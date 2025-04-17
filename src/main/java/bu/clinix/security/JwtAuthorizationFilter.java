package bu.clinix.security;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.web.filter.OncePerRequestFilter;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JwtAuthorizationFilter extends OncePerRequestFilter
{
	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException
	{
		//---cors----Access-Control-Allow-Origin//
		
		response.addHeader("Access-Control-Allow-Origin", "*");
		response.addHeader("Access-Control-Allow-Methods", "*");
		response.addHeader("Access-Control-Allow-Headers", "Origin,Accept,X-Requested-With,Content-Type,Access-Control-Request-Method,Access-Control-Request-Headers,Authorization");
		response.addHeader("Access-Control-Expose-Headers", "Access-Control-Allow-Origin,Access-Control-Allow-credentials,Authorization");
		
		if(request.getMethod().equals("OPTIONS"))
		{
			response.setStatus(HttpServletResponse.SC_OK);
		}
		else
		{
			String path = request.getServletPath();
			if(path.contains("clinix-api/download") || request.getServletPath().equals("/login"))
			{
				System.out.println("--------------access recu download or login path------------->");
				try
				{
					System.out.println("try accept aussi");
					filterChain.doFilter(request, response);/**
					 * permet de dire a ce filtre de continuer son chemin si le path
					 * correspond a '/refreshtoken'
					 */
				} catch (Exception e)
				{
					System.out.println("********exception--null******");
					Map<String, String> errors = new HashMap<String, String>();

					errors.put("msg", "nom d'utilisateur ou mot de passe incorrect");
					errors.put("success", "false");

					response.setContentType("application/json");
					response.setStatus(401);
					new ObjectMapper().writeValue(response.getOutputStream(), errors);
				}
			}
			else
			{
				System.out.println("----------------------jwtAuthorizationFilter----------------->" + request.getHeader("Authorization"));
				String authorizationToken = request.getHeader("Authorization");
				
				if(authorizationToken != null && authorizationToken.startsWith("Bearer "))
				{
					System.out.println("---------------JwtAuthorization- if token not empty-------------");
					try
					{
						String jwt = authorizationToken.substring(7);
						Algorithm algorithm = Algorithm.HMAC256("203999");						
						JWTVerifier jwtVerifier = JWT.require(algorithm).build();
						DecodedJWT decodedJWT = jwtVerifier.verify(jwt);
						
						String username = decodedJWT.getSubject();
						String[] roles = decodedJWT.getClaim("roles").asArray(String.class);
						
						System.out.println("user ok-------------------");
						
						Collection<GrantedAuthority> grantedAuthorities = new ArrayList<GrantedAuthority>();
						
						for (String role : roles)
						{
							grantedAuthorities.add(new SimpleGrantedAuthority(role));
						}
						
						System.out.println("role ok======================");
						
						UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken = new UsernamePasswordAuthenticationToken(username, null, grantedAuthorities);
						
						SecurityContextHolder.getContext().setAuthentication(usernamePasswordAuthenticationToken);
						System.out.println("ok aussi-----------------------");
						filterChain.doFilter(request, response);
						
					} 

					catch (Exception e)
					{
						System.out.println("---------------------authorization ------ exception---in---Token--->");
						Map<String, String> errors = new HashMap<String, String>();
						
						if (e.getMessage().contains("invalid"))
						{
							errors.put("success", "false,");
							errors.put("msg", "le token n'est pas valide");

							response.setContentType("application/json"); 
							response.setStatus(403);
							new ObjectMapper().writeValue(response.getOutputStream(), errors);
						}
						else if(e.getMessage().contains("No validator could be found for constraint"))
						{
							errors.put("success", "false,");
							errors.put("msg", "Ce username existe déjà");

							response.setContentType("application/json"); 
							response.setStatus(400);
							new ObjectMapper().writeValue(response.getOutputStream(), errors);
							
//							errors.put("success", "false,");
//							errors.put("msg", "le token a expiré");
//
//							response.setContentType("application/json"); 
//							response.setStatus(403);
//							new ObjectMapper().writeValue(response.getOutputStream(), errors);
						}
						else
						{
							e.printStackTrace();
						}
					}
				}
				else
				{
					Map<String, String> errors = new HashMap<String, String>();

					errors.put("success", "false");
					errors.put("msg", "la cle est manquante");

					response.setContentType("application/json"); 
					response.setStatus(403);
					new ObjectMapper().writeValue(response.getOutputStream(), errors);
					/** filterChain.doFilter(request, response); permet de dire a ce filtre de continuer son chemin */
				}
				
			}
		}
		//----end cors---//
	}
}

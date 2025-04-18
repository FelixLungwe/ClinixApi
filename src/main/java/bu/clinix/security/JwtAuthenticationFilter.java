package bu.clinix.security;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.fasterxml.jackson.databind.ObjectMapper;

import bu.clinix.entities.AppUser;
import bu.clinix.service.AppRoleServiceImpl;
import bu.clinix.service.AppUserServiceImpl;

public class JwtAuthenticationFilter extends UsernamePasswordAuthenticationFilter
{
	private AppUserServiceImpl appUserServiceImpl;
	private AppRoleServiceImpl appRoleServiceImpl;
	private AuthenticationManager authenticationManager;
	
	
	
	/**
	 * @param appUserServiceImpl
	 * @param appRoleServiceImpl
	 * @param authenticationManager
	 */
	public JwtAuthenticationFilter(AppUserServiceImpl appUserServiceImpl, AppRoleServiceImpl appRoleServiceImpl,
			AuthenticationManager authenticationManager)
	{
		this.appUserServiceImpl = appUserServiceImpl;
		this.appRoleServiceImpl = appRoleServiceImpl;
		this.authenticationManager = authenticationManager;
	}

	@Override
	public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response)
			throws AuthenticationException
	{
		System.out.println("********JwtAuthenticationFilter-attemptAuthentication********");
		AppUser user = null; 
		try
		{
			System.out.println("try de attempt-----------");
			user = new ObjectMapper().readValue(request.getInputStream(), AppUser.class);
			
			if (user.getUsername().equals("") && !(user.getPassword().equals("")))
			{
				System.out.println("**********exception---user*********");
				Map<String, String> errors = new HashMap<String, String>();
				
				errors.put("msg", "veuillez fournir un nom d'utilisateur");
				errors.put("success", "false");
				
				response.setContentType("application/json");
				response.setStatus(400);
				new ObjectMapper().writeValue(response.getOutputStream(),errors);
			}
			else if (user.getPassword().equals("") && !(user.getUsername().equals(""))) 
			{ 
				System.out.println("********exception--password*********");
				Map<String, String> errors = new HashMap<String, String>();
				
				errors.put("msg", "veuillez fournir un mot de passe");
				errors.put("success", "false");
				
				response.setContentType("application/json");
				response.setStatus(400);
				new ObjectMapper().writeValue(response.getOutputStream(),errors);
			}
			else if (user.getUsername().equals("") && user.getPassword().equals("")) 
			{
				System.out.println("********exception--password--username*********");
				Map<String, String> errors = new HashMap<String, String>();
				
				errors.put("msg", "veuillez fournir tous les champs obligatoire");
				errors.put("success", "false");
				
				response.setContentType("application/json");
				response.setStatus(400);
				new ObjectMapper().writeValue(response.getOutputStream(),errors);
			}
			else if (user != null) 
			{
				System.out.println("---olala-----");
				
				AppUser appUser = appUserServiceImpl.loadUserByUsername(user.getUsername());
				
					System.out.println("--------appuser->"+appUser.getPassword());
				
					System.out.println("appuser="+appUser);
					if (!(new BCryptPasswordEncoder().matches(user.getPassword(), appUser.getPassword())) || appUser == null )
					{
						System.out.println("false de if");
						System.out.println("********exception--password--username---incorrect*********");
						Map<String, String> errors = new HashMap<String, String>();
						
						errors.put("msg", "nom d'utilisateur ou mot de passe incorrect");
						errors.put("success", "false");
						
						response.setContentType("application/json");
						response.setStatus(401);
						new ObjectMapper().writeValue(response.getOutputStream(),errors);
					}
			}
			
		} 
		catch (IOException e)
	 	{
			System.out.println("catch de attempt-------------------->");
			e.printStackTrace();
			System.out.println("*************attemptAuthentication**************");
		}

		return authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(user.getUsername(), user.getPassword()));
	}
	
	@Override
	protected void successfulAuthentication(HttpServletRequest request, HttpServletResponse response, FilterChain chain,
			Authentication authResult) throws IOException, ServletException
	{
//		
//		
////		String jwtRefreshToken = JWT.create().withSubject(user.getUsername())
////				.withExpiresAt(new Date(System.currentTimeMillis() + 50 * 60 * 1000))
////				.withIssuer(request.getRequestURL().toString())
////				.sign(algorithm);
//		
////		Map<String, String> idToken = new HashMap<String, String>();
//		
////		idToken.put("access-token", jwtAccessToken);
////		idToken.put("refresh-token", jwtRefreshToken);
//		
////		response.setContentType("application/json");
////		new ObjectMapper().writeValue(response.getOutputStream(), idToken);
//		response.setHeader("Authorization", jwtAccessToken);
		System.out.println("********JwtAuthenticationFilter-successfulAuthentication********");
		User user = (User) authResult.getPrincipal();
		
		Algorithm algorithm = Algorithm.HMAC256("203999");
		
		String jwtAccessToken =  JWT.create().withSubject(user.getUsername())
				.withExpiresAt(new Date(System.currentTimeMillis()+1*24*3600*1000))
				.withIssuer(request.getRequestURL().toString())
				.withClaim("roles", user.getAuthorities().stream().map(ga -> ga.getAuthority()).collect(Collectors.toList()))
				.sign(algorithm);
		System.out.println("Token -->"+jwtAccessToken);
		
		response.setHeader("Authorization", jwtAccessToken);
		
	}
}

package bu.clinix.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;


import bu.clinix.service.AppRoleServiceImpl;
import bu.clinix.service.AppUserServiceImpl;
import bu.clinix.service.UserDetailsServiceImpl;
import lombok.extern.slf4j.Slf4j;
@Slf4j
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter
{
	@Autowired
	private UserDetailsServiceImpl userDetailsServiceImpl;
	
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	@Autowired
	private AppUserServiceImpl appUserServiceImpl;
	
	@Autowired
	private AppRoleServiceImpl appRoleServiceImpl;
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception
	{
		System.out.println("******************configure-auth*******************");
		//auth.userDetailsService(userDetailsServiceImpl).passwordEncoder(bCryptPasswordEncoder);
		auth.userDetailsService(userDetailsServiceImpl).passwordEncoder(bCryptPasswordEncoder);

	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception
	{
		System.out.println("******************configure-http********************");
		
		 http.csrf().disable(); 
		 http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
		 http.authorizeRequests().antMatchers("/login").permitAll();
		 http.authorizeRequests().antMatchers("/clinix-api/download/**").permitAll();
//		 http.authorizeRequests().anyRequest().permitAll();

		 http.authorizeRequests().anyRequest().authenticated();
//		 http.formLogin().loginProcessingUrl("/login").permitAll();
		 http.addFilter(new JwtAuthenticationFilter(appUserServiceImpl, appRoleServiceImpl, authenticationManagerBean()));
		 http.addFilterBefore(new JwtAuthorizationFilter(), UsernamePasswordAuthenticationFilter.class);
	}
	
	//@Bean
	@Override
	protected AuthenticationManager authenticationManager() throws Exception
	{
		// TODO Auto-generated method stub
		return super.authenticationManager();
	}
}

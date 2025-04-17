package bu.clinix.service;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import bu.clinix.entities.AppUser;


@Service
public class UserDetailsServiceImpl implements UserDetailsService
{	 

	@Autowired
	private IAppUserService iAppUserService;
	

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException
	{
		// TODO Auto-generated method stub
		AppUser appUser = null;
		Collection<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
		;
		try
		{
			appUser = iAppUserService.loadUserByUsername(username);
			appUser.getAppRoles().forEach(role -> {
				authorities.add(new SimpleGrantedAuthority(role.getRoleName()));
			});
		}
		catch (UsernameNotFoundException | NullPointerException e)
		{
			System.out.println("loadUserByUsername de Detail ------------exception ------->");
		}
		
		return new User(appUser.getUsername(), appUser.getPassword(), authorities);
	}

}

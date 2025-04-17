package bu.clinix.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import bu.clinix.dao.AppRoleRepository;
import bu.clinix.dao.AppUserRepository;
import bu.clinix.entities.AppRole;
import bu.clinix.entities.AppUser;

@Service
public class AppUserServiceImpl implements IAppUserService
{
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Autowired
	private AppUserRepository appUserRepository;
	
	@Autowired
	private AppRoleRepository appRoleRepository;

	@Override
	public AppUser addAppUser(AppUser appUser)
	{
		System.out.println("------------------add user service-----------");
		String password = appUser.getPassword();
		System.out.println("-------password:"+password+appUser.getEmail()+appUser.getFullname()+appUser.getUsername());
		appUser.setPassword(passwordEncoder.encode(password));
		return appUserRepository.save(appUser);
	}

	@Override
	public AppUser loadUserByUsername(String username)
	{
		AppUser appUser;
		System.out.println("********debut AppUserService-loadUserByUsername********");
		 appUser = appUserRepository.findByUsername(username);
		System.out.println("********fin AppUserService-loadUserByUsername********" + appUser);
		// TODO Auto-generated method stub
		if(!appUser.isActivated())
		{
			appUser = null;
		}
		return appUser;
	}

	@Override
	public List<AppUser> listUsers()
	{
		// TODO Auto-generated method stub
		return appUserRepository.findAll();
	}

	@Override
	public void deleteUser(Long idUser)
	{
		appUserRepository.deleteById(idUser);
		
	}

	@Override
	public AppUser updateUser(AppUser appUser)
	{
		// TODO Auto-generated method stub
		String password = appUser.getPassword();
		appUser.setPassword(passwordEncoder.encode(password));
		return appUserRepository.save(appUser);
	}

	@Transactional
	@Override
	public AppUser addUserToRole(Long idRole, AppUser appUser)
	{
		String password = appUser.getPassword();
		appUser.setPassword(passwordEncoder.encode(password));
		AppUser appUser2 = appUserRepository.save(appUser);
		
		AppRole appRole = appRoleRepository.findById(idRole).get();
		appRole.getAppUsers().add(appUser2);
		
		return appUser;
	}

	@Transactional
	@Override
	public AppUser addUserToRoleById(Long idUser, Long idRole)
	{
		AppUser user = appUserRepository.findById(idUser).get();
		AppRole role = appRoleRepository.findById(idRole).get();
		role.getAppUsers().add(user);
		return user;
	}

	@Override
	public AppUser getUserById(Long id)
	{
		// TODO Auto-generated method stub
		System.out.println("---------------getUserById-------------");
		return appUserRepository.findById(id).get();
	}

	@Override
	public void up_date_User(AppUser appUser)
	{
		appUserRepository.save(appUser);
	}

}

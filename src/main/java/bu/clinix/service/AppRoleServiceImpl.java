package bu.clinix.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import bu.clinix.dao.AppRoleRepository;
import bu.clinix.dao.AppUserRepository;
import bu.clinix.entities.AppRole;
import bu.clinix.entities.AppUser;

@Service
public class AppRoleServiceImpl implements IAppRoleService
{
	@Autowired
	AppRoleRepository appRoleRepository;
	
	@Autowired
	AppUserRepository appUserRepository;

	@Override
	public AppRole addAppRole(AppRole appRole)
	{
		// TODO Auto-generated method stub
		return appRoleRepository.save(appRole);
	}

	@Override
	public void deleteAppRole(Long idRole)
	{
		// TODO Auto-generated method stub
		appRoleRepository.deleteById(idRole);
		
	}

	@Override
	public AppRole updateRole(AppRole appRole)
	{
		// TODO Auto-generated method stub
		return appRoleRepository.save(appRole);
	}

	@Override
	public List<AppRole> listRoles()
	{
		// TODO Auto-generated method stub
		return appRoleRepository.findAll();
	}

	@Override
	@Transactional
	public void addRoleToUser(String username, List<AppRole> appRoles)
	{
		AppUser p = appUserRepository.findByUsername(username);
		p.setAppRoles(appRoles);
	}

}

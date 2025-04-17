package bu.clinix.service;

import java.util.List;

import bu.clinix.entities.AppUser;


public interface IAppUserService
{
	AppUser getUserById(Long id);
	 AppUser addAppUser(AppUser appUser);
	 AppUser loadUserByUsername(String username);
	 List<AppUser> listUsers();
	 void deleteUser(Long idUser);
	 AppUser updateUser(AppUser appUser);
	
	 AppUser addUserToRole(Long idRole, AppUser appUser);
	 AppUser addUserToRoleById(Long idUser, Long idRole);
	 
	 void up_date_User(AppUser appUser);

}

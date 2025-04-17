package bu.clinix.service;

import java.util.List;

import bu.clinix.entities.AppRole;

public interface IAppRoleService
{
	AppRole addAppRole(AppRole appRole);
	void deleteAppRole(Long idRole);
	AppRole updateRole(AppRole appRole);
	List<AppRole> listRoles();
	
	void addRoleToUser(String username, List<AppRole> appRoles);
}

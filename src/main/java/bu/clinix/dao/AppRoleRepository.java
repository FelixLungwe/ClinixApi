package bu.clinix.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import bu.clinix.entities.AppRole;

public interface AppRoleRepository extends JpaRepository<AppRole, Long>
{
	public AppRole findByRoleName(String roleName);
}

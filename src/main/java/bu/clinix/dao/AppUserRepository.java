package bu.clinix.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import bu.clinix.entities.AppUser;

public interface AppUserRepository extends JpaRepository<AppUser, Long>
{
	public AppUser findByUsername(String username);

}

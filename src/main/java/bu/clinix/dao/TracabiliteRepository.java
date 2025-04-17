package bu.clinix.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import bu.clinix.entities.Tracabilite;

public interface TracabiliteRepository extends JpaRepository<Tracabilite, Long>
{
	List<Tracabilite> findByUsername(String username);
	List<Tracabilite> findByOperation(String operation);
	List<Tracabilite> findByOrderByIdDesc(); // Asc and Desc
}

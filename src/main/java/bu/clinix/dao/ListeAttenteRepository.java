package bu.clinix.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import bu.clinix.entities.ListeAttente;

public interface ListeAttenteRepository extends JpaRepository<ListeAttente, Long>
{
	List<ListeAttente> findByServiceDestination(String serviceDestination);
//	List<ListeAttente> findByOperation(String operation);
//	
//	@Query(" select * from ListeAttente where ListeAttente.username =?1")
//	List<ListeAttente> findByUsername(String username);
//	public List<ListeAttente> findAllOrderByIdDesc();// Desc and Asc
}

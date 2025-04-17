package bu.clinix.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import bu.clinix.entities.Sortie;

public interface SortieRepository extends JpaRepository<Sortie, Long>
{
	
}

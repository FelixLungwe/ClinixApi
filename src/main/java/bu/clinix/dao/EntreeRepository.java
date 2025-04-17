package bu.clinix.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import bu.clinix.entities.Entree;

public interface EntreeRepository extends JpaRepository<Entree, Long>
{

}

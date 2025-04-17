package bu.clinix.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import bu.clinix.entities.Acte;

public interface ActeRepository extends JpaRepository<Acte, Long>
{

}

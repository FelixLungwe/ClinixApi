package bu.clinix.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import bu.clinix.entities.Accouchement;

public interface AccouchementRepository extends JpaRepository<Accouchement, Long>
{

}

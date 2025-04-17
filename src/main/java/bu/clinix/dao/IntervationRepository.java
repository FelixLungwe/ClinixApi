package bu.clinix.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import bu.clinix.entities.Intervation;

public interface IntervationRepository extends JpaRepository<Intervation, Long>
{

}

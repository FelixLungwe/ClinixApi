package bu.clinix.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import bu.clinix.entities.Urgence;

public interface UrgenceRepository extends JpaRepository<Urgence, Long>
{

}

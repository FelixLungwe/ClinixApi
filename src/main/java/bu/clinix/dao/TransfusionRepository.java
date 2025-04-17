package bu.clinix.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import bu.clinix.entities.Transfusion;

public interface TransfusionRepository extends JpaRepository<Transfusion, Long>
{

}

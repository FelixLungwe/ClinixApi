package bu.clinix.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import bu.clinix.entities.Examen;

public interface ExamenRepository extends JpaRepository<Examen, Long>
{

}

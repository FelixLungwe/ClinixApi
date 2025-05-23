package bu.clinix.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import bu.clinix.entities.Patient;

public interface PatientRepository extends JpaRepository<Patient, Long>
{
	Patient findByMatricule(String matricule);
}

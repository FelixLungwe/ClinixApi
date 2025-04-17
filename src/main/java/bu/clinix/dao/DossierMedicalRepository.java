package bu.clinix.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import bu.clinix.entities.DossierMedical;

public interface DossierMedicalRepository extends JpaRepository<DossierMedical, Long>
{
//	@Query("SELECT dossier_medical.num_dossier_med FROM dossier_medical INNER JOIN patient ON dossier_medical.patient_id = patient.patient_id WHERE patient.patient_id == ?1")
//	int findDossierMedicalByIdPatient(Long patient_id);
}

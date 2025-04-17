package bu.clinix.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import bu.clinix.dao.ExamenRepository;
import bu.clinix.dao.PatientRepository;
import bu.clinix.entities.Examen;
import bu.clinix.entities.Patient;

@Service
public class ExamenServiceImpl implements IExamenService
{
	@Autowired
	private PatientRepository patientRepository;
	
	@Autowired
	private ExamenRepository examenRepository;

	public Examen addExamen(Examen examen)
	{
		return examenRepository.save(examen);
	}

	public Examen getExamen(Long id)
	{
		return examenRepository.findById(id).get();
	}

	public List<Examen> getExamens()
	{
		return examenRepository.findAll();
	}

	public Examen updateExamen(Examen examen)
	{
		return examenRepository.save(examen);
	}

	public void deleteExamen(Long id)
	{
		examenRepository.deleteById(id);
	}

	@Transactional
	public void addPatientToExamen(Long id, Examen examen)
	{
		Patient patient = patientRepository.findById(id).get();
		examenRepository.save(examen);
		examen.setPatient(patient);
	}

	@Override
	@Transactional
	public Examen addPatientToExamenByMat(String matricule, Examen examen)
	{
		Patient p = patientRepository.findByMatricule(matricule);
		
		System.out.println("--------patient recup"+p.getFullname()+"--"+p.getMatricule());
		
		String dateNaissance = p.getDateNaissance()+"";
		LocalDate start_date = LocalDate.parse(dateNaissance);
		LocalDate end_date = LocalDate.now();
		String groupeAge = DifferenceDate.findGroupeAge(start_date, end_date);
		examen.setGroupeAge(groupeAge);
		
		examen = examenRepository.save(examen);
		examen.setPatient(p);
		
		return examen;
	}
}

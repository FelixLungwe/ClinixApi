package bu.clinix.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import bu.clinix.dao.PatientRepository;
import bu.clinix.dao.UrgenceRepository;
import bu.clinix.entities.Patient;
import bu.clinix.entities.Urgence;

@Service
public class UrgenceServiceImpl implements IUrgenceService
{
	@Autowired
	private UrgenceRepository urgenceRepository;
	
	@Autowired
	private PatientRepository patientRepository;

	public Urgence addUrgence(Urgence urgence)
	{
		return urgenceRepository.save(urgence);
	}

	public Urgence getUrgence(Long id)
	{
		return urgenceRepository.findById(id).get();
	}

	public List<Urgence> getUrgences()
	{
		return urgenceRepository.findAll();
	}

	public Urgence updateUrgence(Urgence urgence)
	{
		return urgenceRepository.save(urgence);
	}

	public void deleteUrgence(Long id)
	{
		urgenceRepository.deleteById(id);
	}

	@Transactional
	public void addPatientToUrgence(Long id, Urgence urgence)
	{
		Patient patient = patientRepository.findById(id).get();
		urgenceRepository.save(urgence);
		urgence.setPatient(patient);
	}

	@Override
	public Urgence addPatientToUrgenceByMat(String matricule, Urgence urgence)
	{
		Patient p = patientRepository.findByMatricule(matricule);
		
		String dateNaissance = p.getDateNaissance()+"";
		LocalDate start_date = LocalDate.parse(dateNaissance);
		LocalDate end_date = LocalDate.now();
		String groupeAge = DifferenceDate.findGroupeAge(start_date, end_date);
		urgence.setGroupeAge(groupeAge);
		
		urgenceRepository.save(urgence);
		urgence.setPatient(p);
		
		return urgence;
	}
}

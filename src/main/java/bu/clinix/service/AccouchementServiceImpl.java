package bu.clinix.service;

import java.time.LocalDate;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import bu.clinix.dao.AccouchementRepository;
import bu.clinix.dao.PatientRepository;
import bu.clinix.entities.Accouchement;
import bu.clinix.entities.Patient;

@Service
public class AccouchementServiceImpl implements IAccouchementService
{
	@Autowired
	private AccouchementRepository accouchementRepository;
	
	private PatientRepository patientRepository;

	public Accouchement addAccouchement(Accouchement accouchement)
	{
		return accouchementRepository.save(accouchement);
	}

	public Accouchement getAccouchement(Long id)
	{
		return accouchementRepository.findById(id).get();
	}

	public List<Accouchement> getAccouchements()
	{
		return accouchementRepository.findAll();
	}

	public Accouchement updateAccouchement(Accouchement accouchement)
	{
		return accouchementRepository.save(accouchement);
	}

	public void deleteAccouchement(Long id)
	{
		accouchementRepository.deleteById(id);
	}
	
	@Transactional
	public void addPatientToAccouchement(Long idPatient, Accouchement accouchement)
	{
		Patient patient = patientRepository.findById(idPatient).get();
		accouchementRepository.save(accouchement);
		accouchement.setPatient(patient);
	}

	@Override
	public Accouchement addPatientToAccouchementByMat(String matricule, Accouchement accouchement)
	{
		Patient p = patientRepository.findByMatricule(matricule);
		
		String dateNaissance = p.getDateNaissance()+"";
		LocalDate start_date = LocalDate.parse(dateNaissance);
		LocalDate end_date = LocalDate.now();
		String groupeAge = DifferenceDate.findGroupeAge(start_date, end_date);
		accouchement.setGroupeAge(groupeAge);
		
		accouchementRepository.save(accouchement);
		accouchement.setPatient(p);
		
		return accouchement;
	}
}

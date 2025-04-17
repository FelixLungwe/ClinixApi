package bu.clinix.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import bu.clinix.dao.GynecoObstetriqueRepository;
import bu.clinix.dao.PatientRepository;
import bu.clinix.entities.GynecoObstetrique;
import bu.clinix.entities.Patient;

@Service
public class GynecoObstetriqueServiceImpl implements IGynecoObstetriqueService
{
	@Autowired
	private PatientRepository patientRepository;
	
	@Autowired
	private GynecoObstetriqueRepository gynecoObstetriqueRepository;

	public GynecoObstetrique addGynecoObstetrique(GynecoObstetrique gynecoObstetrique)
	{
		return gynecoObstetriqueRepository.save(gynecoObstetrique);
	}

	public GynecoObstetrique getGynecoObstetrique(Long id)
	{
		return gynecoObstetriqueRepository.findById(id).get();
	}

	public List<GynecoObstetrique> getGynecoObstetriques()
	{
		return gynecoObstetriqueRepository.findAll();
	}

	public GynecoObstetrique updateGynecoObstetrique(GynecoObstetrique gynecoObstetrique)
	{
		return gynecoObstetriqueRepository.save(gynecoObstetrique);
	}

	public void deleteGynecoObstetrique(Long id)
	{
		gynecoObstetriqueRepository.deleteById(id);
		
	}

	@Transactional
	public void addPatientToGynecoObstetrique(Long id, GynecoObstetrique gynecoObstetrique)
	{
		Patient patient = patientRepository.findById(id).get();
		gynecoObstetriqueRepository.save(gynecoObstetrique);
		gynecoObstetrique.setPatient(patient);
	}

	@Override
	@Transactional
	public GynecoObstetrique addPatientToGynecoObstetriqueByMat(String matricule, GynecoObstetrique gynecoObstetrique)
	{
		//LocalDate a = LocalDate.parse(gynecoObstetrique.getHeureEntree()+"");
		System.out.println("------------------date rec"+gynecoObstetrique.getHeureEntree());
		Patient p = patientRepository.findByMatricule(matricule);
		
		String dateNaissance = p.getDateNaissance()+"";
		LocalDate start_date = LocalDate.parse(dateNaissance);
		LocalDate end_date = LocalDate.now();
		String age = DifferenceDate.findDifference(start_date, end_date);
		String groupeAge = DifferenceDate.findGroupeAge(start_date, end_date);
		gynecoObstetrique.setGroupeAge(groupeAge);
		gynecoObstetrique.setAge(age);
		
		gynecoObstetriqueRepository.save(gynecoObstetrique);
		gynecoObstetrique.setPatient(p);
		
		
		return gynecoObstetrique;
	}

}

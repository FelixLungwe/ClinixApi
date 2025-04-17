package bu.clinix.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import bu.clinix.dao.ActeRepository;
import bu.clinix.dao.PatientRepository;
import bu.clinix.entities.Acte;
import bu.clinix.entities.Patient;

@Service
public class ActeServiceImpl implements IActeService
{
	@Autowired
	private PatientRepository patientRepository;
	
	@Autowired
	private ActeRepository acteRepository;

	public Acte addActe(Acte acte)
	{
		return acteRepository.save(acte);
	}

	public Acte getActe(Long id)
	{
		return acteRepository.findById(id).get();
	}

	public List<Acte> getActes()
	{
		return acteRepository.findAll();
	}

	public Acte updateActe(Acte acte)
	{
		return acteRepository.save(acte);
	}

	public void deleteActe(Long id)
	{
		acteRepository.deleteById(id);
	}

	@Transactional
	public void addPatientToActe(Long id, Acte acte)
	{
		Patient patient = patientRepository.findById(id).get();
		acteRepository.save(acte);
		acte.setPatient(patient);
	}

	@Override
	@Transactional
	public Acte addPatientToActeByMat(String matricule, Acte acte)
	{
		Patient p = patientRepository.findByMatricule(matricule);
		
		String dateNaissance = p.getDateNaissance()+"";
		LocalDate start_date = LocalDate.parse(dateNaissance);
		LocalDate end_date = LocalDate.now();
		String groupeAge = DifferenceDate.findGroupeAge(start_date, end_date);
		acte.setGroupeAge(groupeAge);
		
		acteRepository.save(acte);
		acte.setPatient(p);
		
		return acte;
	}
	
	
}

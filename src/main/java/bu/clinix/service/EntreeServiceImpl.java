package bu.clinix.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import bu.clinix.dao.EntreeRepository;
import bu.clinix.dao.PatientRepository;
import bu.clinix.entities.Entree;
import bu.clinix.entities.Patient;

@Service
public class EntreeServiceImpl implements IEntreeService
{
	@Autowired
	private PatientRepository patientRepository;
	
	@Autowired
	private EntreeRepository entreeRepository;

	public Entree addEntree(Entree entree)
	{
		return entreeRepository.save(entree);
	}

	public Entree getEntree(Long id)
	{
		return entreeRepository.findById(id).get();
	}

	public List<Entree> getEntrees()
	{
		return entreeRepository.findAll();
	}

	public Entree updateEntree(Entree entree)
	{
		return entreeRepository.save(entree);
	}

	public void deleteEntree(Long id)
	{
		entreeRepository.deleteById(id);
	}

	@Transactional
	public void addPatientToEntree(Long id, Entree entree)
	{
		Patient patient = patientRepository.findById(id).get();
		entreeRepository.save(entree);
		entree.setPatient(patient);
	}

	@Override
	public Entree addPatientToEntreeByMat(String matricule, Entree entree)
	{
		Patient p = patientRepository.findByMatricule(matricule);
		
		String dateNaissance = p.getDateNaissance()+"";
		LocalDate start_date = LocalDate.parse(dateNaissance);
		LocalDate end_date = LocalDate.now();
		String groupeAge = DifferenceDate.findGroupeAge(start_date, end_date);
		entree.setGroupeAge(groupeAge);
		
		entreeRepository.save(entree);
		entree.setPatient(p);
		
		return entree;
	}
	
	

}

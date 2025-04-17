package bu.clinix.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import bu.clinix.dao.DepistageVolontaireRepository;
import bu.clinix.dao.PatientRepository;
import bu.clinix.entities.DepistageVolontaire;
import bu.clinix.entities.Patient;

@Service
public class DepistageVolontaireServiceImpl implements IDepistageVolontaireService
{
	@Autowired
	private PatientRepository patientRepository;
	
	@Autowired
	private DepistageVolontaireRepository depistageVolontaireRepository;

	public DepistageVolontaire addDepistageVolontaire(DepistageVolontaire depistageVolontaire)
	{
		return depistageVolontaireRepository.save(depistageVolontaire);
	}

	public DepistageVolontaire getDepistageVolontaire(Long id)
	{
		return depistageVolontaireRepository.findById(id).get();
	}

	public List<DepistageVolontaire> getDepistageVolontaires()
	{
		return depistageVolontaireRepository.findAll();
	}

	public DepistageVolontaire updateDepistageVolontaire(DepistageVolontaire depistageVolontaire)
	{
		return depistageVolontaireRepository.save(depistageVolontaire);
	}

	public void deleteDepistageVolontaire(Long id)
	{
		depistageVolontaireRepository.deleteById(id);
	}

	@Transactional
	public void addPatientToDepistageVolontaire(Long id, DepistageVolontaire depistageVolontaire)
	{
		Patient patient = patientRepository.findById(id).get();
		depistageVolontaireRepository.save(depistageVolontaire);
		depistageVolontaire.setPatient(patient);
	}

	@Override
	public DepistageVolontaire addPatientToDepistageVolontaireByMat(String matricule,
			DepistageVolontaire depistageVolontaire)
	{
		Patient p = patientRepository.findByMatricule(matricule);
		
//		String dateNaissance = p.getDateNaissance()+"";
//		LocalDate start_date = LocalDate.parse(dateNaissance);
//		LocalDate end_date = LocalDate.now();
//		String groupeAge = DifferenceDate.findGroupeAge(start_date, end_date);
//		depistageVolontaire.setGroupeAge(groupeAge);
		
		depistageVolontaireRepository.save(depistageVolontaire);
		depistageVolontaire.setPatient(p);
		
		return depistageVolontaire;
	}
	
	
}

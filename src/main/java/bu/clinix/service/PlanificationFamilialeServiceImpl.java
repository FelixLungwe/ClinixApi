package bu.clinix.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import bu.clinix.dao.PatientRepository;
import bu.clinix.dao.PlanificationFamilialeRepository;
import bu.clinix.entities.Patient;
import bu.clinix.entities.PlanificationFamiliale;

@Service
public class PlanificationFamilialeServiceImpl implements IPlanificationFamilialeService
{
	@Autowired
	private PlanificationFamilialeRepository planificationFamilialeRepository;
	
	@Autowired
	private PatientRepository patientRepository;

	public PlanificationFamiliale addPlanificationFamiliale(PlanificationFamiliale planificationFamiliale)
	{
		return planificationFamilialeRepository.save(planificationFamiliale);
	}

	public PlanificationFamiliale getPlanificationFamiliale(Long id)
	{
		return planificationFamilialeRepository.findById(id).get();
	}

	public List<PlanificationFamiliale> getPlanificationFamiliales()
	{
		return planificationFamilialeRepository.findAll();
	}

	public PlanificationFamiliale updatePlanificationFamiliale(PlanificationFamiliale planificationFamiliale)
	{
		return planificationFamilialeRepository.save(planificationFamiliale);
	}

	public void deletePlanificationFamiliale(Long id)
	{
		planificationFamilialeRepository.deleteById(id);
	}

	@Transactional
	public void addPatientToPlanificationFamiliale(Long id, PlanificationFamiliale planificationFamiliale)
	{
		Patient patient = patientRepository.findById(id).get();
		planificationFamilialeRepository.save(planificationFamiliale);
		planificationFamiliale.setPatient(patient);
	}

	@Override
	public PlanificationFamiliale addPatientToPlanificationFamilialeByMat(String matricule,
			PlanificationFamiliale planificationFamiliale)
	{
		Patient p = patientRepository.findByMatricule(matricule);
		
		String dateNaissance = p.getDateNaissance()+"";
		LocalDate start_date = LocalDate.parse(dateNaissance);
		LocalDate end_date = LocalDate.now();
		String groupeAge = DifferenceDate.findGroupeAge(start_date, end_date);
		planificationFamiliale.setGroupeAge(groupeAge);
		
		planificationFamilialeRepository.save(planificationFamiliale);
		planificationFamiliale.setPatient(p);
		
		return planificationFamiliale;
	}
	

}

package bu.clinix.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import bu.clinix.dao.PatientRepository;
import bu.clinix.dao.StabilisationRepository;
import bu.clinix.entities.Patient;
import bu.clinix.entities.Stabilisation;

@Service
public class StabilisationServiceImpl implements IStabilisationService
{
	@Autowired
	private StabilisationRepository stabilisationRepository;
	
	@Autowired
	private PatientRepository patientRepository;

	public Stabilisation addStabilisation(Stabilisation stabilisation)
	{
		return stabilisationRepository.save(stabilisation);
	}

	public Stabilisation getStabilisation(Long id)
	{
		return stabilisationRepository.findById(id).get();
	}

	public List<Stabilisation> getStabilisations()
	{
		return stabilisationRepository.findAll();
	}

	public Stabilisation updateStabilisation(Stabilisation stabilisation)
	{
		return stabilisationRepository.save(stabilisation);
	}

	public void deleteStabilisation(Long id)
	{
		stabilisationRepository.deleteById(id);
	}

	@Transactional
	public void addPatientToStabilisation(Long id, Stabilisation stabilisation)
	{
		Patient patient = patientRepository.findById(id).get();
		stabilisationRepository.save(stabilisation);
		stabilisation.setPatient(patient);
	}

	@Override
	public Stabilisation addPatientToStabilisationByMat(String matricule, Stabilisation stabilisation)
	{
		Patient p = patientRepository.findByMatricule(matricule);
		
		String dateNaissance = p.getDateNaissance()+"";
		LocalDate start_date = LocalDate.parse(dateNaissance);
		LocalDate end_date = LocalDate.now();
		String groupeAge = DifferenceDate.findGroupeAge(start_date, end_date);
		stabilisation.setGroupeAge(groupeAge);
		
		stabilisationRepository.save(stabilisation);
		stabilisation.setPatient(p);
		
		return stabilisation;
	}
}

package bu.clinix.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import bu.clinix.dao.IntervationRepository;
import bu.clinix.dao.PatientRepository;
import bu.clinix.entities.Intervation;
import bu.clinix.entities.Patient;

@Service
public class IntervationServiceImpl implements IIntervationService
{
	@Autowired
	private IntervationRepository intervationRepository;
	
	@Autowired
	private PatientRepository patientRepository;

	public Intervation addIntervation(Intervation intervation)
	{
		return intervationRepository.save(intervation);
	}

	public Intervation getIntervation(Long id)
	{
		return intervationRepository.findById(id).get();
	}

	public List<Intervation> getIntervations()
	{
		return intervationRepository.findAll();
	}

	public Intervation updateIntervation(Intervation intervation)
	{
		return intervationRepository.save(intervation);
	}

	public void deleteIntervation(Long id)
	{
		intervationRepository.deleteById(id);
	}

	@Transactional
	public void addPatientToIntervation(Long id, Intervation intervation)
	{
		Patient patient = patientRepository.findById(id).get();
		intervation.setPatient(patient);
	}

	@Override
	public void addPatientToIntervationByMat(String matricule, Intervation intervation)
	{
		// TODO Auto-generated method stub
		
	}
}

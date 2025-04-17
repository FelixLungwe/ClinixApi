package bu.clinix.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import bu.clinix.dao.PatientRepository;
import bu.clinix.dao.TransfusionRepository;
import bu.clinix.entities.Patient;
import bu.clinix.entities.Transfusion;

@Service
public class TransfusionServiceImpl implements ITransfusionService
{
	@Autowired
	private TransfusionRepository transfusionRepository;
	
	@Autowired
	private PatientRepository patientRepository;

	public Transfusion addTransfusion(Transfusion transfusion)
	{
		return transfusionRepository.save(transfusion);
	}

	public Transfusion getTransfusion(Long id)
	{
		return transfusionRepository.findById(id).get();
	}

	public List<Transfusion> getTransfusions()
	{
		return transfusionRepository.findAll();
	}

	public Transfusion updateTransfusion(Transfusion transfusion)
	{
		return transfusionRepository.save(transfusion);
	}

	public void deleteTransfusion(Long id)
	{
		patientRepository.deleteById(id);
	}

	@Transactional
	public void addPatientToTransfusion(Long id, Transfusion transfusion)
	{
		Patient patient = patientRepository.findById(id).get();
		transfusionRepository.save(transfusion);
		transfusion.setPatient(patient);
	}

	@Override
	public Transfusion addPatientToTransfusionByMat(String matricule, Transfusion transfusion)
	{
		Patient p = patientRepository.findByMatricule(matricule);
		
		transfusionRepository.save(transfusion);
		transfusion.setPatient(p);
		
		return transfusion;
	}
}

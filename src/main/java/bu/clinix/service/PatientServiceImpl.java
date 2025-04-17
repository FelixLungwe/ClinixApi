package bu.clinix.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bu.clinix.dao.PatientRepository;
import bu.clinix.entities.Patient;

@Service
public class PatientServiceImpl implements IPatientService
{
	@Autowired
	private PatientRepository patientRepository;

	public Patient addPatient(Patient patient)
	{
		Patient p = patientRepository.save(patient);
		int id =(int) (p.getPatient_id()/1);
		String matricule = GenerateIdPatient.geneteIdPatient(id, p.getFullname(), p.getSexe(), p.getMatricule());
		p.setMatricule(matricule);
		return patientRepository.save(p);
	}

	public Patient getPatient(Long id)
	{
		return patientRepository.findById(id).get();
	}

	public List<Patient> getPatients()
	{
		// TODO Auto-generated method stub
		return patientRepository.findAll();
	}

	public Patient updatePatient(Patient patient)
	{
		// TODO Auto-generated method stub
		return patientRepository.save(patient);
	}

	public void deletePatient(Long id)
	{
		patientRepository.deleteById(id);
	}

	@Override
	public Patient getPatientByMatricule(String matricule)
	{
		// TODO Auto-generated method stub
		return patientRepository.findByMatricule(matricule);
	}

}

package bu.clinix.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import bu.clinix.dao.AccueilHospitalisationRepository;
import bu.clinix.dao.PatientRepository;
import bu.clinix.entities.AccueilHospitalisation;
import bu.clinix.entities.Patient;

@Service
public class AccueilHospitalisationServiceImpl implements IAccueilHospitalisationService
{
	@Autowired
	private AccueilHospitalisationRepository accueilHospitalisationRepository;
	@Autowired
	private PatientRepository patientRepository;

	@Override
	public AccueilHospitalisation addAccueilHospitalisation(AccueilHospitalisation accueilHospitalisation)
	{
		// TODO Auto-generated method stub
		return accueilHospitalisationRepository.save(accueilHospitalisation);
	}

	@Override
	public AccueilHospitalisation getAccueilHospitalisation(Long id)
	{
		// TODO Auto-generated method stub
		return accueilHospitalisationRepository.findById(id).get();
	}

	@Override
	public List<AccueilHospitalisation> getAccueilHospitalisations()
	{
		// TODO Auto-generated method stub
		return accueilHospitalisationRepository.findAll();
	}

	@Override
	public AccueilHospitalisation updateAccueilHospitalisation(AccueilHospitalisation accueilHospitalisation)
	{
		// TODO Auto-generated method stub
		return accueilHospitalisationRepository.save(accueilHospitalisation);
	}

	@Override
	public void deleteAccueilHospitalisation(Long id)
	{
		// TODO Auto-generated method stub
		accueilHospitalisationRepository.deleteById(id);
	}

	@Override
	@Transactional
	public AccueilHospitalisation addPatientToAccueilHospitalisation(Long id,
			AccueilHospitalisation accueilHospitalisation)
	{
		// TODO Auto-generated method stub
		Patient patient = patientRepository.findById(id).get();
		String dateNaissance = patient.getDateNaissance()+"";
		LocalDate start_date = LocalDate.parse(dateNaissance);
		LocalDate end_date = LocalDate.now();
		String age = DifferenceDate.findDifference(start_date, end_date);
		String groupeAge = DifferenceDate.findGroupeAge(start_date, end_date);
		accueilHospitalisation.setAge(age);
		accueilHospitalisation.setGroupeAge(groupeAge);
		
		accueilHospitalisation = accueilHospitalisationRepository.save(accueilHospitalisation);
		accueilHospitalisation.setPatient(patient);
		
		return accueilHospitalisation;
	}

	@Override
	@Transactional
	public AccueilHospitalisation addPatientToAccueilHospitalisationByMat(String matricule,
			AccueilHospitalisation accueilHospitalisation)
	{
		// TODO Auto-generated method stub
		Patient p = patientRepository.findByMatricule(matricule);
		
		String dateNaissance = p.getDateNaissance()+"";
		LocalDate start_date = LocalDate.parse(dateNaissance);
		LocalDate end_date = LocalDate.now();
		String age = DifferenceDate.findDifference(start_date, end_date);
		String groupeAge = DifferenceDate.findGroupeAge(start_date, end_date);
		accueilHospitalisation.setAge(age);
		accueilHospitalisation.setGroupeAge(groupeAge);
		
		accueilHospitalisationRepository.save(accueilHospitalisation);
		accueilHospitalisation.setPatient(p);
		return accueilHospitalisation;
	}

	@Override
	@Transactional
	public AccueilHospitalisation updatePatientToAccueilHospitalisationByMat(String matricule,
			AccueilHospitalisation accueilHospitalisation)
	{
		// TODO Auto-generated method stub
		Patient p = patientRepository.findByMatricule(matricule);
		
		String dateNaissance = p.getDateNaissance()+"";
		LocalDate start_date = LocalDate.parse(dateNaissance);
		LocalDate end_date = LocalDate.now();
		String age = DifferenceDate.findDifference(start_date, end_date);
		String groupeAge = DifferenceDate.findGroupeAge(start_date, end_date);
		accueilHospitalisation.setAge(age);
		accueilHospitalisation.setGroupeAge(groupeAge);
		
		accueilHospitalisationRepository.save(accueilHospitalisation);
		accueilHospitalisation.setPatient(p);
		
		return accueilHospitalisation;
	}

}

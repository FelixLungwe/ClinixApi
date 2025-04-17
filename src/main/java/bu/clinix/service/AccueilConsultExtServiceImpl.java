package bu.clinix.service;

import java.sql.Date;
import java.sql.SQLData;
import java.time.LocalDate;
import java.util.List;

import org.hibernate.dialect.pagination.SQL2008StandardLimitHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fasterxml.jackson.databind.deser.std.DateDeserializers.SqlDateDeserializer;

import bu.clinix.dao.AccueilConsultExtRepository;
import bu.clinix.dao.PatientRepository;
import bu.clinix.entities.AccueilConsultExt;
import bu.clinix.entities.Patient;
import io.cucumber.java.en_old.Ac;

@Service
public class AccueilConsultExtServiceImpl implements IAccueilConsultExtService
{
	@Autowired
	private AccueilConsultExtRepository accueilConsultExtRepository;
	
	@Autowired
	private PatientRepository patientRepository;

	public AccueilConsultExt addAccueilConsultExt(AccueilConsultExt accueilConsultExt)
	{
		return accueilConsultExtRepository.save(accueilConsultExt);
	}

	public AccueilConsultExt getAccueilConsultExt(Long id)
	{
		return accueilConsultExtRepository.findById(id).get();
	}

	public List<AccueilConsultExt> getAccueilConsultExts()
	{
		return accueilConsultExtRepository.findAll();
	}

	public AccueilConsultExt updateAccueilConsultExt(AccueilConsultExt accueilConsultExt)
	{
		return accueilConsultExtRepository.save(accueilConsultExt);
	}

	public void deleteAccueilConsultExt(Long id)
	{
		accueilConsultExtRepository.deleteById(id);	
	}

	@Transactional
	public AccueilConsultExt addPatientToAccueilConsultExt(Long id, AccueilConsultExt accueilConsultExt)
	{
		Patient patient = patientRepository.findById(id).get();
		String dateNaissance = patient.getDateNaissance()+"";
		LocalDate start_date = LocalDate.parse(dateNaissance);
		LocalDate end_date = LocalDate.now();
		String age = DifferenceDate.findDifference(start_date, end_date);
		String groupeAge = DifferenceDate.findGroupeAge(start_date, end_date);
		accueilConsultExt.setAge(age);
		accueilConsultExt.setGroupeAge(groupeAge);
		
		accueilConsultExtRepository.save(accueilConsultExt);
		accueilConsultExt.setPatient(patient);
		return accueilConsultExt;
	}

	@Override
	@Transactional
	public AccueilConsultExt addPatientToAccueilConsultExtByMat(String matricule, AccueilConsultExt accueilConsultExt)
	{
		Patient p = patientRepository.findByMatricule(matricule);
		
		String dateNaissance = p.getDateNaissance()+"";
		LocalDate start_date = LocalDate.parse(dateNaissance);
		LocalDate end_date = LocalDate.now();
		String age = DifferenceDate.findDifference(start_date, end_date);
		String groupeAge = DifferenceDate.findGroupeAge(start_date, end_date);
		accueilConsultExt.setAge(age);
		accueilConsultExt.setGroupeAge(groupeAge);
		
		accueilConsultExt = accueilConsultExtRepository.save(accueilConsultExt);
		accueilConsultExt.setPatient(p);
		
		System.out.println("-----------accueilConsultExt----id-->"+accueilConsultExt.getAccueilConsultExt_id());
		
		return accueilConsultExt;
	}

	@Override
	@Transactional
	public AccueilConsultExt updatePatientToAccueilConsulExtByMat(String matricule, AccueilConsultExt accueilConsultExt)
	{
		Patient p = patientRepository.findByMatricule(matricule);
		
		String dateNaissance = p.getDateNaissance()+"";
		LocalDate start_date = LocalDate.parse(dateNaissance);
		LocalDate end_date = LocalDate.now();
		String age = DifferenceDate.findDifference(start_date, end_date);
		String groupeAge = DifferenceDate.findGroupeAge(start_date, end_date);
		accueilConsultExt.setAge(age);
		accueilConsultExt.setGroupeAge(groupeAge);
		
		accueilConsultExtRepository.save(accueilConsultExt);
		accueilConsultExt.setPatient(p);
		
		return accueilConsultExt;
	}
	
	

}

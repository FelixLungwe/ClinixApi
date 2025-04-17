package bu.clinix.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import bu.clinix.dao.ConsultationPostNatalRepository;
import bu.clinix.dao.PatientRepository;
import bu.clinix.entities.ConsultationPostNatal;
import bu.clinix.entities.Patient;

@Service
public class ConsultationPostNatalServiceImpl implements IConsultationPostNatalService
{
	@Autowired
	private PatientRepository patientRepository;
	
	@Autowired
	private ConsultationPostNatalRepository consultationPostNatalRepository;

	public ConsultationPostNatal addConsultationPostNatal(ConsultationPostNatal consultationPostNatal)
	{
		return consultationPostNatalRepository.save(consultationPostNatal);
	}

	public ConsultationPostNatal getConsultationPostNatal(Long id)
	{
		return consultationPostNatalRepository.findById(id).get();
	}

	public List<ConsultationPostNatal> getConsultationPostNatals()
	{
		return consultationPostNatalRepository.findAll();
	}

	public ConsultationPostNatal updateConsultationPostNatal(ConsultationPostNatal consultationPostNatal)
	{
		return consultationPostNatalRepository.save(consultationPostNatal);
	}

	public void deleteConsultationPostNatal(Long id)
	{
		consultationPostNatalRepository.deleteById(id);
	}

	@Transactional
	public void addPatientToConsultationPostNatal(Long id, ConsultationPostNatal consultationPostNatal)
	{
		Patient patient = patientRepository.findById(id).get();
		consultationPostNatalRepository.save(consultationPostNatal);
		consultationPostNatal.setPatient(patient);
	}

	@Override
	public ConsultationPostNatal addPatientToConsultationPostNatalByMat(String matricule,
			ConsultationPostNatal consultationPostNatal)
	{
		Patient p = patientRepository.findByMatricule(matricule);
		
		String dateNaissance = p.getDateNaissance()+"";
		LocalDate start_date = LocalDate.parse(dateNaissance);
		LocalDate end_date = LocalDate.now();
		String groupeAge = DifferenceDate.findGroupeAge(start_date, end_date);
		consultationPostNatal.setGroupeAge(groupeAge);
		
		consultationPostNatalRepository.save(consultationPostNatal);
		consultationPostNatal.setPatient(p);
		
		return consultationPostNatal;
	}
}

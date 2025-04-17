package bu.clinix.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import bu.clinix.dao.ConsultationExterneRepository;
import bu.clinix.dao.PatientRepository;
import bu.clinix.entities.ConsultationExterne;
import bu.clinix.entities.Patient;

@Service
public class ConsultationExterneServiceImpl implements IConsultationExterneService
{
	@Autowired
	private ConsultationExterneRepository consultationExterneRepository;
	
	@Autowired
	private PatientRepository patientRepository;

	public ConsultationExterne addConsultationExterne(ConsultationExterne consultationExterne)
	{
		return consultationExterneRepository.save(consultationExterne);
	}

	public ConsultationExterne getConsultationExterne(Long id)
	{
		return consultationExterneRepository.findById(id).get();
	}

	public List<ConsultationExterne> getConsultationExternes()
	{
		return consultationExterneRepository.findAll();
	}

	public ConsultationExterne updateConsultationExterne(ConsultationExterne consultationExterne)
	{
		return consultationExterneRepository.save(consultationExterne);
	}

	public void deleteConsultationExterne(Long id)
	{
		consultationExterneRepository.deleteById(id);
	}

	@Transactional
	public void addPatientToConsultationExterne(Long id, ConsultationExterne consultationExterne)
	{
		Patient patient = patientRepository.findById(id).get();
		consultationExterneRepository.save(consultationExterne);
		consultationExterne.setPatient(patient);
	}

	@Override
	public ConsultationExterne addPatientToConsultationExterneByMat(String matricule,
			ConsultationExterne consultationExterne)
	{
		Patient p = patientRepository.findByMatricule(matricule);
		
		String dateNaissance = p.getDateNaissance()+"";
		LocalDate start_date = LocalDate.parse(dateNaissance);
		LocalDate end_date = LocalDate.now();
		String groupeAge = DifferenceDate.findGroupeAge(start_date, end_date);
		consultationExterne.setGroupeAge(groupeAge);
		
		consultationExterneRepository.save(consultationExterne);
		consultationExterne.setPatient(p);
		
		return consultationExterne;
	}
	
	
}

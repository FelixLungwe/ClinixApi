package bu.clinix.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import bu.clinix.dao.ConsultationPrenataleRepository;
import bu.clinix.dao.PatientRepository;
import bu.clinix.entities.ConsultationPrenatale;
import bu.clinix.entities.Patient;

@Service
public class ConsultationPrenataleServiceImpl implements IConsultationPrenataleService
{
	@Autowired
	private PatientRepository patientRepository;
	
	@Autowired
	private ConsultationPrenataleRepository consultationPrenataleRepository;

	public ConsultationPrenatale addConsultationPrenatale(ConsultationPrenatale consultationPrenatale)
	{
		return consultationPrenataleRepository.save(consultationPrenatale);
	}

	public ConsultationPrenatale getConsultationPrenatale(Long id)
	{
		return consultationPrenataleRepository.findById(id).get();
	}

	public List<ConsultationPrenatale> getConsultationPrenatales()
	{
		return consultationPrenataleRepository.findAll();
	}

	public ConsultationPrenatale updateConsultationPrenatale(ConsultationPrenatale consultationPrenatale)
	{
		return consultationPrenataleRepository.save(consultationPrenatale);
	}

	public void deleteConsultationPrenatale(Long id)
	{
		consultationPrenataleRepository.deleteById(id);
	}

	@Transactional
	public void addPatientToConsultationPrenatale(Long id, ConsultationPrenatale consultationPrenatale)
	{
		Patient patient = patientRepository.findById(id).get();
		consultationPrenataleRepository.save(consultationPrenatale);
		consultationPrenatale.setPatient(patient);
	}

	@Override
	public ConsultationPrenatale addPatientToConsultationPrenataleByMat(String matricule,
			ConsultationPrenatale consultationPrenatale)
	{
		Patient p = patientRepository.findByMatricule(matricule);
		
		String dateNaissance = p.getDateNaissance()+"";
		LocalDate start_date = LocalDate.parse(dateNaissance);
		LocalDate end_date = LocalDate.now();
		String groupeAge = DifferenceDate.findGroupeAge(start_date, end_date);
		consultationPrenatale.setGroupeAge(groupeAge);
		
		consultationPrenataleRepository.save(consultationPrenatale);
		consultationPrenatale.setPatient(p);
		
		return consultationPrenatale;
	}

	
	
}

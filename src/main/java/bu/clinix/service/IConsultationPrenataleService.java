package bu.clinix.service;

import java.util.List;

import bu.clinix.entities.ConsultationPrenatale;

public interface IConsultationPrenataleService
{
	ConsultationPrenatale addConsultationPrenatale(ConsultationPrenatale consultationPrenatale);
	ConsultationPrenatale getConsultationPrenatale(Long id);
	List<ConsultationPrenatale> getConsultationPrenatales();
	ConsultationPrenatale updateConsultationPrenatale(ConsultationPrenatale consultationPrenatale);
	void deleteConsultationPrenatale(Long id);
	void addPatientToConsultationPrenatale(Long id, ConsultationPrenatale consultationPrenatale);
	ConsultationPrenatale addPatientToConsultationPrenataleByMat(String matricule, ConsultationPrenatale consultationPrenatale);
}

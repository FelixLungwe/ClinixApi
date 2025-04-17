package bu.clinix.service;

import java.util.List;

import bu.clinix.entities.ConsultationExterne;

public interface IConsultationExterneService
{
	ConsultationExterne addConsultationExterne(ConsultationExterne consultationExterne);
	ConsultationExterne getConsultationExterne(Long id);
	List<ConsultationExterne> getConsultationExternes();
	ConsultationExterne updateConsultationExterne(ConsultationExterne consultationExterne);
	void deleteConsultationExterne(Long id);
	void addPatientToConsultationExterne(Long id, ConsultationExterne consultationExterne);
	ConsultationExterne addPatientToConsultationExterneByMat(String matricule, ConsultationExterne consultationExterne);

}

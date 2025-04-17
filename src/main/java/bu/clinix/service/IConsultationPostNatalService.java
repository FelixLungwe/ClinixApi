package bu.clinix.service;

import java.util.List;

import bu.clinix.entities.ConsultationPostNatal;

public interface IConsultationPostNatalService
{
	ConsultationPostNatal addConsultationPostNatal(ConsultationPostNatal consultationPostNatal);
	ConsultationPostNatal getConsultationPostNatal(Long id);
	List<ConsultationPostNatal> getConsultationPostNatals();
	ConsultationPostNatal updateConsultationPostNatal(ConsultationPostNatal consultationPostNatal);
	void deleteConsultationPostNatal(Long id);
	void addPatientToConsultationPostNatal(Long id, ConsultationPostNatal consultationPostNatal);
	ConsultationPostNatal addPatientToConsultationPostNatalByMat(String matricule, ConsultationPostNatal consultationPostNatal);
}

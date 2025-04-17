package bu.clinix.service;

import java.util.List;

import bu.clinix.entities.PlanificationFamiliale;

public interface IPlanificationFamilialeService
{
	PlanificationFamiliale addPlanificationFamiliale(PlanificationFamiliale planificationFamiliale);
	PlanificationFamiliale getPlanificationFamiliale(Long id);
	List<PlanificationFamiliale> getPlanificationFamiliales();
	PlanificationFamiliale updatePlanificationFamiliale(PlanificationFamiliale planificationFamiliale);
	void deletePlanificationFamiliale(Long id);
	void addPatientToPlanificationFamiliale(Long id, PlanificationFamiliale planificationFamiliale);
	PlanificationFamiliale addPatientToPlanificationFamilialeByMat(String matricule, PlanificationFamiliale planificationFamiliale);
}

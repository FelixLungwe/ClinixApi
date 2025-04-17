package bu.clinix.service;

import java.util.List;

import bu.clinix.entities.Intervation;

public interface IIntervationService
{
	Intervation addIntervation(Intervation intervation);
	Intervation getIntervation(Long id);
	List<Intervation> getIntervations();
	Intervation updateIntervation(Intervation intervation);
	void deleteIntervation(Long id);
	void addPatientToIntervation(Long id, Intervation intervation);
	void addPatientToIntervationByMat(String matricule, Intervation intervation);
}

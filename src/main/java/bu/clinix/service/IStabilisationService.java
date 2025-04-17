package bu.clinix.service;

import java.util.List;

import bu.clinix.entities.Stabilisation;

public interface IStabilisationService
{
	Stabilisation addStabilisation(Stabilisation stabilisation);
	Stabilisation getStabilisation(Long id);
	List<Stabilisation> getStabilisations();
	Stabilisation updateStabilisation(Stabilisation stabilisation);
	void deleteStabilisation(Long id);
	void addPatientToStabilisation(Long id, Stabilisation stabilisation);
	Stabilisation addPatientToStabilisationByMat(String matricule, Stabilisation stabilisation);
}

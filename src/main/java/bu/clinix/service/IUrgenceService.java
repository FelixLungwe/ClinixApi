package bu.clinix.service;

import java.util.List;

import bu.clinix.entities.Urgence;

public interface IUrgenceService
{
	Urgence addUrgence(Urgence urgence);
	Urgence getUrgence(Long id);
	List<Urgence> getUrgences();
	Urgence updateUrgence(Urgence urgence);
	void deleteUrgence(Long id);
	void addPatientToUrgence(Long id, Urgence urgence);
	Urgence addPatientToUrgenceByMat(String matricule, Urgence urgence);
}

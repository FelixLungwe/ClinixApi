package bu.clinix.service;

import java.util.List;

import bu.clinix.entities.Entree;

public interface IEntreeService
{
	Entree addEntree(Entree entree);
	Entree getEntree(Long id);
	List<Entree> getEntrees();
	Entree updateEntree(Entree entree);
	void deleteEntree(Long id);
	void addPatientToEntree(Long id, Entree entree);

	Entree addPatientToEntreeByMat(String matricule, Entree entree);
}

package bu.clinix.service;

import java.util.List;

import bu.clinix.entities.Sortie;

public interface ISortieService
{
	Sortie addSortie(Sortie sortie);
	Sortie getSortie(Long id);
	List<Sortie> getSorties();
	Sortie updateSortie(Sortie sortie);
	void deleteSortie(Long id);
	void addPatientToSortie(Long id, Sortie sortie);
	Sortie addPatientToSortieByMat(String matricule, Sortie sortie);
}

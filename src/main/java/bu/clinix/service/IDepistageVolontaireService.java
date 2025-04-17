package bu.clinix.service;

import java.util.List;

import bu.clinix.entities.DepistageVolontaire;

public interface IDepistageVolontaireService
{
	DepistageVolontaire addDepistageVolontaire(DepistageVolontaire depistageVolontaire);
	DepistageVolontaire getDepistageVolontaire(Long id);
	List<DepistageVolontaire> getDepistageVolontaires();
	DepistageVolontaire updateDepistageVolontaire(DepistageVolontaire depistageVolontaire);
	void deleteDepistageVolontaire(Long id);
	void addPatientToDepistageVolontaire(Long id, DepistageVolontaire depistageVolontaire);
	DepistageVolontaire addPatientToDepistageVolontaireByMat(String matricule, DepistageVolontaire depistageVolontaire);
}

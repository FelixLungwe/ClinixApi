package bu.clinix.service;

import java.util.List;

import bu.clinix.entities.Accouchement;

public interface IAccouchementService
{
	Accouchement addAccouchement(Accouchement accouchement);
	Accouchement getAccouchement(Long id);
	List<Accouchement> getAccouchements();
	Accouchement updateAccouchement(Accouchement accouchement);
	void deleteAccouchement(Long id);
	void addPatientToAccouchement(Long id, Accouchement accouchement);
	Accouchement addPatientToAccouchementByMat(String matricule, Accouchement accouchement);
}

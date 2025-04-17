package bu.clinix.service;

import java.util.List;

import bu.clinix.entities.Patient;

public interface IPatientService
{
	Patient addPatient(Patient patient);
	Patient getPatient(Long id);
	List<Patient> getPatients();
	Patient updatePatient(Patient patient);
	void deletePatient(Long id);
	Patient getPatientByMatricule(String matricule);
	//Patient getRecentSave(Date dateEnregistre);
	//Patient getRecentSave(Date dateEnregistre1);
	//Patient getRecentSave(Date dateEnregistre1);
}

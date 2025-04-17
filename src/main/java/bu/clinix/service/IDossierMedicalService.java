package bu.clinix.service;

import java.util.List;

import bu.clinix.entities.Biometrie_Antecedents;
import bu.clinix.entities.ChefFamille;
import bu.clinix.entities.DossierMedical;
import bu.clinix.entities.Synthese_sortie;

public interface IDossierMedicalService
{
	DossierMedical addDossierMedical(DossierMedical dossierMedical);
	DossierMedical getDossierMedical(Long id);
	List<DossierMedical> getDossierMedicals();
	DossierMedical updateDossierMedical(DossierMedical dossierMedical);
	void deleteDossierMedical(Long id);
	//DossierMedical getDMbyIdPatient(Long idPatient);
	DossierMedical addChefFamilleToDM(Long idDM, ChefFamille chefFamille);
	
	DossierMedical addBioToDM(Long idDM, Biometrie_Antecedents biometrie_Antecedents);
	
	DossierMedical addSyntheseToDM(Long idDM, Synthese_sortie synthese_sortie);
	
	DossierMedical addPatientToDM(String matriculePatient, DossierMedical dossierMedical);
	
	DossierMedical getDMbyIdPatient(String matriculePatient);
}

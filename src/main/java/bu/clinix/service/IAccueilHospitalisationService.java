package bu.clinix.service;

import java.util.List;

import bu.clinix.entities.AccueilHospitalisation;

public interface IAccueilHospitalisationService
{
	AccueilHospitalisation addAccueilHospitalisation(AccueilHospitalisation accueilHospitalisation);
	AccueilHospitalisation getAccueilHospitalisation(Long id);
	List<AccueilHospitalisation> getAccueilHospitalisations();
	AccueilHospitalisation updateAccueilHospitalisation(AccueilHospitalisation accueilHospitalisation);
	void deleteAccueilHospitalisation(Long id);
	AccueilHospitalisation addPatientToAccueilHospitalisation(Long id, AccueilHospitalisation accueilHospitalisation);
	AccueilHospitalisation addPatientToAccueilHospitalisationByMat(String matricule, AccueilHospitalisation accueilHospitalisation);
	AccueilHospitalisation updatePatientToAccueilHospitalisationByMat(String matricule, AccueilHospitalisation accueilHospitalisation);
}

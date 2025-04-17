package bu.clinix.service;

import java.util.List;

import bu.clinix.entities.AccueilConsultExt;

public interface IAccueilConsultExtService
{
	AccueilConsultExt addAccueilConsultExt(AccueilConsultExt accueilConsultExt);
	AccueilConsultExt getAccueilConsultExt(Long id);
	List<AccueilConsultExt> getAccueilConsultExts();
	AccueilConsultExt updateAccueilConsultExt(AccueilConsultExt accueilConsultExt);
	void deleteAccueilConsultExt(Long id);
	AccueilConsultExt addPatientToAccueilConsultExt(Long id, AccueilConsultExt accueilConsultExt);
	AccueilConsultExt addPatientToAccueilConsultExtByMat(String matricule, AccueilConsultExt accueilConsultExt);
	AccueilConsultExt updatePatientToAccueilConsulExtByMat(String matricule, AccueilConsultExt accueilConsultExt);
}

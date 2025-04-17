package bu.clinix.service;

import java.util.List;

import bu.clinix.entities.Biometrie_Antecedents;

public interface IBiometrieAntecedantService
{
	Biometrie_Antecedents addBiometrie_Antecedents(Biometrie_Antecedents biometrie_Antecedents);
	Biometrie_Antecedents getBiometrie_Antecedents(Long id);
	List<Biometrie_Antecedents> getBiometrie_Antecedentss();
	Biometrie_Antecedents updateBiometrie_Antecedents(Biometrie_Antecedents biometrie_Antecedents);
	void deleteBiometrie_Antecedents(Long id);
	//void addBiometrieAntecedantToDM(Long id, Biometrie_Antecedents biometrie_Antecedents);
}

package bu.clinix.service;

import java.util.List;

import bu.clinix.entities.GynecoObstetrique;

public interface IGynecoObstetriqueService
{
	GynecoObstetrique addGynecoObstetrique(GynecoObstetrique gynecoObstetrique);
	GynecoObstetrique getGynecoObstetrique(Long id);
	List<GynecoObstetrique> getGynecoObstetriques();
	GynecoObstetrique updateGynecoObstetrique(GynecoObstetrique gynecoObstetrique);
	void deleteGynecoObstetrique(Long id);
	void addPatientToGynecoObstetrique(Long id, GynecoObstetrique gynecoObstetrique);
	GynecoObstetrique addPatientToGynecoObstetriqueByMat(String matricule, GynecoObstetrique gynecoObstetrique);
	
}

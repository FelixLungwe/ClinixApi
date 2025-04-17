package bu.clinix.service;

import java.util.List;

import bu.clinix.entities.Examen;

public interface IExamenService
{
	Examen addExamen(Examen examen);
	Examen getExamen(Long id);
	List<Examen> getExamens();
	Examen updateExamen(Examen examen);
	void deleteExamen(Long id);
	void addPatientToExamen(Long id, Examen examen);
	Examen addPatientToExamenByMat(String matricule, Examen examen);
}

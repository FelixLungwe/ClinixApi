package bu.clinix.service;

import java.util.List;

import bu.clinix.entities.Transfusion;

public interface ITransfusionService
{
	Transfusion addTransfusion(Transfusion transfusion);
	Transfusion getTransfusion(Long id);
	List<Transfusion> getTransfusions();
	Transfusion updateTransfusion(Transfusion transfusion);
	void deleteTransfusion(Long id);
	void addPatientToTransfusion(Long id, Transfusion transfusion);
	Transfusion addPatientToTransfusionByMat(String matricule, Transfusion transfusion);
}

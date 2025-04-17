package bu.clinix.service;

import java.util.List;

import bu.clinix.entities.Acte;

public interface IActeService
{
	Acte addActe(Acte acte);
	Acte getActe(Long id);
	List<Acte> getActes();
	Acte updateActe(Acte acte);
	void deleteActe(Long id);
	void addPatientToActe(Long id, Acte acte);
	Acte addPatientToActeByMat( String matricule, Acte acte);
}

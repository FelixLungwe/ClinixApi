package bu.clinix.service;

import java.util.List;

import bu.clinix.entities.Synthese_sortie;

public interface ISyntheseSortieService
{
	Synthese_sortie addSynthese_sortie(Synthese_sortie synthese_sortie);
	Synthese_sortie getSynthese_sortie(Long id);
	List<Synthese_sortie> getSynthese_sorties();
	Synthese_sortie updateSynthese_sortie(Synthese_sortie synthese_sortie);
	void deleteSynthese_sortie(Long id);
	//void addSyntheseSortieToDM(Long id, Synthese_sortie synthese_sortie);
}

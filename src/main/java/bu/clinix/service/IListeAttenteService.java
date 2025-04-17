package bu.clinix.service;

import java.util.List;

import bu.clinix.entities.ListeAttente;

public interface IListeAttenteService
{
	
	ListeAttente saveListeAttente(ListeAttente listeAttente);
	void deleteListeAttente(Long id);
	ListeAttente updateListeAttente(ListeAttente listeAttente);
	ListeAttente getListeAttente(Long id);
	List<ListeAttente> getListeAttentes();
	List<ListeAttente> getListeAttenteByServiceDestination(String serviceDestination);
	ListeAttente savePatientToListeAttente(Long id, ListeAttente listeAttente);
	ListeAttente savePatientToListeAttenteByMat(String matricule, ListeAttente listeAttente);
	
}

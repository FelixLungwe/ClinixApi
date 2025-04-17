package bu.clinix.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import bu.clinix.dao.ListeAttenteRepository;
import bu.clinix.dao.PatientRepository;
import bu.clinix.entities.ListeAttente;
import bu.clinix.entities.Patient;

@Service
public class ListeAttenteServiceImpl implements IListeAttenteService
{  
	@Autowired
	private ListeAttenteRepository listeAttenteRepository;
	
	@Autowired
	private PatientRepository patientRepository;

	@Override
	public ListeAttente saveListeAttente(ListeAttente listeAttente)
	{
		// TODO Auto-generated method stub
		return listeAttenteRepository.save(listeAttente);
	}

	@Override
	public void deleteListeAttente(Long id)
	{
		// TODO Auto-generated method stub
		listeAttenteRepository.deleteById(id);
		
	}

	@Override
	public ListeAttente updateListeAttente(ListeAttente listeAttente)
	{
		// TODO Auto-generated method stub
		return listeAttenteRepository.save(listeAttente);
	}

	@Override
	public ListeAttente getListeAttente(Long id)
	{
		// TODO Auto-generated method stub
		return listeAttenteRepository.findById(id).get();
	}

	@Override
	public List<ListeAttente> getListeAttentes()
	{
		// TODO Auto-generated method stub
		return listeAttenteRepository.findAll();
	}
	
	
	@Override
	public List<ListeAttente> getListeAttenteByServiceDestination(String serviceDestination)
	{
		// TODO Auto-generated method stub
		return listeAttenteRepository.findByServiceDestination(serviceDestination);
	}

	@Transactional
	@Override
	public ListeAttente savePatientToListeAttente(Long id, ListeAttente listeAttente)
	{
		Patient patient = patientRepository.findById(id).get();
		listeAttenteRepository.save(listeAttente);
		listeAttente.setPatient(patient);
		return listeAttente;
	}

	@Override
	public ListeAttente savePatientToListeAttenteByMat(String matricule, ListeAttente listeAttente)
	{
		System.out.println("-------------liste attente save with patient----------");
		Patient p = patientRepository.findByMatricule(matricule);
		System.out.println("-------------after recuperating patient-------------");
		listeAttenteRepository.save(listeAttente);
		listeAttente.setPatient(p);
		System.out.println("---------------after all on liste attente save with patien------");
		return listeAttente;
	}

}

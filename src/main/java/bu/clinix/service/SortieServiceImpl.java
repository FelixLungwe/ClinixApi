package bu.clinix.service;

import java.time.LocalDate;
import java.util.List;

import org.hibernate.engine.transaction.spi.IsolationDelegate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import bu.clinix.dao.PatientRepository;
import bu.clinix.dao.SortieRepository;
import bu.clinix.entities.Patient;
import bu.clinix.entities.Sortie;

@Service
public class SortieServiceImpl implements ISortieService
{
	@Autowired
	private SortieRepository sortieRepository;
	
	@Autowired
	private PatientRepository patientRepository;

	public Sortie addSortie(Sortie sortie)
	{
		return sortieRepository.save(sortie);
	}

	public Sortie getSortie(Long id)
	{
		return sortieRepository.findById(id).get();
	}

	public List<Sortie> getSorties()
	{
		return sortieRepository.findAll();
	}

	public Sortie updateSortie(Sortie sortie)
	{
		return sortieRepository.save(sortie);
	}

	public void deleteSortie(Long id)
	{
		sortieRepository.deleteById(id);
	}

	@Transactional
	public void addPatientToSortie(Long id, Sortie sortie)
	{
		Patient patient = patientRepository.findById(id).get();
		sortieRepository.save(sortie);
		sortie.setPatient(patient);
	}

	@Override
	public Sortie addPatientToSortieByMat(String matricule, Sortie sortie)
	{
		Patient p = patientRepository.findByMatricule(matricule);
		
		String dateNaissance = p.getDateNaissance()+"";
		LocalDate start_date = LocalDate.parse(dateNaissance);
		LocalDate end_date = LocalDate.now();
		String groupeAge = DifferenceDate.findGroupeAge(start_date, end_date);
		sortie.setGroupeAge(groupeAge);
		
        sortieRepository.save(sortie);
		sortie.setPatient(p);
		
		return sortie;
	}
	
	

}

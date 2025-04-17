package bu.clinix.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import bu.clinix.dao.BiometrieAntecedantRepository;
import bu.clinix.dao.ChefFamilleRepository;
import bu.clinix.dao.DossierMedicalRepository;
import bu.clinix.dao.PatientRepository;
import bu.clinix.dao.SyntheseSortieRepository;
import bu.clinix.entities.Biometrie_Antecedents;
import bu.clinix.entities.ChefFamille;
import bu.clinix.entities.DossierMedical;
import bu.clinix.entities.Patient;
import bu.clinix.entities.Synthese_sortie;

@Service
public class DossierMedicalServiceImpl implements IDossierMedicalService
{
	@Autowired
	private DossierMedicalRepository dossierMedicalRepository;
	
	@Autowired
	private ChefFamilleRepository chefFamilleRepository;
	
	@Autowired
	private BiometrieAntecedantRepository biometrieAntecedantRepository;
	
	@Autowired
	private SyntheseSortieRepository syntheseSortieRepository;
	
	@Autowired
	private PatientRepository patientRepository;

	@Override
	public DossierMedical addDossierMedical(DossierMedical dossierMedical)
	{
		// TODO Auto-generated method stub
		return dossierMedicalRepository.save(dossierMedical);
	}

	@Override
	public DossierMedical getDossierMedical(Long id)
	{
		// TODO Auto-generated method stub
		return dossierMedicalRepository.findById(id).get();
	}

	@Override
	public List<DossierMedical> getDossierMedicals()
	{
		System.out.println("------getDossierMedicals-------");
		// TODO Auto-generated method stub
		try
		{
			return dossierMedicalRepository.findAll();
		} catch (Exception e)
		{
			System.out.println("--------------except--getDossierMedicals");
			return null;
		}
		
	}

	@Override
	public DossierMedical updateDossierMedical(DossierMedical dossierMedical)
	{
		// TODO Auto-generated method stub
		return dossierMedicalRepository.save(dossierMedical);
	}

	@Override
	public void deleteDossierMedical(Long id)
	{
		// TODO Auto-generated method stub
		dossierMedicalRepository.deleteById(id);
	}

	
	@Override
	@Transactional
	public DossierMedical addChefFamilleToDM(Long idDM, ChefFamille chefFamille)
	{
		// TODO Auto-generated method stub
		System.out.println("_-------addChefFamilleToDM-----idDM:"+idDM);
		ChefFamille chefFamille2 = chefFamilleRepository.save(chefFamille);
		DossierMedical dossierMedical = dossierMedicalRepository.findById(idDM).get();
		System.out.println("_-------addChefFamilleToDM-----idCF:"+chefFamille2.getCf_id()+"---idDM:"+dossierMedical.getNumDossierMed());
		dossierMedical.setChefFamille(chefFamille2);
		chefFamille2.setDossierMedical(dossierMedical);
		return dossierMedical;
	}

	@Transactional
	@Override
	public DossierMedical addBioToDM(Long idDM, Biometrie_Antecedents biometrie_Antecedents)
	{
		// TODO Auto-generated method stub
		biometrie_Antecedents = biometrieAntecedantRepository.save(biometrie_Antecedents);
		DossierMedical dossierMedical = dossierMedicalRepository.findById(idDM).get();
		dossierMedical.setBiometrie_Antecedents(biometrie_Antecedents);
		return dossierMedical;
	}

	@Transactional
	@Override
	public DossierMedical addSyntheseToDM(Long idDM, Synthese_sortie synthese_sortie)
	{
		// TODO Auto-generated method stub
		DossierMedical dossierMedical = dossierMedicalRepository.findById(idDM).get();
		syntheseSortieRepository.save(synthese_sortie);
		synthese_sortie.setDossierMedical(dossierMedical);
		return dossierMedical;
	}

	
	@Override
	@Transactional
	public DossierMedical addPatientToDM(String matriculePatient, DossierMedical dossierMedical)
	{
		System.out.println("----------------matriculePatient:--"+matriculePatient);
		
		Patient patient = patientRepository.findByMatricule(matriculePatient);
		System.out.println("-------------findByMatricule-----"+patient.getPatient_id());
		dossierMedicalRepository.save(dossierMedical);
		dossierMedical.setPatient(patient);
		System.out.println("-------------setPatient-----"+dossierMedical.getPatient().getPatient_id());
		return dossierMedical;
	}

	@Override
	public DossierMedical getDMbyIdPatient(String matriculePatient)
	{
		// TODO Auto-generated method stu
		Patient patient = patientRepository.findByMatricule(matriculePatient);
		Long numDM = patient.getDossierMedical().getNumDossierMed();
		DossierMedical d = dossierMedicalRepository.findById(numDM).get();
		return d;
	}

//	@Override
//	public DossierMedical getDMbyIdPatient(Long idPatient)
//	{
//		// TODO Auto-generated method stub
//		return dossierMedicalRepository.findDossierMedicalByIdPatient(idPatient);
//	}

}

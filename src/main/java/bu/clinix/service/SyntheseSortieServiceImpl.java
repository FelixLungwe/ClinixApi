package bu.clinix.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bu.clinix.dao.DossierMedicalRepository;
import bu.clinix.dao.SyntheseSortieRepository;
import bu.clinix.entities.DossierMedical;
import bu.clinix.entities.Synthese_sortie;

@Service
public class SyntheseSortieServiceImpl implements ISyntheseSortieService
{
	@Autowired
	private SyntheseSortieRepository syntheseSortieRepository;
	
	@Autowired
	private DossierMedicalRepository dossierMedicalRepository;

	@Override
	public Synthese_sortie addSynthese_sortie(Synthese_sortie synthese_sortie)
	{
		// TODO Auto-generated method stub
		return syntheseSortieRepository.save(synthese_sortie);
	}

	@Override
	public Synthese_sortie getSynthese_sortie(Long id)
	{
		// TODO Auto-generated method stub
		return syntheseSortieRepository.findById(id).get();
	}

	@Override
	public List<Synthese_sortie> getSynthese_sorties()
	{
		// TODO Auto-generated method stub
		return syntheseSortieRepository.findAll();
	}

	@Override
	public Synthese_sortie updateSynthese_sortie(Synthese_sortie synthese_sortie)
	{
		// TODO Auto-generated method stub
		return syntheseSortieRepository.save(synthese_sortie);
	}

	@Override
	public void deleteSynthese_sortie(Long id)
	{
		// TODO Auto-generated method stub
		syntheseSortieRepository.deleteById(id);
	}

	

}

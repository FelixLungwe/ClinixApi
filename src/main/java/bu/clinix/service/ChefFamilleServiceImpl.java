package bu.clinix.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bu.clinix.dao.ChefFamilleRepository;
import bu.clinix.entities.ChefFamille;

@Service
public class ChefFamilleServiceImpl implements IChefFamilleService
{
	@Autowired
	private ChefFamilleRepository chefFamilleRepository;

	@Override
	public ChefFamille addChefFamille(ChefFamille chefFamille)
	{
		// TODO Auto-generated method stub
		return chefFamilleRepository.save(chefFamille);
	}

	@Override
	public ChefFamille getChefFamille(Long id)
	{
		// TODO Auto-generated method stub
		return chefFamilleRepository.findById(id).get();
	}

	@Override
	public List<ChefFamille> getChefFamilles()
	{
		// TODO Auto-generated method stub
		return chefFamilleRepository.findAll();
	}

	@Override
	public ChefFamille updateChefFamille(ChefFamille chefFamille)
	{
		// TODO Auto-generated method stub
		return chefFamilleRepository.save(chefFamille);
	}

	@Override
	public void deleteChefFamille(Long id)
	{
		// TODO Auto-generated method stub
		chefFamilleRepository.deleteById(id);
	}

	

}

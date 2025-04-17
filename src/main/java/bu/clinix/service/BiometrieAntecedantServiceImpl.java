package bu.clinix.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bu.clinix.dao.BiometrieAntecedantRepository;
import bu.clinix.entities.Biometrie_Antecedents;

@Service
public class BiometrieAntecedantServiceImpl implements IBiometrieAntecedantService
{
	@Autowired
	private BiometrieAntecedantRepository biometrieAntecedantRepository;

	@Override
	public Biometrie_Antecedents addBiometrie_Antecedents(Biometrie_Antecedents biometrie_Antecedents)
	{
		// TODO Auto-generated method stub
		return biometrieAntecedantRepository.save(biometrie_Antecedents);
	}

	@Override
	public Biometrie_Antecedents getBiometrie_Antecedents(Long id)
	{
		// TODO Auto-generated method stub
		return biometrieAntecedantRepository.findById(id).get();
	}

	@Override
	public List<Biometrie_Antecedents> getBiometrie_Antecedentss()
	{
		// TODO Auto-generated method stub
		return biometrieAntecedantRepository.findAll();
	}

	@Override
	public Biometrie_Antecedents updateBiometrie_Antecedents(Biometrie_Antecedents biometrie_Antecedents)
	{
		// TODO Auto-generated method stub
		return biometrieAntecedantRepository.save(biometrie_Antecedents);
	}

	@Override
	public void deleteBiometrie_Antecedents(Long id)
	{
		// TODO Auto-generated method stub
		biometrieAntecedantRepository.deleteById(id);
	}

	

}

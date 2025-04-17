package bu.clinix.service;

import java.util.List;

import bu.clinix.entities.ChefFamille;

public interface IChefFamilleService
{
	ChefFamille addChefFamille(ChefFamille chefFamille);
	ChefFamille getChefFamille(Long id);
	List<ChefFamille> getChefFamilles();
	ChefFamille updateChefFamille(ChefFamille chefFamille);
	void deleteChefFamille(Long id);
	//void addChefFamilleToDM(Long id, ChefFamille chefFamille);
	
}

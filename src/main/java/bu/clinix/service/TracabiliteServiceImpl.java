package bu.clinix.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import bu.clinix.dao.AppUserRepository;
import bu.clinix.dao.TracabiliteRepository;
import bu.clinix.entities.AppUser;
import bu.clinix.entities.Tracabilite;

@Service
public class TracabiliteServiceImpl implements ITracabiliteService
{
	@Autowired
	private TracabiliteRepository tracabiliteRepository;
	
	@Autowired
	private AppUserRepository appUserRepository;

	@Override
	public Tracabilite saveTracabilite(Tracabilite tracabilite)
	{
		// TODO Auto-generated method stub
		return tracabiliteRepository.save(tracabilite);
	}

	@Override
	public void deleteTracabilite(Long id)
	{
		// TODO Auto-generated method stub
		tracabiliteRepository.deleteById(id);
	}

	@Override
	public Tracabilite updateTracabilite(Tracabilite tracabilite)
	{
		// TODO Auto-generated method stub
		return tracabiliteRepository.save(tracabilite);
	}

	@Override
	public Tracabilite getTracabilite(Long id)
	{
		// TODO Auto-generated method stub
		return tracabiliteRepository.findById(id).get();
	}

	@Override
	public List<Tracabilite> getTracabilites()
	{
		// TODO Auto-generated method stub
		return tracabiliteRepository.findByOrderByIdDesc();
	}

	@Override
	public List<Tracabilite> getTracabilitesByUsername(String username)
	{
		// TODO Auto-generated method stub
		return tracabiliteRepository.findByUsername(username);
	}

	@Override
	public List<Tracabilite> getTracabilitesByOperation(String operation)
	{
		// TODO Auto-generated method stub
		return tracabiliteRepository.findByOperation(operation);
	}

	@Transactional
	@Override
	public Tracabilite saveUserToTracabilite(String username, Tracabilite tracabilite)
	{
		
		System.out.println("---------user to tarce-------- service");
		AppUser appUser = appUserRepository.findByUsername(username);
		tracabiliteRepository.save(tracabilite);
		tracabilite.setAppUser(appUser);
		return tracabilite;
	}
	

}

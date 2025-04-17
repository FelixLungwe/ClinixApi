package bu.clinix.service;

import java.util.List;

import bu.clinix.entities.Tracabilite;

public interface ITracabiliteService
{
	Tracabilite saveTracabilite(Tracabilite tracabilite);
	void deleteTracabilite(Long id);
	Tracabilite updateTracabilite(Tracabilite tracabilite);
	Tracabilite getTracabilite(Long id);
	List<Tracabilite> getTracabilites();
	List<Tracabilite> getTracabilitesByUsername(String username);
	List<Tracabilite> getTracabilitesByOperation(String operation);
	Tracabilite saveUserToTracabilite(String username, Tracabilite tracabilite);
}

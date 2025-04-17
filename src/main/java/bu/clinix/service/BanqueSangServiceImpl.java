package bu.clinix.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import bu.clinix.dao.BanqueSangRepository;
import bu.clinix.dao.PatientRepository;
import bu.clinix.entities.BanqueSang;
import bu.clinix.entities.Patient;

@Service
public class BanqueSangServiceImpl implements IBanqueSangService
{
	@Autowired
	private PatientRepository patientRepository;
	
	@Autowired
	private BanqueSangRepository banqueSangRepository;

	public BanqueSang addBanqueSang(BanqueSang banqueSang)
	{
		return banqueSangRepository.save(banqueSang);
	}

	public BanqueSang getBanqueSang(Long id)
	{
		return banqueSangRepository.findById(id).get();
	}

	public List<BanqueSang> getBanqueSangs()
	{
		return banqueSangRepository.findAll();
	}

	public BanqueSang updateBanqueSang(BanqueSang banqueSang)
	{
		return banqueSangRepository.save(banqueSang);
	}

	public void deleteBanqueSang(Long id)
	{
		banqueSangRepository.deleteById(id);
	}

	@Transactional
	public void addPatientToBanqueSang(Long id, BanqueSang banqueSang)
	{
		Patient patient = patientRepository.findById(id).get();
		banqueSangRepository.save(banqueSang);
		banqueSang.setPatient(patient);
	}

	@Override
	@Transactional
	public BanqueSang addPatientToBanqueSangByMat(String matricule, BanqueSang banqueSang)
	{
		Patient p = patientRepository.findByMatricule(matricule);
		
//		String dateNaissance = p.getDateNaissance()+"";
//		LocalDate start_date = LocalDate.parse(dateNaissance);
//		LocalDate end_date = LocalDate.now();
//		String groupeAge = DifferenceDate.findGroupeAge(start_date, end_date);
//		banqueSang.setGroupeAge(groupeAge);
		
		banqueSangRepository.save(banqueSang);
		banqueSang.setPatient(p);
		
		return banqueSang;
	}
	
}

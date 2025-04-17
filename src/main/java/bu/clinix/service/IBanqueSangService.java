package bu.clinix.service;

import java.util.List;

import bu.clinix.entities.BanqueSang;

public interface IBanqueSangService
{
	BanqueSang addBanqueSang(BanqueSang banqueSang);
	BanqueSang getBanqueSang(Long id);
	List<BanqueSang> getBanqueSangs();
	BanqueSang updateBanqueSang(BanqueSang banqueSang);
	void deleteBanqueSang(Long id);
	void addPatientToBanqueSang(Long id, BanqueSang banqueSang);
	BanqueSang addPatientToBanqueSangByMat(String matricule, BanqueSang banqueSang);

}

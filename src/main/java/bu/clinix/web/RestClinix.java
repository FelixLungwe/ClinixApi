package bu.clinix.web;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Date;
import java.util.List;

//import javax.persistence.Access;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.annotation.JsonFormat;

import bu.clinix.entities.AccueilConsultExt;
import bu.clinix.entities.AccueilHospitalisation;
import bu.clinix.entities.Acte;
import bu.clinix.entities.AppRole;
//import bu.clinix.entities.AppRole;
import bu.clinix.entities.AppUser;
import bu.clinix.entities.BanqueSang;
import bu.clinix.entities.Biometrie_Antecedents;
import bu.clinix.entities.ChefFamille;
import bu.clinix.entities.ConsultationExterne;
import bu.clinix.entities.ConsultationPostNatal;
import bu.clinix.entities.ConsultationPrenatale;
import bu.clinix.entities.DepistageVolontaire;
import bu.clinix.entities.DossierMedical;
import bu.clinix.entities.Entree;
import bu.clinix.entities.Examen;
import bu.clinix.entities.GynecoObstetrique;
import bu.clinix.entities.Intervation;
import bu.clinix.entities.ListeAttente;
import bu.clinix.entities.Message;
import bu.clinix.entities.PasswordForm;
import bu.clinix.entities.Patient;
import bu.clinix.entities.PlanificationFamiliale;
import bu.clinix.entities.Sortie;
import bu.clinix.entities.Stabilisation;
import bu.clinix.entities.Synthese_sortie;
import bu.clinix.entities.T_trace;
import bu.clinix.entities.Tracabilite;
import bu.clinix.entities.Transfusion;
import bu.clinix.entities.Urgence;
import bu.clinix.service.IPatientService;
import bu.clinix.service.DifferenceDate;
import bu.clinix.service.IAccueilConsultExtService;
import bu.clinix.service.IAccueilHospitalisationService;
import bu.clinix.service.IActeService;
import bu.clinix.service.IAppRoleService;
//import bu.clinix.service.IAppRoleService;
import bu.clinix.service.IAppUserService;
import bu.clinix.service.IBanqueSangService;
import bu.clinix.service.IBiometrieAntecedantService;
import bu.clinix.service.IChefFamilleService;
import bu.clinix.service.IConsultationExterneService;
import bu.clinix.service.IConsultationPostNatalService;
import bu.clinix.service.IConsultationPrenataleService;
import bu.clinix.service.IDepistageVolontaireService;
import bu.clinix.service.IDossierMedicalService;
import bu.clinix.service.IEntreeService;
import bu.clinix.service.IExamenService;
import bu.clinix.service.IGynecoObstetriqueService;
import bu.clinix.service.IIntervationService;
import bu.clinix.service.IListeAttenteService;
import bu.clinix.service.IMessageService;
import bu.clinix.service.IPatientService;
import bu.clinix.service.IPlanificationFamilialeService;
import bu.clinix.service.ISortieService;
import bu.clinix.service.IStabilisationService;
import bu.clinix.service.ISyntheseSortieService;
import bu.clinix.service.ITracabiliteService;
import bu.clinix.service.ITransfusionService;
import bu.clinix.service.IUrgenceService;


@RequestMapping("/clinix-api")
@CrossOrigin(origins = "*")
@RestController
public class RestClinix
{
	@Autowired
	private IAppRoleService iAppRoleService;
	
	@Autowired
	private IAppUserService iAppUserService;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yy")
	private Date dateEnregistre1;
	@Autowired
	private IPatientService iPatientService;
	
	@Autowired
	private ITracabiliteService iTracabiliteService;
	
	@Autowired
	private IListeAttenteService iListeAttenteService;
		
	@Autowired
	private IAccueilConsultExtService iAccueilConsultExtService;
	
	@Autowired
	private IAccueilHospitalisationService iAccueilHospitalisationService;
	
	@Autowired
	private IActeService iActeService;
	
	@Autowired
	private IBanqueSangService iBanqueSangService;
	
	@Autowired
	private IConsultationExterneService iConsultationExterneService;
	
	@Autowired
	private IConsultationPostNatalService iConsultationPostNatalService;
	
	@Autowired
	private IConsultationPrenataleService iConsultationPrenataleService;
	
	@Autowired
	private IDepistageVolontaireService iDepistageVolontaireService;
	
	@Autowired
	private IEntreeService iEntreeService;
	
	@Autowired
	private IExamenService iExamenService;
	
	@Autowired
	private IGynecoObstetriqueService iGynecoObstetriqueService;
	
	@Autowired
	private IIntervationService iIntervationService;
	
	@Autowired
	private IPlanificationFamilialeService iPlanificationFamilialeService;
	
	@Autowired
	private ISortieService iSortieService;
	
	@Autowired
	private IStabilisationService iStabilisationService;
	
	@Autowired
	private ITransfusionService iTransfusionService;
	
	@Autowired
	private IUrgenceService iUrgenceService;
	
	@Autowired
	private IDossierMedicalService iDossierMedicalService;
	
	@Autowired
	private IChefFamilleService iChefFamilleService;
	
	@Autowired
	private ISyntheseSortieService iSyntheseSortieService;
	
	@Autowired
	private IBiometrieAntecedantService iBiometrieAntecedantService;
	
	@Autowired
	private IMessageService iMessageService;

	// others variables 
	public static final String DIRECTORY = "E:" + File.separator + "AngularProjet" + File.separator+"Clinix"+ File.separator+"src"+ File.separator+"assets"+ File.separator;
	//public static final String DIRECTORY = "E:" + File.separator + "images" + File.separator;

	@Autowired
	private PasswordEncoder passwordEncoder;
	

	//----------------------------------------restPatient----------------------------------------
	
	@PostMapping(path = "/patient")
	public Patient savePatient(@RequestBody Patient patient)
	{
		System.out.println("start savePatient rest");
		System.out.println("----------"+patient.getFullname()+"-------"+patient.getQuartierColline());
		return iPatientService.addPatient(patient);
	}

	@GetMapping(path = "/patient/{id}")
	public Patient getPatient(@PathVariable("id") Long id)
	{
		Patient p = iPatientService.getPatient(id);
		for (int i = 0; i < p.getAccueilConsultExts().size(); i++)
		{
			System.out.println("-------------getPatient accueil:"+i+"---:"+p.getAccueilConsultExts().get(i).getModePayement());
		}
		return p;
	}
	
	
//	@GetMapping(path = "/patientByMat/{matricule}")
//	public Patient getPatientByMatricule(@PathVariable("matricule") String matricule)
//	{
//		Patient p = iPatientService.getPatientByMatricule(matricule);
//		System.out.println("-----------------patientByMat----------size-----"+p.getAccueilConsultExts().size());
//		for (int i = 0; i < p.getAccueilConsultExts().size(); i++)
//		{
//			System.out.println("-------------getPatient accueil:"+i+"---:"+p.getAccueilConsultExts().get(i).getModePayement());
//		}
//		return p;
//	}
	
	@GetMapping(value = "/patientByMat/{matricule}")
	public ResponseEntity<Patient> getPatientByMatricule(@PathVariable("matricule") String matricule)
	{
		System.out.println("-----------------------getPatientByMatricule---------------------");
		Patient p = iPatientService.getPatientByMatricule(matricule);
		System.out.println("-----------------patientByMat----------size-----"+p.getAccueilConsultExts().size());
		for (int i = 0; i < p.getAccueilConsultExts().size(); i++)
		{
			System.out.println("-------------getPatient accueil:"+i+"---:"+p.getAccueilConsultExts().get(i).getModePayement());
		}
		return new ResponseEntity(p, HttpStatus.OK);
	}
	
	@GetMapping(value = "/patientToTrace/{matricule}")
	public ResponseEntity<List<T_trace>> getPatientToTraceByMatricule(@PathVariable("matricule") String matricule)
	{
		System.out.println("-----------------------getPatientByMatricule---------------------");
		Patient p = iPatientService.getPatientByMatricule(matricule);
		System.out.println("-----------------patientByMat----------size-----"+p.getAccueilConsultExts().size());
		for (int i = 0; i < p.getAccueilConsultExts().size(); i++)
		{
			System.out.println("-------------getPatient accueil:"+i+"---:"+p.getAccueilConsultExts().get(i).getModePayement());
		}
		
		List<T_trace> t_traces = DifferenceDate.generateObjectTrace(p);
		
		return new ResponseEntity(t_traces, HttpStatus.OK);
	}

	@GetMapping(value = "/patients")
	public List<Patient> getPatients()
	{
		return iPatientService.getPatients();
	}

	@DeleteMapping(path = "/patient/{id}")
	public void deletePatient(@PathVariable("id") Long id)
	{
		iPatientService.deletePatient(id);
	}

	@PutMapping(path = "/patient")
	public Patient updatePatients(@RequestBody Patient patient)
	{
		return iPatientService.updatePatient(patient);
	}
	
	//----------------------------------------restTracabilite---------------------------------
	@PostMapping(path = "/addUserToTracabilite/{username}")
	public Tracabilite saveUserToTrace(@RequestBody Tracabilite tracabilite, @PathVariable("username") String username)
	{
		System.out.println("-------------user to trace --- rest");
		return iTracabiliteService.saveUserToTracabilite(username, tracabilite);
	}
	
	@PostMapping(path = "/tracabilite")
	public Tracabilite saveTracabilite(@RequestBody Tracabilite tracabilite)
	{
		return iTracabiliteService.saveTracabilite(tracabilite);
	}

	@GetMapping(path = "/tracabilite/{id}")
	public Tracabilite getTracabilite(@PathVariable("id") Long id)
	{
		return iTracabiliteService.getTracabilite(id);
	}

	@GetMapping(path = "/tracabilites")
	public List<Tracabilite> getTracabilites()
	{
		return iTracabiliteService.getTracabilites();
	}
	
	
	@GetMapping(path = "/tracabiliteByUsername/{username}")
	public List<Tracabilite> getTracabiliteUsername(@PathVariable("username") String username)
	{
		return iTracabiliteService.getTracabilitesByUsername(username);
	}
	
	@GetMapping(path = "/tracabiliteByOperation/{operation}")
	public List<Tracabilite> getTracabiliteOperation(@PathVariable("operation") String operation)
	{
		return iTracabiliteService.getTracabilitesByOperation(operation);
	}

	@DeleteMapping(path = "/tracabilite/{id}")
	public ResponseEntity<?> deleteTracabilite(@PathVariable("id") Long id)
	{
		iTracabiliteService.deleteTracabilite(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@PutMapping(path = "/tracabilite")
	public Tracabilite updateTracabilites(@RequestBody Tracabilite tracabilite)
	{
		return iTracabiliteService.updateTracabilite(tracabilite);
	}
	
	
	//----------------------------------------restListeAttente--------------------------------------------
	
	@PostMapping(path = "/patientToListeAttente/{id}")
	public ListeAttente saveListeAttente( @PathVariable("id") Long id, @RequestBody ListeAttente listeAttente)
	{
		return iListeAttenteService.savePatientToListeAttente(id, listeAttente);
	}
	@PostMapping(path = "/patientToListeAttenteByMat/{matricule}")
	public ListeAttente saveListeAttenteByMat( @PathVariable("matricule") String matricule, @RequestBody ListeAttente listeAttente)
	{
		System.out.println("------------------addPatientToListeAttenteByMatricule------------------------------");
		return iListeAttenteService.savePatientToListeAttenteByMat(matricule, listeAttente);
	}
	
	@PostMapping(path = "/listeAttente")
	public ListeAttente savePatientToListeAttente(@RequestBody ListeAttente listeAttente)
	{
		return iListeAttenteService.saveListeAttente(listeAttente);
	}

	@GetMapping(path = "/listeAttente/{id}")
	public ListeAttente getListeAttente(@PathVariable("id") Long id)
	{
		return iListeAttenteService.getListeAttente(id);
	}

	@GetMapping(path = "/listeAttentes")
	public List<ListeAttente> getListeAttentes()
	{
		return iListeAttenteService.getListeAttentes();
	}
	
	
	@GetMapping(path = "/listeAttenteByService/{service}")
	public List<ListeAttente> getListeAttenteService(@PathVariable("service") String service)
	{
		return iListeAttenteService.getListeAttenteByServiceDestination(service);
	}

	@DeleteMapping(path = "/listeAttente/{id}")
	public ResponseEntity<?> deleteListeAttente(@PathVariable("id") Long id)
	{
		iListeAttenteService.deleteListeAttente(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@PutMapping(path = "/listeAttente")
	public ListeAttente updateListeAttentes(@RequestBody ListeAttente listeAttente)
	{
		return iListeAttenteService.updateListeAttente(listeAttente);
	}
	
	//----------------------------------------restAccueilConsultExt----------------------------------------
	
	@PostMapping(path = "/accueilConsultExt")
	public AccueilConsultExt saveAccueilConsultExt(@RequestBody AccueilConsultExt accueilConsultExt)
	{
		return iAccueilConsultExtService.addAccueilConsultExt(accueilConsultExt);
	}

	@GetMapping(path = "/accueilConsultExt/{id}")
	public AccueilConsultExt getAccueilConsultExt(@PathVariable("id") Long id)
	{
		return iAccueilConsultExtService.getAccueilConsultExt(id);
	}

	@GetMapping(path = "/accueilConsultExts")
	public List<AccueilConsultExt> getAccueilConsultExts()
	{
		return iAccueilConsultExtService.getAccueilConsultExts();
	}

	@DeleteMapping(path = "/accueilConsultExt/{id}")
	public void deleteAccueilConsultExt(@PathVariable("id") Long id)
	{
		iAccueilConsultExtService.deleteAccueilConsultExt(id);
	}

	@PutMapping(path = "/accueilConsultExt")
	public AccueilConsultExt updateAccueilConsultExts(@RequestBody AccueilConsultExt accueilConsultExt)
	{
		return iAccueilConsultExtService.updateAccueilConsultExt(accueilConsultExt);
	}
	@PostMapping("/patientToAccueilConsultExt/{idPatient}")
	public AccueilConsultExt addPatientToAccueilConsultExt(@RequestBody AccueilConsultExt accueilConsultExt, @PathVariable("idPatient") Long idPatient)
	{
		 return iAccueilConsultExtService.addPatientToAccueilConsultExt(idPatient, accueilConsultExt);
	}
	
	@PutMapping("/patientToAccueilConsultExtByMat/{matricule}")
	public AccueilConsultExt updatePatientToAccueilConsultExtByMat(@RequestBody AccueilConsultExt accueilConsultExt, @PathVariable("matricule") String matricule) {
		return iAccueilConsultExtService.updatePatientToAccueilConsulExtByMat(matricule, accueilConsultExt);
	}
	
	@PostMapping("/patientToAccueilConsultExtByMat/{matricule}")
	public AccueilConsultExt addPatientToAccueilConsulExtByMat(@RequestBody AccueilConsultExt accueilConsultExt, @PathVariable("matricule") String matricule)
	{
		 return iAccueilConsultExtService.addPatientToAccueilConsultExtByMat(matricule, accueilConsultExt);
	}
	
//	@GetMapping(value = "/roles")
//	public ResponseEntity<AppRole> getRoles()
//	{
//		System.out.println("-------------getRoles---------------->");
//		List<AppRole> appRoles = iAppRoleService.listRoles();
//		return new ResponseEntity(appRoles, HttpStatus.OK);
//	}
	
	//----------------------------------------restAccueilHospitalisation----------------------------------------
	
	@PostMapping(path = "/accueilHospitalisation")
	public AccueilHospitalisation saveAccueilHospitalisation(@RequestBody AccueilHospitalisation accueilHospitalisation)
	{
		return iAccueilHospitalisationService.addAccueilHospitalisation(accueilHospitalisation);
	}

	@GetMapping(path = "/accueilHospitalisation/{id}")
	public AccueilHospitalisation getAccueilHospitalisation(@PathVariable("id") Long id)
	{
		return iAccueilHospitalisationService.getAccueilHospitalisation(id);
	}

	@GetMapping(path = "/accueilHospitalisations")
	public List<AccueilHospitalisation> getAccueilHospitalisations()
	{
		return iAccueilHospitalisationService.getAccueilHospitalisations();
	}

	@DeleteMapping(path = "/accueilHospitalisation/{id}")
	public void deleteAccueilHospitalisation(@PathVariable("id") Long id)
	{
		iAccueilHospitalisationService.deleteAccueilHospitalisation(id);
	}

	@PutMapping(path = "/accueilHospitalisation")
	public AccueilHospitalisation updateAccueilHospitalisations(@RequestBody AccueilHospitalisation accueilHospitalisation)
	{
		return iAccueilHospitalisationService.updateAccueilHospitalisation(accueilHospitalisation);
	}
	@PostMapping("/patientToAccueilHospitalisation/{idPatient}")
	public AccueilHospitalisation addPatientToAccueilHospitalisation(@RequestBody AccueilHospitalisation accueilHospitalisation, @PathVariable("idPatient") Long idPatient)
	{
		 return iAccueilHospitalisationService.addPatientToAccueilHospitalisation(idPatient, accueilHospitalisation);
	}
	
	@PutMapping("/patientToAccueilHospitalisationByMat/{matricule}")
	public AccueilHospitalisation updatePatientToAccueilHospitalisationByMat(@RequestBody AccueilHospitalisation accueilHospitalisation, @PathVariable("matricule") String matricule) {
		return iAccueilHospitalisationService.updatePatientToAccueilHospitalisationByMat(matricule, accueilHospitalisation);
	}
	
	@PostMapping("/patientToAccueilHospitalisationByMat/{matricule}")
	public void addPatientToAccueilConsulExtByMat(@RequestBody AccueilHospitalisation accueilHospitalisation, @PathVariable("matricule") String matricule)
	{
		 iAccueilHospitalisationService.addPatientToAccueilHospitalisationByMat(matricule, accueilHospitalisation);
	}

	//----------------------------------------restActe----------------------------------------
	
	@PostMapping(path = "/acte")
	public Acte saveActe(@RequestBody Acte acte)
	{
		return iActeService.addActe(acte);
	}

	@GetMapping(path = "/acte/{id}")
	public Acte getActe(@PathVariable("id") Long id)
	{
		return iActeService.getActe(id);
	}

	@GetMapping(path = "/actes")
	public List<Acte> getActes()
	{
		return iActeService.getActes();
	}

	@DeleteMapping(path = "/acte/{id}")
	public void deleteActe(@PathVariable("id") Long id)
	{
		iActeService.deleteActe(id);
	}

	@PutMapping(path = "/acte")
	public Acte updateActes(@RequestBody Acte acte)
	{
		return iActeService.updateActe(acte);
	}
	@PostMapping("/patientToActe/{idPatient}")
	public void addPatientToRendezVoous(@RequestBody Acte acte, @PathVariable("idPatient") Long idPatient)
	{
		 iActeService.addPatientToActe(idPatient, acte);
	}
	@PostMapping("/patientToActeByMat/{matricule}")
	public Acte addPatientToActeByMat(@RequestBody Acte acte, @PathVariable("matricule") String matricule)
	{
		 return iActeService.addPatientToActeByMat(matricule, acte);
	}

	//----------------------------------------restBanqueSang----------------------------------------
	
	@PostMapping(path = "/banqueSang")
	public BanqueSang saveBanqueSang(@RequestBody BanqueSang banqueSang)
	{
		return iBanqueSangService.addBanqueSang(banqueSang);
	}

	@GetMapping(path = "/banqueSang/{id}")
	public BanqueSang getBanqueSang(@PathVariable("id") Long id)
	{
		return iBanqueSangService.getBanqueSang(id);
	}

	@GetMapping(path = "/banqueSangs")
	public List<BanqueSang> getBanqueSangs()
	{
		return iBanqueSangService.getBanqueSangs();
	}

	@DeleteMapping(path = "/banqueSang/{id}")
	public void deleteBanqueSang(@PathVariable("id") Long id)
	{
		iBanqueSangService.deleteBanqueSang(id);
	}

	@PutMapping(path = "/banqueSang")
	public BanqueSang updateBanqueSangs(@RequestBody BanqueSang banqueSang)
	{
		return iBanqueSangService.updateBanqueSang(banqueSang);
	}
	@PostMapping("/patientToBanqueSang/{idPatient}")
	public void addPatientToBanqueSang(@RequestBody BanqueSang banqueSang, @PathVariable("idPatient") Long idPatient)
	{
		 iBanqueSangService.addPatientToBanqueSang(idPatient, banqueSang);
	}
	
	@PostMapping("/patientToBanqueSangByMat/{matricule}")
	public BanqueSang addPatientToBanqueSangByMat(@RequestBody BanqueSang banqueSang, @PathVariable("matricule") String matricule)
	{
		 return iBanqueSangService.addPatientToBanqueSangByMat(matricule, banqueSang);
	}
	

	//----------------------------------------restConsultationExterne----------------------------------------
	
	@PostMapping(path = "/consultationExterne")
	public ConsultationExterne saveConsultationExterne(@RequestBody ConsultationExterne consultationExterne)
	{
		return iConsultationExterneService.addConsultationExterne(consultationExterne);
	}

	@GetMapping(path = "/consultationExterne/{id}")
	public ConsultationExterne getConsultationExterne(@PathVariable("id") Long id)
	{
		return iConsultationExterneService.getConsultationExterne(id);
	}

	@GetMapping(path = "/consultationExternes")
	public List<ConsultationExterne> getConsultationExternes()
	{
		return iConsultationExterneService.getConsultationExternes();
	}

	@DeleteMapping(path = "/consultationExterne/{id}")
	public void deleteConsultationExterne(@PathVariable("id") Long id)
	{
		iConsultationExterneService.deleteConsultationExterne(id);
	}

	@PutMapping(path = "/consultationExterne")
	public ConsultationExterne updateConsultationExternes(@RequestBody ConsultationExterne consultationExterne)
	{
		return iConsultationExterneService.updateConsultationExterne(consultationExterne);
	}
	@PostMapping("/patientToConsultationExterne/{idPatient}")
	public void addPatientToRendezVoous(@RequestBody ConsultationExterne consultationExterne, @PathVariable("idPatient") Long idPatient)
	{
		 iConsultationExterneService.addPatientToConsultationExterne(idPatient, consultationExterne);
	}
	
	@PostMapping("/patientToConsultationExterneByMat/{matricule}")
	public void addPatientConsultationExterneByMat(@RequestBody ConsultationExterne consultationExterne, @PathVariable("matricule") String matricule)
	{
		 iConsultationExterneService.addPatientToConsultationExterneByMat(matricule, consultationExterne);
	}

	//----------------------------------------restConsultationPostNatal----------------------------------------
	
	@PostMapping(path = "/consultationPostNatal")
	public ConsultationPostNatal saveConsultationPostNatal(@RequestBody ConsultationPostNatal consultationPostNatal)
	{
		return iConsultationPostNatalService.addConsultationPostNatal(consultationPostNatal);
	}

	@GetMapping(path = "/consultationPostNatal/{id}")
	public ConsultationPostNatal getConsultationPostNatal(@PathVariable("id") Long id)
	{
		return iConsultationPostNatalService.getConsultationPostNatal(id);
	}

	@GetMapping(path = "/consultationPostNatals")
	public List<ConsultationPostNatal> getConsultationPostNatals()
	{
		return iConsultationPostNatalService.getConsultationPostNatals();
	}

	@DeleteMapping(path = "/consultationPostNatal/{id}")
	public void deleteConsultationPostNatal(@PathVariable("id") Long id)
	{
		iConsultationPostNatalService.deleteConsultationPostNatal(id);
	}

	@PutMapping(path = "/consultationPostNatal")
	public ConsultationPostNatal updateConsultationPostNatals(@RequestBody ConsultationPostNatal consultationPostNatal)
	{
		return iConsultationPostNatalService.updateConsultationPostNatal(consultationPostNatal);
	}
	@PostMapping("/patientToConsultationPostNatal/{idPatient}")
	public void addPatientToRendezVoous(@RequestBody ConsultationPostNatal consultationPostNatal, @PathVariable("idPatient") Long idPatient)
	{
		 iConsultationPostNatalService.addPatientToConsultationPostNatal(idPatient, consultationPostNatal);
	}
	
	@PostMapping("/patientToConsultationPostNatalByMat/{matricule}")
	public void addPatientConsultationPostNatalByMat(@RequestBody ConsultationPostNatal consultationPostNatal, @PathVariable("matricule") String matricule)
	{
		 iConsultationPostNatalService.addPatientToConsultationPostNatalByMat(matricule, consultationPostNatal);
	}
	

	//----------------------------------------restConsultationPrenatale----------------------------------------
	
	@PostMapping(path = "/consultationPrenatale")
	public ConsultationPrenatale saveConsultationPrenatale(@RequestBody ConsultationPrenatale consultationPrenatale)
	{
		return iConsultationPrenataleService.addConsultationPrenatale(consultationPrenatale);
	}

	@GetMapping(path = "/consultationPrenatale/{id}")
	public ConsultationPrenatale getConsultationPrenatale(@PathVariable("id") Long id)
	{
		return iConsultationPrenataleService.getConsultationPrenatale(id);
	}

	@GetMapping(path = "/consultationPrenatales")
	public List<ConsultationPrenatale> getConsultationPrenatales()
	{
		return iConsultationPrenataleService.getConsultationPrenatales();
	}

	@DeleteMapping(path = "/consultationPrenatale/{id}")
	public void deleteConsultationPrenatale(@PathVariable("id") Long id)
	{
		iConsultationPrenataleService.deleteConsultationPrenatale(id);
	}

	@PutMapping(path = "/consultationPrenatale")
	public ConsultationPrenatale updateConsultationPrenatales(@RequestBody ConsultationPrenatale consultationPrenatale)
	{
		return iConsultationPrenataleService.updateConsultationPrenatale(consultationPrenatale);
	}
	@PostMapping("/patientToConsultationPrenatale/{idPatient}")
	public void addPatientToRendezVoous(@RequestBody ConsultationPrenatale consultationPrenatale, @PathVariable("idPatient") Long idPatient)
	{
		 iConsultationPrenataleService.addPatientToConsultationPrenatale(idPatient, consultationPrenatale);
	}
	
	@PostMapping("/patientToConsultationPrenataleByMat/{matricule}")
	public void addPatientConsultationPrenataleByMat(@RequestBody ConsultationPrenatale consultationPrenatale, @PathVariable("matricule") String matricule)
	{
		 iConsultationPrenataleService.addPatientToConsultationPrenataleByMat(matricule, consultationPrenatale);
	}
	

	//----------------------------------------restDepistageVolontaire----------------------------------------
	
	@PostMapping(path = "/depistageVolontaire")
	public DepistageVolontaire saveDepistageVolontaire(@RequestBody DepistageVolontaire depistageVolontaire)
	{
		return iDepistageVolontaireService.addDepistageVolontaire(depistageVolontaire);
	}

	@GetMapping(path = "/depistageVolontaire/{id}")
	public DepistageVolontaire getDepistageVolontaire(@PathVariable("id") Long id)
	{
		return iDepistageVolontaireService.getDepistageVolontaire(id);
	}

	@GetMapping(path = "/depistageVolontaires")
	public List<DepistageVolontaire> getDepistageVolontaires()
	{
		return iDepistageVolontaireService.getDepistageVolontaires();
	}

	@DeleteMapping(path = "/depistageVolontaire/{id}")
	public void deleteDepistageVolontaire(@PathVariable("id") Long id)
	{
		iDepistageVolontaireService.deleteDepistageVolontaire(id);
	}

	@PutMapping(path = "/depistageVolontaire")
	public DepistageVolontaire updateDepistageVolontaires(@RequestBody DepistageVolontaire depistageVolontaire)
	{
		return iDepistageVolontaireService.updateDepistageVolontaire(depistageVolontaire);
	}
	@PostMapping("/patientToDepistageVolontaire/{idPatient}")
	public void addPatientToRendezVoous(@RequestBody DepistageVolontaire depistageVolontaire, @PathVariable("idPatient") Long idPatient)
	{
		 iDepistageVolontaireService.addPatientToDepistageVolontaire(idPatient, depistageVolontaire);
	}
	@PostMapping("/patientToDepistageVolontaireByMat/{matricule}")
	public void addPatientToDepistageVolontaireByMat(@RequestBody DepistageVolontaire depistageVolontaire, @PathVariable("matricule") String matricule)
	{
		 iDepistageVolontaireService.addPatientToDepistageVolontaireByMat(matricule, depistageVolontaire);
	}
	

	//----------------------------------------restEntree----------------------------------------
	
	@PostMapping(path = "/entree")
	public Entree saveEntree(@RequestBody Entree entree)
	{
		return iEntreeService.addEntree(entree);
	}

	@GetMapping(path = "/entree/{id}")
	public Entree getEntree(@PathVariable("id") Long id)
	{
		return iEntreeService.getEntree(id);
	}

	@GetMapping(path = "/entrees")
	public List<Entree> getEntrees()
	{
		return iEntreeService.getEntrees();
	}

	@DeleteMapping(path = "/entree/{id}")
	public void deleteEntree(@PathVariable("id") Long id)
	{
		iEntreeService.deleteEntree(id);
	}

	@PutMapping(path = "entree")
	public Entree updateEntrees(@RequestBody Entree entree)
	{
		return iEntreeService.updateEntree(entree);
	}
	@PostMapping("/patientToEntree/{idPatient}")
	public void addPatientToRendezVoous(@RequestBody Entree entree, @PathVariable("idPatient") Long idPatient)
	{
		 iEntreeService.addPatientToEntree(idPatient, entree);
	}
	
	@PostMapping("/patientToEntreeByMat/{matricule}")
	public void addPatientToEntreeByMat(@RequestBody Entree entree, @PathVariable("matricule") String matricule)
	{
		 iEntreeService.addPatientToEntreeByMat(matricule, entree);
	}
	

	//----------------------------------------restExamen----------------------------------------
	
	@PostMapping(path = "/examen")
	public Examen saveExamen(@RequestBody Examen examen)
	{
		return iExamenService.addExamen(examen);
	}

	@GetMapping(path = "/examen/{id}")
	public Examen getExamen(@PathVariable("id") Long id)
	{
		return iExamenService.getExamen(id);
	}

	@GetMapping(path = "/examens")
	public List<Examen> getExamens()
	{
		return iExamenService.getExamens();
	}

	@DeleteMapping(path = "/examen/{id}")
	public void deleteExamen(@PathVariable("id") Long id)
	{
		iExamenService.deleteExamen(id);
	}

	@PutMapping(path = "/examen")
	public Examen updateExamens(@RequestBody Examen examen)
	{
		return iExamenService.updateExamen(examen);
	}
	@PostMapping("/patientToExamen/{idPatient}")
	public void addPatientToRendezVoous(@RequestBody Examen examen, @PathVariable("idPatient") Long idPatient)
	{
		 iExamenService.addPatientToExamen(idPatient, examen);
	}
	
	@PostMapping("/patientToExamenByMat/{matricule}")
	public Examen addPatientToExamenByMat(@RequestBody Examen examen, @PathVariable("matricule") String matricule)
	{
		return iExamenService.addPatientToExamenByMat(matricule, examen);
	}
	
	@GetMapping("/examensByPatient/{matricule}")
	public List<Examen> getExamensByPatient(@PathVariable("matricule") String matricule)
	{
		try
		{
			System.out.println("----------getExamensByPatient-------------debut--");
			Patient patient = iPatientService.getPatientByMatricule(matricule);
			List<Examen> examens = patient.getExamens();
			System.out.println("-----------getExamensByPatient------------fin");
			
			return examens;
		} catch (Exception e)
		{
			System.out.println(e);
			System.out.println("---------------getExamensByPatient----except---");
			List<Examen> ex = List.of();
			return ex;
		}
	}
	

	//----------------------------------------restGynecoObstetrique----------------------------------------
	
	@PostMapping(path = "/gynecoObstetrique")
	public GynecoObstetrique saveGynecoObstetrique(@RequestBody GynecoObstetrique gynecoObstetrique)
	{
		return iGynecoObstetriqueService.addGynecoObstetrique(gynecoObstetrique);
	}

	@GetMapping(path = "/gynecoObstetrique/{id}")
	public GynecoObstetrique getGynecoObstetrique(@PathVariable("id") Long id)
	{
		return iGynecoObstetriqueService.getGynecoObstetrique(id);
	}

	@GetMapping(path = "/gynecoObstetriques")
	public List<GynecoObstetrique> getGynecoObstetriques()
	{
		return iGynecoObstetriqueService.getGynecoObstetriques();
	}

	@DeleteMapping(path = "/gynecoObstetrique/{id}")
	public void deleteGynecoObstetrique(@PathVariable("id") Long id)
	{
		iGynecoObstetriqueService.deleteGynecoObstetrique(id);
	}

	@PutMapping(path = "/gynecoObstetrique")
	public GynecoObstetrique updateGynecoObstetriques(@RequestBody GynecoObstetrique gynecoObstetrique)
	{
		return iGynecoObstetriqueService.updateGynecoObstetrique(gynecoObstetrique);
	}
	@PostMapping("/patientToGynecoObstetrique/{idPatient}")
	public void addPatientToRendezVoous(@RequestBody GynecoObstetrique gynecoObstetrique, @PathVariable("idPatient") Long idPatient)
	{
		 iGynecoObstetriqueService.addPatientToGynecoObstetrique(idPatient, gynecoObstetrique);
	}
	
	@PostMapping("/patientToGynecoObstetriqueByMat/{matricule}")
	public GynecoObstetrique addPatientToGynecoObstetriqueByMat(@RequestBody GynecoObstetrique gynecoObstetrique, @PathVariable("matricule") String matricule)
	{
		return iGynecoObstetriqueService.addPatientToGynecoObstetriqueByMat(matricule, gynecoObstetrique);
	}
	

	//----------------------------------------restIntervation----------------------------------------
	
	@PostMapping(path = "/intervation")
	public Intervation saveIntervation(@RequestBody Intervation intervation)
	{
		return iIntervationService.addIntervation(intervation);
	}

	@GetMapping(path = "/intervation/{id}")
	public Intervation getIntervation(@PathVariable("id") Long id)
	{
		return iIntervationService.getIntervation(id);
	}

	@GetMapping(path = "/intervations")
	public List<Intervation> getIntervations()
	{
		return iIntervationService.getIntervations();
	}

	@DeleteMapping(path = "/intervation/{id}")
	public void deleteIntervation(@PathVariable("id") Long id)
	{
		iIntervationService.deleteIntervation(id);
	}

	@PutMapping(path = "/intervation")
	public Intervation updateIntervations(@RequestBody Intervation intervation)
	{
		return iIntervationService.updateIntervation(intervation);
	}
	@PostMapping("/patientToIntervation/{idPatient}")
	public void addPatientToRendezVoous(@RequestBody Intervation intervation, @PathVariable("idPatient") Long idPatient)
	{
		 iIntervationService.addPatientToIntervation(idPatient,intervation);
	}
	
	@PostMapping("/patientToIntervationByMat/{matricule}")
	public void addPatientToIntervationByMat(@RequestBody Intervation intervation, @PathVariable("matricule") String matricule)
	{
		 iIntervationService.addPatientToIntervationByMat(matricule, intervation);
	}
	

	//----------------------------------------restPlanificationFamiliale----------------------------------------
	
	@PostMapping(path = "/planificationFamiliale")
	public PlanificationFamiliale savePlanificationFamiliale(@RequestBody PlanificationFamiliale planificationFamiliale)
	{
		return iPlanificationFamilialeService.addPlanificationFamiliale(planificationFamiliale);
	}

	@GetMapping(path = "/planificationFamiliale/{id}")
	public PlanificationFamiliale getPlanificationFamiliale(@PathVariable("id") Long id)
	{
		return iPlanificationFamilialeService.getPlanificationFamiliale(id);
	}

	@GetMapping(path = "/planificationFamiliales")
	public List<PlanificationFamiliale> getPlanificationFamiliales()
	{
		return iPlanificationFamilialeService.getPlanificationFamiliales();
	}

	@DeleteMapping(path = "/planificationFamiliale/{id}")
	public void deletePlanificationFamiliale(@PathVariable("id") Long id)
	{
		iPlanificationFamilialeService.deletePlanificationFamiliale(id);
	}

	@PutMapping(path = "/planificationFamiliale")
	public PlanificationFamiliale updatePlanificationFamiliales(@RequestBody PlanificationFamiliale planificationFamiliale)
	{
		return iPlanificationFamilialeService.updatePlanificationFamiliale(planificationFamiliale);
	}
	@PostMapping("/patientToPlanificationFamiliale/{idPatient}")
	public void addPatientToRendezVoous(@RequestBody PlanificationFamiliale planificationFamiliale, @PathVariable("idPatient") Long idPatient)
	{
		 iPlanificationFamilialeService.addPatientToPlanificationFamiliale(idPatient, planificationFamiliale);
	}
	
	@PostMapping("/patientToPlanificationFamilialeByMat/{matricule}")
	public void addPatientToPlanificationFamilialeByMat(@RequestBody PlanificationFamiliale planificationFamiliale, @PathVariable("matricule") String matricule)
	{
		 iPlanificationFamilialeService.addPatientToPlanificationFamilialeByMat(matricule, planificationFamiliale);
	}
	

	//----------------------------------------restSortie----------------------------------------
	
	@PostMapping(path = "/Sortie")
	public Sortie saveSortie(@RequestBody Sortie sortie)
	{
		return iSortieService.addSortie(sortie);
	}

	@GetMapping(path = "/sortie/{id}")
	public Sortie getSortie(@PathVariable("id") Long id)
	{
		return iSortieService.getSortie(id);
	}

	@GetMapping(path = "/sorties")
	public List<Sortie> getSorties()
	{
		return iSortieService.getSorties();
	}

	@DeleteMapping(path = "/sortie/{id}")
	public void deleteSortie(@PathVariable("id") Long id)
	{
		iSortieService.deleteSortie(id);
	}

	@PutMapping(path = "/sortie")
	public Sortie updateSorties(@RequestBody Sortie sortie)
	{
		return iSortieService.updateSortie(sortie);
	}
	@PostMapping("/patientToSortie/{idPatient}")
	public void addPatientToRendezVoous(@RequestBody Sortie sortie, @PathVariable("idPatient") Long idPatient)
	{
		 iSortieService.addPatientToSortie(idPatient, sortie);
	}
	
	@PostMapping("/patientToSortieByMat/{matricule}")
	public void addPatientToSortieByMat(@RequestBody Sortie sortie, @PathVariable("matricule") String matricule)
	{
		 iSortieService.addPatientToSortieByMat(matricule, sortie);
	}
	

	//----------------------------------------restStabilisation----------------------------------------
	
	@PostMapping(path = "/stabilisation")
	public Stabilisation saveStabilisation(@RequestBody Stabilisation stabilisation)
	{
		return iStabilisationService.addStabilisation(stabilisation);
	}

	@GetMapping(path = "/stabilisation/{id}")
	public Stabilisation getStabilisation(@PathVariable("id") Long id)
	{
		return iStabilisationService.getStabilisation(id);
	}

	@GetMapping(path = "/stabilisations")
	public List<Stabilisation> getStabilisations()
	{
		return iStabilisationService.getStabilisations();
	}

	@DeleteMapping(path = "/stabilisation/{id}")
	public void deleteStabilisation(@PathVariable("id") Long id)
	{
		iStabilisationService.deleteStabilisation(id);
	}

	@PutMapping(path = "/stabilisation")
	public Stabilisation updateStabilisations(@RequestBody Stabilisation stabilisation)
	{
		return iStabilisationService.updateStabilisation(stabilisation);
	}
	@PostMapping("/patientToStabilisation/{idPatient}")
	public void addPatientToRendezVoous(@RequestBody Stabilisation stabilisation, @PathVariable("idPatient") Long idPatient)
	{
		 iStabilisationService.addPatientToStabilisation(idPatient, stabilisation);
	}
	
	@PostMapping("/patientToStabilisationByMat/{matricule}")
	public void addPatientToStabilisationByMat(@RequestBody Stabilisation stabilisation, @PathVariable("matricule") String matricule)
	{
		 iStabilisationService.addPatientToStabilisationByMat(matricule, stabilisation);
	}

	//----------------------------------------restTransfusion----------------------------------------
	
	@PostMapping(path = "/transfusion")
	public Transfusion saveTransfusion(@RequestBody Transfusion transfusion)
	{
		return iTransfusionService.addTransfusion(transfusion);
	}

	@GetMapping(path = "/transfusion/{id}")
	public Transfusion getTransfusion(@PathVariable("id") Long id)
	{
		return iTransfusionService.getTransfusion(id);
	}

	@GetMapping(path = "/transfusions")
	public List<Transfusion> getTransfusions()
	{
		return iTransfusionService.getTransfusions();
	}

	@DeleteMapping(path = "/transfusion/{id}")
	public void deleteTransfusion(@PathVariable("id") Long id)
	{
		iTransfusionService.deleteTransfusion(id);
	}

	@PutMapping(path = "/transfusion")
	public Transfusion updateTransfusions(@RequestBody Transfusion transfusion)
	{
		return iTransfusionService.updateTransfusion(transfusion);
	}
	@PostMapping("/patientToTransfusion/{idPatient}")
	public void addPatientToRendezVoous(@RequestBody Transfusion transfusion, @PathVariable("idPatient") Long idPatient)
	{
		 iTransfusionService.addPatientToTransfusion(idPatient, transfusion);
	}
	
	@PostMapping("/patientToTransfusionByMat/{matricule}")
	public Transfusion addPatientToTransfusionByMat(@RequestBody Transfusion transfusion, @PathVariable("matricule") String matricule)
	{
		 return iTransfusionService.addPatientToTransfusionByMat(matricule, transfusion);
	}
	

	//----------------------------------------restUrgence----------------------------------------
	
	@PostMapping(path = "/urgence")
	public Urgence saveUrgence(@RequestBody Urgence urgence)
	{
		return iUrgenceService.addUrgence(urgence);
	}

	@GetMapping(path = "/urgence/{id}")
	public Urgence getUrgence(@PathVariable("id") Long id)
	{
		return iUrgenceService.getUrgence(id);
	}

	@GetMapping(path = "/urgences")
	public List<Urgence> getUrgences()
	{
		return iUrgenceService.getUrgences();
	}

	@DeleteMapping(path = "/urgence/{id}")
	public void deleteUrgence(@PathVariable("id") Long id)
	{
		iUrgenceService.deleteUrgence(id);
	}

	@PutMapping(path = "/urgence")
	public Urgence updateUrgences(@RequestBody Urgence urgence)
	{
		return iUrgenceService.updateUrgence(urgence);
	}
	@PostMapping("/patientToUrgence/{idPatient}")
	public void addPatientToRendezVoous(@RequestBody Urgence urgence, @PathVariable("idPatient") Long idPatient)
	{
		 iUrgenceService.addPatientToUrgence(idPatient, urgence);
	} 
	
	@PostMapping("/patientToUrgenceByMat/{matricule}")
	public void addPatientToUrgenceByMat(@RequestBody Urgence urgence, @PathVariable("matricule") String matricule)
	{
		 iUrgenceService.addPatientToUrgenceByMat(matricule, urgence);
	}
	
	

	/*-------------------------------dossier medical--------------------------------------------------*/
	
	@PostMapping(path = "/dossierMedical")
	public DossierMedical saveDossierMedical(@RequestBody DossierMedical dossierMedical)
	{
		
		return iDossierMedicalService.addDossierMedical(dossierMedical);
	}

	@GetMapping(path = "/dossierMedical/{id}")
	public DossierMedical getDossierMedical(@PathVariable("id") Long id)
	{
		DossierMedical dm = iDossierMedicalService.getDossierMedical(id);
		System.out.println("-------getDossierMedical-----ss--size-----"+dm.getSynthese_sortie().size());
		System.out.println("-------getDossierMedical-----cf--size-----"+dm.getChefFamille().getCf_nom());
		System.out.println("-------getDossierMedical-----bio--size-----"+dm.getBiometrie_Antecedents().getBio_Allergies());
		for (int i = 0; i < dm.getSynthese_sortie().size(); i++)
		{
			System.out.println("------------ss------modePayement---------"+dm.getSynthese_sortie().get(i).getSs_ModePaiement());
		}
		return dm;
	}
	
	@GetMapping(path = "/dossierMedicalToSS/{id}")
	public List<Synthese_sortie> getDossierMedicalToSS(@PathVariable("id") Long id)
	{
		DossierMedical dm = iDossierMedicalService.getDossierMedical(id);
		List<Synthese_sortie> sss = dm.getSynthese_sortie();
		return sss;
	}

	@GetMapping(path = "/dossierMedicals")
	public List<DossierMedical> getDossierMedicals()
	{
		try
		{
			System.out.println("----------rest getDossierMedicals()-------try--");
			return iDossierMedicalService.getDossierMedicals();
		} catch (Exception e)
		{
			System.out.println("----------rest getDossierMedicals()-------except--");
			return null;
		}
	}

	@DeleteMapping(path = "/dossierMedical/{id}")
	public void deleteDossierMedical(@PathVariable("id") Long id)
	{
		iDossierMedicalService.deleteDossierMedical(id);
	}

	@PutMapping(path = "/dossierMedical")
	public DossierMedical updateDossierMedicals(@RequestBody DossierMedical dossierMedical)
	{
		return iDossierMedicalService.updateDossierMedical(dossierMedical);
	}
	
	@PostMapping(path = "/addChefFamilleToDM/{idDM}")
	public DossierMedical addChefFamilleToDM(@PathVariable("idDM") Long idDM, @RequestBody ChefFamille chefFamille) 
	{
		return iDossierMedicalService.addChefFamilleToDM(idDM, chefFamille);
	}
	
	@PostMapping(path = "/addBioToDM/{idDM}")
	public DossierMedical addBioToDM(@PathVariable("idDM") Long idDM, @RequestBody Biometrie_Antecedents biometrie_Antecedents) 
	{
		return iDossierMedicalService.addBioToDM(idDM, biometrie_Antecedents);
	}
	
	@PostMapping(path = "/addSyntheseToDM/{idDM}")
	public DossierMedical addSyntheseToDM(@PathVariable("idDM") Long idDM, @RequestBody Synthese_sortie synthese_sortie) 
	{
		return iDossierMedicalService.addSyntheseToDM(idDM, synthese_sortie);
	}
	
	@PostMapping(path = "/addPatientToDM/{idPatient}")
	public DossierMedical addPatientToDM(@PathVariable("idPatient") String matriculePatient, @RequestBody DossierMedical dossierMedical)
	{
		return iDossierMedicalService.addPatientToDM(matriculePatient, dossierMedical);
	}
	
	@GetMapping(path = "/getDMbyIdPatient/{matr}")
	public DossierMedical getDMbyIdPatient(@PathVariable("matr") String matriculePatient)
	{
		return iDossierMedicalService.getDMbyIdPatient(matriculePatient);
	}
	
	
/*-------------------------------Messsage--------------------------------------------------*/
	
	@PostMapping(path = "/message")
	public Message saveMessage(@RequestBody Message message)
	{
		
		return iMessageService.addMessage(message);
	}

	@GetMapping(path = "/message/{id}")
	public Message getMessage(@PathVariable("id") Long id)
	{
		Message msg = iMessageService.getMessage(id);
		
		return msg;
	}
	

	@GetMapping(path = "/messages")
	public List<Message> getMessages()
	{
		try
		{
			System.out.println("----------rest getDossierMedicals()-------try--");
			return iMessageService.getMessages();
		} catch (Exception e)
		{
			System.out.println("----------rest getDossierMedicals()-------except--");
			return null;
		}
	}
	
	@GetMapping(path = "/dossierMedicalByUsername/{username}")
	public List<Message> getMessageUser(@PathVariable("username") String username)
	{
		try
		{
			System.out.println("----------rest getMessages()-------try--");
			return iMessageService.getMessagesByUsername(username);
		} catch (Exception e)
		{
			System.out.println("----------rest getMessages()-------except--");
			return null;
		}
	}

	@DeleteMapping(path = "/message/{id}")
	public void deleteMessage(@PathVariable("id") Long id)
	{
		iMessageService.deleteMessage(id);
	}

	@PutMapping(path = "/message")
	public Message updateMessage(@RequestBody Message message)
	{
		return iMessageService.updateMessage(message);
	}
	
	
	
	
	
	/*------------------------  chef de famille-------------------------*/
	
	@PostMapping(path = "/chefFamille")
	public ChefFamille saveChefFamille(@RequestBody ChefFamille chefFamille)
	{
		return iChefFamilleService.addChefFamille(chefFamille);
	}

	@GetMapping(path = "/chefFamille/{id}")
	public ChefFamille getChefFamille(@PathVariable("id") Long id)
	{
		return iChefFamilleService.getChefFamille(id);
	}

	@GetMapping(path = "/chefFamilles")
	public List<ChefFamille> getChefFamilles()
	{
		return iChefFamilleService.getChefFamilles();
	}

	@DeleteMapping(path = "/chefFamille/{id}")
	public void deleteChefFamille(@PathVariable("id") Long id)
	{
		iChefFamilleService.deleteChefFamille(id);
	}

	@PutMapping(path = "/chefFamille")
	public ChefFamille updateChefFamilles(@RequestBody ChefFamille chefFamille)
	{
		return iChefFamilleService.updateChefFamille(chefFamille);
	}
	
	/*------------------------ Biometrie & Antecedants-------------------------*/
	
	@PostMapping(path = "/biometrieAntecedant")
	public Biometrie_Antecedents saveUrgence(@RequestBody Biometrie_Antecedents biometrie_Antecedents)
	{
		return iBiometrieAntecedantService.addBiometrie_Antecedents(biometrie_Antecedents);
	}

	@GetMapping(path = "/biometrieAntecedent/{id}")
	public Biometrie_Antecedents getBiometrieAntecedant(@PathVariable("id") Long id)
	{
		return iBiometrieAntecedantService.getBiometrie_Antecedents(id);
	}

	@GetMapping(path = "/biometrieAntecedants")
	public List<Biometrie_Antecedents> getBiometrieAntecedants()
	{
		return iBiometrieAntecedantService.getBiometrie_Antecedentss();
	}

	@DeleteMapping(path = "/biometrieAntecedant/{id}")
	public void deleteBiometrieAntecedant(@PathVariable("id") Long id)
	{
		iBiometrieAntecedantService.deleteBiometrie_Antecedents(id);
	}

	@PutMapping(path = "/biometrieAntecedant")
	public Biometrie_Antecedents updateBiometrieAntecedants(@RequestBody Biometrie_Antecedents biometrieAntecedant)
	{
		return iBiometrieAntecedantService.updateBiometrie_Antecedents(biometrieAntecedant);
	}
	
	/*------------------------ Synthese de Sortie-------------------------*/
	
	@PostMapping(path = "/syntheseSortie")
	public Synthese_sortie saveSyntheseSortie(@RequestBody Synthese_sortie syntheseSortie)
	{
		return iSyntheseSortieService.addSynthese_sortie(syntheseSortie);
	}

	@GetMapping(path = "/syntheseSortie/{id}")
	public Synthese_sortie getSyntheseSortie(@PathVariable("id") Long id)
	{
		return iSyntheseSortieService.getSynthese_sortie(id);
	}

	@GetMapping(path = "/syntheseSorties")
	public List<Synthese_sortie> getSyntheseSorties()
	{
		return iSyntheseSortieService.getSynthese_sorties();
	}

	@DeleteMapping(path = "/syntheseSortie/{id}")
	public void deleteSyntheseSortie(@PathVariable("id") Long id)
	{
		iSyntheseSortieService.deleteSynthese_sortie(id);
	}

	@PutMapping(path = "/syntheseSortie")
	public Synthese_sortie updateSyntheseSorties(@RequestBody Synthese_sortie syntheseSortie)
	{
		return iSyntheseSortieService.updateSynthese_sortie(syntheseSortie);
	}
	
	//----------------------Gestion --- User --ANd --Role
	
	
	@GetMapping(value = "/user/{idUser}/{idRole}")
	public AppUser addUserToRoleById(@PathVariable("idUser") Long idUser, @PathVariable("idRole") Long idRole)
	{
		System.out.println("------------addUserToRoleById--------------");
		System.out.println("idUser:"+idUser+"-----------idRole"+idRole);
		return iAppUserService.addUserToRoleById(idUser, idRole);
	}
	
	
	
	/***
	 * appUser and appRole
	 * 
	 */

	@PostMapping(value = "/user/{id}")
	public ResponseEntity<AppUser> addUserToRole(@PathVariable("id") Long id, @Valid @RequestBody AppUser appUser)
			throws IOException
	{
		System.out.println("---------------addUserToRole------------");
		AppUser appUser2 = iAppUserService.addUserToRole(id, appUser);

		return new ResponseEntity<>(appUser2, HttpStatus.OK);
	}
	
	@PutMapping(value = "/role/{idUser}")
	public ResponseEntity<?> addRoleToUser(@PathVariable("username") String username, @Valid @RequestBody List<AppRole> appRoles)
			throws IOException
	{
		System.out.println("---------------addUserToRole------------");
		 iAppRoleService.addRoleToUser(username, appRoles);

		return new ResponseEntity<>( HttpStatus.OK);
	}

//	@GetMapping(value = "/user/{userName}")
//	public ResponseEntity<AppUser> profile(@PathVariable("userName") String userName)
//	{
//		System.out.println("start user load ");
//		
//		System.out.println(" user load ok");
//		
//		return new ResponseEntity(user, HttpStatus.OK);
//	}
	
	@GetMapping(value = "/userVerify/{userName}")
	public AppUser verifyUser(@PathVariable("userName") String userName)
	{
		String reponse = "noExist";
		AppUser user = null;
		System.out.println("----------------user-----initial: "+user);
		try
		{
			user = new AppUser();
			System.out.println("-----------------initializing--user----:"+user.equals(null));
			System.out.println("start user load ");
			user = iAppUserService.loadUserByUsername(userName);
			System.out.println("-------------user----after----load: "+user);
			System.out.println("---------------en suite----------:"+user.equals(null));
			System.out.println("---------------en suite encore----:"+user.getFullname());
			//System.out.println("username get:===="+ user.getUsername());
			reponse = "exist";
			
			if(user.equals(null)) {
				user = new AppUser();
				reponse = "noExist";
			}
		}
		
		catch (NullPointerException e) {
			reponse =  "noExist";
			user = new AppUser();
		}
		
		catch (Exception e)
		{
			System.out.println("exception loaduser"+e);
			user = new AppUser();
			reponse = "exist";
		}
		
		
		
		user.setUsername(reponse);
		
		System.out.println("-----------------voici l'username-------:"+user.getUsername());
		
		return user;
	}
	
	@GetMapping("/userById/{id}")
	public AppUser getUserById(@PathVariable("id") Long id)
	{
		return iAppUserService.getUserById(id);
	}
	
	@GetMapping(value = "/user/{userName}")
	public AppUser profile(@PathVariable("userName") String userName)
	{
		try
		{
			System.out.println("start user load ");
			AppUser user = iAppUserService.loadUserByUsername(userName);
			System.out.println("username get:===="+ user.getUsername());
			return user;
		} catch (Exception e)
		{
			System.out.println("exception loaduser"+e);
			return null;
		}
	}

//	@PostMapping(value = "/role")
//	public ResponseEntity<AppRole> addUser(@Valid @RequestBody AppRole appRole)
//	{
//		System.out.println("-----------------save--role----rest---------->");
//		AppRole appRoleSave = iAppRoleService.addAppRole(appRole);
//		return new ResponseEntity<AppRole>(appRoleSave, HttpStatus.OK);
//	}
	
	@PostMapping(value = "/user")
	public ResponseEntity<AppUser> addUser(@RequestBody AppUser appUser)
	{
		System.out.println("---------------user:"+appUser.getUsername()+appUser.getEmail()+appUser.getFullname()+appUser.getPassword()+appUser.getPhone()+appUser.getUrlPicture());
		System.out.println("--------------debut------save----user----");
		AppUser appUserSave = iAppUserService.addAppUser(appUser);
		System.out.println("---------------fin------save------user----");
		return new ResponseEntity<AppUser>(appUserSave, HttpStatus.OK);
	}

	@GetMapping(value = "/roles")
	public ResponseEntity<AppRole> getRoles()
	{
		System.out.println("-------------getRoles---------------->");
		List<AppRole> appRoles = iAppRoleService.listRoles();
		return new ResponseEntity(appRoles, HttpStatus.OK);
	}

	@DeleteMapping(value = "/role/{idRole}")
	public ResponseEntity<?> deleteRole(@PathVariable("idRole") Long idRole)
	{
		System.out.println("delete------------");
		iAppRoleService.deleteAppRole(idRole);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@DeleteMapping(value = "/user/{idUser}")
	public ResponseEntity<?> deleteUser(@PathVariable("idUser") Long idUser)
	{
		System.out.println("delete------------");
		iAppUserService.deleteUser(idUser);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@PutMapping(value = "/role")
	public ResponseEntity<AppRole> updateRole(@RequestBody AppRole appRole)
	{
		AppRole appRole2 = iAppRoleService.updateRole(appRole);
		return new ResponseEntity<>(appRole2, HttpStatus.OK);
	}

	@PutMapping(value = "/user")
	public ResponseEntity<AppUser> updateUser(@RequestBody AppUser appUser)
	{
		System.out.println("------------debut--------update---user");
		AppUser appUser2 = iAppUserService.updateUser(appUser);
		System.out.println("------update-------user----------");
		return new ResponseEntity<>(appUser2, HttpStatus.OK);
	}
	@PutMapping(value = "/userHiden")
	public ResponseEntity<?> up_date_user(@RequestBody AppUser appUser)
	{
		System.out.println("------------debut--------update---user");
		 iAppUserService.up_date_User(appUser);
		System.out.println("------update-------user----------");
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@PostMapping(value = "/role")
	public ResponseEntity<AppRole> addUser(@Valid @RequestBody AppRole appRole)
	{
		System.out.println("-----------------save--role----rest---------->");
		AppRole appRoleSave = iAppRoleService.addAppRole(appRole);
		return new ResponseEntity<AppRole>(appRoleSave, HttpStatus.OK);
	}

	@GetMapping(value = "/users")
	public ResponseEntity<List<AppUser>> getAllUsers()
	{
		List<AppUser> listUsers = iAppUserService.listUsers();
		return new ResponseEntity(listUsers, HttpStatus.OK);
	}
	
	@PostMapping(value = "/convertingPassword")
	public ResponseEntity<PasswordForm> hashPassword(@Valid @RequestBody PasswordForm passwordForm)
	{
		System.out.println("-----------------------------hashPassword----------------"+passwordForm.getOldPassword());
		System.out.println("-----------------------new password:"+passwordForm.getNewPassword());
		System.out.println("-----------------------conf old password:"+passwordForm.getConfirmOldPassword());
		System.out.println("-----------------------conf new password:"+passwordForm.getConfirmPassword());
		System.out.println("-----------------------etat:"+passwordForm.isEtat());
		
		//appUser.setPassword(passwordEncoder.encode(password));
		boolean etat = new BCryptPasswordEncoder().matches(passwordForm.getOldPassword(),
				passwordForm.getConfirmOldPassword());
		passwordForm.setEtat(etat);
		
		System.out.println("-------------------fin----------hashPassword----------------"+passwordForm.getOldPassword());
		
		return new ResponseEntity(passwordForm, HttpStatus.OK);
	}
	
	
	
	
	/*------------------------ download and upload of files-------------------------*/
	
	@GetMapping(value = "/download/{filename}")
	public ResponseEntity<Resource> download(@PathVariable("filename") String filename) throws IOException
	{
		Path filePath = Paths.get(DIRECTORY).toAbsolutePath().normalize().resolve(filename);
		if (!Files.exists(filePath))
		{
			throw new FileNotFoundException("fichier non trouve");
		}
		Resource resource = new UrlResource(filePath.toUri());

		return ResponseEntity.ok().contentType(MediaType.parseMediaType(Files.probeContentType(filePath))).body(resource);
	}

	@PostMapping("/upload/{filename}")
	public ResponseEntity<String> upload(@RequestParam("urlPicture") MultipartFile multipartFile, @PathVariable("filename") String filenameNew) throws IOException
	{
		System.out.println("-----------------------upload-----------------");
		String fileName = StringUtils.cleanPath(multipartFile.getOriginalFilename());
		Path fileStorage = Paths.get(DIRECTORY, filenameNew).toAbsolutePath().normalize();

		Files.copy(multipartFile.getInputStream(), fileStorage, StandardCopyOption.REPLACE_EXISTING);
		System.out.println("fileName Orginal--->"+fileName+"fileName--->" + filenameNew + " fileStorage--->" + fileStorage + "");
		return new ResponseEntity<>(filenameNew, HttpStatus.OK);
	}
}

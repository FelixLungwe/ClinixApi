 package bu.clinix.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

import org.hibernate.annotations.Fetch;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.NonNull;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

@Table(uniqueConstraints = @UniqueConstraint(columnNames = "matricule"))
@Entity
public class Patient implements Serializable
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	private Long patient_id;
	
	@NonNull
	private String fullname;
	@NonNull
	@DateTimeFormat(pattern = "dd-MM-yy")
	@Temporal(TemporalType.DATE)
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yy")
	private Date dateNaissance;
//	private String age;
	@NonNull
	private String sexe;
	private String province;
	private String commune;
	private String zone;
	private String quartierColline;
	private String sousCollineRueAvenueNumero;
	private String telephone;
	//@DateTimeFormat(pattern = "dd-MM-yy")
	//@Temporal(TemporalType.DATE)
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyyMMdd-HHmmSS")
	private Date DateEnregistre;
	private String matricule;
	
	
	@OneToMany(mappedBy = "patient")
	@JsonProperty(access = Access.WRITE_ONLY)
	private List<Accouchement> accouchements;
	
	@OneToMany(mappedBy = "patient")
	@JsonProperty(access = Access.WRITE_ONLY)
	private List<AccueilConsultExt> accueilConsultExts; // accueilConsultExts
	
	@OneToMany(mappedBy = "patient")
	@JsonProperty(access = Access.WRITE_ONLY)
	private List<AccueilHospitalisation> accueilHospitalisations;
	
	@OneToMany(mappedBy = "patient")
	@JsonProperty(access = Access.WRITE_ONLY)
	private List<Acte> actes;
	
	@OneToMany(mappedBy = "patient")
	@JsonProperty(access = Access.WRITE_ONLY)
	private List<BanqueSang> banqueSangs;
	
	@OneToMany(mappedBy = "patient")
	@JsonProperty(access = Access.WRITE_ONLY)
	private List<ConsultationExterne> consultationExternes;
	
	@OneToMany(mappedBy = "patient")
	@JsonProperty(access = Access.WRITE_ONLY)
	private List<ConsultationPostNatal> consultationPostNatals;
	
	@OneToMany(mappedBy = "patient")
	@JsonProperty(access = Access.WRITE_ONLY)
	private List<ConsultationPrenatale> consultationPrenatales;
	
	@OneToMany(mappedBy = "patient")
	@JsonProperty(access = Access.WRITE_ONLY)
	private List<DepistageVolontaire> depistageVolontaires;
	
	@OneToMany(mappedBy = "patient")
	@JsonProperty(access = Access.WRITE_ONLY)
	private List<Entree> entrees;
	
	@OneToMany(mappedBy = "patient")
	@JsonProperty(access = Access.WRITE_ONLY)
	private List<Examen> examens;
	
	@OneToMany(mappedBy = "patient")
	@JsonProperty(access = Access.WRITE_ONLY)
	private List<GynecoObstetrique> gynecoObstetriques;
	
	@OneToMany(mappedBy = "patient")
	@JsonProperty(access = Access.WRITE_ONLY)
	private List<Intervation> interventions;
	
	@OneToMany(mappedBy = "patient")
	@JsonProperty(access = Access.WRITE_ONLY)
	private List<PlanificationFamiliale> planificationFamiliales;
	
	@OneToMany(mappedBy = "patient")
	@JsonProperty(access = Access.WRITE_ONLY)
	private List<Sortie> sorties;
	
	@OneToMany(mappedBy = "patient")
	@JsonProperty(access = Access.WRITE_ONLY)
	private List<Transfusion> transfusions;
	
	@OneToMany(mappedBy = "patient")
	@JsonProperty(access = Access.WRITE_ONLY)
	private List<Urgence> urgences;
	
	@OneToMany(mappedBy= "patient")
	@JsonProperty(access = Access.WRITE_ONLY)
	private List<ListeAttente> listeAttentes;
	
	@OneToOne(mappedBy = "patient", fetch = FetchType.EAGER)
	@JsonProperty(access = Access.WRITE_ONLY)
	private DossierMedical dossierMedical;
	

	
	
	/**
	 * 
	 */
	public Patient()
	{
		super();
	}
	

	/**
	 * @param fullname
	 * @param dateNaissance
	 * @param sexe
	 * @param province
	 * @param commune
	 * @param zone
	 * @param quartierColline
	 * @param sousCollineRueAvenueNumero
	 * @param dateEnregistre
	 * @param matricule
	 */
	public Patient(String fullname, Date dateNaissance, String sexe, String province, String commune, String zone,
			String quartierColline, String sousCollineRueAvenueNumero, Date dateEnregistre, String matricule, String telephone)
	{
		super();
		this.fullname = fullname;
		this.dateNaissance = dateNaissance;
		this.sexe = sexe;
		this.province = province;
		this.commune = commune;
		this.zone = zone;
		this.quartierColline = quartierColline;
		this.sousCollineRueAvenueNumero = sousCollineRueAvenueNumero;
		DateEnregistre = dateEnregistre;
		this.matricule = matricule;
		this.telephone = telephone;
	}


	/**
	 * @return the patient_id
	 */
	public Long getPatient_id()
	{
		return patient_id;
	}


	/**
	 * @param patient_id the patient_id to set
	 */
	public void setPatient_id(Long patient_id)
	{
		this.patient_id = patient_id;
	}


	/**
	 * @return the fullname
	 */
	public String getFullname()
	{
		return fullname;
	}


	/**
	 * @param fullname the fullname to set
	 */
	public void setFullname(String fullname)
	{
		this.fullname = fullname;
	}


	/**
	 * @return the dateNaissance
	 */
	public Date getDateNaissance()
	{
		return dateNaissance;
	}


	/**
	 * @param dateNaissance the dateNaissance to set
	 */
	public void setDateNaissance(Date dateNaissance)
	{
		this.dateNaissance = dateNaissance;
	}


	/**
	 * @return the sexe
	 */
	public String getSexe()
	{
		return sexe;
	}


	/**
	 * @param sexe the sexe to set
	 */
	public void setSexe(String sexe)
	{
		this.sexe = sexe;
	}


	/**
	 * @return the province
	 */
	public String getProvince()
	{
		return province;
	}


	/**
	 * @param province the province to set
	 */
	public void setProvince(String province)
	{
		this.province = province;
	}


	/**
	 * @return the commune
	 */
	public String getCommune()
	{
		return commune;
	}


	/**
	 * @param commune the commune to set
	 */
	public void setCommune(String commune)
	{
		this.commune = commune;
	}


	/**
	 * @return the zone
	 */
	public String getZone()
	{
		return zone;
	}


	/**
	 * @param zone the zone to set
	 */
	public void setZone(String zone)
	{
		this.zone = zone;
	}


	/**
	 * @return the quartierColline
	 */
	public String getQuartierColline()
	{
		return quartierColline;
	}


	/**
	 * @param quartierColline the quartierColline to set
	 */
	public void setQuartierColline(String quartierColline)
	{
		this.quartierColline = quartierColline;
	}


	/**
	 * @return the sousCollineRueAvenueNumero
	 */
	public String getSousCollineRueAvenueNumero()
	{
		return sousCollineRueAvenueNumero;
	}


	/**
	 * @param sousCollineRueAvenueNumero the sousCollineRueAvenueNumero to set
	 */
	public void setSousCollineRueAvenueNumero(String sousCollineRueAvenueNumero)
	{
		this.sousCollineRueAvenueNumero = sousCollineRueAvenueNumero;
	}


	/**
	 * @return the dateEnregistre
	 */
	public Date getDateEnregistre()
	{
		return DateEnregistre;
	}


	/**
	 * @param dateEnregistre the dateEnregistre to set
	 */
	public void setDateEnregistre(Date dateEnregistre)
	{
		DateEnregistre = dateEnregistre;
	}


	/**
	 * @return the matricule
	 */
	public String getMatricule()
	{
		return matricule;
	}


	/**
	 * @param matricule the matricule to set
	 */
	public void setMatricule(String matricule)
	{
		this.matricule = matricule;
	}


	/**
	 * @return the telephone
	 */
	public String getTelephone()
	{
		return telephone;
	}


	/**
	 * @param telephone the telephone to set
	 */
	public void setTelephone(String telephone)
	{
		this.telephone = telephone;
	}


	/**
	 * @return the accouchements
	 */
	public List<Accouchement> getAccouchements()
	{
		return accouchements;
	}


	/**
	 * @param accouchements the accouchements to set
	 */
	public void setAccouchements(List<Accouchement> accouchements)
	{
		this.accouchements = accouchements;
	}


	/**
	 * @return the accueilConsultExts
	 */
	public List<AccueilConsultExt> getAccueilConsultExts()
	{
		return accueilConsultExts;
	}


	/**
	 * @param accueilConsultExts the accueilConsultExts to set
	 */
	public void setAccueilConsultExts(List<AccueilConsultExt> accueilConsultExts)
	{
		this.accueilConsultExts = accueilConsultExts;
	}


	/**
	 * @return the actes
	 */
	public List<Acte> getActes()
	{
		return actes;
	}


	/**
	 * @param actes the actes to set
	 */
	public void setActes(List<Acte> actes)
	{
		this.actes = actes;
	}


	/**
	 * @return the banqueSangs
	 */
	public List<BanqueSang> getBanqueSangs()
	{
		return banqueSangs;
	}


	/**
	 * @param banqueSangs the banqueSangs to set
	 */
	public void setBanqueSangs(List<BanqueSang> banqueSangs)
	{
		this.banqueSangs = banqueSangs;
	}


	/**
	 * @return the consultationExternes
	 */
	public List<ConsultationExterne> getConsultationExternes()
	{
		return consultationExternes;
	}


	/**
	 * @param consultationExternes the consultationExternes to set
	 */
	public void setConsultationExternes(List<ConsultationExterne> consultationExternes)
	{
		this.consultationExternes = consultationExternes;
	}


	/**
	 * @return the consultationPostNatals
	 */
	public List<ConsultationPostNatal> getConsultationPostNatals()
	{
		return consultationPostNatals;
	}


	/**
	 * @param consultationPostNatals the consultationPostNatals to set
	 */
	public void setConsultationPostNatals(List<ConsultationPostNatal> consultationPostNatals)
	{
		this.consultationPostNatals = consultationPostNatals;
	}


	/**
	 * @return the consultationPrenatales
	 */
	public List<ConsultationPrenatale> getConsultationPrenatales()
	{
		return consultationPrenatales;
	}


	/**
	 * @param consultationPrenatales the consultationPrenatales to set
	 */
	public void setConsultationPrenatales(List<ConsultationPrenatale> consultationPrenatales)
	{
		this.consultationPrenatales = consultationPrenatales;
	}


	/**
	 * @return the depistageVolontaires
	 */
	public List<DepistageVolontaire> getDepistageVolontaires()
	{
		return depistageVolontaires;
	}


	/**
	 * @param depistageVolontaires the depistageVolontaires to set
	 */
	public void setDepistageVolontaires(List<DepistageVolontaire> depistageVolontaires)
	{
		this.depistageVolontaires = depistageVolontaires;
	}


	/**
	 * @return the entrees
	 */
	public List<Entree> getEntrees()
	{
		return entrees;
	}


	/**
	 * @param entrees the entrees to set
	 */
	public void setEntrees(List<Entree> entrees)
	{
		this.entrees = entrees;
	}


	/**
	 * @return the examens
	 */
	public List<Examen> getExamens()
	{
		return examens;
	}


	/**
	 * @param examens the examens to set
	 */
	public void setExamens(List<Examen> examens)
	{
		this.examens = examens;
	}


	/**
	 * @return the gynecoObstetriques
	 */
	public List<GynecoObstetrique> getGynecoObstetriques()
	{
		return gynecoObstetriques;
	}


	/**
	 * @param gynecoObstetriques the gynecoObstetriques to set
	 */
	public void setGynecoObstetriques(List<GynecoObstetrique> gynecoObstetriques)
	{
		this.gynecoObstetriques = gynecoObstetriques;
	}


	/**
	 * @return the interventions
	 */
	public List<Intervation> getInterventions()
	{
		return interventions;
	}


	/**
	 * @param interventions the interventions to set
	 */
	public void setInterventions(List<Intervation> interventions)
	{
		this.interventions = interventions;
	}


	/**
	 * @return the planificationFamiliales
	 */
	public List<PlanificationFamiliale> getPlanificationFamiliales()
	{
		return planificationFamiliales;
	}


	/**
	 * @param planificationFamiliales the planificationFamiliales to set
	 */
	public void setPlanificationFamiliales(List<PlanificationFamiliale> planificationFamiliales)
	{
		this.planificationFamiliales = planificationFamiliales;
	}


	/**
	 * @return the sorties
	 */
	public List<Sortie> getSorties()
	{
		return sorties;
	}


	/**
	 * @param sorties the sorties to set
	 */
	public void setSorties(List<Sortie> sorties)
	{
		this.sorties = sorties;
	}


	/**
	 * @return the transfusions
	 */
	public List<Transfusion> getTransfusions()
	{
		return transfusions;
	}


	/**
	 * @param transfusions the transfusions to set
	 */
	public void setTransfusions(List<Transfusion> transfusions)
	{
		this.transfusions = transfusions;
	}


	/**
	 * @return the urgences
	 */
	public List<Urgence> getUrgences()
	{
		return urgences;
	}


	/**
	 * @param urgences the urgences to set
	 */
	public void setUrgences(List<Urgence> urgences)
	{
		this.urgences = urgences;
	}


	/**
	 * @return the accueilHospitalisations
	 */
	public List<AccueilHospitalisation> getAccueilHospitalisations()
	{
		return accueilHospitalisations;
	}


	/**
	 * @param accueilHospitalisations the accueilHospitalisations to set
	 */
	public void setAccueilHospitalisations(List<AccueilHospitalisation> accueilHospitalisations)
	{
		this.accueilHospitalisations = accueilHospitalisations;
	}


	/**
	 * @return the listeAttentes
	 */
	public List<ListeAttente> getListeAttentes()
	{
		return listeAttentes;
	}


	/**
	 * @param listeAttentes the listeAttentes to set
	 */
	public void setListeAttentes(List<ListeAttente> listeAttentes)
	{
		this.listeAttentes = listeAttentes;
	}


	/**
	 * @return the dossierMedical
	 */
	public DossierMedical getDossierMedical()
	{
		return dossierMedical;
	}


	/**
	 * @param dossierMedical the dossierMedical to set
	 */
	public void setDossierMedical(DossierMedical dossierMedical)
	{
		this.dossierMedical = dossierMedical;
	}
	

}

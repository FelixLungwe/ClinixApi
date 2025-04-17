package bu.clinix.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.NonNull;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class ConsultationPostNatal implements Serializable
{
	@ManyToOne
	@JoinColumn(name = "patient_id")
	@JsonIgnore
	private Patient patient;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long consultationPostNatal_id;
	
	private String chefFamille;
	private String groupeAge;
	private String origine;
	@DateTimeFormat(pattern = "dd-MM-yy")
	@Temporal(TemporalType.DATE)
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yy")
	private Date dateAccouchement;
	private String  situationMatrim;
	private int ageFemme;
	private String  vihConnu;
	private String  sousArv;
	private String  depistageVihDurantVisite;
	private String femmeMiseSousArv;
	private String nomBebe;
	private String prenomBebe;
	private String lieuAccouchement;
	private String provenancePr1ereVisite;
	private String autresVisites;
	private String bebeDeMereVihMisCtx;
	private String bebeDeMereVihPreveIpcr;
	private String vitamineA;
	private String adhesionPf;
	private String adhesionpfFemmeArv;
	private String signeEvocateur;
	private String infectionPuerperale;
	private String problemeDetecte;
	private String decisionPrise;
	
	
	
	/**
	 * @param chefFamille
	 * @param groupeAge
	 * @param origine
	 * @param dateAccouchement
	 * @param situationMatrim
	 * @param ageFemme
	 * @param vihConnu
	 * @param sousArv
	 * @param depistageVihDurantVisite
	 * @param femmeMiseSousArv
	 * @param nomBebe
	 * @param prenomBebe
	 * @param lieuAccouchement
	 * @param provenancePr1ereVisite
	 * @param autresVisites
	 * @param bebeDeMereVihMisCtx
	 * @param bebeDeMereVihPreveIpcr
	 * @param vitamineA
	 * @param adhesionPf
	 * @param adhesionpfFemmeArv
	 * @param signeEvocateur
	 * @param infectionPuerperale
	 * @param problemeDetecte
	 * @param decisionPrise
	 */
	public ConsultationPostNatal(String chefFamille, String groupeAge, String origine, Date dateAccouchement,
			String situationMatrim, int ageFemme, String vihConnu, String sousArv, String depistageVihDurantVisite,
			String femmeMiseSousArv, String nomBebe, String prenomBebe, String lieuAccouchement,
			String provenancePr1ereVisite, String autresVisites, String bebeDeMereVihMisCtx,
			String bebeDeMereVihPreveIpcr, String vitamineA, String adhesionPf, String adhesionpfFemmeArv,
			String signeEvocateur, String infectionPuerperale, String problemeDetecte, String decisionPrise)
	{
		super();
		this.chefFamille = chefFamille;
		this.groupeAge = groupeAge;
		this.origine = origine;
		this.dateAccouchement = dateAccouchement;
		this.situationMatrim = situationMatrim;
		this.ageFemme = ageFemme;
		this.vihConnu = vihConnu;
		this.sousArv = sousArv;
		this.depistageVihDurantVisite = depistageVihDurantVisite;
		this.femmeMiseSousArv = femmeMiseSousArv;
		this.nomBebe = nomBebe;
		this.prenomBebe = prenomBebe;
		this.lieuAccouchement = lieuAccouchement;
		this.provenancePr1ereVisite = provenancePr1ereVisite;
		this.autresVisites = autresVisites;
		this.bebeDeMereVihMisCtx = bebeDeMereVihMisCtx;
		this.bebeDeMereVihPreveIpcr = bebeDeMereVihPreveIpcr;
		this.vitamineA = vitamineA;
		this.adhesionPf = adhesionPf;
		this.adhesionpfFemmeArv = adhesionpfFemmeArv;
		this.signeEvocateur = signeEvocateur;
		this.infectionPuerperale = infectionPuerperale;
		this.problemeDetecte = problemeDetecte;
		this.decisionPrise = decisionPrise;
	}
	/**
	 * 
	 */
	public ConsultationPostNatal()
	{
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the patient
	 */
	public Patient getPatient()
	{
		return patient;
	}
	/**
	 * @param patient the patient to set
	 */
	public void setPatient(Patient patient)
	{
		this.patient = patient;
	}
	/**
	 * @return the consultationPostNatal_id
	 */
	public Long getConsultationPostNatal_id()
	{
		return consultationPostNatal_id;
	}
	/**
	 * @param consultationPostNatal_id the consultationPostNatal_id to set
	 */
	public void setConsultationPostNatal_id(Long consultationPostNatal_id)
	{
		this.consultationPostNatal_id = consultationPostNatal_id;
	}
	/**
	 * @return the dateAccouchement
	 */
	public Date getDateAccouchement()
	{
		return dateAccouchement;
	}
	/**
	 * @param dateAccouchement the dateAccouchement to set
	 */
	public void setDateAccouchement(Date dateAccouchement)
	{
		this.dateAccouchement = dateAccouchement;
	}
	/**
	 * @return the situationMatrim
	 */
	public String getSituationMatrim()
	{
		return situationMatrim;
	}
	/**
	 * @param situationMatrim the situationMatrim to set
	 */
	public void setSituationMatrim(String situationMatrim)
	{
		this.situationMatrim = situationMatrim;
	}
	/**
	 * @return the ageFemme
	 */
	public int getAgeFemme()
	{
		return ageFemme;
	}
	/**
	 * @param ageFemme the ageFemme to set
	 */
	public void setAgeFemme(int ageFemme)
	{
		this.ageFemme = ageFemme;
	}
	/**
	 * @return the vihConnu
	 */
	public String getVihConnu()
	{
		return vihConnu;
	}
	/**
	 * @param vihConnu the vihConnu to set
	 */
	public void setVihConnu(String vihConnu)
	{
		this.vihConnu = vihConnu;
	}
	/**
	 * @return the sousArv
	 */
	public String getSousArv()
	{
		return sousArv;
	}
	/**
	 * @param sousArv the sousArv to set
	 */
	public void setSousArv(String sousArv)
	{
		this.sousArv = sousArv;
	}
	/**
	 * @return the depistageVihDurantVisite
	 */
	public String getDepistageVihDurantVisite()
	{
		return depistageVihDurantVisite;
	}
	/**
	 * @param depistageVihDurantVisite the depistageVihDurantVisite to set
	 */
	public void setDepistageVihDurantVisite(String depistageVihDurantVisite)
	{
		this.depistageVihDurantVisite = depistageVihDurantVisite;
	}
	/**
	 * @return the femmeMiseSousArv
	 */
	public String getFemmeMiseSousArv()
	{
		return femmeMiseSousArv;
	}
	/**
	 * @param femmeMiseSousArv the femmeMiseSousArv to set
	 */
	public void setFemmeMiseSousArv(String femmeMiseSousArv)
	{
		this.femmeMiseSousArv = femmeMiseSousArv;
	}
	/**
	 * @return the nomBebe
	 */
	public String getNomBebe()
	{
		return nomBebe;
	}
	/**
	 * @param nomBebe the nomBebe to set
	 */
	public void setNomBebe(String nomBebe)
	{
		this.nomBebe = nomBebe;
	}
	/**
	 * @return the prenomBebe
	 */
	public String getPrenomBebe()
	{
		return prenomBebe;
	}
	/**
	 * @param prenomBebe the prenomBebe to set
	 */
	public void setPrenomBebe(String prenomBebe)
	{
		this.prenomBebe = prenomBebe;
	}
	/**
	 * @return the lieuAccouchement
	 */
	public String getLieuAccouchement()
	{
		return lieuAccouchement;
	}
	/**
	 * @param lieuAccouchement the lieuAccouchement to set
	 */
	public void setLieuAccouchement(String lieuAccouchement)
	{
		this.lieuAccouchement = lieuAccouchement;
	}
	/**
	 * @return the provenancePr1ereVisite
	 */
	public String getProvenancePr1ereVisite()
	{
		return provenancePr1ereVisite;
	}
	/**
	 * @param provenancePr1ereVisite the provenancePr1ereVisite to set
	 */
	public void setProvenancePr1ereVisite(String provenancePr1ereVisite)
	{
		this.provenancePr1ereVisite = provenancePr1ereVisite;
	}
	/**
	 * @return the autresVisites
	 */
	public String getAutresVisites()
	{
		return autresVisites;
	}
	/**
	 * @param autresVisites the autresVisites to set
	 */
	public void setAutresVisites(String autresVisites)
	{
		this.autresVisites = autresVisites;
	}
	/**
	 * @return the bebeDeMereVihMisCtx
	 */
	public String getBebeDeMereVihMisCtx()
	{
		return bebeDeMereVihMisCtx;
	}
	/**
	 * @param bebeDeMereVihMisCtx the bebeDeMereVihMisCtx to set
	 */
	public void setBebeDeMereVihMisCtx(String bebeDeMereVihMisCtx)
	{
		this.bebeDeMereVihMisCtx = bebeDeMereVihMisCtx;
	}
	/**
	 * @return the bebeDeMereVihPreveIpcr
	 */
	public String getBebeDeMereVihPreveIpcr()
	{
		return bebeDeMereVihPreveIpcr;
	}
	/**
	 * @param bebeDeMereVihPreveIpcr the bebeDeMereVihPreveIpcr to set
	 */
	public void setBebeDeMereVihPreveIpcr(String bebeDeMereVihPreveIpcr)
	{
		this.bebeDeMereVihPreveIpcr = bebeDeMereVihPreveIpcr;
	}
	/**
	 * @return the vitamineA
	 */
	public String getVitamineA()
	{
		return vitamineA;
	}
	/**
	 * @param vitamineA the vitamineA to set
	 */
	public void setVitamineA(String vitamineA)
	{
		this.vitamineA = vitamineA;
	}
	/**
	 * @return the adhesionPf
	 */
	public String getAdhesionPf()
	{
		return adhesionPf;
	}
	/**
	 * @param adhesionPf the adhesionPf to set
	 */
	public void setAdhesionPf(String adhesionPf)
	{
		this.adhesionPf = adhesionPf;
	}
	/**
	 * @return the adhesionpfFemmeArv
	 */
	public String getAdhesionpfFemmeArv()
	{
		return adhesionpfFemmeArv;
	}
	/**
	 * @param adhesionpfFemmeArv the adhesionpfFemmeArv to set
	 */
	public void setAdhesionpfFemmeArv(String adhesionpfFemmeArv)
	{
		this.adhesionpfFemmeArv = adhesionpfFemmeArv;
	}
	/**
	 * @return the signeEvocateur
	 */
	public String getSigneEvocateur()
	{
		return signeEvocateur;
	}
	/**
	 * @param signeEvocateur the signeEvocateur to set
	 */
	public void setSigneEvocateur(String signeEvocateur)
	{
		this.signeEvocateur = signeEvocateur;
	}
	/**
	 * @return the infectionPuerperale
	 */
	public String getInfectionPuerperale()
	{
		return infectionPuerperale;
	}
	/**
	 * @param infectionPuerperale the infectionPuerperale to set
	 */
	public void setInfectionPuerperale(String infectionPuerperale)
	{
		this.infectionPuerperale = infectionPuerperale;
	}
	/**
	 * @return the problemeDetecte
	 */
	public String getProblemeDetecte()
	{
		return problemeDetecte;
	}
	/**
	 * @param problemeDetecte the problemeDetecte to set
	 */
	public void setProblemeDetecte(String problemeDetecte)
	{
		this.problemeDetecte = problemeDetecte;
	}
	/**
	 * @return the decisionPrise
	 */
	public String getDecisionPrise()
	{
		return decisionPrise;
	}
	/**
	 * @param decisionPrise the decisionPrise to set
	 */
	public void setDecisionPrise(String decisionPrise)
	{
		this.decisionPrise = decisionPrise;
	}
	/**
	 * @return the chefFamille
	 */
	public String getChefFamille()
	{
		return chefFamille;
	}
	/**
	 * @param chefFamille the chefFamille to set
	 */
	public void setChefFamille(String chefFamille)
	{
		this.chefFamille = chefFamille;
	}
	/**
	 * @return the groupeAge
	 */
	public String getGroupeAge()
	{
		return groupeAge;
	}
	/**
	 * @param groupeAge the groupeAge to set
	 */
	public void setGroupeAge(String groupeAge)
	{
		this.groupeAge = groupeAge;
	}
	/**
	 * @return the origine
	 */
	public String getOrigine()
	{
		return origine;
	}
	/**
	 * @param origine the origine to set
	 */
	public void setOrigine(String origine)
	{
		this.origine = origine;
	}
	
	

}

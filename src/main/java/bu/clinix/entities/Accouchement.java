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
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class Accouchement implements Serializable
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long accouchement_id;

	@ManyToOne
	@JoinColumn(name = "patient_id")
	@JsonProperty
	private Patient patient;
	
	private String chefFamille;
	private String groupeAge;
	private String origine;
	private String qualificationResponsableAccouchemnt;
	private String ageRisqueAccouchement;
	private boolean diabeteConnu;
	private boolean htaConnu;
	private boolean risqueDetecteParCPN;
	private String typeAccouchement;
	private boolean avortement;
	private boolean paludisme;
	private String deroulementAccouchement;
	private String indicationCesarienne;
	private String complicObstetricDirect;
	private boolean deceMaternel;
	private String ptme;
	
	@NonNull
	@DateTimeFormat(pattern = "dd-MM-yy")
	@Temporal(TemporalType.DATE)
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yy")
	private Date dateAccouchement;
	private boolean allaitmt1ereHeure;
	private String methodecontracRecue;
	
	@NonNull
	@DateTimeFormat(pattern = "dd-MM-yy")
	@Temporal(TemporalType.DATE)
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yy")
	private Date dateSortie;
	private int gestiteFemme;
	private int pariteFemme;
	private int nbrEnfantVivant;
	private int nbrAvortement;
	private boolean anemie;
	private String sexeEnfant;
	private String apgarEnfant; // type de donn�e � verifier...
	private String issueAccouchement;
	private String etatMortNe;
	private boolean femmeHivConnu;
	private boolean femmeSousArvDeja;
	private boolean femmeMiseSousArv;
	private boolean depisteVihCourTravail;
	private boolean femmeDejaHvbConnu;
	private boolean femmeDejaSousTraitement;
	private boolean nouveauNeVaccinHvb;
	private boolean nouveauNeMisSousArv;
	
	
	
	
	
	/**
	 * @param chefFamille
	 * @param origine
	 * @param qualificationResponsableAccouchemnt
	 * @param ageRisqueAccouchement
	 * @param diabeteConnu
	 * @param htaConnu
	 * @param risqueDetecteParCPN
	 * @param typeAccouchement
	 * @param avortement
	 * @param paludisme
	 * @param deroulementAccouchement
	 * @param indicationCesarienne
	 * @param complicObstetricDirect
	 * @param deceMaternel
	 * @param ptme
	 * @param dateAccouchement
	 * @param allaitmt1ereHeure
	 * @param methodecontracRecue
	 * @param dateSortie
	 * @param gestiteFemme
	 * @param pariteFemme
	 * @param nbrEnfantVivant
	 * @param nbrAvortement
	 * @param anemie
	 * @param sexeEnfant
	 * @param apgarEnfant
	 * @param issueAccouchement
	 * @param etatMortNe
	 * @param femmeHivConnu
	 * @param femmeSousArvDeja
	 * @param femmeMiseSousArv
	 * @param depisteVihCourTravail
	 * @param femmeDejaHvbConnu
	 * @param femmeDejaSousTraitement
	 * @param nouveauNeVaccinHvb
	 * @param nouveauNeMisSousArv
	 */
	public Accouchement(String chefFamille, String origine, String qualificationResponsableAccouchemnt,
			String ageRisqueAccouchement, boolean diabeteConnu, boolean htaConnu, boolean risqueDetecteParCPN,
			String typeAccouchement, boolean avortement, boolean paludisme, String deroulementAccouchement,
			String indicationCesarienne, String complicObstetricDirect, boolean deceMaternel, String ptme,
			Date dateAccouchement, boolean allaitmt1ereHeure, String methodecontracRecue, Date dateSortie,
			int gestiteFemme, int pariteFemme, int nbrEnfantVivant, int nbrAvortement, boolean anemie,
			String sexeEnfant, String apgarEnfant, String issueAccouchement, String etatMortNe, boolean femmeHivConnu,
			boolean femmeSousArvDeja, boolean femmeMiseSousArv, boolean depisteVihCourTravail,
			boolean femmeDejaHvbConnu, boolean femmeDejaSousTraitement, boolean nouveauNeVaccinHvb,
			boolean nouveauNeMisSousArv)
	{
		super();
		this.chefFamille = chefFamille;
		this.origine = origine;
		this.qualificationResponsableAccouchemnt = qualificationResponsableAccouchemnt;
		this.ageRisqueAccouchement = ageRisqueAccouchement;
		this.diabeteConnu = diabeteConnu;
		this.htaConnu = htaConnu;
		this.risqueDetecteParCPN = risqueDetecteParCPN;
		this.typeAccouchement = typeAccouchement;
		this.avortement = avortement;
		this.paludisme = paludisme;
		this.deroulementAccouchement = deroulementAccouchement;
		this.indicationCesarienne = indicationCesarienne;
		this.complicObstetricDirect = complicObstetricDirect;
		this.deceMaternel = deceMaternel;
		this.ptme = ptme;
		this.dateAccouchement = dateAccouchement;
		this.allaitmt1ereHeure = allaitmt1ereHeure;
		this.methodecontracRecue = methodecontracRecue;
		this.dateSortie = dateSortie;
		this.gestiteFemme = gestiteFemme;
		this.pariteFemme = pariteFemme;
		this.nbrEnfantVivant = nbrEnfantVivant;
		this.nbrAvortement = nbrAvortement;
		this.anemie = anemie;
		this.sexeEnfant = sexeEnfant;
		this.apgarEnfant = apgarEnfant;
		this.issueAccouchement = issueAccouchement;
		this.etatMortNe = etatMortNe;
		this.femmeHivConnu = femmeHivConnu;
		this.femmeSousArvDeja = femmeSousArvDeja;
		this.femmeMiseSousArv = femmeMiseSousArv;
		this.depisteVihCourTravail = depisteVihCourTravail;
		this.femmeDejaHvbConnu = femmeDejaHvbConnu;
		this.femmeDejaSousTraitement = femmeDejaSousTraitement;
		this.nouveauNeVaccinHvb = nouveauNeVaccinHvb;
		this.nouveauNeMisSousArv = nouveauNeMisSousArv;
	}
	/**
	 * @return the accouchement_id
	 */
	public Long getAccouchement_id()
	{
		return accouchement_id;
	}
	/**
	 * @param accouchement_id the accouchement_id to set
	 */
	public void setAccouchement_id(Long accouchement_id)
	{
		this.accouchement_id = accouchement_id;
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
	 * @return the qualificationResponsableAccouchemnt
	 */
	public String getQualificationResponsableAccouchemnt()
	{
		return qualificationResponsableAccouchemnt;
	}
	/**
	 * @param qualificationResponsableAccouchemnt the qualificationResponsableAccouchemnt to set
	 */
	public void setQualificationResponsableAccouchemnt(String qualificationResponsableAccouchemnt)
	{
		this.qualificationResponsableAccouchemnt = qualificationResponsableAccouchemnt;
	}
	/**
	 * @return the ageRisqueAccouchement
	 */
	public String getAgeRisqueAccouchement()
	{
		return ageRisqueAccouchement;
	}
	/**
	 * @param ageRisqueAccouchement the ageRisqueAccouchement to set
	 */
	public void setAgeRisqueAccouchement(String ageRisqueAccouchement)
	{
		this.ageRisqueAccouchement = ageRisqueAccouchement;
	}
	/**
	 * @return the diabeteConnu
	 */
	public boolean isDiabeteConnu()
	{
		return diabeteConnu;
	}
	/**
	 * @param diabeteConnu the diabeteConnu to set
	 */
	public void setDiabeteConnu(boolean diabeteConnu)
	{
		this.diabeteConnu = diabeteConnu;
	}
	/**
	 * @return the htaConnu
	 */
	public boolean isHtaConnu()
	{
		return htaConnu;
	}
	/**
	 * @param htaConnu the htaConnu to set
	 */
	public void setHtaConnu(boolean htaConnu)
	{
		this.htaConnu = htaConnu;
	}
	/**
	 * @return the risqueDetecteParCPN
	 */
	public boolean isRisqueDetecteParCPN()
	{
		return risqueDetecteParCPN;
	}
	/**
	 * @param risqueDetecteParCPN the risqueDetecteParCPN to set
	 */
	public void setRisqueDetecteParCPN(boolean risqueDetecteParCPN)
	{
		this.risqueDetecteParCPN = risqueDetecteParCPN;
	}
	/**
	 * @return the typeAccouchement
	 */
	public String getTypeAccouchement()
	{
		return typeAccouchement;
	}
	/**
	 * @param typeAccouchement the typeAccouchement to set
	 */
	public void setTypeAccouchement(String typeAccouchement)
	{
		this.typeAccouchement = typeAccouchement;
	}
	/**
	 * @return the avortement
	 */
	public boolean isAvortement()
	{
		return avortement;
	}
	/**
	 * @param avortement the avortement to set
	 */
	public void setAvortement(boolean avortement)
	{
		this.avortement = avortement;
	}
	/**
	 * @return the paludisme
	 */
	public boolean isPaludisme()
	{
		return paludisme;
	}
	/**
	 * @param paludisme the paludisme to set
	 */
	public void setPaludisme(boolean paludisme)
	{
		this.paludisme = paludisme;
	}
	/**
	 * @return the deroulementAccouchement
	 */
	public String getDeroulementAccouchement()
	{
		return deroulementAccouchement;
	}
	/**
	 * @param deroulementAccouchement the deroulementAccouchement to set
	 */
	public void setDeroulementAccouchement(String deroulementAccouchement)
	{
		this.deroulementAccouchement = deroulementAccouchement;
	}
	/**
	 * @return the indicationCesarienne
	 */
	public String getIndicationCesarienne()
	{
		return indicationCesarienne;
	}
	/**
	 * @param indicationCesarienne the indicationCesarienne to set
	 */
	public void setIndicationCesarienne(String indicationCesarienne)
	{
		this.indicationCesarienne = indicationCesarienne;
	}
	/**
	 * @return the complicObstetricDirect
	 */
	public String getComplicObstetricDirect()
	{
		return complicObstetricDirect;
	}
	/**
	 * @param complicObstetricDirect the complicObstetricDirect to set
	 */
	public void setComplicObstetricDirect(String complicObstetricDirect)
	{
		this.complicObstetricDirect = complicObstetricDirect;
	}
	/**
	 * @return the deceMaternel
	 */
	public boolean isDeceMaternel()
	{
		return deceMaternel;
	}
	/**
	 * @param deceMaternel the deceMaternel to set
	 */
	public void setDeceMaternel(boolean deceMaternel)
	{
		this.deceMaternel = deceMaternel;
	}
	/**
	 * @return the ptme
	 */
	public String getPtme()
	{
		return ptme;
	}
	/**
	 * @param ptme the ptme to set
	 */
	public void setPtme(String ptme)
	{
		this.ptme = ptme;
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
	 * @return the allaitmt1ereHeure
	 */
	public boolean isAllaitmt1ereHeure()
	{
		return allaitmt1ereHeure;
	}
	/**
	 * @param allaitmt1ereHeure the allaitmt1ereHeure to set
	 */
	public void setAllaitmt1ereHeure(boolean allaitmt1ereHeure)
	{
		this.allaitmt1ereHeure = allaitmt1ereHeure;
	}
	/**
	 * @return the methodecontracRecue
	 */
	public String getMethodecontracRecue()
	{
		return methodecontracRecue;
	}
	/**
	 * @param methodecontracRecue the methodecontracRecue to set
	 */
	public void setMethodecontracRecue(String methodecontracRecue)
	{
		this.methodecontracRecue = methodecontracRecue;
	}
	/**
	 * @return the dateSortie
	 */
	public Date getDateSortie()
	{
		return dateSortie;
	}
	/**
	 * @param dateSortie the dateSortie to set
	 */
	public void setDateSortie(Date dateSortie)
	{
		this.dateSortie = dateSortie;
	}
	/**
	 * @return the gestiteFemme
	 */
	public int getGestiteFemme()
	{
		return gestiteFemme;
	}
	/**
	 * @param gestiteFemme the gestiteFemme to set
	 */
	public void setGestiteFemme(int gestiteFemme)
	{
		this.gestiteFemme = gestiteFemme;
	}
	/**
	 * @return the pariteFemme
	 */
	public int getPariteFemme()
	{
		return pariteFemme;
	}
	/**
	 * @param pariteFemme the pariteFemme to set
	 */
	public void setPariteFemme(int pariteFemme)
	{
		this.pariteFemme = pariteFemme;
	}
	/**
	 * @return the nbrEnfantVivant
	 */
	public int getNbrEnfantVivant()
	{
		return nbrEnfantVivant;
	}
	/**
	 * @param nbrEnfantVivant the nbrEnfantVivant to set
	 */
	public void setNbrEnfantVivant(int nbrEnfantVivant)
	{
		this.nbrEnfantVivant = nbrEnfantVivant;
	}
	/**
	 * @return the nbrAvortement
	 */
	public int getNbrAvortement()
	{
		return nbrAvortement;
	}
	/**
	 * @param nbrAvortement the nbrAvortement to set
	 */
	public void setNbrAvortement(int nbrAvortement)
	{
		this.nbrAvortement = nbrAvortement;
	}
	/**
	 * @return the anemie
	 */
	public boolean isAnemie()
	{
		return anemie;
	}
	/**
	 * @param anemie the anemie to set
	 */
	public void setAnemie(boolean anemie)
	{
		this.anemie = anemie;
	}
	/**
	 * @return the sexeEnfant
	 */
	public String getSexeEnfant()
	{
		return sexeEnfant;
	}
	/**
	 * @param sexeEnfant the sexeEnfant to set
	 */
	public void setSexeEnfant(String sexeEnfant)
	{
		this.sexeEnfant = sexeEnfant;
	}
	/**
	 * @return the apgarEnfant
	 */
	public String getApgarEnfant()
	{
		return apgarEnfant;
	}
	/**
	 * @param apgarEnfant the apgarEnfant to set
	 */
	public void setApgarEnfant(String apgarEnfant)
	{
		this.apgarEnfant = apgarEnfant;
	}
	/**
	 * @return the issueAccouchement
	 */
	public String getIssueAccouchement()
	{
		return issueAccouchement;
	}
	/**
	 * @param issueAccouchement the issueAccouchement to set
	 */
	public void setIssueAccouchement(String issueAccouchement)
	{
		this.issueAccouchement = issueAccouchement;
	}
	/**
	 * @return the etatMortNe
	 */
	public String getEtatMortNe()
	{
		return etatMortNe;
	}
	/**
	 * @param etatMortNe the etatMortNe to set
	 */
	public void setEtatMortNe(String etatMortNe)
	{
		this.etatMortNe = etatMortNe;
	}
	/**
	 * @return the femmeHivConnu
	 */
	public boolean isFemmeHivConnu()
	{
		return femmeHivConnu;
	}
	/**
	 * @param femmeHivConnu the femmeHivConnu to set
	 */
	public void setFemmeHivConnu(boolean femmeHivConnu)
	{
		this.femmeHivConnu = femmeHivConnu;
	}
	/**
	 * @return the femmeSousArvDeja
	 */
	public boolean isFemmeSousArvDeja()
	{
		return femmeSousArvDeja;
	}
	/**
	 * @param femmeSousArvDeja the femmeSousArvDeja to set
	 */
	public void setFemmeSousArvDeja(boolean femmeSousArvDeja)
	{
		this.femmeSousArvDeja = femmeSousArvDeja;
	}
	/**
	 * @return the femmeMiseSousArv
	 */
	public boolean isFemmeMiseSousArv()
	{
		return femmeMiseSousArv;
	}
	/**
	 * @param femmeMiseSousArv the femmeMiseSousArv to set
	 */
	public void setFemmeMiseSousArv(boolean femmeMiseSousArv)
	{
		this.femmeMiseSousArv = femmeMiseSousArv;
	}
	/**
	 * @return the depisteVihCourTravail
	 */
	public boolean isDepisteVihCourTravail()
	{
		return depisteVihCourTravail;
	}
	/**
	 * @param depisteVihCourTravail the depisteVihCourTravail to set
	 */
	public void setDepisteVihCourTravail(boolean depisteVihCourTravail)
	{
		this.depisteVihCourTravail = depisteVihCourTravail;
	}
	/**
	 * @return the femmeDejaHvbConnu
	 */
	public boolean isFemmeDejaHvbConnu()
	{
		return femmeDejaHvbConnu;
	}
	/**
	 * @param femmeDejaHvbConnu the femmeDejaHvbConnu to set
	 */
	public void setFemmeDejaHvbConnu(boolean femmeDejaHvbConnu)
	{
		this.femmeDejaHvbConnu = femmeDejaHvbConnu;
	}
	/**
	 * @return the femmeDejaSousTraitement
	 */
	public boolean isFemmeDejaSousTraitement()
	{
		return femmeDejaSousTraitement;
	}
	/**
	 * @param femmeDejaSousTraitement the femmeDejaSousTraitement to set
	 */
	public void setFemmeDejaSousTraitement(boolean femmeDejaSousTraitement)
	{
		this.femmeDejaSousTraitement = femmeDejaSousTraitement;
	}
	/**
	 * @return the nouveauNeVaccinHvb
	 */
	public boolean isNouveauNeVaccinHvb()
	{
		return nouveauNeVaccinHvb;
	}
	/**
	 * @param nouveauNeVaccinHvb the nouveauNeVaccinHvb to set
	 */
	public void setNouveauNeVaccinHvb(boolean nouveauNeVaccinHvb)
	{
		this.nouveauNeVaccinHvb = nouveauNeVaccinHvb;
	}
	/**
	 * @return the nouveauNeMisSousArv
	 */
	public boolean isNouveauNeMisSousArv()
	{
		return nouveauNeMisSousArv;
	}
	/**
	 * @param nouveauNeMisSousArv the nouveauNeMisSousArv to set
	 */
	public void setNouveauNeMisSousArv(boolean nouveauNeMisSousArv)
	{
		this.nouveauNeMisSousArv = nouveauNeMisSousArv;
	}
	public String getChefFamille()
	{
		return chefFamille;
	}
	public void setChefFamille(String chefFamille)
	{
		this.chefFamille = chefFamille;
	}
	public String getOrigine()
	{
		return origine;
	}
	public void setOrigine(String origine)
	{
		this.origine = origine;
	}
	public String getGroupeAge()
	{
		return groupeAge;
	}
	public void setGroupeAge(String groupeAge)
	{
		this.groupeAge = groupeAge;
	}
	
	
}
	
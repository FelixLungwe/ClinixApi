package bu.clinix.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class ConsultationPrenatale implements Serializable
{
	@ManyToOne
	@JoinColumn(name = "patient_id")
	@JsonIgnore
	private Patient patient;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long consultationPrenatale_id;
	
	private String chefFamille;
	private String groupeAge;
	private String origine;
	private String situationMatrim;
	private String numCpn;
	private int ageGrossesse;
	private String gestiteFemme;
	private int parite;
	private String depistageVih;
	private String depistageSyphilis;
	private String depistageViraleB;
	private String diabeteConnu;
	//private String nnnnnnnnnn;  // a verifier
	private String htaConnu;
	private String vihConnu;
	private String etatNutritionnel;
	private int numCpn1AgeGross;
	private String risqueAgeGross;
	private String vaccinationFemme;
	private String preventionFemme;
	private int detectionProbleme;
	private String conseillingPf;
	private String reference;
	private String descriptionProbleme;
	
	
	/**
	 * @param chefFamille
	 * @param groupeAge
	 * @param origine
	 * @param situationMatrim
	 * @param numCpn
	 * @param ageGrossesse
	 * @param gestiteFemme
	 * @param parite
	 * @param depistageVih
	 * @param depistageSyphilis
	 * @param depistageViraleB
	 * @param diabeteConnu
	 * @param htaConnu
	 * @param vihConnu
	 * @param etatNutritionnel
	 * @param numCpn1AgeGross
	 * @param risqueAgeGross
	 * @param vaccinationFemme
	 * @param preventionFemme
	 * @param detectionProbleme
	 * @param conseillingPf
	 * @param reference
	 * @param descriptionProbleme
	 */
	public ConsultationPrenatale(String chefFamille, String groupeAge, String origine, String situationMatrim,
			String numCpn, int ageGrossesse, String gestiteFemme, int parite, String depistageVih,
			String depistageSyphilis, String depistageViraleB, String diabeteConnu, String htaConnu, String vihConnu,
			String etatNutritionnel, int numCpn1AgeGross, String risqueAgeGross, String vaccinationFemme,
			String preventionFemme, int detectionProbleme, String conseillingPf, String reference,
			String descriptionProbleme)
	{
		super();
		this.chefFamille = chefFamille;
		this.groupeAge = groupeAge;
		this.origine = origine;
		this.situationMatrim = situationMatrim;
		this.numCpn = numCpn;
		this.ageGrossesse = ageGrossesse;
		this.gestiteFemme = gestiteFemme;
		this.parite = parite;
		this.depistageVih = depistageVih;
		this.depistageSyphilis = depistageSyphilis;
		this.depistageViraleB = depistageViraleB;
		this.diabeteConnu = diabeteConnu;
		this.htaConnu = htaConnu;
		this.vihConnu = vihConnu;
		this.etatNutritionnel = etatNutritionnel;
		this.numCpn1AgeGross = numCpn1AgeGross;
		this.risqueAgeGross = risqueAgeGross;
		this.vaccinationFemme = vaccinationFemme;
		this.preventionFemme = preventionFemme;
		this.detectionProbleme = detectionProbleme;
		this.conseillingPf = conseillingPf;
		this.reference = reference;
		this.descriptionProbleme = descriptionProbleme;
	}
	/**
	 * 
	 */
	public ConsultationPrenatale()
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
	 * @return the consultationPrenatale_id
	 */
	public Long getConsultationPrenatale_id()
	{
		return consultationPrenatale_id;
	}
	/**
	 * @param consultationPrenatale_id the consultationPrenatale_id to set
	 */
	public void setConsultationPrenatale_id(Long consultationPrenatale_id)
	{
		this.consultationPrenatale_id = consultationPrenatale_id;
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
	 * @return the numCpn
	 */
	public String getNumCpn()
	{
		return numCpn;
	}
	/**
	 * @param numCpn the numCpn to set
	 */
	public void setNumCpn(String numCpn)
	{
		this.numCpn = numCpn;
	}
	/**
	 * @return the ageGrossesse
	 */
	public int getAgeGrossesse()
	{
		return ageGrossesse;
	}
	/**
	 * @param ageGrossesse the ageGrossesse to set
	 */
	public void setAgeGrossesse(int ageGrossesse)
	{
		this.ageGrossesse = ageGrossesse;
	}
	/**
	 * @return the gestiteFemme
	 */
	public String getGestiteFemme()
	{
		return gestiteFemme;
	}
	/**
	 * @param gestiteFemme the gestiteFemme to set
	 */
	public void setGestiteFemme(String gestiteFemme)
	{
		this.gestiteFemme = gestiteFemme;
	}
	/**
	 * @return the parite
	 */
	public int getParite()
	{
		return parite;
	}
	/**
	 * @param parite the parite to set
	 */
	public void setParite(int parite)
	{
		this.parite = parite;
	}
	/**
	 * @return the depistageVih
	 */
	public String getDepistageVih()
	{
		return depistageVih;
	}
	/**
	 * @param depistageVih the depistageVih to set
	 */
	public void setDepistageVih(String depistageVih)
	{
		this.depistageVih = depistageVih;
	}
	/**
	 * @return the depistageSyphilis
	 */
	public String getDepistageSyphilis()
	{
		return depistageSyphilis;
	}
	/**
	 * @param depistageSyphilis the depistageSyphilis to set
	 */
	public void setDepistageSyphilis(String depistageSyphilis)
	{
		this.depistageSyphilis = depistageSyphilis;
	}
	/**
	 * @return the depistageViraleB
	 */
	public String getDepistageViraleB()
	{
		return depistageViraleB;
	}
	/**
	 * @param depistageViraleB the depistageViraleB to set
	 */
	public void setDepistageViraleB(String depistageViraleB)
	{
		this.depistageViraleB = depistageViraleB;
	}
	/**
	 * @return the diabeteConnu
	 */
	public String getDiabeteConnu()
	{
		return diabeteConnu;
	}
	/**
	 * @param diabeteConnu the diabeteConnu to set
	 */
	public void setDiabeteConnu(String diabeteConnu)
	{
		this.diabeteConnu = diabeteConnu;
	}
	/**
	 * @return the htaConnu
	 */
	public String getHtaConnu()
	{
		return htaConnu;
	}
	/**
	 * @param htaConnu the htaConnu to set
	 */
	public void setHtaConnu(String htaConnu)
	{
		this.htaConnu = htaConnu;
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
	 * @return the etatNutritionnel
	 */
	public String getEtatNutritionnel()
	{
		return etatNutritionnel;
	}
	/**
	 * @param etatNutritionnel the etatNutritionnel to set
	 */
	public void setEtatNutritionnel(String etatNutritionnel)
	{
		this.etatNutritionnel = etatNutritionnel;
	}
	/**
	 * @return the numCpn1AgeGross
	 */
	public int getNumCpn1AgeGross()
	{
		return numCpn1AgeGross;
	}
	/**
	 * @param numCpn1AgeGross the numCpn1AgeGross to set
	 */
	public void setNumCpn1AgeGross(int numCpn1AgeGross)
	{
		this.numCpn1AgeGross = numCpn1AgeGross;
	}
	/**
	 * @return the risqueAgeGross
	 */
	public String getRisqueAgeGross()
	{
		return risqueAgeGross;
	}
	/**
	 * @param risqueAgeGross the risqueAgeGross to set
	 */
	public void setRisqueAgeGross(String risqueAgeGross)
	{
		this.risqueAgeGross = risqueAgeGross;
	}
	/**
	 * @return the vaccinationFemme
	 */
	public String getVaccinationFemme()
	{
		return vaccinationFemme;
	}
	/**
	 * @param vaccinationFemme the vaccinationFemme to set
	 */
	public void setVaccinationFemme(String vaccinationFemme)
	{
		this.vaccinationFemme = vaccinationFemme;
	}
	/**
	 * @return the preventionFemme
	 */
	public String getPreventionFemme()
	{
		return preventionFemme;
	}
	/**
	 * @param preventionFemme the preventionFemme to set
	 */
	public void setPreventionFemme(String preventionFemme)
	{
		this.preventionFemme = preventionFemme;
	}
	/**
	 * @return the detectionProbleme
	 */
	public int getDetectionProbleme()
	{
		return detectionProbleme;
	}
	/**
	 * @param detectionProbleme the detectionProbleme to set
	 */
	public void setDetectionProbleme(int detectionProbleme)
	{
		this.detectionProbleme = detectionProbleme;
	}
	/**
	 * @return the conseillingPf
	 */
	public String getConseillingPf()
	{
		return conseillingPf;
	}
	/**
	 * @param conseillingPf the conseillingPf to set
	 */
	public void setConseillingPf(String conseillingPf)
	{
		this.conseillingPf = conseillingPf;
	}
	/**
	 * @return the reference
	 */
	public String getReference()
	{
		return reference;
	}
	/**
	 * @param reference the reference to set
	 */
	public void setReference(String reference)
	{
		this.reference = reference;
	}
	/**
	 * @return the descriptionProbleme
	 */
	public String getDescriptionProbleme()
	{
		return descriptionProbleme;
	}
	/**
	 * @param descriptionProbleme the descriptionProbleme to set
	 */
	public void setDescriptionProbleme(String descriptionProbleme)
	{
		this.descriptionProbleme = descriptionProbleme;
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

package bu.clinix.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Acte implements Serializable
{
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "patient_id")
	//@JsonIgnore
	private Patient patient;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long acte_id;
	private String chefFamille;
	private String groupeAge;
	private String origine;
	private String origineDemandeService;
	private String origineDemandePrescripteur;
	private boolean femmeEnceinte;
	private String justification;
	private String codeDescriptionActe;
	private String libelleDescriptionActe;
	private boolean decesDurantActe;
	private String observation;
	private String responsableActe;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyyMMdd-HHmmSS")
	private Date dateEnregistre;
	
	
	/**
	 * @param chefFamille
	 * @param groupeAge
	 * @param origine
	 * @param origineDemandeService
	 * @param origineDemandePrescripteur
	 * @param femmeEnceinte
	 * @param justification
	 * @param codeDescriptionActe
	 * @param libelleDescriptionActe
	 * @param decesDurantActe
	 * @param observation
	 * @param responsableActe
	 */
	public Acte(String chefFamille, String groupeAge, String origine, String origineDemandeService,
			String origineDemandePrescripteur, boolean femmeEnceinte, String justification, String codeDescriptionActe,
			String libelleDescriptionActe, boolean decesDurantActe, String observation, String responsableActe)
	{
		super();
		this.chefFamille = chefFamille;
		this.groupeAge = groupeAge;
		this.origine = origine;
		this.origineDemandeService = origineDemandeService;
		this.origineDemandePrescripteur = origineDemandePrescripteur;
		this.femmeEnceinte = femmeEnceinte;
		this.justification = justification;
		this.codeDescriptionActe = codeDescriptionActe;
		this.libelleDescriptionActe = libelleDescriptionActe;
		this.decesDurantActe = decesDurantActe;
		this.observation = observation;
		this.responsableActe = responsableActe;
	}
	/**
	 * 
	 */
	public Acte()
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
	 * @return the acte_id
	 */
	public Long getActe_id()
	{
		return acte_id;
	}
	/**
	 * @param acte_id the acte_id to set
	 */
	public void setActe_id(Long acte_id)
	{
		this.acte_id = acte_id;
	}
	/**
	 * @return the origineDemandeService
	 */
	public String getOrigineDemandeService()
	{
		return origineDemandeService;
	}
	/**
	 * @param origineDemandeService the origineDemandeService to set
	 */
	public void setOrigineDemandeService(String origineDemandeService)
	{
		this.origineDemandeService = origineDemandeService;
	}
	/**
	 * @return the origineDemandePrescripteur
	 */
	public String getOrigineDemandePrescripteur()
	{
		return origineDemandePrescripteur;
	}
	/**
	 * @param origineDemandePrescripteur the origineDemandePrescripteur to set
	 */
	public void setOrigineDemandePrescripteur(String origineDemandePrescripteur)
	{
		this.origineDemandePrescripteur = origineDemandePrescripteur;
	}
	/**
	 * @return the femmeEnceinte
	 */
	public boolean isFemmeEnceinte()
	{
		return femmeEnceinte;
	}
	/**
	 * @param femmeEnceinte the femmeEnceinte to set
	 */
	public void setFemmeEnceinte(boolean femmeEnceinte)
	{
		this.femmeEnceinte = femmeEnceinte;
	}
	/**
	 * @return the justification
	 */
	public String getJustification()
	{
		return justification;
	}
	/**
	 * @param justification the justification to set
	 */
	public void setJustification(String justification)
	{
		this.justification = justification;
	}
	/**
	 * @return the codeDescriptionActe
	 */
	public String getCodeDescriptionActe()
	{
		return codeDescriptionActe;
	}
	/**
	 * @param codeDescriptionActe the codeDescriptionActe to set
	 */
	public void setCodeDescriptionActe(String codeDescriptionActe)
	{
		this.codeDescriptionActe = codeDescriptionActe;
	}
	/**
	 * @return the libelleDescriptionActe
	 */
	public String getLibelleDescriptionActe()
	{
		return libelleDescriptionActe;
	}
	/**
	 * @param libelleDescriptionActe the libelleDescriptionActe to set
	 */
	public void setLibelleDescriptionActe(String libelleDescriptionActe)
	{
		this.libelleDescriptionActe = libelleDescriptionActe;
	}
	/**
	 * @return the decesDurantActe
	 */
	public boolean isDecesDurantActe()
	{
		return decesDurantActe;
	}
	/**
	 * @param decesDurantActe the decesDurantActe to set
	 */
	public void setDecesDurantActe(boolean decesDurantActe)
	{
		this.decesDurantActe = decesDurantActe;
	}
	/**
	 * @return the observation
	 */
	public String getObservation()
	{
		return observation;
	}
	/**
	 * @param observation the observation to set
	 */
	public void setObservation(String observation)
	{
		this.observation = observation;
	}
	/**
	 * @return the responsableActe
	 */
	public String getResponsableActe()
	{
		return responsableActe;
	}
	/**
	 * @param responsableActe the responsableActe to set
	 */
	public void setResponsableActe(String responsableActe)
	{
		this.responsableActe = responsableActe;
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

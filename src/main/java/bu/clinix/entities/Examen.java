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
public class Examen implements Serializable
{
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "patient_id")
	//@JsonIgnore
	private Patient patient;
	
//	@ManyToOne(fetch = FetchType.EAGER)
//	@JoinColumn(name = "patient_id")
//	//@JsonIgnore
//	private Patient patient;
	

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long examen_id;
	
	private String chefFamille;
	private String groupeAge;
	private String origine;
	private String origineDemandeService;
	private String origineDemandePrescripteur;
	private boolean femmeEnceinte;
	private String codeExamen;
	private String libelleExamen;
	private String resultatExamen;
	private String valeurProtocole;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyyMMdd-HHmmSS")
	private Date dateEnregistre;
	
	
	
	/**
	 * @param chefFamille
	 * @param groupeAge
	 * @param origine
	 * @param origineDemandeService
	 * @param origineDemandePrescripteur
	 * @param femmeEnceinte
	 * @param codeExamen
	 * @param libelleExamen
	 * @param resultatExamen
	 * @param valeurProtocole
	 */
	public Examen(String chefFamille, String groupeAge, String origine, String origineDemandeService,
			String origineDemandePrescripteur, boolean femmeEnceinte, String codeExamen, String libelleExamen,
			String resultatExamen, String valeurProtocole, Date dateEnregistre)
	{
		super();
		this.chefFamille = chefFamille;
		this.groupeAge = groupeAge;
		this.origine = origine;
		this.origineDemandeService = origineDemandeService;
		this.origineDemandePrescripteur = origineDemandePrescripteur;
		this.femmeEnceinte = femmeEnceinte;
		this.codeExamen = codeExamen;
		this.libelleExamen = libelleExamen;
		this.resultatExamen = resultatExamen;
		this.valeurProtocole = valeurProtocole;
		this.dateEnregistre = dateEnregistre;
	}
	/**
	 * 
	 */
	public Examen()
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
	 * @return the examen_id
	 */
	public Long getExamen_id()
	{
		return examen_id;
	}
	/**
	 * @param examen_id the examen_id to set
	 */
	public void setExamen_id(Long examen_id)
	{
		this.examen_id = examen_id;
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
	 * @return the codeExamen
	 */
	public String getCodeExamen()
	{
		return codeExamen;
	}
	/**
	 * @param codeExamen the codeExamen to set
	 */
	public void setCodeExamen(String codeExamen)
	{
		this.codeExamen = codeExamen;
	}
	/**
	 * @return the libelleExamen
	 */
	public String getLibelleExamen()
	{
		return libelleExamen;
	}
	/**
	 * @param libelleExamen the libelleExamen to set
	 */
	public void setLibelleExamen(String libelleExamen)
	{
		this.libelleExamen = libelleExamen;
	}
	/**
	 * @return the resultatExamen
	 */
	public String getResultatExamen()
	{
		return resultatExamen;
	}
	/**
	 * @param resultatExamen the resultatExamen to set
	 */
	public void setResultatExamen(String resultatExamen)
	{
		this.resultatExamen = resultatExamen;
	}
	/**
	 * @return the valeurProtocole
	 */
	public String getValeurProtocole()
	{
		return valeurProtocole;
	}
	/**
	 * @param valeurProtocole the valeurProtocole to set
	 */
	public void setValeurProtocole(String valeurProtocole)
	{
		this.valeurProtocole = valeurProtocole;
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
	/**
	 * @return the dateEnregistre
	 */
	public Date getDateEnregistre()
	{
		return dateEnregistre;
	}
	/**
	 * @param dateEnregistre the dateEnregistre to set
	 */
	public void setDateEnregistre(Date dateEnregistre)
	{
		dateEnregistre = dateEnregistre;
	}
	
	

}

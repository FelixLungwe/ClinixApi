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
public class Intervation implements Serializable
{
	@ManyToOne
	@JoinColumn(name = "patient_id")
	@JsonIgnore
	private Patient patient;
	

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long intervention_id;
	
	private String chefFamille;
	private String groupeAge;
	private String origine;
	private String codeServiceOrigine;
	private String originePrescripteur;
	private boolean femmeEnceinte;
	private String codeDiagnostic;
	private String libelleDiagnostic;
	private String typeIntervention;
	private String codeActe;
	private String libelleActe;
	private String protocole;
	private  boolean deces;
	private String observation;
	private String responsables;// type de donnee � verifier !!!
	
	
	
	/**
	 * @param chefFamille
	 * @param groupeAge
	 * @param origine
	 * @param codeServiceOrigine
	 * @param originePrescripteur
	 * @param femmeEnceinte
	 * @param codeDiagnostic
	 * @param libelleDiagnostic
	 * @param typeIntervention
	 * @param codeActe
	 * @param libelleActe
	 * @param protocole
	 * @param deces
	 * @param observation
	 * @param responsables
	 * @param codeTypeAnestesie
	 * @param libelleTypeAnestesie
	 */
	public Intervation(String chefFamille, String groupeAge, String origine, String codeServiceOrigine,
			String originePrescripteur, boolean femmeEnceinte, String codeDiagnostic, String libelleDiagnostic,
			String typeIntervention, String codeActe, String libelleActe, String protocole, boolean deces,
			String observation, String responsables, String codeTypeAnestesie, String libelleTypeAnestesie)
	{
		super();
		this.chefFamille = chefFamille;
		this.groupeAge = groupeAge;
		this.origine = origine;
		this.codeServiceOrigine = codeServiceOrigine;
		this.originePrescripteur = originePrescripteur;
		this.femmeEnceinte = femmeEnceinte;
		this.codeDiagnostic = codeDiagnostic;
		this.libelleDiagnostic = libelleDiagnostic;
		this.typeIntervention = typeIntervention;
		this.codeActe = codeActe;
		this.libelleActe = libelleActe;
		this.protocole = protocole;
		this.deces = deces;
		this.observation = observation;
		this.responsables = responsables;
		this.codeTypeAnestesie = codeTypeAnestesie;
		this.libelleTypeAnestesie = libelleTypeAnestesie;
	}
	/**
	 * 
	 */
	public Intervation()
	{
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the codeTypeAnestesie
	 */
	public String getCodeTypeAnestesie()
	{
		return codeTypeAnestesie;
	}
	/**
	 * @param codeTypeAnestesie the codeTypeAnestesie to set
	 */
	public void setCodeTypeAnestesie(String codeTypeAnestesie)
	{
		this.codeTypeAnestesie = codeTypeAnestesie;
	}
	/**
	 * @return the libelleTypeAnestesie
	 */
	public String getLibelleTypeAnestesie()
	{
		return libelleTypeAnestesie;
	}
	/**
	 * @param libelleTypeAnestesie the libelleTypeAnestesie to set
	 */
	public void setLibelleTypeAnestesie(String libelleTypeAnestesie)
	{
		this.libelleTypeAnestesie = libelleTypeAnestesie;
	}
	private String codeTypeAnestesie;
	private String libelleTypeAnestesie;
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
	 * @return the intervention_id
	 */
	public Long getIntervention_id()
	{
		return intervention_id;
	}
	/**
	 * @param intervention_id the intervention_id to set
	 */
	public void setIntervention_id(Long intervention_id)
	{
		this.intervention_id = intervention_id;
	}
	/**
	 * @return the codeServiceOrigine
	 */
	public String getCodeServiceOrigine()
	{
		return codeServiceOrigine;
	}
	/**
	 * @param codeServiceOrigine the codeServiceOrigine to set
	 */
	public void setCodeServiceOrigine(String codeServiceOrigine)
	{
		this.codeServiceOrigine = codeServiceOrigine;
	}
	/**
	 * @return the originePrescripteur
	 */
	public String getOriginePrescripteur()
	{
		return originePrescripteur;
	}
	/**
	 * @param originePrescripteur the originePrescripteur to set
	 */
	public void setOriginePrescripteur(String originePrescripteur)
	{
		this.originePrescripteur = originePrescripteur;
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
	 * @return the codeDiagnostic
	 */
	public String getCodeDiagnostic()
	{
		return codeDiagnostic;
	}
	/**
	 * @param codeDiagnostic the codeDiagnostic to set
	 */
	public void setCodeDiagnostic(String codeDiagnostic)
	{
		this.codeDiagnostic = codeDiagnostic;
	}
	/**
	 * @return the libelleDiagnostic
	 */
	public String getLibelleDiagnostic()
	{
		return libelleDiagnostic;
	}
	/**
	 * @param libelleDiagnostic the libelleDiagnostic to set
	 */
	public void setLibelleDiagnostic(String libelleDiagnostic)
	{
		this.libelleDiagnostic = libelleDiagnostic;
	}
	/**
	 * @return the typeIntervention
	 */
	public String getTypeIntervention()
	{
		return typeIntervention;
	}
	/**
	 * @param typeIntervention the typeIntervention to set
	 */
	public void setTypeIntervention(String typeIntervention)
	{
		this.typeIntervention = typeIntervention;
	}
	/**
	 * @return the codeActe
	 */
	public String getCodeActe()
	{
		return codeActe;
	}
	/**
	 * @param codeActe the codeActe to set
	 */
	public void setCodeActe(String codeActe)
	{
		this.codeActe = codeActe;
	}
	/**
	 * @return the libelleActe
	 */
	public String getLibelleActe()
	{
		return libelleActe;
	}
	/**
	 * @param libelleActe the libelleActe to set
	 */
	public void setLibelleActe(String libelleActe)
	{
		this.libelleActe = libelleActe;
	}
	/**
	 * @return the protocole
	 */
	public String getProtocole()
	{
		return protocole;
	}
	/**
	 * @param protocole the protocole to set
	 */
	public void setProtocole(String protocole)
	{
		this.protocole = protocole;
	}
	/**
	 * @return the deces
	 */
	public boolean isDeces()
	{
		return deces;
	}
	/**
	 * @param deces the deces to set
	 */
	public void setDeces(boolean deces)
	{
		this.deces = deces;
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
	 * @return the responsables
	 */
	public String getResponsables()
	{
		return responsables;
	}
	/**
	 * @param responsables the responsables to set
	 */
	public void setResponsables(String responsables)
	{
		this.responsables = responsables;
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

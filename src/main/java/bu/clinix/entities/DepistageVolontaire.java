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
public class DepistageVolontaire implements Serializable
{
	@ManyToOne
	@JoinColumn(name = "patient_id")
	@JsonIgnore
	private Patient patient;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long depistageVolontaire_id;
	private String chefFamille;
	private String groupeAge;
	private String origine;
	private String codeClientComplexe;
	
	private int agePatient;
	private String etatCivil;
	private String professionPatient;
	private String facteurRisque;
	private String raisonTest;
	private String depistageVih;
	private String pointEntree;
	private String vihPositif;
	private String relationPersonneIndexee;
	private String reference;
	private String observation;
	
	
	
	/**
	 * @param chefFamille
	 * @param groupeAge
	 * @param origine
	 * @param codeClientComplexe
	 * @param agePatient
	 * @param etatCivil
	 * @param professionPatient
	 * @param facteurRisque
	 * @param raisonTest
	 * @param depistageVih
	 * @param pointEntree
	 * @param vihPositif
	 * @param relationPersonneIndexee
	 * @param reference
	 * @param observation
	 */
	public DepistageVolontaire(String chefFamille, String groupeAge, String origine, String codeClientComplexe,
			int agePatient, String etatCivil, String professionPatient, String facteurRisque, String raisonTest,
			String depistageVih, String pointEntree, String vihPositif, String relationPersonneIndexee,
			String reference, String observation)
	{
		super();
		this.chefFamille = chefFamille;
		this.groupeAge = groupeAge;
		this.origine = origine;
		this.codeClientComplexe = codeClientComplexe;
		this.agePatient = agePatient;
		this.etatCivil = etatCivil;
		this.professionPatient = professionPatient;
		this.facteurRisque = facteurRisque;
		this.raisonTest = raisonTest;
		this.depistageVih = depistageVih;
		this.pointEntree = pointEntree;
		this.vihPositif = vihPositif;
		this.relationPersonneIndexee = relationPersonneIndexee;
		this.reference = reference;
		this.observation = observation;
	}
	/**
	 * 
	 */
	public DepistageVolontaire()
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
	 * @return the depistageVolontaire_id
	 */
	public Long getDepistageVolontaire_id()
	{
		return depistageVolontaire_id;
	}
	/**
	 * @param depistageVolontaire_id the depistageVolontaire_id to set
	 */
	public void setDepistageVolontaire_id(Long depistageVolontaire_id)
	{
		this.depistageVolontaire_id = depistageVolontaire_id;
	}
	/**
	 * @return the codeClientComplexe
	 */
	public String getCodeClientComplexe()
	{
		return codeClientComplexe;
	}
	/**
	 * @param codeClientComplexe the codeClientComplexe to set
	 */
	public void setCodeClientComplexe(String codeClientComplexe)
	{
		this.codeClientComplexe = codeClientComplexe;
	}
	/**
	 * @return the agePatient
	 */
	public int getAgePatient()
	{
		return agePatient;
	}
	/**
	 * @param agePatient the agePatient to set
	 */
	public void setAgePatient(int agePatient)
	{
		this.agePatient = agePatient;
	}
	/**
	 * @return the etatCivil
	 */
	public String getEtatCivil()
	{
		return etatCivil;
	}
	/**
	 * @param etatCivil the etatCivil to set
	 */
	public void setEtatCivil(String etatCivil)
	{
		this.etatCivil = etatCivil;
	}
	/**
	 * @return the professionPatient
	 */
	public String getProfessionPatient()
	{
		return professionPatient;
	}
	/**
	 * @param professionPatient the professionPatient to set
	 */
	public void setProfessionPatient(String professionPatient)
	{
		this.professionPatient = professionPatient;
	}
	/**
	 * @return the facteurRisque
	 */
	public String getFacteurRisque()
	{
		return facteurRisque;
	}
	/**
	 * @param facteurRisque the facteurRisque to set
	 */
	public void setFacteurRisque(String facteurRisque)
	{
		this.facteurRisque = facteurRisque;
	}
	/**
	 * @return the raisonTest
	 */
	public String getRaisonTest()
	{
		return raisonTest;
	}
	/**
	 * @param raisonTest the raisonTest to set
	 */
	public void setRaisonTest(String raisonTest)
	{
		this.raisonTest = raisonTest;
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
	 * @return the pointEntree
	 */
	public String getPointEntree()
	{
		return pointEntree;
	}
	/**
	 * @param pointEntree the pointEntree to set
	 */
	public void setPointEntree(String pointEntree)
	{
		this.pointEntree = pointEntree;
	}
	/**
	 * @return the vihPositif
	 */
	public String getVihPositif()
	{
		return vihPositif;
	}
	/**
	 * @param vihPositif the vihPositif to set
	 */
	public void setVihPositif(String vihPositif)
	{
		this.vihPositif = vihPositif;
	}
	/**
	 * @return the relationPersonneIndexee
	 */
	public String getRelationPersonneIndexee()
	{
		return relationPersonneIndexee;
	}
	/**
	 * @param relationPersonneIndexee the relationPersonneIndexee to set
	 */
	public void setRelationPersonneIndexee(String relationPersonneIndexee)
	{
		this.relationPersonneIndexee = relationPersonneIndexee;
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
	
	

}

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
public class PlanificationFamiliale implements Serializable
{
	@ManyToOne
	@JoinColumn(name = "patient_id")
	@JsonIgnore
	private Patient patient;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long planificationFamiliale_id;
	private String chefFamille;
	private String groupeAge;
	private String origine;
	private boolean accompagneParParten;
	private String methodeUtilisee;
	private String ancienneAcceptante;
	private String effetSecondaire;
	private String changement;
	private String  controle;
	private int qtteDistribue;
	private int qtteInjectAdministreParTps;
	
	
	/**
	 * @param chefFamille
	 * @param groupeAge
	 * @param origine
	 * @param accompagneParParten
	 * @param methodeUtilisee
	 * @param ancienneAcceptante
	 * @param effetSecondaire
	 * @param changement
	 * @param controle
	 * @param qtteDistribue
	 * @param qtteInjectAdministreParTps
	 */
	public PlanificationFamiliale(String chefFamille, String groupeAge, String origine, boolean accompagneParParten,
			String methodeUtilisee, String ancienneAcceptante, String effetSecondaire, String changement,
			String controle, int qtteDistribue, int qtteInjectAdministreParTps)
	{
		super();
		this.chefFamille = chefFamille;
		this.groupeAge = groupeAge;
		this.origine = origine;
		this.accompagneParParten = accompagneParParten;
		this.methodeUtilisee = methodeUtilisee;
		this.ancienneAcceptante = ancienneAcceptante;
		this.effetSecondaire = effetSecondaire;
		this.changement = changement;
		this.controle = controle;
		this.qtteDistribue = qtteDistribue;
		this.qtteInjectAdministreParTps = qtteInjectAdministreParTps;
	}
	/**
	 * 
	 */
	public PlanificationFamiliale()
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
	 * @return the planificationFamiliale_id
	 */
	public Long getPlanificationFamiliale_id()
	{
		return planificationFamiliale_id;
	}
	/**
	 * @param planificationFamiliale_id the planificationFamiliale_id to set
	 */
	public void setPlanificationFamiliale_id(Long planificationFamiliale_id)
	{
		this.planificationFamiliale_id = planificationFamiliale_id;
	}
	/**
	 * @return the accompagneParParten
	 */
	public boolean isAccompagneParParten()
	{
		return accompagneParParten;
	}
	/**
	 * @param accompagneParParten the accompagneParParten to set
	 */
	public void setAccompagneParParten(boolean accompagneParParten)
	{
		this.accompagneParParten = accompagneParParten;
	}
	/**
	 * @return the methodeUtilisee
	 */
	public String getMethodeUtilisee()
	{
		return methodeUtilisee;
	}
	/**
	 * @param methodeUtilisee the methodeUtilisee to set
	 */
	public void setMethodeUtilisee(String methodeUtilisee)
	{
		this.methodeUtilisee = methodeUtilisee;
	}
	/**
	 * @return the ancienneAcceptante
	 */
	public String getAncienneAcceptante()
	{
		return ancienneAcceptante;
	}
	/**
	 * @param ancienneAcceptante the ancienneAcceptante to set
	 */
	public void setAncienneAcceptante(String ancienneAcceptante)
	{
		this.ancienneAcceptante = ancienneAcceptante;
	}
	/**
	 * @return the effetSecondaire
	 */
	public String getEffetSecondaire()
	{
		return effetSecondaire;
	}
	/**
	 * @param effetSecondaire the effetSecondaire to set
	 */
	public void setEffetSecondaire(String effetSecondaire)
	{
		this.effetSecondaire = effetSecondaire;
	}
	/**
	 * @return the changement
	 */
	public String getChangement()
	{
		return changement;
	}
	/**
	 * @param changement the changement to set
	 */
	public void setChangement(String changement)
	{
		this.changement = changement;
	}
	/**
	 * @return the controle
	 */
	public String getControle()
	{
		return controle;
	}
	/**
	 * @param controle the controle to set
	 */
	public void setControle(String controle)
	{
		this.controle = controle;
	}
	/**
	 * @return the qtteDistribue
	 */
	public int getQtteDistribue()
	{
		return qtteDistribue;
	}
	/**
	 * @param qtteDistribue the qtteDistribue to set
	 */
	public void setQtteDistribue(int qtteDistribue)
	{
		this.qtteDistribue = qtteDistribue;
	}
	/**
	 * @return the qtteInjectAdministreParTps
	 */
	public int getQtteInjectAdministreParTps()
	{
		return qtteInjectAdministreParTps;
	}
	/**
	 * @param qtteInjectAdministreParTps the qtteInjectAdministreParTps to set
	 */
	public void setQtteInjectAdministreParTps(int qtteInjectAdministreParTps)
	{
		this.qtteInjectAdministreParTps = qtteInjectAdministreParTps;
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

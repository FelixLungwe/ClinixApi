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
public class Entree implements Serializable
{
	@ManyToOne
	@JoinColumn(name = "patient_id")
	@JsonIgnore
	private Patient patient;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long entree_id;
	
	private String chefFamille;
	private String groupeAge;
	private String origine;
	@DateTimeFormat(pattern = "dd-MM-yy")
	@Temporal(TemporalType.DATE)
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yy")
	private Date dateEntree;
	private String mode;
	private String diagnostic;
	private String contexte;
	private String typeService;
	
	
	
	/**
	 * @param chefFamille
	 * @param groupeAge
	 * @param origine
	 * @param dateEntree
	 * @param mode
	 * @param diagnostic
	 * @param contexte
	 * @param typeService
	 */
	public Entree(String chefFamille, String groupeAge, String origine, Date dateEntree, String mode, String diagnostic,
			String contexte, String typeService)
	{
		super();
		this.chefFamille = chefFamille;
		this.groupeAge = groupeAge;
		this.origine = origine;
		this.dateEntree = dateEntree;
		this.mode = mode;
		this.diagnostic = diagnostic;
		this.contexte = contexte;
		this.typeService = typeService;
	}
	/**
	 * 
	 */
	public Entree()
	{
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the entree_id
	 */
	public Long getEntree_id()
	{
		return entree_id;
	}
	/**
	 * @param entree_id the entree_id to set
	 */
	public void setEntree_id(Long entree_id)
	{
		this.entree_id = entree_id;
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
	 * @return the dateEntree
	 */
	public Date getDateEntree()
	{
		return dateEntree;
	}
	/**
	 * @param dateEntree the dateEntree to set
	 */
	public void setDateEntree(Date dateEntree)
	{
		this.dateEntree = dateEntree;
	}
	/**
	 * @return the mode
	 */
	public String getMode()
	{
		return mode;
	}
	/**
	 * @param mode the mode to set
	 */
	public void setMode(String mode)
	{
		this.mode = mode;
	}
	/**
	 * @return the diagnostic
	 */
	public String getDiagnostic()
	{
		return diagnostic;
	}
	/**
	 * @param diagnostic the diagnostic to set
	 */
	public void setDiagnostic(String diagnostic)
	{
		this.diagnostic = diagnostic;
	}
	/**
	 * @return the contexte
	 */
	public String getContexte()
	{
		return contexte;
	}
	/**
	 * @param contexte the contexte to set
	 */
	public void setContexte(String contexte)
	{
		this.contexte = contexte;
	}
	/**
	 * @return the typeService
	 */
	public String getTypeService()
	{
		return typeService;
	}
	/**
	 * @param typeService the typeService to set
	 */
	public void setTypeService(String typeService)
	{
		this.typeService = typeService;
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

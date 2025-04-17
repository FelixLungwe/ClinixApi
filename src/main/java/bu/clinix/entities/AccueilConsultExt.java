package bu.clinix.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.NonNull;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

@Entity
public class AccueilConsultExt implements Serializable
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long accueilConsultExt_id; // accueilConsultExt_id
	private String modePayement;
	
	private String chefFamille;
	private String age;
	private String groupeAge;
	private String origine;
	private String serviceDestination;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyyMMdd-HHmmSS")
	private Date dateConsult;
	private boolean state;
	
	
//	@ManyToMany(fetch = FetchType.EAGER)
//    @JoinTable(name = "users_roles", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
//    List<AppRole> appRoles;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "patient_id")
	//@JsonIgnore
	private Patient patient;
	
	
	
	
	
	/**
	 * @param modePayement
	 * @param chefFamille
	 * @param age
	 * @param groupeAge
	 * @param origine
	 * @param serviceDestination
	 * @param dateConsult
	 */
	public AccueilConsultExt(String modePayement, String chefFamille, String age, String groupeAge, String origine,
			String serviceDestination, Date dateConsult, boolean state)
	{
		super();
		this.modePayement = modePayement;
		this.chefFamille = chefFamille;
		this.age = age;
		this.groupeAge = groupeAge;
		this.origine = origine;
		this.serviceDestination = serviceDestination;
		this.dateConsult = dateConsult;
		this.state = state;
	}

	/**
	 * 
	 */
	public AccueilConsultExt()
	{
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the accueilConsultExt_id
	 */
	public Long getAccueilConsultExt_id()
	{
		return accueilConsultExt_id;
	}

	/**
	 * @param accueilConsultExt_id the accueilConsultExt_id to set
	 */
	public void setAccueilConsultExt_id(Long accueilConsultExt_id)
	{
		this.accueilConsultExt_id = accueilConsultExt_id;
	}

	/**
	 * @return the modePayement
	 */
	public String getModePayement()
	{
		return modePayement;
	}

	/**
	 * @param modePayement the modePayement to set
	 */
	public void setModePayement(String modePayement)
	{
		this.modePayement = modePayement;
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
	 * @return the age
	 */
	public String getAge()
	{
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(String age)
	{
		this.age = age;
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
	 * @return the serviceDestination
	 */
	public String getServiceDestination()
	{
		return serviceDestination;
	}

	/**
	 * @param serviceDestination the serviceDestination to set
	 */
	public void setServiceDestination(String serviceDestination)
	{
		this.serviceDestination = serviceDestination;
	}

	/**
	 * @return the dateConsult
	 */
	public Date getDateConsult()
	{
		return dateConsult;
	}

	/**
	 * @param dateConsult the dateConsult to set
	 */
	public void setDateConsult(Date dateConsult)
	{
		this.dateConsult = dateConsult;
	}
	
	

	/**
	 * @return the state
	 */
	public boolean isState()
	{
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(boolean state)
	{
		this.state = state;
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


}

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

@Entity
public class AccueilHospitalisation implements Serializable
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long accueilHosp_id;
	private String modePayement;
	
	private String chefFamille;
	private String age;
	private String groupeAge;
	private String origine;
	private boolean envoyeParConsult;
	private String serviceDestination;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyyMMdd-HHmmSS")
	private Date dateSortie;
	
	private Long dureeSejour;
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
	 * 
	 */
	public AccueilHospitalisation()
	{
		super();
		// TODO Auto-generated constructor stub
	}




	/**
	 * @param modePayement
	 * @param chefFamille
	 * @param age
	 * @param groupeAge
	 * @param origine
	 * @param envoyeParConsult
	 * @param serviceDestination
	 * @param dateSortie
	 * @param dureeSejour
	 * @param dateConsult
	 * @param state
	 */
	public AccueilHospitalisation(String modePayement, String chefFamille, String age, String groupeAge, String origine,
			boolean envoyeParConsult, String serviceDestination, Date dateSortie, Long dureeSejour, Date dateConsult,
			boolean state)
	{
		super();
		this.modePayement = modePayement;
		this.chefFamille = chefFamille;
		this.age = age;
		this.groupeAge = groupeAge;
		this.origine = origine;
		this.envoyeParConsult = envoyeParConsult;
		this.serviceDestination = serviceDestination;
		this.dateSortie = dateSortie;
		this.dureeSejour = dureeSejour;
		this.dateConsult = dateConsult;
		this.state = state;
	}




	/**
	 * @return the accueilHosp_id
	 */
	public Long getAccueilHosp_id()
	{
		return accueilHosp_id;
	}




	/**
	 * @param accueilHosp_id the accueilHosp_id to set
	 */
	public void setAccueilHosp_id(Long accueilHosp_id)
	{
		this.accueilHosp_id = accueilHosp_id;
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
	 * @return the envoyeParConsult
	 */
	public boolean isEnvoyeParConsult()
	{
		return envoyeParConsult;
	}




	/**
	 * @param envoyeParConsult the envoyeParConsult to set
	 */
	public void setEnvoyeParConsult(boolean envoyeParConsult)
	{
		this.envoyeParConsult = envoyeParConsult;
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
	 * @return the dureeSejour
	 */
	public Long getDureeSejour()
	{
		return dureeSejour;
	}




	/**
	 * @param dureeSejour the dureeSejour to set
	 */
	public void setDureeSejour(Long dureeSejour)
	{
		this.dureeSejour = dureeSejour;
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

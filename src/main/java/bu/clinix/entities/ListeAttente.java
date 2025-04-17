package bu.clinix.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.lang.NonNull;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class ListeAttente
{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "patient_id")
	@JsonProperty
	private Patient patient;
	
	private String serviceDestination;
	private String serviceSource;
	@NonNull
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyyMMdd-HHmmSS")
	private Date dateEnregistre;
	private boolean state;
	
	
	
	
	/**
	 * @param serviceDestination
	 * @param serviceSource
	 * @param dateEnregistre
	 * @param state
	 */
	public ListeAttente(String serviceDestination, String serviceSource, Date dateEnregistre, boolean state)
	{
		super();
		this.serviceDestination = serviceDestination;
		this.serviceSource = serviceSource;
		this.dateEnregistre = dateEnregistre;
		this.state = state;
	}
	/**
	 * 
	 */
	public ListeAttente()
	{
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the id
	 */
	public Long getId()
	{
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id)
	{
		this.id = id;
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
	 * @return the serviceSource
	 */
	public String getServiceSource()
	{
		return serviceSource;
	}
	/**
	 * @param serviceSource the serviceSource to set
	 */
	public void setServiceSource(String serviceSource)
	{
		this.serviceSource = serviceSource;
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
		this.dateEnregistre = dateEnregistre;
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
	public String getServiceDestination()
	{
		return serviceDestination;
	}
	public void setServiceDestination(String serviceDestination)
	{
		this.serviceDestination = serviceDestination;
	}
}

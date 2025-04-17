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

@Entity
public class Tracabilite
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@NonNull
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "appUser_id")
	private AppUser appUser;
	
	private String username;
	
	@NonNull
	private String operation;
	
	@NonNull
	private Long idElement;
	
	@NonNull
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyyMMdd-HHmmSS")
	private Date dateEnregistre;

	/**
	 * 
	 */
	public Tracabilite()
	{
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param appUser
	 * @param operation
	 * @param idElement
	 * @param dateEnregistre
	 */
	public Tracabilite( String operation, Long idElement, Date dateEnregistre)
	{
		super();
		this.operation = operation;
		this.idElement = idElement;
		this.dateEnregistre = dateEnregistre;
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
	 * @return the appUser
	 */
	public AppUser getAppUser()
	{
		return appUser;
	}

	/**
	 * @param appUser the appUser to set
	 */
	public void setAppUser(AppUser appUser)
	{
		this.appUser = appUser;
	}

	/**
	 * @return the operation
	 */
	public String getOperation()
	{
		return operation;
	}

	/**
	 * @param operation the operation to set
	 */
	public void setOperation(String operation)
	{
		this.operation = operation;
	}

	/**
	 * @return the idElement
	 */
	public Long getIdElement()
	{
		return idElement;
	}

	/**
	 * @param idElement the idElement to set
	 */
	public void setIdElement(Long idElement)
	{
		this.idElement = idElement;
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
	 * @return the username
	 */
	public String getUsername()
	{
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username)
	{
		this.username = username;
	}
	
	
	
	// les operations : connecting and disconnecting, delete, save, update, tentative.
	
	
	
}

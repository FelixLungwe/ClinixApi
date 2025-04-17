package bu.clinix.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.UniqueElements;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;


@FieldDefaults(level = AccessLevel.PRIVATE)
@RequiredArgsConstructor
@NoArgsConstructor
//@Data
//@Table(uniqueConstraints = @UniqueConstraint(columnNames = "username"))
@Entity
public class AppUser implements Serializable
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	
	@NonNull
	String email;
	
	@NonNull
	String fullname;
	
	@NonNull
	//@UniqueElements(message = "Cet utilisateur existe déjà")
	String username;
	
	@NonNull
	//@Size(min = 3, message = "Ne doit pas etre inferieur à 3 caractere")
	String password;
	
	@NonNull
	String phone;
	
	@NonNull
	String urlPicture;
	
	@NonNull
	boolean activated;
	
	@NonNull
	boolean connected;
	
//	@ManyToMany(fetch = FetchType.EAGER)
//	@JoinTable(name = "users_roles", joinColumns = @JoinColumn(referencedColumnName = "user_id"), inverseJoinColumns = @JoinColumn(referencedColumnName = "role_id"))
//	List<AppRole> appRoles;
	
	@ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "users_roles", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
    List<AppRole> appRoles;
	
	@OneToMany(mappedBy = "appUser")
	@JsonProperty(access = Access.WRITE_ONLY)
	private List<Tracabilite> tracabilites;
	
//	@OneToMany(mappedBy= "patient")
//	private List<ListeAttente> listeAttentes;

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
	 * @return the email
	 */
	public String getEmail()
	{
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email)
	{
		this.email = email;
	}

	/**
	 * @return the fullname
	 */
	public String getFullname()
	{
		return fullname;
	}

	/**
	 * @param fullname the fullname to set
	 */
	public void setFullname(String fullname)
	{
		this.fullname = fullname;
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

	/**
	 * @return the password
	 */
	public String getPassword()
	{
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password)
	{
		this.password = password;
	}

	/**
	 * @return the phone
	 */
	public String getPhone()
	{
		return phone;
	}

	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone)
	{
		this.phone = phone;
	}

	/**
	 * @return the urlPicture
	 */
	public String getUrlPicture()
	{
		return urlPicture;
	}

	/**
	 * @param urlPicture the urlPicture to set
	 */
	public void setUrlPicture(String urlPicture)
	{
		this.urlPicture = urlPicture;
	}

	/**
	 * @return the appRoles
	 */
	public List<AppRole> getAppRoles()
	{
		return appRoles;
	}

	/**
	 * @param appRoles the appRoles to set
	 */
	public void setAppRoles(List<AppRole> appRoles)
	{
		this.appRoles = appRoles;
	}

	/**
	 * @return the activated
	 */
	public boolean isActivated()
	{
		return activated;
	}

	/**
	 * @param activated the activated to set
	 */
	public void setActivated(boolean activated)
	{
		this.activated = activated;
	}

	/**
	 * @return the connected
	 */
	public boolean isConnected()
	{
		return connected;
	}

	/**
	 * @param connected the connected to set
	 */
	public void setConnected(boolean connected)
	{
		this.connected = connected;
	}

	/**
	 * @return the tracabilites
	 */
	public List<Tracabilite> getTracabilites()
	{
		return tracabilites;
	}

	/**
	 * @param tracabilites the tracabilites to set
	 */
	public void setTracabilites(List<Tracabilite> tracabilites)
	{
		this.tracabilites = tracabilites;
	}
	
	
}

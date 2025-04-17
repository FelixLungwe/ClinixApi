package bu.clinix.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@RequiredArgsConstructor
//@Data
@Entity
public class AppRole implements Serializable
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	
	@NonNull
	//@Size(min = 5, message = "le nom est trop petit")
	String roleName;
	
	@NonNull
	String commentaire;
	
//	@JsonProperty(access = Access.WRITE_ONLY) // pour eviter la boucle de eager
//	@ManyToMany
//	@JoinTable(name = "users_roles", joinColumns = @JoinColumn(referencedColumnName = "role_id"), inverseJoinColumns = @JoinColumn(referencedColumnName = "user_id"))
//	List<AppUser> appUsers;
	
	@JsonProperty(access = Access.WRITE_ONLY)
	@ManyToMany
	@JoinTable(name = "users_roles", joinColumns = @JoinColumn(name = "role_id"), inverseJoinColumns = @JoinColumn(name = "user_id"))
	List<AppUser> appUsers;

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
	 * @return the roleName
	 */
	public String getRoleName()
	{
		return roleName;
	}

	/**
	 * @param roleName the roleName to set
	 */
	public void setRoleName(String roleName)
	{
		this.roleName = roleName;
	}

	/**
	 * @return the commentaire
	 */
	public String getCommentaire()
	{
		return commentaire;
	}

	/**
	 * @param commentaire the commentaire to set
	 */
	public void setCommentaire(String commentaire)
	{
		this.commentaire = commentaire;
	}

	/**
	 * @return the appUsers
	 */
	public List<AppUser> getAppUsers()
	{
		return appUsers;
	}

	/**
	 * @param appUsers the appUsers to set
	 */
	public void setAppUsers(List<AppUser> appUsers)
	{
		this.appUsers = appUsers;
	}

	
	
}

package bu.clinix.entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

@Entity
public class ChefFamille implements Serializable
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long cf_id;
	
	private String cf_relation; // CF = chef de famille
	private String cf_nom;
	private String cf_prenom;
	private String cf_phone;
	private String cf_profession;
	private String cf_employeur;
	private String cf_nationalite;
	
	@OneToOne(mappedBy = "chefFamille", fetch = FetchType.EAGER, cascade = CascadeType.REMOVE)
	@JsonProperty(access = Access.WRITE_ONLY)
	private DossierMedical dossierMedical;

	/**
	 * 
	 */
	public ChefFamille()
	{
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param cf_relation
	 * @param cf_nom
	 * @param cf_prenom
	 * @param cf_phone
	 * @param cf_profession
	 * @param cf_employeur
	 * @param cf_nationalite
	 */
	public ChefFamille(String cf_relation, String cf_nom, String cf_prenom, String cf_phone, String cf_profession,
			String cf_employeur, String cf_nationalite)
	{
		super();
		this.cf_relation = cf_relation;
		this.cf_nom = cf_nom;
		this.cf_prenom = cf_prenom;
		this.cf_phone = cf_phone;
		this.cf_profession = cf_profession;
		this.cf_employeur = cf_employeur;
		this.cf_nationalite = cf_nationalite;
	}

	/**
	 * @return the cf_id
	 */
	public Long getCf_id()
	{
		return cf_id;
	}

	/**
	 * @param cf_id the cf_id to set
	 */
	public void setCf_id(Long cf_id)
	{
		this.cf_id = cf_id;
	}

	/**
	 * @return the cf_relation
	 */
	public String getCf_relation()
	{
		return cf_relation;
	}

	/**
	 * @param cf_relation the cf_relation to set
	 */
	public void setCf_relation(String cf_relation)
	{
		this.cf_relation = cf_relation;
	}

	/**
	 * @return the cf_nom
	 */
	public String getCf_nom()
	{
		return cf_nom;
	}

	/**
	 * @param cf_nom the cf_nom to set
	 */
	public void setCf_nom(String cf_nom)
	{
		this.cf_nom = cf_nom;
	}

	/**
	 * @return the cf_prenom
	 */
	public String getCf_prenom()
	{
		return cf_prenom;
	}

	/**
	 * @param cf_prenom the cf_prenom to set
	 */
	public void setCf_prenom(String cf_prenom)
	{
		this.cf_prenom = cf_prenom;
	}

	/**
	 * @return the cf_phone
	 */
	public String getCf_phone()
	{
		return cf_phone;
	}

	/**
	 * @param cf_phone the cf_phone to set
	 */
	public void setCf_phone(String cf_phone)
	{
		this.cf_phone = cf_phone;
	}

	/**
	 * @return the cf_profession
	 */
	public String getCf_profession()
	{
		return cf_profession;
	}

	/**
	 * @param cf_profession the cf_profession to set
	 */
	public void setCf_profession(String cf_profession)
	{
		this.cf_profession = cf_profession;
	}

	/**
	 * @return the cf_employeur
	 */
	public String getCf_employeur()
	{
		return cf_employeur;
	}

	/**
	 * @param cf_employeur the cf_employeur to set
	 */
	public void setCf_employeur(String cf_employeur)
	{
		this.cf_employeur = cf_employeur;
	}

	/**
	 * @return the cf_nationalite
	 */
	public String getCf_nationalite()
	{
		return cf_nationalite;
	}

	/**
	 * @param cf_nationalite the cf_nationalite to set
	 */
	public void setCf_nationalite(String cf_nationalite)
	{
		this.cf_nationalite = cf_nationalite;
	}

	/**
	 * @return the dossierMedical
	 */
	public DossierMedical getDossierMedical()
	{
		return dossierMedical;
	}

	/**
	 * @param dossierMedical the dossierMedical to set
	 */
	public void setDossierMedical(DossierMedical dossierMedical)
	{
		this.dossierMedical = dossierMedical;
	}
	
	
}


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
public class Biometrie_Antecedents implements Serializable
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long bio_id;
	
	private String bio_GroupeSanguin_Rhésus; // BIO = Biometrie et antecedants
	private String bio_Statutvaccinal_VaccinsRecus;
	private int bio_Taille;
	private String bio_Poids;
	private String bio_IndiceMasseCorporelle;
	private String bio_Allergies;
	private String bio_MaladiesChroniques;
	private String bio_InterventionsChirurgicalesMajSubies;
	
	@OneToOne(mappedBy = "biometrie_Antecedents", fetch = FetchType.EAGER)
	@JsonProperty(access = Access.WRITE_ONLY)
	private DossierMedical dossierMedical;

	/**
	 * @param bio_GroupeSanguin_Rhésus
	 * @param bio_Statutvaccinal_VaccinsRecus
	 * @param bio_Taille
	 * @param bio_Poids
	 * @param bio_IndiceMasseCorporelle
	 * @param bio_Allergies
	 * @param bio_MaladiesChroniques
	 * @param bio_InterventionsChirurgicalesMajSubies
	 */
	public Biometrie_Antecedents(String bio_GroupeSanguin_Rhésus, String bio_Statutvaccinal_VaccinsRecus,
			int bio_Taille, String bio_Poids, String bio_IndiceMasseCorporelle, String bio_Allergies,
			String bio_MaladiesChroniques, String bio_InterventionsChirurgicalesMajSubies)
	{
		super();
		this.bio_GroupeSanguin_Rhésus = bio_GroupeSanguin_Rhésus;
		this.bio_Statutvaccinal_VaccinsRecus = bio_Statutvaccinal_VaccinsRecus;
		this.bio_Taille = bio_Taille;
		this.bio_Poids = bio_Poids;
		this.bio_IndiceMasseCorporelle = bio_IndiceMasseCorporelle;
		this.bio_Allergies = bio_Allergies;
		this.bio_MaladiesChroniques = bio_MaladiesChroniques;
		this.bio_InterventionsChirurgicalesMajSubies = bio_InterventionsChirurgicalesMajSubies;
	}

	/**
	 * 
	 */
	public Biometrie_Antecedents()
	{
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the bio_id
	 */
	public Long getBio_id()
	{
		return bio_id;
	}

	/**
	 * @param bio_id the bio_id to set
	 */
	public void setBio_id(Long bio_id)
	{
		this.bio_id = bio_id;
	}

	/**
	 * @return the bio_GroupeSanguin_Rhésus
	 */
	public String getBio_GroupeSanguin_Rhésus()
	{
		return bio_GroupeSanguin_Rhésus;
	}

	/**
	 * @param bio_GroupeSanguin_Rhésus the bio_GroupeSanguin_Rhésus to set
	 */
	public void setBio_GroupeSanguin_Rhésus(String bio_GroupeSanguin_Rhésus)
	{
		this.bio_GroupeSanguin_Rhésus = bio_GroupeSanguin_Rhésus;
	}

	/**
	 * @return the bio_Statutvaccinal_VaccinsRecus
	 */
	public String getBio_Statutvaccinal_VaccinsRecus()
	{
		return bio_Statutvaccinal_VaccinsRecus;
	}

	/**
	 * @param bio_Statutvaccinal_VaccinsRecus the bio_Statutvaccinal_VaccinsRecus to set
	 */
	public void setBio_Statutvaccinal_VaccinsRecus(String bio_Statutvaccinal_VaccinsRecus)
	{
		this.bio_Statutvaccinal_VaccinsRecus = bio_Statutvaccinal_VaccinsRecus;
	}

	/**
	 * @return the bio_Taille
	 */
	public int getBio_Taille()
	{
		return bio_Taille;
	}

	/**
	 * @param bio_Taille the bio_Taille to set
	 */
	public void setBio_Taille(int bio_Taille)
	{
		this.bio_Taille = bio_Taille;
	}

	/**
	 * @return the bio_Poids
	 */
	public String getBio_Poids()
	{
		return bio_Poids;
	}

	/**
	 * @param bio_Poids the bio_Poids to set
	 */
	public void setBio_Poids(String bio_Poids)
	{
		this.bio_Poids = bio_Poids;
	}

	/**
	 * @return the bio_IndiceMasseCorporelle
	 */
	public String getBio_IndiceMasseCorporelle()
	{
		return bio_IndiceMasseCorporelle;
	}

	/**
	 * @param bio_IndiceMasseCorporelle the bio_IndiceMasseCorporelle to set
	 */
	public void setBio_IndiceMasseCorporelle(String bio_IndiceMasseCorporelle)
	{
		this.bio_IndiceMasseCorporelle = bio_IndiceMasseCorporelle;
	}

	/**
	 * @return the bio_Allergies
	 */
	public String getBio_Allergies()
	{
		return bio_Allergies;
	}

	/**
	 * @param bio_Allergies the bio_Allergies to set
	 */
	public void setBio_Allergies(String bio_Allergies)
	{
		this.bio_Allergies = bio_Allergies;
	}

	/**
	 * @return the bio_MaladiesChroniques
	 */
	public String getBio_MaladiesChroniques()
	{
		return bio_MaladiesChroniques;
	}

	/**
	 * @param bio_MaladiesChroniques the bio_MaladiesChroniques to set
	 */
	public void setBio_MaladiesChroniques(String bio_MaladiesChroniques)
	{
		this.bio_MaladiesChroniques = bio_MaladiesChroniques;
	}

	/**
	 * @return the bio_InterventionsChirurgicalesMajSubies
	 */
	public String getBio_InterventionsChirurgicalesMajSubies()
	{
		return bio_InterventionsChirurgicalesMajSubies;
	}

	/**
	 * @param bio_InterventionsChirurgicalesMajSubies the bio_InterventionsChirurgicalesMajSubies to set
	 */
	public void setBio_InterventionsChirurgicalesMajSubies(String bio_InterventionsChirurgicalesMajSubies)
	{
		this.bio_InterventionsChirurgicalesMajSubies = bio_InterventionsChirurgicalesMajSubies;
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

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
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

@Entity
public class DossierMedical implements Serializable
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long numDossierMed;
	
	private String niveauScolaire;
	private String nationalite;
	private String numCNI;
	private String numMatricule;
	private String numCarteMutuelle;
	private String profession;
	private String etatCivil;
	private String adressePostale;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yy")
	private Date dateOuverture;
	
	@OneToOne
	@JoinColumn(name = "patient_id", unique = true)
	private Patient patient;
	
	@OneToOne
	@JoinColumn(name = "cf_id", unique = true)
	private ChefFamille chefFamille;
	
	@OneToMany(mappedBy = "dossierMedical")
	@JsonProperty(access = Access.WRITE_ONLY)
	private List<Synthese_sortie> synthese_sortie;
	
	@OneToOne
	@JoinColumn(name = "bio_id", unique = true)
	private Biometrie_Antecedents  biometrie_Antecedents;

	/**
	 * @param niveauScolaire
	 * @param nationalite
	 * @param numCNI
	 * @param numMatricule
	 * @param numCarteMutuelle
	 * @param profession
	 * @param etatCivil
	 * @param adressePostale
	 */
	public DossierMedical(String niveauScolaire, String nationalite, String numCNI, String numMatricule,
			String numCarteMutuelle, String profession, String etatCivil, String adressePostale)
	{
		super();
		this.niveauScolaire = niveauScolaire;
		this.nationalite = nationalite;
		this.numCNI = numCNI;
		this.numMatricule = numMatricule;
		this.numCarteMutuelle = numCarteMutuelle;
		this.profession = profession;
		this.etatCivil = etatCivil;
		this.adressePostale = adressePostale;
	}

	/**
	 * 
	 */
	public DossierMedical()
	{
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the numDossierMed
	 */
	public Long getNumDossierMed()
	{
		return numDossierMed;
	}

	/**
	 * @param numDossierMed the numDossierMed to set
	 */
	public void setNumDossierMed(Long numDossierMed)
	{
		this.numDossierMed = numDossierMed;
	}

	/**
	 * @return the niveauScolaire
	 */
	public String getNiveauScolaire()
	{
		return niveauScolaire;
	}

	/**
	 * @param niveauScolaire the niveauScolaire to set
	 */
	public void setNiveauScolaire(String niveauScolaire)
	{
		this.niveauScolaire = niveauScolaire;
	}

	/**
	 * @return the nationalite
	 */
	public String getNationalite()
	{
		return nationalite;
	}

	/**
	 * @param nationalite the nationalite to set
	 */
	public void setNationalite(String nationalite)
	{
		this.nationalite = nationalite;
	}

	/**
	 * @return the numCNI
	 */
	public String getNumCNI()
	{
		return numCNI;
	}

	/**
	 * @param numCNI the numCNI to set
	 */
	public void setNumCNI(String numCNI)
	{
		this.numCNI = numCNI;
	}

	/**
	 * @return the numMatricule
	 */
	public String getNumMatricule()
	{
		return numMatricule;
	}

	/**
	 * @param numMatricule the numMatricule to set
	 */
	public void setNumMatricule(String numMatricule)
	{
		this.numMatricule = numMatricule;
	}

	/**
	 * @return the numCarteMutuelle
	 */
	public String getNumCarteMutuelle()
	{
		return numCarteMutuelle;
	}

	/**
	 * @param numCarteMutuelle the numCarteMutuelle to set
	 */
	public void setNumCarteMutuelle(String numCarteMutuelle)
	{
		this.numCarteMutuelle = numCarteMutuelle;
	}

	/**
	 * @return the profession
	 */
	public String getProfession()
	{
		return profession;
	}

	/**
	 * @param profession the profession to set
	 */
	public void setProfession(String profession)
	{
		this.profession = profession;
	}

	/**
	 * @return the etatCivil
	 */
	public String getEtatCivil()
	{
		return etatCivil;
	}

	/**
	 * @param etatCivil the etatCivil to set
	 */
	public void setEtatCivil(String etatCivil)
	{
		this.etatCivil = etatCivil;
	}

	/**
	 * @return the adressePostale
	 */
	public String getAdressePostale()
	{
		return adressePostale;
	}

	/**
	 * @param adressePostale the adressePostale to set
	 */
	public void setAdressePostale(String adressePostale)
	{
		this.adressePostale = adressePostale;
	}

	/**
	 * @return the dateOuverture
	 */
	public Date getDateOuverture()
	{
		return dateOuverture;
	}

	/**
	 * @param dateOuverture the dateOuverture to set
	 */
	public void setDateOuverture(Date dateOuverture)
	{
		this.dateOuverture = dateOuverture;
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
	 * @return the chefFamille
	 */
	public ChefFamille getChefFamille()
	{
		return chefFamille;
	}

	/**
	 * @param chefFamille the chefFamille to set
	 */
	public void setChefFamille(ChefFamille chefFamille)
	{
		this.chefFamille = chefFamille;
	}

	/**
	 * @return the synthese_sortie
	 */
	public List<Synthese_sortie> getSynthese_sortie()
	{
		return synthese_sortie;
	}

	/**
	 * @param synthese_sortie the synthese_sortie to set
	 */
	public void setSynthese_sortie(List<Synthese_sortie> synthese_sortie)
	{
		this.synthese_sortie = synthese_sortie;
	}

	/**
	 * @return the biometrie_Antecedents
	 */
	public Biometrie_Antecedents getBiometrie_Antecedents()
	{
		return biometrie_Antecedents;
	}

	/**
	 * @param biometrie_Antecedents the biometrie_Antecedents to set
	 */
	public void setBiometrie_Antecedents(Biometrie_Antecedents biometrie_Antecedents)
	{
		this.biometrie_Antecedents = biometrie_Antecedents;
	}  
	
	
	

}

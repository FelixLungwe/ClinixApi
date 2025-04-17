package bu.clinix.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Urgence implements Serializable
{
	@ManyToOne
	@JoinColumn(name = "patient_id")
	@JsonIgnore
	private Patient patient;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long urgence_id;
	
	private String chefFamille;
	private String groupeAge;
	private String origine;
	private String nouveauCas;
	private String ancienCas;
	private String modeArrivee;
	private String typePatient;
	private String femmePostpartum;
	private String femmeEnceinte;
	private int ageGrossesse;
	private String signeCliniques;
	private String examenComplementaire;
	private String resultatExamen;
	private String codeDiagnostic;
	private String libelleDiagnostic;
	private int qtteProduitPrescrits;
	private String modeSortie;
	private boolean deces;
	private boolean deceMaternel;
	private String modePayement;
	
	
	
	
	/**
	 * @param chefFamille
	 * @param groupeAge
	 * @param origine
	 * @param nouveauCas
	 * @param ancienCas
	 * @param modeArrivee
	 * @param typePatient
	 * @param femmePostpartum
	 * @param femmeEnceinte
	 * @param ageGrossesse
	 * @param signeCliniques
	 * @param examenComplementaire
	 * @param resultatExamen
	 * @param codeDiagnostic
	 * @param libelleDiagnostic
	 * @param qtteProduitPrescrits
	 * @param modeSortie
	 * @param deces
	 * @param deceMaternel
	 * @param modePayement
	 */
	public Urgence(String chefFamille, String groupeAge, String origine, String nouveauCas, String ancienCas,
			String modeArrivee, String typePatient, String femmePostpartum, String femmeEnceinte, int ageGrossesse,
			String signeCliniques, String examenComplementaire, String resultatExamen, String codeDiagnostic,
			String libelleDiagnostic, int qtteProduitPrescrits, String modeSortie, boolean deces, boolean deceMaternel,
			String modePayement)
	{
		super();
		this.chefFamille = chefFamille;
		this.groupeAge = groupeAge;
		this.origine = origine;
		this.nouveauCas = nouveauCas;
		this.ancienCas = ancienCas;
		this.modeArrivee = modeArrivee;
		this.typePatient = typePatient;
		this.femmePostpartum = femmePostpartum;
		this.femmeEnceinte = femmeEnceinte;
		this.ageGrossesse = ageGrossesse;
		this.signeCliniques = signeCliniques;
		this.examenComplementaire = examenComplementaire;
		this.resultatExamen = resultatExamen;
		this.codeDiagnostic = codeDiagnostic;
		this.libelleDiagnostic = libelleDiagnostic;
		this.qtteProduitPrescrits = qtteProduitPrescrits;
		this.modeSortie = modeSortie;
		this.deces = deces;
		this.deceMaternel = deceMaternel;
		this.modePayement = modePayement;
	}
	/**
	 * 
	 */
	public Urgence()
	{
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the urgence_id
	 */
	public Long getUrgence_id()
	{
		return urgence_id;
	}
	/**
	 * @param urgence_id the urgence_id to set
	 */
	public void setUrgence_id(Long urgence_id)
	{
		this.urgence_id = urgence_id;
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
	 * @return the nouveauCas
	 */
	public String getNouveauCas()
	{
		return nouveauCas;
	}
	/**
	 * @param nouveauCas the nouveauCas to set
	 */
	public void setNouveauCas(String nouveauCas)
	{
		this.nouveauCas = nouveauCas;
	}
	/**
	 * @return the ancienCas
	 */
	public String getAncienCas()
	{
		return ancienCas;
	}
	/**
	 * @param ancienCas the ancienCas to set
	 */
	public void setAncienCas(String ancienCas)
	{
		this.ancienCas = ancienCas;
	}
	/**
	 * @return the modeArrivee
	 */
	public String getModeArrivee()
	{
		return modeArrivee;
	}
	/**
	 * @param modeArrivee the modeArrivee to set
	 */
	public void setModeArrivee(String modeArrivee)
	{
		this.modeArrivee = modeArrivee;
	}
	/**
	 * @return the typePatient
	 */
	public String getTypePatient()
	{
		return typePatient;
	}
	/**
	 * @param typePatient the typePatient to set
	 */
	public void setTypePatient(String typePatient)
	{
		this.typePatient = typePatient;
	}
	/**
	 * @return the femmePostpartum
	 */
	public String getFemmePostpartum()
	{
		return femmePostpartum;
	}
	/**
	 * @param femmePostpartum the femmePostpartum to set
	 */
	public void setFemmePostpartum(String femmePostpartum)
	{
		this.femmePostpartum = femmePostpartum;
	}
	/**
	 * @return the femmeEnceinte
	 */
	public String getFemmeEnceinte()
	{
		return femmeEnceinte;
	}
	/**
	 * @param femmeEnceinte the femmeEnceinte to set
	 */
	public void setFemmeEnceinte(String femmeEnceinte)
	{
		this.femmeEnceinte = femmeEnceinte;
	}
	/**
	 * @return the ageGrossesse
	 */
	public int getAgeGrossesse()
	{
		return ageGrossesse;
	}
	/**
	 * @param ageGrossesse the ageGrossesse to set
	 */
	public void setAgeGrossesse(int ageGrossesse)
	{
		this.ageGrossesse = ageGrossesse;
	}
	/**
	 * @return the signeCliniques
	 */
	public String getSigneCliniques()
	{
		return signeCliniques;
	}
	/**
	 * @param signeCliniques the signeCliniques to set
	 */
	public void setSigneCliniques(String signeCliniques)
	{
		this.signeCliniques = signeCliniques;
	}
	/**
	 * @return the examenComplementaire
	 */
	public String getExamenComplementaire()
	{
		return examenComplementaire;
	}
	/**
	 * @param examenComplementaire the examenComplementaire to set
	 */
	public void setExamenComplementaire(String examenComplementaire)
	{
		this.examenComplementaire = examenComplementaire;
	}
	/**
	 * @return the resultatExamen
	 */
	public String getResultatExamen()
	{
		return resultatExamen;
	}
	/**
	 * @param resultatExamen the resultatExamen to set
	 */
	public void setResultatExamen(String resultatExamen)
	{
		this.resultatExamen = resultatExamen;
	}
	/**
	 * @return the codeDiagnostic
	 */
	public String getCodeDiagnostic()
	{
		return codeDiagnostic;
	}
	/**
	 * @param codeDiagnostic the codeDiagnostic to set
	 */
	public void setCodeDiagnostic(String codeDiagnostic)
	{
		this.codeDiagnostic = codeDiagnostic;
	}
	/**
	 * @return the libelleDiagnostic
	 */
	public String getLibelleDiagnostic()
	{
		return libelleDiagnostic;
	}
	/**
	 * @param libelleDiagnostic the libelleDiagnostic to set
	 */
	public void setLibelleDiagnostic(String libelleDiagnostic)
	{
		this.libelleDiagnostic = libelleDiagnostic;
	}
	/**
	 * @return the qtteProduitPrescrits
	 */
	public int getQtteProduitPrescrits()
	{
		return qtteProduitPrescrits;
	}
	/**
	 * @param qtteProduitPrescrits the qtteProduitPrescrits to set
	 */
	public void setQtteProduitPrescrits(int qtteProduitPrescrits)
	{
		this.qtteProduitPrescrits = qtteProduitPrescrits;
	}
	/**
	 * @return the modeSortie
	 */
	public String getModeSortie()
	{
		return modeSortie;
	}
	/**
	 * @param modeSortie the modeSortie to set
	 */
	public void setModeSortie(String modeSortie)
	{
		this.modeSortie = modeSortie;
	}
	/**
	 * @return the deces
	 */
	public boolean getDeces()
	{
		return deces;
	}
	/**
	 * @param deces the deces to set
	 */
	public void setDeces(boolean deces)
	{
		this.deces = deces;
	}
	/**
	 * @return the deceMaternel
	 */
	public boolean isDeceMaternel()
	{
		return deceMaternel;
	}
	/**
	 * @param deceMaternel the deceMaternel to set
	 */
	public void setDeceMaternel(boolean deceMaternel)
	{
		this.deceMaternel = deceMaternel;
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

package bu.clinix.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class ConsultationExterne implements Serializable
{
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "patient_id")
	@JsonIgnore
	private Patient patient;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long consultationExterne_id;
	
	private String chefFamille;
	private String groupeAge;
	private String origine;
	private String nouveauCas;
	private String originePatient; // a verifier 
	private String ancienCas;
	private String modeEntree;
	private String femmePostpartum;
	private String femmeEnceinteCodeOrigine;
	private int ageGrossesse;
	private String signeClinique;
	private String codeExamenComplementaire;
	private String libelleExamenComplementaire;
	private String resultatExamenComplementaire;
	private String codeDiagnostic;
	private String libelleDiagnostic;
	private String traitementPrescrit;
	private String modeSortie;
	private String modePayement;
	
	
	
	/**
	 * @param chefFamille
	 * @param groupeAge
	 * @param origine
	 * @param nouveauCas
	 * @param originePatient
	 * @param ancienCas
	 * @param modeEntree
	 * @param femmePostpartum
	 * @param femmeEnceinteCodeOrigine
	 * @param ageGrossesse
	 * @param signeClinique
	 * @param codeExamenComplementaire
	 * @param libelleExamenComplementaire
	 * @param resultatExamenComplementaire
	 * @param codeDiagnostic
	 * @param libelleDiagnostic
	 * @param traitementPrescrit
	 * @param modeSortie
	 * @param modePayement
	 */
	public ConsultationExterne(String chefFamille, String groupeAge, String origine, String nouveauCas,
			String originePatient, String ancienCas, String modeEntree, String femmePostpartum,
			String femmeEnceinteCodeOrigine, int ageGrossesse, String signeClinique, String codeExamenComplementaire,
			String libelleExamenComplementaire, String resultatExamenComplementaire, String codeDiagnostic,
			String libelleDiagnostic, String traitementPrescrit, String modeSortie, String modePayement)
	{
		super();
		this.chefFamille = chefFamille;
		this.groupeAge = groupeAge;
		this.origine = origine;
		this.nouveauCas = nouveauCas;
		this.originePatient = originePatient;
		this.ancienCas = ancienCas;
		this.modeEntree = modeEntree;
		this.femmePostpartum = femmePostpartum;
		this.femmeEnceinteCodeOrigine = femmeEnceinteCodeOrigine;
		this.ageGrossesse = ageGrossesse;
		this.signeClinique = signeClinique;
		this.codeExamenComplementaire = codeExamenComplementaire;
		this.libelleExamenComplementaire = libelleExamenComplementaire;
		this.resultatExamenComplementaire = resultatExamenComplementaire;
		this.codeDiagnostic = codeDiagnostic;
		this.libelleDiagnostic = libelleDiagnostic;
		this.traitementPrescrit = traitementPrescrit;
		this.modeSortie = modeSortie;
		this.modePayement = modePayement;
	}
	/**
	 * 
	 */
	public ConsultationExterne()
	{
		super();
		// TODO Auto-generated constructor stub
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
	 * @return the consultationExterne
	 */
	public Long getConsultationExterne_id()
	{
		return consultationExterne_id;
	}
	/**
	 * @param consultationExterne the consultationExterne to set
	 */
	public void setConsultationExterne_id(Long consultationExterne_id)
	{
		this.consultationExterne_id = consultationExterne_id;
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
	 * @return the originePatient
	 */
	public String getOriginePatient()
	{
		return originePatient;
	}
	/**
	 * @param originePatient the originePatient to set
	 */
	public void setOriginePatient(String originePatient)
	{
		this.originePatient = originePatient;
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
	 * @return the modeEntree
	 */
	public String getModeEntree()
	{
		return modeEntree;
	}
	/**
	 * @param modeEntree the modeEntree to set
	 */
	public void setModeEntree(String modeEntree)
	{
		this.modeEntree = modeEntree;
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
	 * @return the femmeEnceinteCodeOrigine
	 */
	public String getFemmeEnceinteCodeOrigine()
	{
		return femmeEnceinteCodeOrigine;
	}
	/**
	 * @param femmeEnceinteCodeOrigine the femmeEnceinteCodeOrigine to set
	 */
	public void setFemmeEnceinteCodeOrigine(String femmeEnceinteCodeOrigine)
	{
		this.femmeEnceinteCodeOrigine = femmeEnceinteCodeOrigine;
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
	 * @return the signeClinique
	 */
	public String getSigneClinique()
	{
		return signeClinique;
	}
	/**
	 * @param signeClinique the signeClinique to set
	 */
	public void setSigneClinique(String signeClinique)
	{
		this.signeClinique = signeClinique;
	}
	/**
	 * @return the codeExamenComplementaire
	 */
	public String getCodeExamenComplementaire()
	{
		return codeExamenComplementaire;
	}
	/**
	 * @param codeExamenComplementaire the codeExamenComplementaire to set
	 */
	public void setCodeExamenComplementaire(String codeExamenComplementaire)
	{
		this.codeExamenComplementaire = codeExamenComplementaire;
	}
	/**
	 * @return the libelleExamenComplementaire
	 */
	public String getLibelleExamenComplementaire()
	{
		return libelleExamenComplementaire;
	}
	/**
	 * @param libelleExamenComplementaire the libelleExamenComplementaire to set
	 */
	public void setLibelleExamenComplementaire(String libelleExamenComplementaire)
	{
		this.libelleExamenComplementaire = libelleExamenComplementaire;
	}
	/**
	 * @return the resultatExamenComplementaire
	 */
	public String getResultatExamenComplementaire()
	{
		return resultatExamenComplementaire;
	}
	/**
	 * @param resultatExamenComplementaire the resultatExamenComplementaire to set
	 */
	public void setResultatExamenComplementaire(String resultatExamenComplementaire)
	{
		this.resultatExamenComplementaire = resultatExamenComplementaire;
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
	 * @return the traitementPrescrit
	 */
	public String getTraitementPrescrit()
	{
		return traitementPrescrit;
	}
	/**
	 * @param traitementPrescrit the traitementPrescrit to set
	 */
	public void setTraitementPrescrit(String traitementPrescrit)
	{
		this.traitementPrescrit = traitementPrescrit;
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

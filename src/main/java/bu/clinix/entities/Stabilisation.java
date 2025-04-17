package bu.clinix.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.NonNull;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Stabilisation implements Serializable
{
	@ManyToOne
	@JoinColumn(name = "patient_id")
	@JsonIgnore
	private Patient patient;
	

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long stabilisation_id;
	private int pbPatient;
	private int taillePatient;
	private int poidPatient;
	private String typeAdmission;
	private String critereAdmission;
	private String malnutrLieeVih;
	private String kitDistribue;
	
	private String chefFamille;
	private String groupeAge;
	private String origine;
	@DateTimeFormat(pattern = "dd-MM-yy")
	@Temporal(TemporalType.DATE)
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yy")
	private Date dateSortie;
	private int dureeSejour;
	private int poidSortie;
	private int tailleSortie;
	private String rapportTp;
	private String degreOedeme;
	private String etatPatient;
	private String patientRefere;
	private String diagnosticFinal;
	
	
	
	/**
	 * @param pbPatient
	 * @param taillePatient
	 * @param poidPatient
	 * @param typeAdmission
	 * @param critereAdmission
	 * @param malnutrLieeVih
	 * @param kitDistribue
	 * @param chefFamille
	 * @param groupeAge
	 * @param origine
	 * @param dateSortie
	 * @param dureeSejour
	 * @param poidSortie
	 * @param tailleSortie
	 * @param rapportTp
	 * @param degreOedeme
	 * @param etatPatient
	 * @param patientRefere
	 * @param diagnosticFinal
	 */
	public Stabilisation(int pbPatient, int taillePatient, int poidPatient, String typeAdmission,
			String critereAdmission, String malnutrLieeVih, String kitDistribue, String chefFamille, String groupeAge,
			String origine, Date dateSortie, int dureeSejour, int poidSortie, int tailleSortie, String rapportTp,
			String degreOedeme, String etatPatient, String patientRefere, String diagnosticFinal)
	{
		super();
		this.pbPatient = pbPatient;
		this.taillePatient = taillePatient;
		this.poidPatient = poidPatient;
		this.typeAdmission = typeAdmission;
		this.critereAdmission = critereAdmission;
		this.malnutrLieeVih = malnutrLieeVih;
		this.kitDistribue = kitDistribue;
		this.chefFamille = chefFamille;
		this.groupeAge = groupeAge;
		this.origine = origine;
		this.dateSortie = dateSortie;
		this.dureeSejour = dureeSejour;
		this.poidSortie = poidSortie;
		this.tailleSortie = tailleSortie;
		this.rapportTp = rapportTp;
		this.degreOedeme = degreOedeme;
		this.etatPatient = etatPatient;
		this.patientRefere = patientRefere;
		this.diagnosticFinal = diagnosticFinal;
	}
	/**
	 * 
	 */
	public Stabilisation()
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
	 * @return the stabilisation_id
	 */
	public Long getStabilisation_id()
	{
		return stabilisation_id;
	}
	/**
	 * @param stabilisation_id the stabilisation_id to set
	 */
	public void setStabilisation_id(Long stabilisation_id)
	{
		this.stabilisation_id = stabilisation_id;
	}
	/**
	 * @return the pbPatient
	 */
	public int getPbPatient()
	{
		return pbPatient;
	}
	/**
	 * @param pbPatient the pbPatient to set
	 */
	public void setPbPatient(int pbPatient)
	{
		this.pbPatient = pbPatient;
	}
	/**
	 * @return the taillePatient
	 */
	public int getTaillePatient()
	{
		return taillePatient;
	}
	/**
	 * @param taillePatient the taillePatient to set
	 */
	public void setTaillePatient(int taillePatient)
	{
		this.taillePatient = taillePatient;
	}
	/**
	 * @return the poidPatient
	 */
	public int getPoidPatient()
	{
		return poidPatient;
	}
	/**
	 * @param poidPatient the poidPatient to set
	 */
	public void setPoidPatient(int poidPatient)
	{
		this.poidPatient = poidPatient;
	}
	/**
	 * @return the typeAdmission
	 */
	public String getTypeAdmission()
	{
		return typeAdmission;
	}
	/**
	 * @param typeAdmission the typeAdmission to set
	 */
	public void setTypeAdmission(String typeAdmission)
	{
		this.typeAdmission = typeAdmission;
	}
	/**
	 * @return the critereAdmission
	 */
	public String getCritereAdmission()
	{
		return critereAdmission;
	}
	/**
	 * @param critereAdmission the critereAdmission to set
	 */
	public void setCritereAdmission(String critereAdmission)
	{
		this.critereAdmission = critereAdmission;
	}
	/**
	 * @return the malnutrLieeVih
	 */
	public String getMalnutrLieeVih()
	{
		return malnutrLieeVih;
	}
	/**
	 * @param malnutrLieeVih the malnutrLieeVih to set
	 */
	public void setMalnutrLieeVih(String malnutrLieeVih)
	{
		this.malnutrLieeVih = malnutrLieeVih;
	}
	/**
	 * @return the kitDistribue
	 */
	public String getKitDistribue()
	{
		return kitDistribue;
	}
	/**
	 * @param kitDistribue the kitDistribue to set
	 */
	public void setKitDistribue(String kitDistribue)
	{
		this.kitDistribue = kitDistribue;
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
	public int getDureeSejour()
	{
		return dureeSejour;
	}
	/**
	 * @param dureeSejour the dureeSejour to set
	 */
	public void setDureeSejour(int dureeSejour)
	{
		this.dureeSejour = dureeSejour;
	}
	/**
	 * @return the poidSortie
	 */
	public int getPoidSortie()
	{
		return poidSortie;
	}
	/**
	 * @param poidSortie the poidSortie to set
	 */
	public void setPoidSortie(int poidSortie)
	{
		this.poidSortie = poidSortie;
	}
	/**
	 * @return the tailleSortie
	 */
	public int getTailleSortie()
	{
		return tailleSortie;
	}
	/**
	 * @param tailleSortie the tailleSortie to set
	 */
	public void setTailleSortie(int tailleSortie)
	{
		this.tailleSortie = tailleSortie;
	}
	/**
	 * @return the rapportTp
	 */
	public String getRapportTp()
	{
		return rapportTp;
	}
	/**
	 * @param rapportTp the rapportTp to set
	 */
	public void setRapportTp(String rapportTp)
	{
		this.rapportTp = rapportTp;
	}
	/**
	 * @return the degreOedeme
	 */
	public String getDegreOedeme()
	{
		return degreOedeme;
	}
	/**
	 * @param degreOedeme the degreOedeme to set
	 */
	public void setDegreOedeme(String degreOedeme)
	{
		this.degreOedeme = degreOedeme;
	}
	/**
	 * @return the etatPatient
	 */
	public String getEtatPatient()
	{
		return etatPatient;
	}
	/**
	 * @param etatPatient the etatPatient to set
	 */
	public void setEtatPatient(String etatPatient)
	{
		this.etatPatient = etatPatient;
	}
	/**
	 * @return the patientRefere
	 */
	public String getPatientRefere()
	{
		return patientRefere;
	}
	/**
	 * @param patientRefere the patientRefere to set
	 */
	public void setPatientRefere(String patientRefere)
	{
		this.patientRefere = patientRefere;
	}
	/**
	 * @return the diagnosticFinal
	 */
	public String getDiagnosticFinal()
	{
		return diagnosticFinal;
	}
	/**
	 * @param diagnosticFinal the diagnosticFinal to set
	 */
	public void setDiagnosticFinal(String diagnosticFinal)
	{
		this.diagnosticFinal = diagnosticFinal;
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

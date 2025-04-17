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
public class Sortie implements Serializable
{
	@ManyToOne
	@JoinColumn(name = "patient_id")
	@JsonIgnore
	private Patient patient;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long sortie_id;
	
	private String chefFamille;
	private String groupeAge;
	private String origine;
	@DateTimeFormat(pattern = "dd-MM-yy")
	@Temporal(TemporalType.DATE)
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yy")
	private Date dateEntree;
	
	@NonNull
	@DateTimeFormat(pattern = "dd-MM-yy")
	@Temporal(TemporalType.DATE)
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yy")
	private Date dateSortie;
	private String mode;
	
	@NonNull
	@DateTimeFormat(pattern = "dd-MM-yy")
	@Temporal(TemporalType.DATE)
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yy")
	private Date auditDecesMaternel;
	private String modeSortiePourAutorise;
	private boolean femmeEnceinte;
	private String diagnosticPrincipalCode;
	private String diagnosticPrincipalLibelle;
	private String contexte;
	private int nbrExamenLabo;
	private int nbrExamenImagerie;
	private String modePayement;
	private int dureeHosp;
	private boolean infoPostActes;
	
	
	
	/**
	 * @param chefFamille
	 * @param groupeAge
	 * @param origine
	 * @param dateEntree
	 * @param dateSortie
	 * @param mode
	 * @param auditDecesMaternel
	 * @param modeSortiePourAutorise
	 * @param femmeEnceinte
	 * @param diagnosticPrincipalCode
	 * @param diagnosticPrincipalLibelle
	 * @param contexte
	 * @param nbrExamenLabo
	 * @param nbrExamenImagerie
	 * @param modePayement
	 * @param dureeHosp
	 * @param infoPostActes
	 */
	public Sortie(String chefFamille, String groupeAge, String origine, Date dateEntree, Date dateSortie, String mode,
			Date auditDecesMaternel, String modeSortiePourAutorise, boolean femmeEnceinte,
			String diagnosticPrincipalCode, String diagnosticPrincipalLibelle, String contexte, int nbrExamenLabo,
			int nbrExamenImagerie, String modePayement, int dureeHosp, boolean infoPostActes)
	{
		super();
		this.chefFamille = chefFamille;
		this.groupeAge = groupeAge;
		this.origine = origine;
		this.dateEntree = dateEntree;
		this.dateSortie = dateSortie;
		this.mode = mode;
		this.auditDecesMaternel = auditDecesMaternel;
		this.modeSortiePourAutorise = modeSortiePourAutorise;
		this.femmeEnceinte = femmeEnceinte;
		this.diagnosticPrincipalCode = diagnosticPrincipalCode;
		this.diagnosticPrincipalLibelle = diagnosticPrincipalLibelle;
		this.contexte = contexte;
		this.nbrExamenLabo = nbrExamenLabo;
		this.nbrExamenImagerie = nbrExamenImagerie;
		this.modePayement = modePayement;
		this.dureeHosp = dureeHosp;
		this.infoPostActes = infoPostActes;
	}
	/**
	 * 
	 */
	public Sortie()
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
	 * @return the sortie_id
	 */
	public Long getSortie_id()
	{
		return sortie_id;
	}
	/**
	 * @param sortie_id the sortie_id to set
	 */
	public void setSortie_id(Long sortie_id)
	{
		this.sortie_id = sortie_id;
	}
	/**
	 * @return the dateEntree
	 */
	public Date getDateEntree()
	{
		return dateEntree;
	}
	/**
	 * @param dateEntree the dateEntree to set
	 */
	public void setDateEntree(Date dateEntree)
	{
		this.dateEntree = dateEntree;
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
	 * @return the mode
	 */
	public String getMode()
	{
		return mode;
	}
	/**
	 * @param mode the mode to set
	 */
	public void setMode(String mode)
	{
		this.mode = mode;
	}
	/**
	 * @return the auditDecesMaternel
	 */
	public Date getAuditDecesMaternel()
	{
		return auditDecesMaternel;
	}
	/**
	 * @param auditDecesMaternel the auditDecesMaternel to set
	 */
	public void setAuditDecesMaternel(Date auditDecesMaternel)
	{
		this.auditDecesMaternel = auditDecesMaternel;
	}
	/**
	 * @return the modeSortiePourAutorise
	 */
	public String getModeSortiePourAutorise()
	{
		return modeSortiePourAutorise;
	}
	/**
	 * @param modeSortiePourAutorise the modeSortiePourAutorise to set
	 */
	public void setModeSortiePourAutorise(String modeSortiePourAutorise)
	{
		this.modeSortiePourAutorise = modeSortiePourAutorise;
	}
	/**
	 * @return the femmeEnceinte
	 */
	public boolean isFemmeEnceinte()
	{
		return femmeEnceinte;
	}
	/**
	 * @param femmeEnceinte the femmeEnceinte to set
	 */
	public void setFemmeEnceinte(boolean femmeEnceinte)
	{
		this.femmeEnceinte = femmeEnceinte;
	}
	/**
	 * @return the diagnosticPrincipalCode
	 */
	public String getDiagnosticPrincipalCode()
	{
		return diagnosticPrincipalCode;
	}
	/**
	 * @param diagnosticPrincipalCode the diagnosticPrincipalCode to set
	 */
	public void setDiagnosticPrincipalCode(String diagnosticPrincipalCode)
	{
		this.diagnosticPrincipalCode = diagnosticPrincipalCode;
	}
	/**
	 * @return the diagnosticPrincipalLibelle
	 */
	public String getDiagnosticPrincipalLibelle()
	{
		return diagnosticPrincipalLibelle;
	}
	/**
	 * @param diagnosticPrincipalLibelle the diagnosticPrincipalLibelle to set
	 */
	public void setDiagnosticPrincipalLibelle(String diagnosticPrincipalLibelle)
	{
		this.diagnosticPrincipalLibelle = diagnosticPrincipalLibelle;
	}
	/**
	 * @return the contexte
	 */
	public String getContexte()
	{
		return contexte;
	}
	/**
	 * @param contexte the contexte to set
	 */
	public void setContexte(String contexte)
	{
		this.contexte = contexte;
	}
	/**
	 * @return the nbrExamenLabo
	 */
	public int getNbrExamenLabo()
	{
		return nbrExamenLabo;
	}
	/**
	 * @param nbrExamenLabo the nbrExamenLabo to set
	 */
	public void setNbrExamenLabo(int nbrExamenLabo)
	{
		this.nbrExamenLabo = nbrExamenLabo;
	}
	/**
	 * @return the nbrExamenImagerie
	 */
	public int getNbrExamenImagerie()
	{
		return nbrExamenImagerie;
	}
	/**
	 * @param nbrExamenImagerie the nbrExamenImagerie to set
	 */
	public void setNbrExamenImagerie(int nbrExamenImagerie)
	{
		this.nbrExamenImagerie = nbrExamenImagerie;
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
	 * @return the dureeHosp
	 */
	public int getDureeHosp()
	{
		return dureeHosp;
	}
	/**
	 * @param dureeHosp the dureeHosp to set
	 */
	public void setDureeHosp(int dureeHosp)
	{
		this.dureeHosp = dureeHosp;
	}
	/**
	 * @return the infoPostActes
	 */
	public boolean isInfoPostActes()
	{
		return infoPostActes;
	}
	/**
	 * @param infoPostActes the infoPostActes to set
	 */
	public void setInfoPostActes(boolean infoPostActes)
	{
		this.infoPostActes = infoPostActes;
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

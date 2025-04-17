package bu.clinix.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
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
public class GynecoObstetrique implements Serializable
{
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "patient_id")
	//@JsonIgnore
	private Patient patient;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long gynecoObstetrique_id;
	
	private String age;
	private String groupeAge;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyyMMdd-HHmmSS")
	private Date heureEntree;
	private String modeEntree;
	private boolean ptme_feHivConnu;
	private boolean ptme_feSousArv;
	private boolean ptme_feConnaitPasStatutVih;
	private boolean ptme_feMiseSousArvPr1er;
	private String codeDiagnostic;
	private String libelleDiagnostic;
	private String contexte;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyyMMdd-HHmmSS")
	private Date dateSortie;
	private int dureeHosp;
	private String modeSortie;
	private String ms_ifPatientDecedes;
	private boolean ms_ifDecesMaternel;
	private String ms_Autorisee_typeRenvoi;
	private String ms_Autorisee_hospTransfert;
	private boolean infPostActes;
	private String modePayement;
	private String observations;
	/**
	 * 
	 */
	public GynecoObstetrique()
	{
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param age
	 * @param groupeAge
	 * @param heureEntree
	 * @param modeEntree
	 * @param ptme_feHivConnu
	 * @param ptme_feSousArv
	 * @param ptme_feConnaitPasStatutVih
	 * @param ptme_feMiseSousArvPr1er
	 * @param codeDiagnostic
	 * @param libelleDiagnostic
	 * @param contexte
	 * @param dateSortie
	 * @param dureeHosp
	 * @param modeSortie
	 * @param ms_ifPatientDecedes
	 * @param ms_ifDecesMaternel
	 * @param ms_Autorisee_typeRenvoi
	 * @param ms_Autorisee_hospTransfert
	 * @param infPostActes
	 * @param modePayement
	 * @param observations
	 */
	public GynecoObstetrique(String age, String groupeAge, Date heureEntree, String modeEntree,
			boolean ptme_feHivConnu, boolean ptme_feSousArv, boolean ptme_feConnaitPasStatutVih,
			boolean ptme_feMiseSousArvPr1er, String codeDiagnostic, String libelleDiagnostic, String contexte,
			Date dateSortie, int dureeHosp, String modeSortie, String ms_ifPatientDecedes, boolean ms_ifDecesMaternel,
			String ms_Autorisee_typeRenvoi, String ms_Autorisee_hospTransfert, boolean infPostActes,
			String modePayement, String observations)
	{
		super();
		this.setAge(age);
		this.setGroupeAge(groupeAge);
		this.heureEntree = heureEntree;
		this.modeEntree = modeEntree;
		this.ptme_feHivConnu = ptme_feHivConnu;
		this.ptme_feSousArv = ptme_feSousArv;
		this.ptme_feConnaitPasStatutVih = ptme_feConnaitPasStatutVih;
		this.ptme_feMiseSousArvPr1er = ptme_feMiseSousArvPr1er;
		this.codeDiagnostic = codeDiagnostic;
		this.libelleDiagnostic = libelleDiagnostic;
		this.contexte = contexte;
		this.dateSortie = dateSortie;
		this.dureeHosp = dureeHosp;
		this.modeSortie = modeSortie;
		this.ms_ifPatientDecedes = ms_ifPatientDecedes;
		this.ms_ifDecesMaternel = ms_ifDecesMaternel;
		this.ms_Autorisee_typeRenvoi = ms_Autorisee_typeRenvoi;
		this.ms_Autorisee_hospTransfert = ms_Autorisee_hospTransfert;
		this.infPostActes = infPostActes;
		this.modePayement = modePayement;
		this.observations = observations;
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
	 * @return the gynocoObstetrique_id
	 */
	public Long getGynocoObstetrique_id()
	{
		return gynecoObstetrique_id;
	}
	/**
	 * @param gynocoObstetrique_id the gynocoObstetrique_id to set
	 */
	public void setGynocoObstetrique_id(Long gynocoObstetrique_id)
	{
		this.gynecoObstetrique_id = gynocoObstetrique_id;
	}
	
	/**
	 * @return the heureEntree
	 */
	public Date getHeureEntree()
	{
		return heureEntree;
	}
	/**
	 * @param heureEntree the heureEntree to set
	 */
	public void setHeureEntree(Date heureEntree)
	{
		this.heureEntree = heureEntree;
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
	 * @return the ptme_feHivConnu
	 */
	public boolean isPtme_feHivConnu()
	{
		return ptme_feHivConnu;
	}
	/**
	 * @param ptme_feHivConnu the ptme_feHivConnu to set
	 */
	public void setPtme_feHivConnu(boolean ptme_feHivConnu)
	{
		this.ptme_feHivConnu = ptme_feHivConnu;
	}
	/**
	 * @return the ptme_feSousArv
	 */
	public boolean isPtme_feSousArv()
	{
		return ptme_feSousArv;
	}
	/**
	 * @param ptme_feSousArv the ptme_feSousArv to set
	 */
	public void setPtme_feSousArv(boolean ptme_feSousArv)
	{
		this.ptme_feSousArv = ptme_feSousArv;
	}
	/**
	 * @return the ptme_feConnaitPasStatutVih
	 */
	public boolean isPtme_feConnaitPasStatutVih()
	{
		return ptme_feConnaitPasStatutVih;
	}
	/**
	 * @param ptme_feConnaitPasStatutVih the ptme_feConnaitPasStatutVih to set
	 */
	public void setPtme_feConnaitPasStatutVih(boolean ptme_feConnaitPasStatutVih)
	{
		this.ptme_feConnaitPasStatutVih = ptme_feConnaitPasStatutVih;
	}
	/**
	 * @return the ptme_feMiseSousArvPr1er
	 */
	public boolean isPtme_feMiseSousArvPr1er()
	{
		return ptme_feMiseSousArvPr1er;
	}
	/**
	 * @param ptme_feMiseSousArvPr1er the ptme_feMiseSousArvPr1er to set
	 */
	public void setPtme_feMiseSousArvPr1er(boolean ptme_feMiseSousArvPr1er)
	{
		this.ptme_feMiseSousArvPr1er = ptme_feMiseSousArvPr1er;
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
	 * @return the ms_ifPatientDecedes
	 */
	public String getMs_ifPatientDecedes()
	{
		return ms_ifPatientDecedes;
	}
	/**
	 * @param ms_ifPatientDecedes the ms_ifPatientDecedes to set
	 */
	public void setMs_ifPatientDecedes(String ms_ifPatientDecedes)
	{
		this.ms_ifPatientDecedes = ms_ifPatientDecedes;
	}
	/**
	 * @return the ms_ifDecesMaternel
	 */
	public boolean isMs_ifDecesMaternel()
	{
		return ms_ifDecesMaternel;
	}
	/**
	 * @param ms_ifDecesMaternel the ms_ifDecesMaternel to set
	 */
	public void setMs_ifDecesMaternel(boolean ms_ifDecesMaternel)
	{
		this.ms_ifDecesMaternel = ms_ifDecesMaternel;
	}
	/**
	 * @return the ms_Autorisee_typeRenvoi
	 */
	public String getMs_Autorisee_typeRenvoi()
	{
		return ms_Autorisee_typeRenvoi;
	}
	/**
	 * @param ms_Autorisee_typeRenvoi the ms_Autorisee_typeRenvoi to set
	 */
	public void setMs_Autorisee_typeRenvoi(String ms_Autorisee_typeRenvoi)
	{
		this.ms_Autorisee_typeRenvoi = ms_Autorisee_typeRenvoi;
	}
	/**
	 * @return the ms_Autorisee_hospTransfert
	 */
	public String getMs_Autorisee_hospTransfert()
	{
		return ms_Autorisee_hospTransfert;
	}
	/**
	 * @param ms_Autorisee_hospTransfert the ms_Autorisee_hospTransfert to set
	 */
	public void setMs_Autorisee_hospTransfert(String ms_Autorisee_hospTransfert)
	{
		this.ms_Autorisee_hospTransfert = ms_Autorisee_hospTransfert;
	}
	/**
	 * @return the infPostActes
	 */
	public boolean isInfPostActes()
	{
		return infPostActes;
	}
	/**
	 * @param infPostActes the infPostActes to set
	 */
	public void setInfPostActes(boolean infPostActes)
	{
		this.infPostActes = infPostActes;
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
	 * @return the observations
	 */
	public String getObservations()
	{
		return observations;
	}
	/**
	 * @param observations the observations to set
	 */
	public void setObservations(String observations)
	{
		this.observations = observations;
	}
	public String getAge()
	{
		return age;
	}
	public void setAge(String age)
	{
		this.age = age;
	}
	public String getGroupeAge()
	{
		return groupeAge;
	}
	public void setGroupeAge(String groupeAge)
	{
		this.groupeAge = groupeAge;
	}
	
	
	

}

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

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Synthese_sortie implements Serializable
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyyMMdd-HHmmSS")
	private Date ss_dateEntreeHosp; // SS = Synthese de Sortie
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyyMMdd-HHmmSS")
	private Date ss_dateSortieHosp;
	private String ss_motifAdmission;
	private String ss_ModeSortie;
	private String ss_ModeSortie_decede;
	private String ss_ModeSortie_autorise;
	private String ss_Diagnostic_cim; // multiselect
	private String ss_Traitement;
	private String ss_PrecentionComplications;
	private String ss_ModePaiement;
	private String ss_ModePaiement_numCarte;
	private String ss_nomDocteur;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "numDossierMed")
	private DossierMedical dossierMedical;

	/**
	 * @param ss_dateEntreeHosp
	 * @param ss_dateSortieHosp
	 * @param ss_motifAdmission
	 * @param ss_ModeSortie
	 * @param ss_ModeSortie_decede
	 * @param ss_ModeSortie_autorise
	 * @param ss_Diagnostic_cim
	 * @param ss_Traitement
	 * @param ss_PrecentionComplications
	 * @param ss_ModePaiement
	 * @param ss_ModePaiement_numCarte
	 * @param ss_nomDocteur
	 */
	public Synthese_sortie(Date ss_dateEntreeHosp, Date ss_dateSortieHosp, String ss_motifAdmission,
			String ss_ModeSortie, String ss_ModeSortie_decede, String ss_ModeSortie_autorise, String ss_Diagnostic_cim,
			String ss_Traitement, String ss_PrecentionComplications, String ss_ModePaiement,
			String ss_ModePaiement_numCarte, String ss_nomDocteur)
	{
		super();
		this.ss_dateEntreeHosp = ss_dateEntreeHosp;
		this.ss_dateSortieHosp = ss_dateSortieHosp;
		this.ss_motifAdmission = ss_motifAdmission;
		this.ss_ModeSortie = ss_ModeSortie;
		this.ss_ModeSortie_decede = ss_ModeSortie_decede;
		this.ss_ModeSortie_autorise = ss_ModeSortie_autorise;
		this.ss_Diagnostic_cim = ss_Diagnostic_cim;
		this.ss_Traitement = ss_Traitement;
		this.ss_PrecentionComplications = ss_PrecentionComplications;
		this.ss_ModePaiement = ss_ModePaiement;
		this.ss_ModePaiement_numCarte = ss_ModePaiement_numCarte;
		this.ss_nomDocteur = ss_nomDocteur;
	}

	/**
	 * 
	 */
	public Synthese_sortie()
	{
		super();
		// TODO Auto-generated constructor stub
	}

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
	 * @return the ss_dateEntreeHosp
	 */
	public Date getSs_dateEntreeHosp()
	{
		return ss_dateEntreeHosp;
	}

	/**
	 * @param ss_dateEntreeHosp the ss_dateEntreeHosp to set
	 */
	public void setSs_dateEntreeHosp(Date ss_dateEntreeHosp)
	{
		this.ss_dateEntreeHosp = ss_dateEntreeHosp;
	}

	/**
	 * @return the ss_dateSortieHosp
	 */
	public Date getSs_dateSortieHosp()
	{
		return ss_dateSortieHosp;
	}

	/**
	 * @param ss_dateSortieHosp the ss_dateSortieHosp to set
	 */
	public void setSs_dateSortieHosp(Date ss_dateSortieHosp)
	{
		this.ss_dateSortieHosp = ss_dateSortieHosp;
	}

	/**
	 * @return the ss_motifAdmission
	 */
	public String getSs_motifAdmission()
	{
		return ss_motifAdmission;
	}

	/**
	 * @param ss_motifAdmission the ss_motifAdmission to set
	 */
	public void setSs_motifAdmission(String ss_motifAdmission)
	{
		this.ss_motifAdmission = ss_motifAdmission;
	}

	/**
	 * @return the ss_ModeSortie
	 */
	public String getSs_ModeSortie()
	{
		return ss_ModeSortie;
	}

	/**
	 * @param ss_ModeSortie the ss_ModeSortie to set
	 */
	public void setSs_ModeSortie(String ss_ModeSortie)
	{
		this.ss_ModeSortie = ss_ModeSortie;
	}

	/**
	 * @return the ss_ModeSortie_decede
	 */
	public String getSs_ModeSortie_decede()
	{
		return ss_ModeSortie_decede;
	}

	/**
	 * @param ss_ModeSortie_decede the ss_ModeSortie_decede to set
	 */
	public void setSs_ModeSortie_decede(String ss_ModeSortie_decede)
	{
		this.ss_ModeSortie_decede = ss_ModeSortie_decede;
	}

	/**
	 * @return the ss_ModeSortie_autorise
	 */
	public String getSs_ModeSortie_autorise()
	{
		return ss_ModeSortie_autorise;
	}

	/**
	 * @param ss_ModeSortie_autorise the ss_ModeSortie_autorise to set
	 */
	public void setSs_ModeSortie_autorise(String ss_ModeSortie_autorise)
	{
		this.ss_ModeSortie_autorise = ss_ModeSortie_autorise;
	}

	/**
	 * @return the ss_Diagnostic_cim
	 */
	public String getSs_Diagnostic_cim()
	{
		return ss_Diagnostic_cim;
	}

	/**
	 * @param ss_Diagnostic_cim the ss_Diagnostic_cim to set
	 */
	public void setSs_Diagnostic_cim(String ss_Diagnostic_cim)
	{
		this.ss_Diagnostic_cim = ss_Diagnostic_cim;
	}

	/**
	 * @return the ss_Traitement
	 */
	public String getSs_Traitement()
	{
		return ss_Traitement;
	}

	/**
	 * @param ss_Traitement the ss_Traitement to set
	 */
	public void setSs_Traitement(String ss_Traitement)
	{
		this.ss_Traitement = ss_Traitement;
	}

	/**
	 * @return the ss_PrecentionComplications
	 */
	public String getSs_PrecentionComplications()
	{
		return ss_PrecentionComplications;
	}

	/**
	 * @param ss_PrecentionComplications the ss_PrecentionComplications to set
	 */
	public void setSs_PrecentionComplications(String ss_PrecentionComplications)
	{
		this.ss_PrecentionComplications = ss_PrecentionComplications;
	}

	/**
	 * @return the ss_ModePaiement
	 */
	public String getSs_ModePaiement()
	{
		return ss_ModePaiement;
	}

	/**
	 * @param ss_ModePaiement the ss_ModePaiement to set
	 */
	public void setSs_ModePaiement(String ss_ModePaiement)
	{
		this.ss_ModePaiement = ss_ModePaiement;
	}

	/**
	 * @return the ss_ModePaiement_numCarte
	 */
	public String getSs_ModePaiement_numCarte()
	{
		return ss_ModePaiement_numCarte;
	}

	/**
	 * @param ss_ModePaiement_numCarte the ss_ModePaiement_numCarte to set
	 */
	public void setSs_ModePaiement_numCarte(String ss_ModePaiement_numCarte)
	{
		this.ss_ModePaiement_numCarte = ss_ModePaiement_numCarte;
	}

	/**
	 * @return the ss_nomDocteur
	 */
	public String getSs_nomDocteur()
	{
		return ss_nomDocteur;
	}

	/**
	 * @param ss_nomDocteur the ss_nomDocteur to set
	 */
	public void setSs_nomDocteur(String ss_nomDocteur)
	{
		this.ss_nomDocteur = ss_nomDocteur;
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

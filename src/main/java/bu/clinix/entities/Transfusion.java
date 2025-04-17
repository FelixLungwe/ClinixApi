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
public class Transfusion implements Serializable
{
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "patient_id")
	//@JsonIgnore
	private Patient patient;
	

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long transfusion_id; 
	
	
	@DateTimeFormat(pattern = "dd-MM-yy")
	@Temporal(TemporalType.DATE)
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yy")
	private Date heureDemande;
	private String typeDemande;
	private double qtteDemande;
	private int nbrPocheDemande;
	private String motifDemande;
	
	@NonNull
	@DateTimeFormat(pattern = "dd-MM-yy")
	@Temporal(TemporalType.DATE)
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yy")
	private Date heureReponse;
	private int nbrPocheResponse;
	private int qtteReponse;
	private String typeReponse;
	private String numPoches;
	private String reationObservee;
	private boolean deces;
	/**
	 * 
	 */
	public Transfusion()
	{
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param heureDemande
	 * @param typeDemande
	 * @param qtteDemande
	 * @param nbrPocheDemande
	 * @param motifDemande
	 * @param heureReponse
	 * @param nbrPocheResponse
	 * @param qtteReponse
	 * @param typeReponse
	 * @param numPoches
	 * @param reationObservee
	 * @param deces
	 */
	public Transfusion(Date heureDemande, String typeDemande, double qtteDemande, int nbrPocheDemande,
			String motifDemande, Date heureReponse, int nbrPocheResponse, int qtteReponse, String typeReponse,
			String numPoches, String reationObservee, boolean deces)
	{
		super();
		this.heureDemande = heureDemande;
		this.typeDemande = typeDemande;
		this.qtteDemande = qtteDemande;
		this.nbrPocheDemande = nbrPocheDemande;
		this.motifDemande = motifDemande;
		this.heureReponse = heureReponse;
		this.nbrPocheResponse = nbrPocheResponse;
		this.qtteReponse = qtteReponse;
		this.typeReponse = typeReponse;
		this.numPoches = numPoches;
		this.reationObservee = reationObservee;
		this.deces = deces;
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
	 * @return the transfusion_id
	 */
	public Long getTransfusion_id()
	{
		return transfusion_id;
	}
	/**
	 * @param transfusion_id the transfusion_id to set
	 */
	public void setTransfusion_id(Long transfusion_id)
	{
		this.transfusion_id = transfusion_id;
	}
	/**
	 * @return the heureDemande
	 */
	public Date getHeureDemande()
	{
		return heureDemande;
	}
	/**
	 * @param heureDemande the heureDemande to set
	 */
	public void setHeureDemande(Date heureDemande)
	{
		this.heureDemande = heureDemande;
	}
	/**
	 * @return the typeDemande
	 */
	public String getTypeDemande()
	{
		return typeDemande;
	}
	/**
	 * @param typeDemande the typeDemande to set
	 */
	public void setTypeDemande(String typeDemande)
	{
		this.typeDemande = typeDemande;
	}
	/**
	 * @return the qtteDemande
	 */
	public double getQtteDemande()
	{
		return qtteDemande;
	}
	/**
	 * @param qtteDemande the qtteDemande to set
	 */
	public void setQtteDemande(double qtteDemande)
	{
		this.qtteDemande = qtteDemande;
	}
	/**
	 * @return the nbrPocheDemande
	 */
	public int getNbrPocheDemande()
	{
		return nbrPocheDemande;
	}
	/**
	 * @param nbrPocheDemande the nbrPocheDemande to set
	 */
	public void setNbrPocheDemande(int nbrPocheDemande)
	{
		this.nbrPocheDemande = nbrPocheDemande;
	}
	/**
	 * @return the motifDemande
	 */
	public String getMotifDemande()
	{
		return motifDemande;
	}
	/**
	 * @param motifDemande the motifDemande to set
	 */
	public void setMotifDemande(String motifDemande)
	{
		this.motifDemande = motifDemande;
	}
	/**
	 * @return the heureReponse
	 */
	public Date getHeureReponse()
	{
		return heureReponse;
	}
	/**
	 * @param heureReponse the heureReponse to set
	 */
	public void setHeureReponse(Date heureReponse)
	{
		this.heureReponse = heureReponse;
	}
	/**
	 * @return the nbrPocheResponse
	 */
	public int getNbrPocheResponse()
	{
		return nbrPocheResponse;
	}
	/**
	 * @param nbrPocheResponse the nbrPocheResponse to set
	 */
	public void setNbrPocheResponse(int nbrPocheResponse)
	{
		this.nbrPocheResponse = nbrPocheResponse;
	}
	/**
	 * @return the qtteReponse
	 */
	public int getQtteReponse()
	{
		return qtteReponse;
	}
	/**
	 * @param qtteReponse the qtteReponse to set
	 */
	public void setQtteReponse(int qtteReponse)
	{
		this.qtteReponse = qtteReponse;
	}
	/**
	 * @return the typeReponse
	 */
	public String getTypeReponse()
	{
		return typeReponse;
	}
	/**
	 * @param typeReponse the typeReponse to set
	 */
	public void setTypeReponse(String typeReponse)
	{
		this.typeReponse = typeReponse;
	}
	/**
	 * @return the numPoches
	 */
	public String getNumPoches()
	{
		return numPoches;
	}
	/**
	 * @param numPoches the numPoches to set
	 */
	public void setNumPoches(String numPoches)
	{
		this.numPoches = numPoches;
	}
	/**
	 * @return the reationObservee
	 */
	public String getReationObservee()
	{
		return reationObservee;
	}
	/**
	 * @param reationObservee the reationObservee to set
	 */
	public void setReationObservee(String reationObservee)
	{
		this.reationObservee = reationObservee;
	}
	/**
	 * @return the deces
	 */
	public boolean isDeces()
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
	
	
	
	

}

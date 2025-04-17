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

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class BanqueSang implements Serializable
{
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "patient_id")
	//@JsonIgnore
	private Patient patient;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long banqueSang_id;
	
//	private String chefFamille;
//	private String groupeAge;
//	private String origine;
	private String groupeSanguin;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyyMMdd-HHmmSS")
	private Date heureDemande;
	private String serviceDemande;
	private String typeDemande;
	private int qtteDemande;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyyMMdd-HHmmSS")
	private Date heureLivraison;
	private int nbrPoche;
	private String numPoche;
	private int qtteResponse;
	//private Date heureReponse;
	private String etatResponse;
	private String responsable;
	private String groupeDonneur;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyyMMdd-HHmmSS")
	private Date dateEnregistre;
	
	
	
	/**
	 * @param groupeSanguin
	 * @param heureDemande
	 * @param serviceDemande
	 * @param typeDemande
	 * @param qtteDemande
	 * @param heureLivraison
	 * @param nbrPoche
	 * @param numPoche
	 * @param qtteResponse
	 * @param etatResponse
	 * @param responsable
	 * @param groupeDonneur
	 * @param dateEnregistre
	 */
	public BanqueSang(String groupeSanguin, Date heureDemande, String serviceDemande, String typeDemande,
			int qtteDemande, Date heureLivraison, int nbrPoche, String numPoche, int qtteResponse, String etatResponse,
			String responsable, String groupeDonneur, Date dateEnregistre)
	{
		super();
		this.groupeSanguin = groupeSanguin;
		this.heureDemande = heureDemande;
		this.serviceDemande = serviceDemande;
		this.typeDemande = typeDemande;
		this.qtteDemande = qtteDemande;
		this.heureLivraison = heureLivraison;
		this.nbrPoche = nbrPoche;
		this.numPoche = numPoche;
		this.qtteResponse = qtteResponse;
		this.etatResponse = etatResponse;
		this.responsable = responsable;
		this.groupeDonneur = groupeDonneur;
		this.dateEnregistre = dateEnregistre;
	}
	/**
	 * 
	 */
	public BanqueSang()
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
	 * @return the banqueSang_id
	 */
	public Long getBanqueSang_id()
	{
		return banqueSang_id;
	}
	/**
	 * @param banqueSang_id the banqueSang_id to set
	 */
	public void setBanqueSang_id(Long banqueSang_id)
	{
		this.banqueSang_id = banqueSang_id;
	}
	/**
	 * @return the groupeSanguin
	 */
	public String getGroupeSanguin()
	{
		return groupeSanguin;
	}
	/**
	 * @param groupeSanguin the groupeSanguin to set
	 */
	public void setGroupeSanguin(String groupeSanguin)
	{
		this.groupeSanguin = groupeSanguin;
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
	 * @return the serviceDemande
	 */
	public String getServiceDemande()
	{
		return serviceDemande;
	}
	/**
	 * @param serviceDemande the serviceDemande to set
	 */
	public void setServiceDemande(String serviceDemande)
	{
		this.serviceDemande = serviceDemande;
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
	public int getQtteDemande()
	{
		return qtteDemande;
	}
	/**
	 * @param qtteDemande the qtteDemande to set
	 */
	public void setQtteDemande(int qtteDemande)
	{
		this.qtteDemande = qtteDemande;
	}
	
	
	/**
	 * @return the heureLivraison
	 */
	public Date getHeureLivraison()
	{
		return heureLivraison;
	}
	/**
	 * @param heureLivraison the heureLivraison to set
	 */
	public void setHeureLivraison(Date heureLivraison)
	{
		this.heureLivraison = heureLivraison;
	}
	/**
	 * @return the nbrPoche
	 */
	public int getNbrPoche()
	{
		return nbrPoche;
	}
	/**
	 * @param nbrPoche the nbrPoche to set
	 */
	public void setNbrPoche(int nbrPoche)
	{
		this.nbrPoche = nbrPoche;
	}
	/**
	 * @return the numPoche
	 */
	public String getNumPoche()
	{
		return numPoche;
	}
	/**
	 * @param numPoche the numPoche to set
	 */
	public void setNumPoche(String numPoche)
	{
		this.numPoche = numPoche;
	}
	/**
	 * @return the qtteResponse
	 */
	public int getQtteResponse()
	{
		return qtteResponse;
	}
	/**
	 * @param qtteResponse the qtteResponse to set
	 */
	public void setQtteResponse(int qtteResponse)
	{
		this.qtteResponse = qtteResponse;
	}
	/**
	 * @return the responsable
	 */
	public String getResponsable()
	{
		return responsable;
	}
	/**
	 * @param responsable the responsable to set
	 */
	public void setResponsable(String responsable)
	{
		this.responsable = responsable;
	}
	/**
	 * @return the groupeDonneur
	 */
	public String getGroupeDonneur()
	{
		return groupeDonneur;
	}
	/**
	 * @param groupeDonneur the groupeDonneur to set
	 */
	public void setGroupeDonneur(String groupeDonneur)
	{
		this.groupeDonneur = groupeDonneur;
	}
	
	public String getEtatResponse()
	{
		return etatResponse;
	}
	public void setEtatResponse(String etatResponse)
	{
		this.etatResponse = etatResponse;
	}
	

}

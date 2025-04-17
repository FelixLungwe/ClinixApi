package bu.clinix.entities;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class T_trace
{
	
	private Long numero;
	private String service;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yy")
	private Date date;

	/**
	 * @param numero
	 * @param service
	 * @param date
	 */
	public T_trace(Long numero, String service, Date date)
	{
		super();
		this.numero = numero;
		this.service = service;
		this.date = date;
	}

	/**
	 * 
	 */
	public T_trace()
	{
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the numero
	 */
	public Long getNumero()
	{
		return numero;
	}

	/**
	 * @param numero the numero to set
	 */
	public void setNumero(Long numero)
	{
		this.numero = numero;
	}

	/**
	 * @return the service
	 */
	public String getService()
	{
		return service;
	}

	/**
	 * @param service the service to set
	 */
	public void setService(String service)
	{
		this.service = service;
	}

	/**
	 * @return the date
	 */
	public Date getDate()
	{
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(Date date)
	{
		this.date = date;
	}

	
	
}

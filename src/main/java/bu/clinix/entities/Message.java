package bu.clinix.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Message implements Serializable
{
	@Id
	@GeneratedValue( strategy = GenerationType.AUTO)
	private Long id;
	
	private String text;
	private boolean isNotice;
	private boolean isMessage;
	private String nomUser;
}

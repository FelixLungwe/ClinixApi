package bu.clinix.service;

import java.util.List;

import bu.clinix.entities.DossierMedical;
import bu.clinix.entities.Message;

public interface IMessageService
{
	Message addMessage(Message message);
	Message getMessage(Long id);
	List<Message> getMessages();
	void deleteMessage(Long id);
	Message updateMessage(Message message);
	
	List<Message> getMessagesByUsername(String username);
	
}

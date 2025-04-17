package bu.clinix.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bu.clinix.dao.MessageRepository;
import bu.clinix.entities.Message;

@Service
public class MessageServiceImpl implements IMessageService
{
	@Autowired
	private MessageRepository messageReposity;

	

	@Override
	public Message getMessage(Long id)
	{
		// TODO Auto-generated method stub
		return messageReposity.findById(id).get();
	}

	@Override
	public List<Message> getMessages()
	{
		// TODO Auto-generated method stub
		return messageReposity.findAll();
	}

	@Override
	public void deleteMessage(Long id)
	{
		// TODO Auto-generated method stub
		messageReposity.deleteById(id);
	}

	
	@Override
	public List<Message> getMessagesByUsername(String username)
	{
		// TODO Auto-generated method stub
		return messageReposity.findAllByNomUser(username);
	}

	@Override
	public Message addMessage(Message message)
	{
		// TODO Auto-generated method stub
		return messageReposity.save(message);
	}

	@Override
	public Message updateMessage(Message message)
	{
		// TODO Auto-generated method stub
		return messageReposity.save(message);
	}

}

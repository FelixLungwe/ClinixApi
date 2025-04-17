package bu.clinix.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import bu.clinix.entities.Message;

public interface MessageRepository extends JpaRepository<Message, Long>
{
	List<Message> findAllByNomUser(String nomUser);
}

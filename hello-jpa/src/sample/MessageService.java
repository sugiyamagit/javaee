package sample;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@ApplicationScoped
@Transactional
public class MessageService {

	@PersistenceContext
	EntityManager entityManager;

	public Message create(String message){
		Message entity = new Message();
		entity.setMessage(message);
		entityManager.persist(entity);
		return entity;
	}

	public List<Message> findAll(){
		return entityManager.createQuery("SELECT x FROM Message x", Message.class).getResultList();
	}
}

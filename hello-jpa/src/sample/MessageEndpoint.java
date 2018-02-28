package sample;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

@ApplicationScoped
@Path("message")
public class MessageEndpoint {
	@Inject
	MessageService messageService;

	@GET
	@Path("add")
	public Message add(@QueryParam("message") String message){
		return messageService.create(message);
	}

	@GET
	public List<Message> list(){
		return messageService.findAll();
	}
}

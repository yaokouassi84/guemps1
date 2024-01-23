package fr.guemps.webServices;

import java.util.List;

import javax.persistence.EntityManager;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import fr.guemps.connexion.ConnexionUtil;
import fr.guemps.model.Client;

@Path("/Clients")
public class GestionClients {

	@GET
	public List<Client> getClients() {
		EntityManager em = ConnexionUtil.getEntityManager();
		List<Client> clts  =  em.createQuery("SELECT c FROM Client c",Client.class).getResultList();
		return clts;
	}
}

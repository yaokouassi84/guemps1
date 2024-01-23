package fr.guemps.webServices;

import java.io.IOException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.guemps.connexion.ConnexionUtil;
import fr.guemps.model.Client;

/**
 * Servlet implementation class listClients
 */
@WebServlet("/listClients")
public class listClients extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	//private GestionClients service;   
    
    public listClients() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//List<Client> clients  = service.getClients();
		EntityManager em = ConnexionUtil.getEntityManager();
		List<Client> clients  =  em.createQuery("SELECT c FROM Client c",Client.class).getResultList();
		request.setAttribute("clients", clients);
		RequestDispatcher rd = (RequestDispatcher) request.getRequestDispatcher("clientList.jsp");
		rd.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}

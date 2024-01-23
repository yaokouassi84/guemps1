/*package fr.guemps.connexion;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ConnexionFinale")
public class ConnexionFinale extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public ConnexionFinale() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		EntityManager em = ConnexionUtil.getEntityManager();
		if(em.isOpen()) {
			System.out.println("Connexion ok");
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
*/
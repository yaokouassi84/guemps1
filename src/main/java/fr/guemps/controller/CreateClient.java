package fr.guemps.controller;

import java.io.IOException;
import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.guemps.connexion.ConnexionUtil;
import fr.guemps.enums.Genre;
import fr.guemps.model.Client;


@WebServlet({ "/CreateClient", "/AddClient" })
public class CreateClient extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public CreateClient() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		EntityManager em = ConnexionUtil.getEntityManager();
		EntityTransaction tx = em.getTransaction();
		Client c = new Client();
		c.setDateCreation(new Date());
		c.setNom("YAO");
		c.setPrenom("Anicet");
		c.setGenre(Genre.HOMME);
		try {
			tx.begin();
			em.persist(c);
			tx.commit();
			em.close();
			
		}catch (Exception e) {
			
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}

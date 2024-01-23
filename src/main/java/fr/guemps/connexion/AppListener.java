package fr.guemps.connexion;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;


@WebListener
public class AppListener implements ServletContextListener {

	private static EntityManagerFactory emf;
		
    public AppListener() {
        
    }

    public static EntityManagerFactory getEmf() {
		return emf;
	}

	public static void setEmf(EntityManagerFactory emf) {
		AppListener.emf = emf;
	}

	public void contextDestroyed(ServletContextEvent sce)  { 
        if(this.emf != null && this.emf.isOpen()) {
        	this.emf.close();
        }
    }
	
    public void contextInitialized(ServletContextEvent sce)  { 
         this.emf = Persistence.createEntityManagerFactory("JFCG");
    }
	
}

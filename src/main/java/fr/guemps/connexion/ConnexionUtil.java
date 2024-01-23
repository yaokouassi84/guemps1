package fr.guemps.connexion;

import javax.persistence.EntityManager;

public class ConnexionUtil {

	public static EntityManager getEntityManager() {
		
		return AppListener.getEmf().createEntityManager();
	}
}

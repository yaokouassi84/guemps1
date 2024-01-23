package fr.guemps.model;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import java.util.Date;
import javax.persistence.*;
import fr.guemps.enums.Poste;

@Entity
public class Joueurs implements Serializable {

	   
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nom;
	private String prenom;
	private Date dateNaissance;
	@Enumerated(EnumType.STRING)
	private Poste poste;
	private Date dateInscrit;
	private Date heureInscrit;
	private static final long serialVersionUID = 1L;

	public Joueurs() {
		super();
	} 
		
	public Joueurs(Long id, String nom, String prenom, Date dateNaissance, Poste poste, Date dateInscrit,
			Date heureInscrit) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.poste = poste;
		this.dateInscrit = dateInscrit;
		this.heureInscrit = heureInscrit;
	}


	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}   
	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}   
	public String getPrenom() {
		return this.prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}   
	public Date getDateNaissance() {
		return this.dateNaissance;
	}

	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}   
	public Date getDateInscrit() {
		return this.dateInscrit;
	}

	public void setDateInscrit(Date dateInscrit) {
		this.dateInscrit = dateInscrit;
	}   
	public Date getHeureInscrit() {
		return this.heureInscrit;
	}

	public void setHeureInscrit(Date heureInscrit) {
		this.heureInscrit = heureInscrit;
	}


	@Override
	public String toString() {
		return "Joueurs [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", dateNaissance=" + dateNaissance
				+ ", poste=" + poste + ", dateInscrit=" + dateInscrit + ", heureInscrit=" + heureInscrit + "]";
	}
   
}

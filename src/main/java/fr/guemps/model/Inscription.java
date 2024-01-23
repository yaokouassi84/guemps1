package fr.guemps.model;

import java.io.Serializable;
import java.lang.Long;
import java.util.Date;

import javax.persistence.*;

import fr.guemps.enums.Poste;


@Entity
public class Inscription implements Serializable {
	private static final long serialVersionUID = 1L;
	   
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nom;
	private String prenom;
	private Date dateNaissance;
	@Enumerated(EnumType.STRING)
	private Poste poste;
	private String ancienClub;
	private Date dateInscrit;
	private Date heureInscrit;
	

	public Inscription() {
		super();
	}  	
	
	public Inscription(Long id, String nom, String prenom, Date dateNaissance, Poste poste, String ancienClub,
			Date dateInscrit, Date heureInscrit) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.poste = poste;
		this.ancienClub = ancienClub;
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
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Date getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public Poste getPoste() {
		return poste;
	}

	public void setPoste(Poste poste) {
		this.poste = poste;
	}

	public String getAncienClub() {
		return ancienClub;
	}

	public void setAncienClub(String ancienClub) {
		this.ancienClub = ancienClub;
	}

	public Date getDateInscrit() {
		return dateInscrit;
	}

	public void setDateInscrit(Date dateInscrit) {
		this.dateInscrit = dateInscrit;
	}

	public Date getHeureInscrit() {
		return heureInscrit;
	}

	public void setHeureInscrit(Date heureInscrit) {
		this.heureInscrit = heureInscrit;
	}

	@Override
	public String toString() {
		return "Inscription [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", dateNaissance=" + dateNaissance
				+ ", poste=" + poste + ", ancienClub=" + ancienClub + ", dateInscrit=" + dateInscrit + ", heureInscrit="
				+ heureInscrit + "]";
	}
   
}

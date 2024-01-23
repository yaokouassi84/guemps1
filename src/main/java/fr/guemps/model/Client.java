package fr.guemps.model;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import java.util.Date;
import javax.persistence.*;

import fr.guemps.enums.Genre;

@Entity
public class Client implements Serializable {
	   
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nom;
	private String prenom;
	
	@Enumerated(EnumType.STRING)
	private Genre genre;
	
	@Temporal(TemporalType.DATE)
	private Date dateCreation;
	private static final long serialVersionUID = 1L;

	public Client() {
		super();
	} 
		
	public Client(Long id, String nom, String prenom, Genre genre, Date dateCreation) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.genre = genre;
		this.dateCreation = dateCreation;
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
	
	
	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	public Date getDateCreation() {
		return this.dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	@Override
	public String toString() {
		return "Client [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", genre=" + genre + ", dateCreation="
				+ dateCreation + "]";
	}
	
}

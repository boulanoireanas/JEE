package com.example.demo.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Livre {

	@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String Titre;
    @Column(nullable = false,updatable = false)
    private String Maison_edition;
    @Column(nullable = false)
    private Date Date_sortie;
    @Column(nullable = false)
    private Date Last_seen;
    @Column(nullable = false)
    private String Auteur;
    @Column(nullable = false)
    private int Nbr_page;
    @Column(nullable = false,unique = true,updatable = false)
    private int ISBN;
    @Column(nullable = false)
	 private boolean Dispo  ;
    

    
    public Livre(String titre, String maison_edition, Date date_sortie, Date last_seen, String auteur, int nbr_page,
			int iSBN, boolean dispo) {
		super();
		Titre = titre;
		Maison_edition = maison_edition;
		Date_sortie = date_sortie;
		Last_seen = last_seen;
		Auteur = auteur;
		Nbr_page = nbr_page;
		ISBN = iSBN;
		Dispo = dispo;
	}


	public Livre() {
		// TODO Auto-generated constructor stub
	}


    public String getTitre() {
		return Titre;
	}
	public void setTitre(String titre) {
		Titre = titre;
	}
	public String getMaison_edition() {
		return Maison_edition;
	}
	public void setMaison_edition(String maison_edition) {
		Maison_edition = maison_edition;
	}

	public Date getDate_sortie() {
		return Date_sortie;
	}


	public void setDate_sortie(Date date_sortie) {
		Date_sortie = date_sortie;
	}


	public Date getLast_seen() {
		return Last_seen;
	}


	public void setLast_seen(Date last_seen) {
		Last_seen = last_seen;
	}


	public String getAuteur() {
		return Auteur;
	}
	public void setAuteur(String auteur) {
		Auteur = auteur;
	}
	public int getNbr_page() {
		return Nbr_page;
	}
	public void setNbr_page(int nbr_page) {
		Nbr_page = nbr_page;
	}
	public int getISBN() {
		return ISBN;
	}
	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}
	public boolean isDispo() {
		return Dispo;
	}
	public void setDispo(boolean dispo) {
		Dispo = dispo;
	}
   public Long getId() {
        return id;
   }
   public void setId(Long id) {
        this.id = id;
   }

 
}
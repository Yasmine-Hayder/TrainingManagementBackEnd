package com.isi.trainingsManagement.model;

import javax.persistence.*;

@Entity
@Table(name="formateur")
public class Formateur {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String prenom;
    private enum Type {
        interne , externe
    }
    private String email;
    private String tel;

    @ManyToOne
    private Organisme organisme;

    public Formateur() {
        this.nom = "";
        this.prenom = "";
        this.email = "";
        this.tel = "";
    }

    public Formateur(Long id, String nom, String prenom, String email, String tel, Organisme organisme) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.tel = tel;
        this.organisme = organisme;
    }

    public Long getId() {
        return id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public Organisme getOrganisme() {
        return organisme;
    }

    public void setOrganisme(Organisme organisme) {
        this.organisme = organisme;
    }
}

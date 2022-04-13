package com.isi.trainingsManagement.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="session")
public class Session {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String lieu;
    private String date_debut;
    private String date_fin;
    private int nb_participant;

    @ManyToOne
    private Organisme organisme;

    @ManyToOne
    private Formateur formateur;

    @ManyToOne
    private Formation formation;

    public Session() {
    }

    public Session(Long id, String lieu, String date_debut, String date_fin, int nb_participant, Organisme organisme, Formateur formateur, Formation formation) {
        this.id = id;
        this.lieu = lieu;
        this.date_debut = date_debut;
        this.date_fin = date_fin;
        this.nb_participant = nb_participant;
        this.organisme = organisme;
        this.formateur = formateur;
        this.formation = formation;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLieu() {
        return lieu;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    public String getDate_debut() {
        return date_debut;
    }

    public void setDate_debut(String date_debut) {
        this.date_debut = date_debut;
    }

    public String getDate_fin() {
        return date_fin;
    }

    public void setDate_fin(String date_fin) {
        this.date_fin = date_fin;
    }

    public int getNb_participant() {
        return nb_participant;
    }

    public void setNb_participant(int nb_participant) {
        this.nb_participant = nb_participant;
    }

    public Organisme getOrganisme() {
        return organisme;
    }

    public void setOrganisme(Organisme organisme) {
        this.organisme = organisme;
    }

    public Formateur getFormateur() {
        return formateur;
    }

    public void setFormateur(Formateur formateur) {
        this.formateur = formateur;
    }

    public Formation getFormation() {
        return formation;
    }

    public void setFormation(Formation formation) {
        this.formation = formation;
    }
}

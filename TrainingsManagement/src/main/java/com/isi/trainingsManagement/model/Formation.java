package com.isi.trainingsManagement.model;

import javax.persistence.*;

@Entity
@Table(name="formation")
public class Formation {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String titre;
    private int annee;
    private int nb_session;
    private String duree;
    private String budget;

    @ManyToOne
    private Domaine domaine;

    public Formation() {
        this.id = id;
        this.titre = titre;
        this.annee = 0;
        this.nb_session =0;
        this.duree ="";
        this.budget ="0";

    }

    public Formation(Long id, String titre, int annee, int nb_session, String duree, String budget, Domaine domaine) {
        this.id = id;
        this.titre = titre;
        this.annee = annee;
        this.nb_session = nb_session;
        this.duree = duree;
        this.budget = budget;
        this.domaine = domaine;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public int getNb_session() {
        return nb_session;
    }

    public void setNb_session(int nb_session) {
        this.nb_session = nb_session;
    }

    public String getDuree() {
        return duree;
    }

    public void setDuree(String duree) {
        this.duree = duree;
    }

    public String getBudget() {
        return budget;
    }

    public void setBudget(String budget) {
        this.budget = budget;
    }

    public Domaine getDomaine() {
        return domaine;
    }

    public void setDomaine(Domaine domaine) {
        this.domaine = domaine;
    }
}

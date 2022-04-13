package com.isi.trainingsManagement.model;

import javax.persistence.*;

@Entity
@Table(name="organisme")
public class Organisme {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String libelle;

    public Organisme() {
        this.libelle = "";
    }
    public Organisme(Long id, String libelle) {
        this.id = id;
        this.libelle = libelle;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
}

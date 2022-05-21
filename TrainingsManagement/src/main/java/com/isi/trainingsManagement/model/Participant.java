package com.isi.trainingsManagement.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="participants")
public class Participant {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String prenom;
    private enum Type {
        national , international
    }
    private String email;
    private String tel;
    @ManyToMany
    @JoinTable(
            name="Participant_session",
            joinColumns= @JoinColumn(name="idParticipant"),
            inverseJoinColumns = @JoinColumn(name= "idSession")
    )
    private Set<Session> sessions = new HashSet<>();

    @ManyToOne
    private Pays pays;

    @ManyToOne
    private Profil profil;
    public Participant() {
    }

    public Participant(Long id, String nom, String prenom, String email, String tel, Set<Session> sessions, Pays pays, Profil profil) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.tel = tel;
        this.sessions = sessions;
        this.pays = pays;
        this.profil = profil;
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

    public Set<Session> getSessions() {
        return sessions;
    }

    public void setSessions(Set<Session> sessions) {
        this.sessions = sessions;
    }

    public Pays getPays() {
        return pays;
    }

    public void setPays(Pays pays) {
        this.pays = pays;
    }

    public Profil getProfil() {
        return profil;
    }

    public void setProfil(Profil profil) {
        this.profil = profil;
    }
}

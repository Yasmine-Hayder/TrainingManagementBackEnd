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
    private Set<Session> roles = new HashSet<>();

    @ManyToOne
    private Pays pays;

    @ManyToOne
    private Profil profil;
}

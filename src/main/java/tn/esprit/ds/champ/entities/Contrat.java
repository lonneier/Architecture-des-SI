package tn.esprit.ds.champ.entities;

import jakarta.persistence.*;

@Entity
public class Contrat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idContrat;

    private Float montant;

    private String annee;

    private Boolean archived;

    @ManyToOne
    Equipe equipe;
    @ManyToOne
    Sponsor sponsor;
}

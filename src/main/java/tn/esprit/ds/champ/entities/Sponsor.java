package tn.esprit.ds.champ.entities;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Sponsor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idSponsor;

    private String nom;

    private String pays;

    private Float budgetAnnuel;

    private Boolean bloquerContrat;

    @OneToMany(mappedBy = "sponsor")
    private Set<Contrat> contrats;

}

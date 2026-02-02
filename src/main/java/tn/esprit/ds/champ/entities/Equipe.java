package tn.esprit.ds.champ.entities;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Equipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEquipe;

    private String libelle;

    private Integer nbPointsTotal;

    private Integer classementGeneral;

    @OneToMany(mappedBy = "equipe")
    private Set<Pilote> pilotes;

    @OneToMany(mappedBy = "equipe")
    private Set<Contrat> contrats;
}

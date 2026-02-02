package tn.esprit.ds.champ.entities;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Pilote {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPilote;

    private String libelleP;

    private Integer nbPointsTotal;

    private Integer classementGeneral;
    @OneToMany(mappedBy = "Pilot")
    private Set<Position> positions;
    @ManyToOne
    Equipe equipe;
}

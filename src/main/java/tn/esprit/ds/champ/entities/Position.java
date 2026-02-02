package tn.esprit.ds.champ.entities;

import jakarta.persistence.*;

@Entity
public class Position {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPosition;

    private Integer classement;

    private Integer nbPoints;
    @ManyToOne
    Course course;
    @ManyToOne
    Pilote Pilot;
}

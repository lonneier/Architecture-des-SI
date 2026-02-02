package tn.esprit.ds.champ.entities;

import jakarta.persistence.*;

@Entity
public class DetailChampionnat {

    @Id
    private String code;

    private String description;
    @OneToOne(mappedBy = "detailChampionnat")
    private championnat championnat;
}
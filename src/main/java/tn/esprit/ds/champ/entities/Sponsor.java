package tn.esprit.ds.champ.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
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
    private boolean archived;
    private LocalDate dateCreation;
    private LocalDate dateDernierModification;

    public LocalDate getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(LocalDate dateCreation) {
        this.dateCreation = dateCreation;
    }

    public boolean isArchived() {
        return archived;
    }

    public void setArchived(boolean archived) {
        this.archived = archived;
    }

    public Boolean getBloquerContrat() {
        return bloquerContrat;
    }

    public void setBloquerContrat(Boolean bloquerContrat) {
        this.bloquerContrat = bloquerContrat;
    }
}

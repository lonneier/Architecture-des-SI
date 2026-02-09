package tn.esprit.ds.champ.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.ds.champ.entities.Pilote;

public interface PiloteRepository extends JpaRepository<Pilote, Long> {
}

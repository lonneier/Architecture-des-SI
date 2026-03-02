package tn.esprit.ds.champ.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.ds.champ.entities.Pilote;
import org.springframework.stereotype.Repository;
@Repository
public interface PiloteRepository extends JpaRepository<Pilote, Long> {
}

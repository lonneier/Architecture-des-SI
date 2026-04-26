package tn.esprit.ds.champ.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.ds.champ.entities.Contrat;
import tn.esprit.ds.champ.entities.Equipe;
@Repository
public interface ContratRepository extends JpaRepository<Contrat, Long> {
}

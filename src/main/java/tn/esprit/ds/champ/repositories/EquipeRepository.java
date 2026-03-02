package tn.esprit.ds.champ.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.ds.champ.entities.Equipe;
import org.springframework.stereotype.Repository;
@Repository
public interface EquipeRepository extends JpaRepository<Equipe, Long> {
}

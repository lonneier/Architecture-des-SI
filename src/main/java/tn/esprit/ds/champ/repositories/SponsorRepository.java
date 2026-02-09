package tn.esprit.ds.champ.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import tn.esprit.ds.champ.entities.Sponsor;

import java.util.List;

public interface SponsorRepository extends JpaRepository<Sponsor, Long> {

}

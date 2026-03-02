package tn.esprit.ds.champ.services;

import tn.esprit.ds.champ.entities.Pilote;
import tn.esprit.ds.champ.repositories.PiloteRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
@Service
@AllArgsConstructor
public class PiloteService implements IPiloteService {
    private PiloteRepository piloteRepository;

    @Override
    public Pilote ajouterPilote(Pilote pilote) {
        return piloteRepository.save(pilote);
    }
}

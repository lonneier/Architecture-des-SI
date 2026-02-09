package tn.esprit.ds.champ.services;

import tn.esprit.ds.champ.entities.Pilote;
import tn.esprit.ds.champ.repositories.PiloteRepository;

public class PiloteService implements IPiloteService {
    private PiloteRepository piloteRepository;

    @Override
    public Pilote ajouterPilote(Pilote pilote) {
        return piloteRepository.save(pilote);
    }
}

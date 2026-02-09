package tn.esprit.ds.champ.services;

import tn.esprit.ds.champ.entities.Equipe;
import tn.esprit.ds.champ.repositories.EquipeRepository;

import java.util.List;

public class EquipeService implements IEquipeService {
    private EquipeRepository equipeRepository;
    @Override
    public Equipe ajouterEquipe(Equipe equipe) {
        return equipeRepository.save(equipe);
    }
}

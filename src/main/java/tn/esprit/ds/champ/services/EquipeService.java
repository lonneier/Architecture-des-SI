package tn.esprit.ds.champ.services;

import tn.esprit.ds.champ.entities.Equipe;
import tn.esprit.ds.champ.repositories.EquipeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
@AllArgsConstructor
public class EquipeService implements IEquipeService {
    private EquipeRepository equipeRepository;
    @Override
    public Equipe ajouterEquipe(Equipe equipe) {
        return equipeRepository.save(equipe);
    }
}

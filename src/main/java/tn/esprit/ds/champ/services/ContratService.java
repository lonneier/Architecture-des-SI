package tn.esprit.ds.champ.services;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import tn.esprit.ds.champ.entities.Contrat;
import tn.esprit.ds.champ.repositories.ContratRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class ContratService implements IContratService {

    private final ContratRepository contratRepository;

    // Injection par constructeur
    public ContratService(ContratRepository contratRepository) {
        this.contratRepository = contratRepository;
    }

    @Override
    @Scheduled(cron = "0/30 * * * * *")
    public void archiverContratExpireesEtAffichageContratActifsParEquipe() {

        System.out.println("=== Vérification des contrats expirés ===");

        List<Contrat> contrats = contratRepository.findAll();
        List<Contrat> contratsArchive = new ArrayList<>();

        for (Contrat contrat : contrats) {

            if (!contrat.getArchived()
                    && Integer.parseInt(contrat.getAnnee()) < 2026) {

                contrat.setArchived(true);
                contratsArchive.add(contrat);
            }
        }

        contratRepository.saveAll(contratsArchive);

        System.out.println("Nombre de contrats archivés : " + contratsArchive.size());
    }
}
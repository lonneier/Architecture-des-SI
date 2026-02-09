package tn.esprit.ds.champ.services;

import tn.esprit.ds.champ.entities.Sponsor;
import tn.esprit.ds.champ.repositories.SponsorRepository;

import java.time.LocalDate;
import java.util.List;

public class SponsorService implements ISponsorService {
    private SponsorRepository sponsorRepository;
    @Override
    public Sponsor ajouterSponsor(Sponsor sponsor) {
        sponsor.setDateCreation(LocalDate.now());
        sponsor.setArchived(false);
        sponsor.setBloquerContrat(false);
        return sponsorRepository.save(sponsor);
    }

    @Override
    public List<Sponsor> ajouterSponsors(List<Sponsor> sponsors) {
        for (Sponsor sponsor : sponsors) {
            sponsor.setDateCreation(LocalDate.now()); // date système
            sponsor.setArchived(false);                // valeur par défaut
            sponsor.setBloquerContrat(false);           // valeur par défaut
        }
        return sponsorRepository.saveAll(sponsors);
    }

    @Override
    public Sponsor modifierSponsor(Sponsor sponsor) {
        sponsor.setDateCreation(LocalDate.now());
        return sponsorRepository.save(sponsor);
    }

    @Override
    public void supprimerSponsor(Long idSponsor) {
        sponsorRepository.deleteById(idSponsor);

    }

    @Override
    public List<Sponsor> listSponsors() {
        return sponsorRepository.findAll();
    }

    @Override
    public Sponsor recupererSponsor(Long idSponsor) {
        return sponsorRepository.findById(idSponsor).get();
    }

    @Override
    public Boolean archiverSponsor(Long idSponsor) {
        Sponsor sponsor = sponsorRepository.findById(idSponsor).orElse(null);

        if (sponsor == null) {
            return false; // sponsor introuvable
        }

        sponsor.setArchived(true); // archivage
        sponsorRepository.save(sponsor);

        return true;

    }
}

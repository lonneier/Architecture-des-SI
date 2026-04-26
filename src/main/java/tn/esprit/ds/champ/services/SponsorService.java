package tn.esprit.ds.champ.services;

import org.springframework.stereotype.Service;
import tn.esprit.ds.champ.entities.Sponsor;
import tn.esprit.ds.champ.repositories.SponsorRepository;

import java.time.LocalDate;
import java.util.List;

@Service
public class SponsorService implements ISponsorService {

    private final SponsorRepository sponsorRepository;

    // constructeur manuel
    public SponsorService(SponsorRepository sponsorRepository) {
        this.sponsorRepository = sponsorRepository;
    }

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
            sponsor.setDateCreation(LocalDate.now());
            sponsor.setArchived(false);
            sponsor.setBloquerContrat(false);
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
        return sponsorRepository.findById(idSponsor).orElse(null);
    }

    @Override
    public Boolean archiverSponsor(Long idSponsor) {
        Sponsor sponsor = sponsorRepository.findById(idSponsor).orElse(null);

        if (sponsor == null)
            return false;

        sponsor.setArchived(true);
        sponsorRepository.save(sponsor);

        return true;
    }
}


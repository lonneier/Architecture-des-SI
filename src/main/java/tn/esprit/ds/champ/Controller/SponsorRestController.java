package tn.esprit.ds.champ.Controller;

import org.springframework.web.bind.annotation.*;
import tn.esprit.ds.champ.entities.Sponsor;
import tn.esprit.ds.champ.services.ISponsorService;

import java.util.List;

@RestController
@RequestMapping("/sponsor")
public class SponsorRestController {

    private final ISponsorService sponsorService;

    // constructeur manuel
    public SponsorRestController(ISponsorService sponsorService) {
        this.sponsorService = sponsorService;
    }

    @PostMapping("/add-sponsor")
    public Sponsor addSponsor(@RequestBody Sponsor s){
        return sponsorService.ajouterSponsor(s);
    }

    @PostMapping("/add-sponsors")
    public List<Sponsor> addSponsors(@RequestBody List<Sponsor> sponsors){
        return sponsorService.ajouterSponsors(sponsors);
    }

    @PutMapping("/update-sponsor")
    public Sponsor updateSponsor(@RequestBody Sponsor s){
        return sponsorService.modifierSponsor(s);
    }

    @DeleteMapping("/delete-sponsor/{id}")
    public void deleteSponsor(@PathVariable Long id){
        sponsorService.supprimerSponsor(id);
    }

    @GetMapping("/test")
    public String test(){
        return "OK";
    }
}


package tn.esprit.ds.champ.Controller;


import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.ds.champ.entities.Sponsor;
import tn.esprit.ds.champ.services.ISponsorService;

import java.util.List;

@Tag(name = "Gestion Sponsor")
@RestController
@AllArgsConstructor
@RequestMapping("/sponsor")
public class SponsorRestController {
    ISponsorService SponsorService;

    @Operation(description = "Ajout d'un sponsor")
    @PostMapping("/add-sponsor")
    public Sponsor addSponsor(@RequestBody Sponsor s){
        return SponsorService.ajouterSponsor(s);
    }
    @Operation(description = "Ajout de plusieurs sponsors")
    @PostMapping("/add-sponsors")
    public List<Sponsor> addSponsors(@RequestBody List<Sponsor> sponsors)
    {
        return SponsorService.ajouterSponsors(sponsors);
    }
    @Operation(description = "modification d'un sponsor")
    @PutMapping("/update-sponsor")
    public Sponsor updateSponsor(@RequestBody Sponsor s){
        return SponsorService.modifierSponsor(s);
    }
    @Operation(description = "supression d'un sponsor")
    @DeleteMapping("/delete-sponsor/{id}")
    public void deleteSponsor(@PathVariable("id") Long id)
    {
        SponsorService.supprimerSponsor(id);
    }
}


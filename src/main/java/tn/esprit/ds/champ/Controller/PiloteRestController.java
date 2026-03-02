package tn.esprit.ds.champ.Controller;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.ds.champ.entities.Pilote;
import tn.esprit.ds.champ.services.IPiloteService;

@Tag(name = "Gestion Pilote")
@RestController
@AllArgsConstructor
@RequestMapping("/pilote")
public class PiloteRestController {
    IPiloteService piloteServices;

    @Operation(description = "Ajout d'un pilote")
    @PostMapping("/add-pilote")
    public String addPilote(@RequestBody Pilote p) {
        return piloteServices.ajouterPilote(p).toString();
    }

}

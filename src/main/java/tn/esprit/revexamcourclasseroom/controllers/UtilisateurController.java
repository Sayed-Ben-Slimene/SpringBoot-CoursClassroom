package tn.esprit.revexamcourclasseroom.controllers;

import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.websocket.server.PathParam;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.revexamcourclasseroom.entities.Niveau;
import tn.esprit.revexamcourclasseroom.entities.Utilisateur;
import tn.esprit.revexamcourclasseroom.services.IUtilisateurService;

@Tag(name = "utilisateur Management")
@AllArgsConstructor
@RequestMapping("/utilisateur")
@RestController
public class UtilisateurController {
     @Autowired
     IUtilisateurService iUtilisateurService;

     @PostMapping("/AjoutUtilisateur")
     public void AjouterUtilisateur(@RequestBody Utilisateur utilisateur) {
          iUtilisateurService.AjouterUtilisateur(utilisateur);
     }

     @PutMapping("/affecterUtilisateurClasse/{idUtilisateur}/{codeClasse}")
     public void affecterUtilisateurClasse(@PathParam("idutilisateur") Integer idUtilisateur ,@PathParam("codeClasse") Integer codeClasse){
          iUtilisateurService.affecterUtilisateurClasse(idUtilisateur,codeClasse);
     }

     @GetMapping("/nbUtilisateursParNiveau/{niveau}")
     public Integer nbUtilisateursParNiveau(@PathParam("niveau") Niveau niveau){
          return iUtilisateurService.nbUtilisateursParNiveau(niveau);
     }


}



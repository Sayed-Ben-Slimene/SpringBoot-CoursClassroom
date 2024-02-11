package tn.esprit.revexamcourclasseroom.controllers;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.revexamcourclasseroom.entities.Classe;
import tn.esprit.revexamcourclasseroom.services.IClasseService;

@Tag(name = "classe Management")
@AllArgsConstructor
@RequestMapping("/classe")
@RestController
public class ClasseController {
     @Autowired
     IClasseService iClasseService;

@PostMapping("/AjoutClasse")
public void AjouterClasse(@RequestBody Classe classe){
     iClasseService.AjouterClasse(classe);



}
}

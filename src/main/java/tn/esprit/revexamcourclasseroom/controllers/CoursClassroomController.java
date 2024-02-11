package tn.esprit.revexamcourclasseroom.controllers;

import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.websocket.server.PathParam;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.revexamcourclasseroom.entities.CoursClassroom;
import tn.esprit.revexamcourclasseroom.entities.Niveau;
import tn.esprit.revexamcourclasseroom.entities.Specialite;
import tn.esprit.revexamcourclasseroom.services.ICoursClassroomService;

@Tag(name = "coursClassroom Management")
@AllArgsConstructor
@RequestMapping("/coursClassroom")
@RestController
public class CoursClassroomController {
     @Autowired
     ICoursClassroomService iCoursClassroomService;

     @PostMapping("/AjoutCoursClassroom")
     public void AjouterCoursClassroom(@RequestBody CoursClassroom coursClassroom,@PathParam("codeClasse") Integer codeClasse) {
          iCoursClassroomService.AjouterCoursClassroom(coursClassroom, codeClasse);
     }
     @PutMapping("/desaffecterCoursClassroomClasse/{idCours}")
     public void desaffecterCoursClassroomClasse(@PathParam("idCours") Integer idCours){
          iCoursClassroomService.desaffecterCoursClassroomClasse(idCours);
     }

     @GetMapping("/countbysepcetcour/{sp}/{nv}")
     public Integer countbysepcetcour(@PathParam("sp") Specialite sp, @PathParam("nv") Niveau nv){
          return iCoursClassroomService.nbHeuresParSpecEtNiv(sp, nv);
     }


}


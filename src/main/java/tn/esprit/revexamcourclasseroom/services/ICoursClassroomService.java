package tn.esprit.revexamcourclasseroom.services;

import tn.esprit.revexamcourclasseroom.entities.CoursClassroom;
import tn.esprit.revexamcourclasseroom.entities.Niveau;
import tn.esprit.revexamcourclasseroom.entities.Specialite;

public interface ICoursClassroomService {
       public CoursClassroom AjouterCoursClassroom(CoursClassroom coursClassroom , Integer codeClasse);
       public void desaffecterCoursClassroomClasse(Integer idCours);
       public void archiverCoursClassrooms();
       public Integer nbHeuresParSpecEtNiv(Specialite sp, Niveau nv);

}

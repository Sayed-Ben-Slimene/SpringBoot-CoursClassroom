package tn.esprit.revexamcourclasseroom.services;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.revexamcourclasseroom.entities.Classe;
import tn.esprit.revexamcourclasseroom.entities.CoursClassroom;
import tn.esprit.revexamcourclasseroom.entities.Niveau;
import tn.esprit.revexamcourclasseroom.entities.Specialite;
import tn.esprit.revexamcourclasseroom.repository.ClasseRepository;
import tn.esprit.revexamcourclasseroom.repository.CoursClassroomRepository;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Slf4j
@Service
public class CoursClassroomService implements ICoursClassroomService {
    @Autowired
    CoursClassroomRepository coursClassroomRepository;

    @Autowired
    ClasseRepository classeRepository;

    @Override
    public CoursClassroom AjouterCoursClassroom(CoursClassroom coursClassroom ,Integer codeClasse) {
        Classe classe = classeRepository.findById(codeClasse).get();
        coursClassroom.setClasse(classe);

        return coursClassroomRepository.save(coursClassroom);
    }

    @Override
    public void desaffecterCoursClassroomClasse(Integer idCours) {
        CoursClassroom coursClassrooms = coursClassroomRepository.findById(idCours).orElse(null);
        coursClassrooms.setClasse(null);
        coursClassroomRepository.save(coursClassrooms);
    }

    @Override
    public void archiverCoursClassrooms() {

    }

    @Override
    public Integer nbHeuresParSpecEtNiv(Specialite sp, Niveau nv) {
         return coursClassroomRepository.countbysepcetcour(sp, nv);
    }
}

package tn.esprit.revexamcourclasseroom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import tn.esprit.revexamcourclasseroom.entities.CoursClassroom;
import tn.esprit.revexamcourclasseroom.entities.Niveau;
import tn.esprit.revexamcourclasseroom.entities.Specialite;

import java.util.Collection;

@Repository
public interface CoursClassroomRepository extends JpaRepository<CoursClassroom, Integer> {
    @Query("select sum(c.nbHeures) from CoursClassroom c where c.specialite in ?1 and c.classe.niveau in ?2")
    Integer countbysepcetcour(Specialite specialites, Niveau niveaus);


}
package tn.esprit.revexamcourclasseroom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.revexamcourclasseroom.entities.Niveau;
import tn.esprit.revexamcourclasseroom.entities.Utilisateur;
@Repository
public interface UtilisateurRepository extends JpaRepository<Utilisateur, Integer> {
    Integer countByClasse_Niveau(Niveau niveau);

}
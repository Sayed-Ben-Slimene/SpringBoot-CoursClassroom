package tn.esprit.revexamcourclasseroom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.revexamcourclasseroom.entities.Classe;
@Repository
public interface ClasseRepository extends JpaRepository<Classe, Integer> {
}
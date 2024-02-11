package tn.esprit.revexamcourclasseroom.services;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.revexamcourclasseroom.entities.Classe;
import tn.esprit.revexamcourclasseroom.repository.ClasseRepository;

@AllArgsConstructor
@NoArgsConstructor
@Service
public class ClasseService implements IClasseService {
    @Autowired
    ClasseRepository classeRepository;
    @Override
    public Classe AjouterClasse(Classe classe) {
        return classeRepository.save(classe);
    }
}

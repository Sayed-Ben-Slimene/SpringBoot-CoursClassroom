package tn.esprit.revexamcourclasseroom.services;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.revexamcourclasseroom.entities.Classe;
import tn.esprit.revexamcourclasseroom.entities.Niveau;
import tn.esprit.revexamcourclasseroom.entities.Utilisateur;
import tn.esprit.revexamcourclasseroom.repository.ClasseRepository;
import tn.esprit.revexamcourclasseroom.repository.UtilisateurRepository;

@AllArgsConstructor
@NoArgsConstructor
@Service
public class UtilisateurService implements IUtilisateurService {
    @Autowired
    UtilisateurRepository utilisateurRepository;
    @Autowired
    ClasseRepository classeRepository;
    @Override
    public Utilisateur AjouterUtilisateur(Utilisateur utilisateur) {
        return utilisateurRepository.save(utilisateur);
    }

    @Override
    public void affecterUtilisateurClasse(Integer idUtilisateur, Integer codeClasse) {
        Utilisateur utilisateur =utilisateurRepository.findById(idUtilisateur).orElse(null);
        Classe classe=classeRepository.findById(codeClasse).orElse(null);

        utilisateur.setClasse(classe);


        utilisateurRepository.save(utilisateur);
    }

    @Override
    public Integer nbUtilisateursParNiveau(Niveau nv) {
        return utilisateurRepository.countByClasse_Niveau(nv);
    }
}

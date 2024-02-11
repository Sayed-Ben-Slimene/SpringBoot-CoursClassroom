package tn.esprit.revexamcourclasseroom.services;

import tn.esprit.revexamcourclasseroom.entities.Niveau;
import tn.esprit.revexamcourclasseroom.entities.Utilisateur;

public interface IUtilisateurService {
       Utilisateur AjouterUtilisateur(Utilisateur utilisateur);
       public void affecterUtilisateurClasse (Integer idUtilisateur, Integer codeClasse);
       public Integer nbUtilisateursParNiveau(Niveau nv);
}

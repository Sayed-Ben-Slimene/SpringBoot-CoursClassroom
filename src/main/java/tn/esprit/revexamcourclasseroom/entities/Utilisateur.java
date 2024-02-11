package tn.esprit.revexamcourclasseroom.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Utilisateur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idUtilisateur;
    private String nom;
    private  String pernom;
    private  String password;

    @ManyToOne
    private Classe classe;

}
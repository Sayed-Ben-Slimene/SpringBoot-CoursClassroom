package tn.esprit.revexamcourclasseroom.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class CoursClassroom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCoursClassroom;
    private String nom;
    private Integer nbHeures;
    private boolean archives;

    @Enumerated(EnumType.STRING)
    private Specialite specialite;

    @ManyToOne
    private Classe classe;


}

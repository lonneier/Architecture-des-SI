package tn.esprit.ds.champ.entities;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCourse;

    private String emplacement;

    private LocalDate dateCourse;
}

package tn.esprit.ds.champ.entities;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Entity
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCourse;

    private String emplacement;

    private LocalDate dateCourse;
    @ManyToMany(mappedBy = "courses")
    private Set<championnat> championnats;
    @OneToMany(mappedBy = "course")
    private Set<Position> positions;



}

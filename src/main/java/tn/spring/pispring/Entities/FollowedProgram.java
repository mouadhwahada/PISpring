package tn.spring.pispring.Entities;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Setter
public class FollowedProgram implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String weightGoal;
    private String steps;
    private String duration;
    private String height;
    private String Neck;
    private String Waist;

    @ManyToOne
    @ToString.Exclude
    @JsonIgnore
    Workoutprogram  workoutprogramss ;


    @ManyToOne
    @ToString.Exclude
    @JsonIgnore
    User userworkout;
}

package com.example.Women.Empowerment.entity;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 
 * @author Hassireen
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class TraineeCourse {
	@Id
    @GeneratedValue
    private long id;
	@NotNull
    private int courseCode ;
    @NotNull
    private String courseName;
    private  int duration;
    private LocalDate startDate;
    private LocalDate endDate;
}

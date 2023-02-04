package com.example.Women.Empowerment.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
 * 
 * @author Anjali
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Admin {
	@Id
	@GeneratedValue
	private long id;
	@NotNull
    private String adminUsername;
	@NotNull
	@Size(min=4,max=8,message="Password does not meet the requirements")
    private String adminPassword;
}

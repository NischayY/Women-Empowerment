package com.example.Women.Empowerment.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 
 * @author Nischay
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Scheme {
	@Id
	@GeneratedValue
	private long schemeId;
	@NotNull
	private String schemeName;
	private int launchYear;
	@NotNull
	private String schemeObjective;
	private String schemeEligibility;
}

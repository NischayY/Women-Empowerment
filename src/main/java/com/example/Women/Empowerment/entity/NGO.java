package com.example.Women.Empowerment.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 
 * @author Pallavi and Anjali
 *
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class NGO {
	@Id
	@GeneratedValue
	private long id;
	@Size(max=20)
	@NotNull
    private String ngoName;
	@Size(max=40)
    private String description;
    private String address;
    private String phoneNumber;
    @NotNull
    @Pattern(regexp = "[a-zA-Z0-9]+@[a-zA-Z]+[.]{1}[a-zA-Z]+$")
    private String email;
    @NotNull
    private String website;
}

package com.example.Women.Empowerment.entity;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 
 * @author Nischay and Hassireen
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Trainee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long traineeId;
	@NotNull
	@Size(max=15,message="limit reached")
	private String firstName;
	@NotNull
	private String lastName;
	@Pattern(regexp = "[a-zA-Z0-9]+@[a-zA-Z]+[.]{1}[a-zA-Z]+$")
	private String emailId;
	private int age;
	private String occupation;
	@NotNull
	@Size(min=4,max=8,message="Password does not meet the requirements")
	private String password;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="fk_Id")
	private NGO ngo;
	
	@OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name ="fk_cid")
    private List<TraineeCourse> course;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="fk_sid")
	private List<Scheme> scheme;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_fid")
    private FeedBack feedBack;
}

/**
 * 
 */
package com.bis.gfi.entities;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.bis.gfi.enums.Gender;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author Obi
 *
 */
@Entity
@Getter
@Setter
@ToString
@Table(name="User_Profile")
public class UserProfile extends BaseEntity {
	
	private static final long serialVersionUID = 1L;

	@Column(name = "FIRST_NAME", nullable = false)
	private String firstName;
	
	@Column(name = "MIDDLE_NAME", nullable = true)
	private String middleName;
	
	@Column(name = "LAST_NAME", nullable = false)
	private String lastName;
	
	@Column(name = "PHONE_NUMBER", nullable = true)
	private String phoneNumber;
	
	@Column(name = "EMAIL", nullable = true, unique = true)
	private String email;
	
	@Column(name = "PASSWORD", nullable = true)
	private String password;
	
	@Column(name = "AGE", nullable = true)
	private Integer age;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "DATE_OF_BIRTH", nullable = true)
	private Date dateOfBirth;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "GENDER", nullable = true)
	private Gender gender;
	
	@Column(name = "PICTURE_URL", nullable = true)
	private String pictureUrl;
	
	@Column(name = "PASSWORD_RESET", nullable = true)
	private boolean passwordReset;
	
	@Lob
	@Column(name = "ABOUT_ME", nullable = true)
	private String aboutMe;
	
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "user")
	private Set<UserRole> userRoles;
	
	public String getFirstAndLastName() {
		if (firstName == null || lastName == null) {
			return null;
		}
		return firstName + " " + lastName;
	}
	
}

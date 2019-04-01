/**
 * 
 */
package com.bis.gfi.entities;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

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
@Table(name="User_Role", uniqueConstraints = @UniqueConstraint(columnNames = { "user_profile_fk", "role_fk" }))
public class UserRole extends BaseEntity {

	private static final long serialVersionUID = 2781876275458961596L;

	@ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "USER_PROFILE_FK")
	private UserProfile user;
	
	@ManyToOne(optional = false)
    @JoinColumn(name = "ROLE_FK")
	private Role role;
	
}

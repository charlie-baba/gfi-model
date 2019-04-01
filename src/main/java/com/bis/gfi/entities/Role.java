/**
 * 
 */
package com.bis.gfi.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

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
@Table(name="Role")
public class Role extends BaseEntity {

	private static final long serialVersionUID = 8351305251243032255L;

	@Column(name = "NAME", nullable = false, unique = true)
	private String name;
	
	@Column(name = "DESCRIPTION", nullable = true)
	private String description;
}

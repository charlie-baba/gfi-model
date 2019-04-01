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
@Table(name="Project_Category")
public class ProjectCategory extends BaseEntity {
	
	private static final long serialVersionUID = 4857672978449040863L;

	@Column(name = "name", unique = true, nullable = false)
	private String name;
	
	@Column(name = "description", nullable = true)
	private String description;
	
}

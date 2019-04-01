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
@Table(name="Settings")
public class Settings extends BaseEntity {

	private static final long serialVersionUID = 9094313800013602829L;

	@Column(name = "NAME", nullable = false, unique = true)
	private String name;

	@Column(name = "VALUE", nullable = false)
	private String value;
	
	@Column(name = "DESCRIPTION", nullable = true)
	private String description;

}

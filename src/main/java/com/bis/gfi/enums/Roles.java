/**
 * 
 */
package com.bis.gfi.enums;

import lombok.Getter;

/**
 * @author Obi
 *
 */
public enum Roles {

	SYSTEM("System Admin/God Mode"), //*winks
	ADMIN("Administrator"),
	SUPPORT("Customer Support"),
	USER("USER");
	
	private Roles(String description) {
		this.description = description;
	}
	
	@Getter
	private String description;
}

/**
 * 
 */
package com.bis.gfi.enums;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Obi
 *
 */
public enum ActivityType {

	CREATE_GROUP("You created a new group"),
	EDIT_GROUP("You edited "),
	DEACTIVATE_GROUP("You deactivated "),
	ACTIVATE_GROUP("You activated "),
	CREATE_PROJECT("You created a new project"),
	EDIT_PROJECT("You edited "),
	PUBLISH_PROJECT("You published "),
	DEACTIVATE_PROJECT("You deactivated "),
	DONATE_TO_PROJECT("You donated to "),
	DEACTIVATE_USER("You deactivated the user "),
	ACTIVATE_USER("You activated the user "),
	UPDATE_PROFILE("You updated your profile"),
	UPDATE_SETTING("You updated the application settings"),
	PAYOUT_PROJECT("You paid out the donations for "),
	;
	
	@Getter
	@Setter
	private String description;
	
	private ActivityType(String description) {
		this.description = description;
	}
	
}

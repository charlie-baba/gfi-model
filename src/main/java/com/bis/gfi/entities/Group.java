/**
 * 
 */
package com.bis.gfi.entities;

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
import javax.persistence.UniqueConstraint;

import com.bis.gfi.enums.ChargeBearer;
import com.bis.gfi.enums.GroupCategory;

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
@Table(name="Group", uniqueConstraints = @UniqueConstraint(columnNames = { "name", "created_by" }))
public class Group extends BaseEntity {
	
	private static final long serialVersionUID = 1301578454997498468L;

	@Column(name = "NAME", nullable = false)
	private String name;
	
	@Lob
	@Column(name = "DESCRIPTION")
	private String description;
	
	@Column(name = "LOGO", nullable = true)
	private byte[] logo;
	
	@Column(name = "BASE64_IMAGE", nullable = true, columnDefinition = "TEXT")
	private String base64Image;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "CATEGORY", nullable = true)
	private GroupCategory category;
	
	@Column(name = "FUND_AVAILABILITY_INTERVAL", nullable = true)
	private Integer fundAvailabilityDuration;
	
	@Column(name = "PRIVATE_GROUP", nullable = false, columnDefinition = "boolean default true")
	private boolean privateGroup;
	
	@Column(name = "TARGET_AMOUNT", nullable = true)
	private Double targetAmount;
	
	@Column(name = "ALLOW_ANONYMOUS_DONATIONS", nullable = false, columnDefinition = "boolean default true")
	private boolean allowAnonymousDonations;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "CHARGE_BEARER", nullable = true)
	private ChargeBearer chargeBearer;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "group")
	private Set<GroupBank> groupBanks;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "group")
	private Set<Project> projects;
}

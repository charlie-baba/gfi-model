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
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.bis.gfi.enums.ChargeBearer;

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
@Table(name="Project")
public class Project extends BaseEntity {

	private static final long serialVersionUID = 7967270039492843710L;

	@Column(name = "NAME", nullable = false)
	private String name;

	@Column(name = "DESCRIPTION", nullable = true, columnDefinition = "TEXT")
	private String description;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "START_DATE", nullable = true, insertable = true, updatable = true)
	private Date startDate;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "END_DATE", nullable = true, insertable = true, updatable = true)
	private Date endDate;
	
	@Column(name = "PRIVATE_PROJECT", nullable = false, columnDefinition = "boolean default true")
	private boolean privateProject;

	@Lob
	@Column(name = "PROJECT_IMAGES")
	private String projectImages;
	
	@Column(name = "TARGET_AMOUNT")
	private Double targetAmount;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "CHARGE_BEARER", nullable = false)
	private ChargeBearer chargeBearer;
	
	@ManyToOne(fetch = FetchType.EAGER, optional = true)
    @JoinColumn(name = "CATEGORY_FK", nullable = true)
    private ProjectCategory category;
	
	@Column(name = "LINK", nullable = true)
	private String link;
	
	@Column(name = "COMPLETED", nullable = false, columnDefinition = "boolean default false")
	private boolean completed;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = true)
    @JoinColumn(name = "GROUP_FK", nullable = false)
    private Group group;
	
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "project")
	private Set<ProjectBank> projectBanks;
}

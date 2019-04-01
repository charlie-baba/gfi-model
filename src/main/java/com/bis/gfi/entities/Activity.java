/**
 * 
 */
package com.bis.gfi.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.bis.gfi.enums.ActivityType;

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
@Table(name="Activity")
public class Activity extends BaseEntity {

	private static final long serialVersionUID = -8739253497177049850L;

	@Column(name = "title", nullable = false)
    private String title;

	@Column(name = "performed_by", nullable = false)
	private String performedBy;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "type", nullable = false)
	private ActivityType type;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "date_performed", nullable = false)
	private Date datePerformed;
	
}

/**
 * 
 */
package com.bis.gfi.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.bis.gfi.enums.MemberStatus;

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
@Table(name="Group_Members")
public class GroupMembers extends BaseEntity {

	private static final long serialVersionUID = -3945971976196522350L;

	@Column(name = "EMAIL", nullable = false)
	private String email;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "STATUS", nullable = false)
	private MemberStatus status;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = true)
    @JoinColumn(name = "GROUP_FK", nullable = false)
	private Group group;
	
}

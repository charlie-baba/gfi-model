/**
 * 
 */
package com.bis.gfi.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name="Group_Bank")
public class GroupBank extends BaseEntity {
	
	private static final long serialVersionUID = 7165660871752006413L;

	@Column(name = "ACCOUNT_NUMBER", nullable = false)
    private String accountNumber;

    @Column(name = "ACCOUNT_NAME", nullable = true)
    private String accountName;

    @Column(nullable = false, name = "PRIMARY_ACCOUNT", columnDefinition = "boolean default false")
    private boolean primaryAccount;
    
    @ManyToOne(optional = true)
    @JoinColumn(name = "GROUP_FK", nullable = false)
    private Group group;
    
    @ManyToOne(fetch = FetchType.EAGER, optional = true)
    @JoinColumn(name = "BANK_FK", nullable = false)
    private Bank bank;
    
}

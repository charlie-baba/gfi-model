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
@Table(name="Project_Bank")
public class ProjectBank extends BaseEntity {
	
	private static final long serialVersionUID = -2066677592826231867L;

	@Column(name = "ACCOUNT_NUMBER", nullable = false)
    private String accountNumber;

    @Column(name = "ACCOUNT_NAME", nullable = true)
    private String accountName;

    @Column(nullable = false, name = "PRIMARY_ACCOUNT", columnDefinition = "boolean default false")
    private boolean primaryAccount;
    
    @ManyToOne(optional = true)
    @JoinColumn(name = "PROJECT_FK", nullable = false)
    private Project project;
    
    @ManyToOne(fetch = FetchType.EAGER, optional = true)
    @JoinColumn(name = "BANK_FK", nullable = false)
    private Bank bank;
    
}

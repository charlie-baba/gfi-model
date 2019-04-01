/**
 * 
 */
package com.bis.gfi.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.bis.gfi.enums.TransactionStatus;
import com.bis.gfi.enums.TransactionType;

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
@Table(name="Transaction")
public class Transaction extends BaseEntity {

	private static final long serialVersionUID = -7131074532461987282L;

	@Column(name = "EMAIL", nullable = true)
	private String email;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "TRANSACTION_TYPE", nullable = false)
	private TransactionType transactionType;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "TRANSACTION_STATUS", nullable = false)
	private TransactionStatus status;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DATE", nullable = false)
	private Date date;
	
	@Column(name = "AMOUNT", nullable = false)
	private Double amount;
	
	@Column(name = "TRANSACTION_CHARGE", nullable = false)
	private Double transactionCharge;
	
	@Column(name = "TOTAL_AMOUNT", nullable = false)
	private Double totalAmount;
	
	@Column(name = "ACCESS_CODE", nullable = true, length = 512)
	private String accessCode;
	
	@Column(name = "TRANSACTION_REF", unique = true, nullable = false)
	private String transactionRef;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = true)
    @JoinColumn(name = "PROJECT_FK", nullable = false)
    private Project project;
	
}

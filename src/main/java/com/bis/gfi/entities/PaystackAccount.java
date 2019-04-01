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
@Table(name="Paystack_Account")
public class PaystackAccount extends BaseEntity {

	private static final long serialVersionUID = -1342428026898622364L;

	@Column(name = "name", nullable = true)
	private String name;
	
	@Column(name = "description", nullable = true)
	private String description;

	@Column(name = "account_number", nullable = false)
	private String accountNumber;

	@Column(name = "bank_name", nullable = true)
	private String bankName;

	@Column(name = "bank_code", nullable = false)
	private String bankCode;

	@Column(name = "currency", nullable = true)
	private String currency;

	@Column(name = "recipient_code", nullable = false)
	private String recipientCode;
	
	@Column(name = "paystack_id", nullable = true)
	private Integer paystackId;
	
}

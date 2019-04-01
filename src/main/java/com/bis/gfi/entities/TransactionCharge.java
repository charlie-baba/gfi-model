/**
 * 
 */
package com.bis.gfi.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

import com.bis.gfi.enums.DonationChargeType;

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
@Table(name="Transaction_Charge")
public class TransactionCharge extends BaseEntity {

	private static final long serialVersionUID = -345962207461211312L;

	@Enumerated(EnumType.STRING)
	@Column(name = "charge_type", nullable = false, unique = true)
	private DonationChargeType chargeType;
	
	@Column(name = "flat_amount", nullable = true)
	private Double flatAmount;

	@Column(name = "percentage_amount", nullable = true)
	private Double percentageAmount;

}

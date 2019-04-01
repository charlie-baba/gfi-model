/**
 * 
 */
package com.bis.gfi.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.bis.gfi.enums.SocialNetworkType;

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
@Table(name="Social_Network_Detail", uniqueConstraints = @UniqueConstraint(columnNames = { "user_id", "social_network_type" }))
public class SocialNetworkDetail extends BaseEntity {

	private static final long serialVersionUID = -8822131700371068247L;

	@Column(name = "EMAIL", nullable = true)
    private String email;
	
	@Column(name = "USERNAME", nullable = true)
    private String username;
	
    @Column(name = "USER_ID", nullable = false)
    private String userId;
	
    @Enumerated(EnumType.STRING)
    @Column(name = "SOCIAL_NETWORK_TYPE", nullable = false)
    private SocialNetworkType socialNetworkType;

    @Column(name = "PROFILE_URL", nullable = true)
    private String profileUrl;

    @Column(name = "IMAGE_URL", nullable = true)
    private String imageUrl;
    
    @ManyToOne(optional = true)
    @JoinColumn(name = "USER_PROFILE_FK", nullable = false)
	private UserProfile user;
	
}

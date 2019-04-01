/**
 * 
 */
package com.bis.gfi.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Obi
 *
 */
@Getter
@Setter
@MappedSuperclass
public abstract class BaseEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false, insertable = true, updatable = false)
    private Long id;

	@Column(name = "ACTIVE", nullable = false, insertable = true, updatable = true)
    private boolean active = true;

    @Column(name = "DELETED", nullable = false, insertable = true, updatable = true)
    private boolean deleted = false;

    @Column(name = "CREATE_DATE", nullable = false, insertable = true, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date createDate = new Date();

    @Column(name = "LAST_MODIFIED", nullable = true, insertable = true, updatable = true)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastModified = new Date();

    @Column(nullable = true, name = "LAST_UPDATED_BY")
    private String lastUpdatedBy;
    
    @Column(nullable = true, name = "CREATED_BY")
    private String createdBy;
    
}

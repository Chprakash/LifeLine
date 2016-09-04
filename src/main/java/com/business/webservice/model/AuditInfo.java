package com.business.webservice.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author prakash
 *This class will be an embeddable entity for all the model classes
 */
@Embeddable
public class AuditInfo {
	
	@Column(name="CREATED_DATE", nullable=true)
	private Date createdDate;

	@Column(name="LAST_UPDATED_DATE", nullable=true)
	private Date lastUpdatedDate;

	@Column(name="CREATED_BY", nullable=true)
	private Integer createdBy;
	
	/**
	 * As per the javadoc of NotEmpty, Integer is not a valid type for it to check. 
	 * It's for Strings and collections. If you just want to make sure an Integer has some value, 
	 * javax.validation.constraints.NotNull is all you need.
	 * 
	 */
	//@NotNull
	@Column(name="UPDATED_BY", nullable=true)
	private Integer updatedBy;

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getLastUpdatedDate() {
		return lastUpdatedDate;
	}

	public void setLastUpdatedDate(Date lastUpdatedDate) {
		this.lastUpdatedDate = lastUpdatedDate;
	}

	public Integer getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Integer createdBy) {
		this.createdBy = createdBy;
	}

	public Integer getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(Integer updatedBy) {
		this.updatedBy = updatedBy;
	}

	

}

package com.business.webservice.model;

// Generated 23 Aug, 2015 2:38:46 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Images generated by hbm2java
 */
@Entity
@Table(name = "images", catalog = "d2dshopping")
public class Images implements java.io.Serializable {

	private int imageid;
	private String imagename;
	private String imageurl;
	private Integer productid;
	private Date createddate;
	private Date updateddate;
	private String createdby;
	private String updatedby;

	public Images() {
	}

	public Images(int imageid) {
		this.imageid = imageid;
	}

	public Images(int imageid, String imagename, String imageurl,
			Integer productid, Date createddate, Date updateddate,
			String createdby, String updatedby) {
		this.imageid = imageid;
		this.imagename = imagename;
		this.imageurl = imageurl;
		this.productid = productid;
		this.createddate = createddate;
		this.updateddate = updateddate;
		this.createdby = createdby;
		this.updatedby = updatedby;
	}

	@Id
	@Column(name = "imageid", unique = true, nullable = false)
	public int getImageid() {
		return this.imageid;
	}

	public void setImageid(int imageid) {
		this.imageid = imageid;
	}

	@Column(name = "imagename", length = 50)
	public String getImagename() {
		return this.imagename;
	}

	public void setImagename(String imagename) {
		this.imagename = imagename;
	}

	@Column(name = "imageurl", length = 50)
	public String getImageurl() {
		return this.imageurl;
	}

	public void setImageurl(String imageurl) {
		this.imageurl = imageurl;
	}

	@Column(name = "productid")
	public Integer getProductid() {
		return this.productid;
	}

	public void setProductid(Integer productid) {
		this.productid = productid;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "createddate", length = 19)
	public Date getCreateddate() {
		return this.createddate;
	}

	public void setCreateddate(Date createddate) {
		this.createddate = createddate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "updateddate", length = 19)
	public Date getUpdateddate() {
		return this.updateddate;
	}

	public void setUpdateddate(Date updateddate) {
		this.updateddate = updateddate;
	}

	@Column(name = "createdby", length = 50)
	public String getCreatedby() {
		return this.createdby;
	}

	public void setCreatedby(String createdby) {
		this.createdby = createdby;
	}

	@Column(name = "updatedby", length = 50)
	public String getUpdatedby() {
		return this.updatedby;
	}

	public void setUpdatedby(String updatedby) {
		this.updatedby = updatedby;
	}

}

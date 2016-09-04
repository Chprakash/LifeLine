package com.business.webservice.model;
// default package
// Generated Sep 2, 2016 8:41:01 AM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

/**
 * Applogincredentials generated by hbm2java
 */
@Entity
@Table(name = "applogincredentials", catalog = "business")
public class Applogincredentials implements java.io.Serializable {

	private Integer appid;
	private Integer version;
	private String loginid;
	private String password;
	private Date createddate;
	private Date lastupdateddate;
	private String createdby;
	private String updatedby;
	private Integer status;
	private Set<Businesssrc> businesssrcs = new HashSet<Businesssrc>(0);

	public Applogincredentials() {
	}

	public Applogincredentials(String password) {
		this.password = password;
	}

	public Applogincredentials(String loginid, String password,
			Date createddate, Date lastupdateddate, String createdby,
			String updatedby, Integer status, Set<Businesssrc> businesssrcs) {
		this.loginid = loginid;
		this.password = password;
		this.createddate = createddate;
		this.lastupdateddate = lastupdateddate;
		this.createdby = createdby;
		this.updatedby = updatedby;
		this.status = status;
		this.businesssrcs = businesssrcs;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "Appid", unique = true, nullable = false)
	public Integer getAppid() {
		return this.appid;
	}

	public void setAppid(Integer appid) {
		this.appid = appid;
	}

	@Version
	@Column(name = "version")
	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	@Column(name = "loginid", length = 50)
	public String getLoginid() {
		return this.loginid;
	}

	public void setLoginid(String loginid) {
		this.loginid = loginid;
	}

	@Column(name = "password", nullable = false, length = 50)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
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
	@Column(name = "lastupdateddate", length = 19)
	public Date getLastupdateddate() {
		return this.lastupdateddate;
	}

	public void setLastupdateddate(Date lastupdateddate) {
		this.lastupdateddate = lastupdateddate;
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

	@Column(name = "status")
	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "applogincredentials")
	public Set<Businesssrc> getBusinesssrcs() {
		return this.businesssrcs;
	}

	public void setBusinesssrcs(Set<Businesssrc> businesssrcs) {
		this.businesssrcs = businesssrcs;
	}

}
package com.business.webservice.model;
// default package
// Generated Sep 2, 2016 8:41:01 AM by Hibernate Tools 3.4.0.CR1

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

/**
 * Consumers generated by hbm2java
 */
@Entity
@Table(name = "consumers", catalog = "business")
public class Consumers implements java.io.Serializable {

	private Integer consumerid;
	private Integer version;
	private User user;
	private String title;
	private String firstname;
	private String middlename;
	private String lastname;
	private Date createddate;
	private Date lastupdateddate;
	private String createdby;
	private String updatedby;
	private Boolean loggedin;
	private Date lastLoggedon;

	public Consumers() {
	}

	public Consumers(String firstname, Date createddate, Date lastupdateddate) {
		this.firstname = firstname;
		this.createddate = createddate;
		this.lastupdateddate = lastupdateddate;
	}

	public Consumers(User user, String title, String firstname,
			String middlename, String lastname, Date createddate,
			Date lastupdateddate, String createdby, String updatedby,
			Boolean loggedin, Date lastLoggedon) {
		this.user = user;
		this.title = title;
		this.firstname = firstname;
		this.middlename = middlename;
		this.lastname = lastname;
		this.createddate = createddate;
		this.lastupdateddate = lastupdateddate;
		this.createdby = createdby;
		this.updatedby = updatedby;
		this.loggedin = loggedin;
		this.lastLoggedon = lastLoggedon;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "consumerid", unique = true, nullable = false)
	public Integer getConsumerid() {
		return this.consumerid;
	}

	public void setConsumerid(Integer consumerid) {
		this.consumerid = consumerid;
	}

	@Version
	@Column(name = "version")
	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "userid")
	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Column(name = "title", length = 10)
	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Column(name = "firstname", nullable = false, length = 50)
	public String getFirstname() {
		return this.firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	@Column(name = "middlename", length = 50)
	public String getMiddlename() {
		return this.middlename;
	}

	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}

	@Column(name = "lastname", length = 50)
	public String getLastname() {
		return this.lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "createddate", nullable = false, length = 19)
	public Date getCreateddate() {
		return this.createddate;
	}

	public void setCreateddate(Date createddate) {
		this.createddate = createddate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "lastupdateddate", nullable = false, length = 19)
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

	@Column(name = "loggedin")
	public Boolean getLoggedin() {
		return this.loggedin;
	}

	public void setLoggedin(Boolean loggedin) {
		this.loggedin = loggedin;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "lastLoggedon", length = 19)
	public Date getLastLoggedon() {
		return this.lastLoggedon;
	}

	public void setLastLoggedon(Date lastLoggedon) {
		this.lastLoggedon = lastLoggedon;
	}

}
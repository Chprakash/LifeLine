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
import javax.persistence.UniqueConstraint;
import javax.persistence.Version;

/**
 * User generated by hbm2java
 */
@Entity
@Table(name = "user", catalog = "business", uniqueConstraints = @UniqueConstraint(columnNames = "email_id"))
public class User implements java.io.Serializable {

	private Long id;
	private Integer version;
	private String emailId;
	private String password;
	private Date createdDate;
	private Date lastUpdatedDate;
	private Long createdBy;
	private Long updatedBy;
	private Boolean active;
	private String previousPassword;
	private Boolean locked;
	private Date lastPasswordChangedOn;
	private Set<Consumercontact> consumercontacts = new HashSet<Consumercontact>(0);
	private Set<Otp> otps = new HashSet<Otp>(0);
	private Set<UserRole> userRoles = new HashSet<UserRole>(0);
	private Set<Businesssrc> businesssrcs = new HashSet<Businesssrc>(0);
	private Set<Consumers> consumerses = new HashSet<Consumers>(0);

	public User() {
	}

	public User(String emailId, String password) {
		this.emailId = emailId;
		this.password = password;
	}

	public User(String emailId, String password, Date createdDate,
			Date lastUpdatedDate, Long createdBy, Long updatedBy, String name,
			Boolean active, String previousPassword, Boolean locked,
			Date lastPasswordChangedOn, Set<Consumercontact> consumercontacts,
			Set<Otp> otps, Set<UserRole> userRoles,
			Set<Businesssrc> businesssrcs, Set<Consumers> consumerses) {
		this.emailId = emailId;
		this.password = password;
		this.createdDate = createdDate;
		this.lastUpdatedDate = lastUpdatedDate;
		this.createdBy = createdBy;
		this.updatedBy = updatedBy;
		this.active = active;
		this.previousPassword = previousPassword;
		this.locked = locked;
		this.lastPasswordChangedOn = lastPasswordChangedOn;
		this.consumercontacts = consumercontacts;
		this.otps = otps;
		this.userRoles = userRoles;
		this.businesssrcs = businesssrcs;
		this.consumerses = consumerses;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Version
	@Column(name = "version")
	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	@Column(name = "email_id", unique = true, nullable = false, length = 50)
	public String getEmailId() {
		return this.emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	@Column(name = "password", nullable = false, length = 100)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created_date", length = 19)
	public Date getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "last_updated_date", length = 19)
	public Date getLastUpdatedDate() {
		return this.lastUpdatedDate;
	}

	public void setLastUpdatedDate(Date lastUpdatedDate) {
		this.lastUpdatedDate = lastUpdatedDate;
	}

	@Column(name = "created_by")
	public Long getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(Long createdBy) {
		this.createdBy = createdBy;
	}

	@Column(name = "updated_by")
	public Long getUpdatedBy() {
		return this.updatedBy;
	}

	public void setUpdatedBy(Long updatedBy) {
		this.updatedBy = updatedBy;
	}

	@Column(name = "active")
	public Boolean getActive() {
		return this.active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	@Column(name = "previous_password", length = 100)
	public String getPreviousPassword() {
		return this.previousPassword;
	}

	public void setPreviousPassword(String previousPassword) {
		this.previousPassword = previousPassword;
	}

	@Column(name = "locked")
	public Boolean getLocked() {
		return this.locked;
	}

	public void setLocked(Boolean locked) {
		this.locked = locked;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "last_password_changed_on", length = 19)
	public Date getLastPasswordChangedOn() {
		return this.lastPasswordChangedOn;
	}

	public void setLastPasswordChangedOn(Date lastPasswordChangedOn) {
		this.lastPasswordChangedOn = lastPasswordChangedOn;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	public Set<Consumercontact> getConsumercontacts() {
		return this.consumercontacts;
	}

	public void setConsumercontacts(Set<Consumercontact> consumercontacts) {
		this.consumercontacts = consumercontacts;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	public Set<Otp> getOtps() {
		return this.otps;
	}

	public void setOtps(Set<Otp> otps) {
		this.otps = otps;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	public Set<UserRole> getUserRoles() {
		return this.userRoles;
	}

	public void setUserRoles(Set<UserRole> userRoles) {
		this.userRoles = userRoles;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	public Set<Businesssrc> getBusinesssrcs() {
		return this.businesssrcs;
	}

	public void setBusinesssrcs(Set<Businesssrc> businesssrcs) {
		this.businesssrcs = businesssrcs;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	public Set<Consumers> getConsumerses() {
		return this.consumerses;
	}

	public void setConsumerses(Set<Consumers> consumerses) {
		this.consumerses = consumerses;
	}

}
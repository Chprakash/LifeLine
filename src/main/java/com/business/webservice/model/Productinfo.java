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
 * Productinfo generated by hbm2java
 */
@Entity
@Table(name = "productinfo", catalog = "d2dshopping")
public class Productinfo implements java.io.Serializable {

	private int productid;
	private String productname;
	private Integer busisrcid;
	private Integer category;
	private Integer subcategory;
	private Integer userid;
	private Integer quantity;
	private Integer price;
	private Integer specificationid;
	private String summery;
	private Integer discount;
	private Date expeclastsaledate;
	private Date ceateddate;
	private Date updateddae;
	private String createdby;
	private String updatedby;
	private Integer popularity;
	private Integer brandid;

	public Productinfo() {
	}

	public Productinfo(int productid) {
		this.productid = productid;
	}

	public Productinfo(int productid, String productname, Integer busisrcid,
			Integer category, Integer subcategory, Integer userid,
			Integer quantity, Integer price, Integer specificationid,
			String summery, Integer discount, Date expeclastsaledate,
			Date ceateddate, Date updateddae, String createdby,
			String updatedby, Integer popularity, Integer brandid) {
		this.productid = productid;
		this.productname = productname;
		this.busisrcid = busisrcid;
		this.category = category;
		this.subcategory = subcategory;
		this.userid = userid;
		this.quantity = quantity;
		this.price = price;
		this.specificationid = specificationid;
		this.summery = summery;
		this.discount = discount;
		this.expeclastsaledate = expeclastsaledate;
		this.ceateddate = ceateddate;
		this.updateddae = updateddae;
		this.createdby = createdby;
		this.updatedby = updatedby;
		this.popularity = popularity;
		this.brandid = brandid;
	}

	@Id
	@Column(name = "productid", unique = true, nullable = false)
	public int getProductid() {
		return this.productid;
	}

	public void setProductid(int productid) {
		this.productid = productid;
	}

	@Column(name = "productname", length = 50)
	public String getProductname() {
		return this.productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	@Column(name = "busisrcid")
	public Integer getBusisrcid() {
		return this.busisrcid;
	}

	public void setBusisrcid(Integer busisrcid) {
		this.busisrcid = busisrcid;
	}

	@Column(name = "category")
	public Integer getCategory() {
		return this.category;
	}

	public void setCategory(Integer category) {
		this.category = category;
	}

	@Column(name = "subcategory")
	public Integer getSubcategory() {
		return this.subcategory;
	}

	public void setSubcategory(Integer subcategory) {
		this.subcategory = subcategory;
	}

	@Column(name = "userid")
	public Integer getUserid() {
		return this.userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	@Column(name = "quantity")
	public Integer getQuantity() {
		return this.quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	@Column(name = "price")
	public Integer getPrice() {
		return this.price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	@Column(name = "specificationid")
	public Integer getSpecificationid() {
		return this.specificationid;
	}

	public void setSpecificationid(Integer specificationid) {
		this.specificationid = specificationid;
	}

	@Column(name = "summery", length = 65535)
	public String getSummery() {
		return this.summery;
	}

	public void setSummery(String summery) {
		this.summery = summery;
	}

	@Column(name = "discount")
	public Integer getDiscount() {
		return this.discount;
	}

	public void setDiscount(Integer discount) {
		this.discount = discount;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "expeclastsaledate", length = 19)
	public Date getExpeclastsaledate() {
		return this.expeclastsaledate;
	}

	public void setExpeclastsaledate(Date expeclastsaledate) {
		this.expeclastsaledate = expeclastsaledate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ceateddate", length = 19)
	public Date getCeateddate() {
		return this.ceateddate;
	}

	public void setCeateddate(Date ceateddate) {
		this.ceateddate = ceateddate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "updateddae", length = 19)
	public Date getUpdateddae() {
		return this.updateddae;
	}

	public void setUpdateddae(Date updateddae) {
		this.updateddae = updateddae;
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

	@Column(name = "popularity")
	public Integer getPopularity() {
		return this.popularity;
	}

	public void setPopularity(Integer popularity) {
		this.popularity = popularity;
	}

	@Column(name = "brandid")
	public Integer getBrandid() {
		return this.brandid;
	}

	public void setBrandid(Integer brandid) {
		this.brandid = brandid;
	}

}

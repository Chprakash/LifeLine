package com.business.webservice.DTO;

import org.springframework.stereotype.Component;

@Component
public class BusinesssrcDTO implements java.io.Serializable {
	private Integer busiSrcId;
	private Integer busiTypeid;
	private String busiName;
	private Integer appid;
	private Integer acstatus;
	private String pancardNo;
	private String adharCardNo;
	private Long userid;
	
	
	public Integer getBusiSrcId() {
		return busiSrcId;
	}
	public void setBusiSrcId(Integer busiSrcId) {
		this.busiSrcId = busiSrcId;
	}
	public Integer getBusiTypeid() {
		return busiTypeid;
	}
	public void setBusiTypeid(Integer busiTypeid) {
		this.busiTypeid = busiTypeid;
	}
	public String getBusiName() {
		return busiName;
	}
	public void setBusiName(String busiName) {
		this.busiName = busiName;
	}
	public Integer getAppid() {
		return appid;
	}
	public void setAppid(Integer appid) {
		this.appid = appid;
	}
	public Integer getAcstatus() {
		return acstatus;
	}
	public void setAcstatus(Integer acstatus) {
		this.acstatus = acstatus;
	}
	public String getPancardNo() {
		return pancardNo;
	}
	public void setPancardNo(String pancardNo) {
		this.pancardNo = pancardNo;
	}
	public String getAdharCardNo() {
		return adharCardNo;
	}
	public void setAdharCardNo(String adharCardNo) {
		this.adharCardNo = adharCardNo;
	}
	public Long getUserid() {
		return userid;
	}
	public void setUserid(Long userid) {
		this.userid = userid;
	}
}

package com.eBookingCn.po;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
//@XmlRootElement(name = "ConsignAddCompleteResult")
@XmlRootElement(name = "ConsignAddCompleteCoverResult")
public class ConsignAddCompleteResult {
	
	//返回码，成功=0000
	@XmlElement
	private String retCode;
	//返回信息
	@XmlElement
	private String retMsg;
	//订单号
	@XmlElement
	private String consNo;
	//账单号
	@XmlElement
	private String billNo;
	//返回时间
	@XmlElement
	private String retTime;
	//remarks
	@XmlElement
	private String remarks;
	
	private String sourceId;
	public String getRetCode() {
		return retCode;
	}
	public void setRetCode(String retCode) {
		this.retCode = retCode;
	}
	public String getRetMsg() {
		return retMsg;
	}
	public void setRetMsg(String retMsg) {
		this.retMsg = retMsg;
	}
	public String getConsNo() {
		return consNo;
	}
	public void setConsNo(String consNo) {
		this.consNo = consNo;
	}
	public String getBillNo() {
		return billNo;
	}
	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}
	public String getRetTime() {
		return retTime;
	}
	public void setRetTime(String retTime) {
		this.retTime = retTime;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public String getSourceId() {
		return sourceId;
	}
	public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
	}
	
}

package com.eBookingCn.po;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)  
public class ServiceInfo{
	//拖车服务(true)
	@XmlElement
	private String trackServiceFlag;
	//报关服务(true)
	@XmlElement
	private String customServiceFlag;
	//仓储服务(true)
	@XmlElement
	private String warehouseServiceFlag;
	//报检服务(true)
	@XmlElement
	private String inspectionServiceFlag;
	//保险服务(true)
	@XmlElement
	private String insuranceServiceFlag;
	
	public String getTrackServiceFlag() {
		return trackServiceFlag;
	}
	public void setTrackServiceFlag(String trackServiceFlag) {
		this.trackServiceFlag = trackServiceFlag;
	}
	public String getCustomServiceFlag() {
		return customServiceFlag;
	}
	public void setCustomServiceFlag(String customServiceFlag) {
		this.customServiceFlag = customServiceFlag;
	}
	public String getWarehouseServiceFlag() {
		return warehouseServiceFlag;
	}
	public void setWarehouseServiceFlag(String warehouseServiceFlag) {
		this.warehouseServiceFlag = warehouseServiceFlag;
	}
	public String getInspectionServiceFlag() {
		return inspectionServiceFlag;
	}
	public void setInspectionServiceFlag(String inspectionServiceFlag) {
		this.inspectionServiceFlag = inspectionServiceFlag;
	}
	public String getInsuranceServiceFlag() {
		return insuranceServiceFlag;
	}
	public void setInsuranceServiceFlag(String insuranceServiceFlag) {
		this.insuranceServiceFlag = insuranceServiceFlag;
	}
}

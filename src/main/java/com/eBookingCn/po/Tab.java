package com.eBookingCn.po;

import java.util.Date;

public class Tab {
	//运费条款
	private String consPaymentTerm;;
	//运输条款
	private String consTransTerm;
	//装货港 
	private String polNameEn;
	//中转港
	private String potNameEn;
	//卸货港 
	private String podNameEn;
	//船名(true)
	private String vessel;
	//航次(true)
	private String voyage;
	//船公司名称
	private String carrierName;
	//开航日期 
	private Date etd;
	//提单号(false)
	private String mblNo;
	//货物件数 
	private String cargoPackages;
	//毛重 单位：kg 2位小数 
	private String cargoGrossWeight;
	//体积 CBM 单位：立方米 4位小数 
	private String cargoVolume;
	//来源方唯一标识
	private String sourceId;
	//集装箱信息
	private String ctnYs20;
	private String ctnYs40;
	private String ctnYs4h;
	private String ctnYs45;
	
	public String getVessel() {
		return vessel;
	}
	public void setVessel(String vessel) {
		this.vessel = vessel;
	}
	public String getVoyage() {
		return voyage;
	}
	public void setVoyage(String voyage) {
		this.voyage = voyage;
	}
	public String getMblNo() {
		return mblNo;
	}
	public void setMblNo(String mblNo) {
		this.mblNo = mblNo;
	}
	public String getConsTransTerm() {
		return consTransTerm;
	}
	public void setConsTransTerm(String consTransTerm) {
		this.consTransTerm = consTransTerm;
	}
	public String getPolNameEn() {
		return polNameEn;
	}
	public void setPolNameEn(String polNameEn) {
		this.polNameEn = polNameEn;
	}
	public String getPotNameEn() {
		return potNameEn;
	}
	public void setPotNameEn(String potNameEn) {
		this.potNameEn = potNameEn;
	}
	public String getPodNameEn() {
		return podNameEn;
	}
	public void setPodNameEn(String podNameEn) {
		this.podNameEn = podNameEn;
	}
	public String getCarrierName() {
		return carrierName;
	}
	public void setCarrierName(String carrierName) {
		this.carrierName = carrierName;
	}
	public Date getEtd() {
		return etd;
	}
	public void setEtd(Date etd) {
		this.etd = etd;
	}
	public String getCargoPackages() {
		return cargoPackages;
	}
	public void setCargoPackages(String cargoPackages) {
		this.cargoPackages = cargoPackages;
	}
	public String getCargoGrossWeight() {
		return cargoGrossWeight;
	}
	public void setCargoGrossWeight(String cargoGrossWeight) {
		this.cargoGrossWeight = cargoGrossWeight;
	}
	public String getCargoVolume() {
		return cargoVolume;
	}
	public void setCargoVolume(String cargoVolume) {
		this.cargoVolume = cargoVolume;
	}
	public String getConsPaymentTerm() {
		return consPaymentTerm;
	}
	public void setConsPaymentTerm(String consPaymentTerm) {
		this.consPaymentTerm = consPaymentTerm;
	}
	public String getSourceId() {
		return sourceId;
	}
	public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
	}
	public String getCtnYs20() {
		return ctnYs20;
	}
	public void setCtnYs20(String ctnYs20) {
		this.ctnYs20 = ctnYs20;
	}
	public String getCtnYs40() {
		return ctnYs40;
	}
	public void setCtnYs40(String ctnYs40) {
		this.ctnYs40 = ctnYs40;
	}
	public String getCtnYs4h() {
		return ctnYs4h;
	}
	public void setCtnYs4h(String ctnYs4h) {
		this.ctnYs4h = ctnYs4h;
	}
	public String getCtnYs45() {
		return ctnYs45;
	}
	public void setCtnYs45(String ctnYs45) {
		this.ctnYs45 = ctnYs45;
	}
	
}
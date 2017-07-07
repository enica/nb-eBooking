package com.eBookingCn.po;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)  
@XmlRootElement
public class ConsignAddComplete {
	//委托编号(true)
	@XmlElement
	private String entrustNo;
	//合同号(true)
	@XmlElement
	private String contractNo;
	//委托时间(true) YYYY-MM-DD 如2013-08-11
	@XmlElement
	private String consDate;
	//客户号(false)
	@XmlElement
	private String custCode;
	//供应商代码(false)---根据我方供应商列表选取
	@XmlElement
	private String supplierCode;
	//运费条款(false)
	@XmlElement
	private String consPaymentTerm;
	//运输条款(false)
	@XmlElement
	private String consTransTerm;
	//收货地名称(true)
	@XmlElement
	private String receiptPlaceName;
	//目的地名称(true)
	@XmlElement
	private String deliveryPlaceName;
	//装货港英文名(false)
	@XmlElement
	private String polNameEn;
	//中转港英文名(true)
	@XmlElement
	private String potNameEn;
	//卸货港英文名(false)
	@XmlElement
	private String podNameEn;
	//船名(true)
	@XmlElement
	private String vessel;
	//航次(true)
	@XmlElement
	private String voyage;
	//船公司名称(false)
	@XmlElement
	private String carrierName;
	//开航日期 (false)YYYY-MM-DD 如2013-08-11
	@XmlElement
	private String etd;
	//截关日期 (true)YYYY-MM-DD 如2013-08-11
	@XmlElement
	private String etcDate;
	//截AMS日期(true) YYYY-MM-DD 如2013-08-11<
	@XmlElement
	private String atc;
	//截单日期(true) YYYY-MM-DD 如2013-08-11
	@XmlElement
	private String cutOffDate;
	//预计到达日期(true) YYYY-MM-DD 如2013-08-11
	@XmlElement
	private String eta;
	//提单号(false)
	@XmlElement
	private String mblNo;
	//货代提单号/副提单号(true)
	@XmlElement
	private String hblNo;
	//装船时间(true)
	@XmlElement
	private String shipmentDate;
	//收货人(false)
	@XmlElement
	private String shipper;
	//发货人(false)
	@XmlElement
	private String consignee;
	//通知人(false)
	@XmlElement
	private String notifyParty;
	//箱型箱量信息
	@XmlElement
	private ContainersInfo containersInfo;
	//货品基本信息
	@XmlElement
	private CargoInfo cargoInfo;
	//服务信息
	@XmlElement
	private ServiceInfo serviceInfo;
	//危险品信息
	@XmlElement
	private DanagerInfo danagerInfo;
	//0
	@XmlElement
	private String billAmountCny;
	//0
	@XmlElement
	private String billAmountUsd;
	//备注(true)
	@XmlElement
	private String remarks;
	//来源方唯一标识(false)
	@XmlElement
	private String sourceId;
	//来源方许可证号(false)
	@XmlElement
	private String permit;
	
	public String getEntrustNo() {
		return entrustNo;
	}

	public void setEntrustNo(String entrustNo) {
		this.entrustNo = entrustNo;
	}

	public String getContractNo() {
		return contractNo;
	}

	public void setContractNo(String contractNo) {
		this.contractNo = contractNo;
	}

	public String getCustCode() {
		return custCode;
	}

	public void setCustCode(String custCode) {
		this.custCode = custCode;
	}

	public String getSupplierCode() {
		return supplierCode;
	}

	public void setSupplierCode(String supplierCode) {
		this.supplierCode = supplierCode;
	}

	public String getConsPaymentTerm() {
		return consPaymentTerm;
	}

	public void setConsPaymentTerm(String consPaymentTerm) {
		this.consPaymentTerm = consPaymentTerm;
	}

	public String getConsTransTerm() {
		return consTransTerm;
	}

	public void setConsTransTerm(String consTransTerm) {
		this.consTransTerm = consTransTerm;
	}

	public String getReceiptPlaceName() {
		return receiptPlaceName;
	}

	public void setReceiptPlaceName(String receiptPlaceName) {
		this.receiptPlaceName = receiptPlaceName;
	}

	public String getDeliveryPlaceName() {
		return deliveryPlaceName;
	}

	public void setDeliveryPlaceName(String deliveryPlaceName) {
		this.deliveryPlaceName = deliveryPlaceName;
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

	public String getCarrierName() {
		return carrierName;
	}

	public void setCarrierName(String carrierName) {
		this.carrierName = carrierName;
	}

	public String getConsDate() {
		return consDate;
	}

	public void setConsDate(String consDate) {
		this.consDate = consDate;
	}

	public String getEtd() {
		return etd;
	}

	public void setEtd(String etd) {
		this.etd = etd;
	}

	public String getEtcDate() {
		return etcDate;
	}

	public void setEtcDate(String etcDate) {
		this.etcDate = etcDate;
	}

	public String getAtc() {
		return atc;
	}

	public void setAtc(String atc) {
		this.atc = atc;
	}

	public String getCutOffDate() {
		return cutOffDate;
	}

	public void setCutOffDate(String cutOffDate) {
		this.cutOffDate = cutOffDate;
	}

	public String getEta() {
		return eta;
	}

	public void setEta(String eta) {
		this.eta = eta;
	}

	public String getMblNo() {
		return mblNo;
	}

	public void setMblNo(String mblNo) {
		this.mblNo = mblNo;
	}

	public String getHblNo() {
		return hblNo;
	}

	public void setHblNo(String hblNo) {
		this.hblNo = hblNo;
	}

	public String getShipmentDate() {
		return shipmentDate;
	}

	public void setShipmentDate(String shipmentDate) {
		this.shipmentDate = shipmentDate;
	}

	public String getShipper() {
		return shipper;
	}

	public void setShipper(String shipper) {
		this.shipper = shipper;
	}

	public String getConsignee() {
		return consignee;
	}

	public void setConsignee(String consignee) {
		this.consignee = consignee;
	}

	public String getNotifyParty() {
		return notifyParty;
	}

	public void setNotifyParty(String notifyParty) {
		this.notifyParty = notifyParty;
	}

	public CargoInfo getCargoInfo() {
		return cargoInfo;
	}

	public void setCargoInfo(CargoInfo cargoInfo) {
		this.cargoInfo = cargoInfo;
	}

	public ServiceInfo getServiceInfo() {
		return serviceInfo;
	}

	public void setServiceInfo(ServiceInfo serviceInfo) {
		this.serviceInfo = serviceInfo;
	}

	public DanagerInfo getDanagerInfo() {
		return danagerInfo;
	}

	public void setDanagerInfo(DanagerInfo danagerInfo) {
		this.danagerInfo = danagerInfo;
	}

	public String getBillAmountCny() {
		return billAmountCny;
	}

	public void setBillAmountCny(String billAmountCny) {
		this.billAmountCny = billAmountCny;
	}

	public String getBillAmountUsd() {
		return billAmountUsd;
	}

	public void setBillAmountUsd(String billAmountUsd) {
		this.billAmountUsd = billAmountUsd;
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

	public String getPermit() {
		return permit;
	}

	public void setPermit(String permit) {
		this.permit = permit;
	}

	public ContainersInfo getContainersInfo() {
		return containersInfo;
	}

	public void setContainersInfo(ContainersInfo containersInfo) {
		this.containersInfo = containersInfo;
	}
	
}

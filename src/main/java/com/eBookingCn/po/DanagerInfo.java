package com.eBookingCn.po;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)  
public class DanagerInfo{
	//是不是危险品(false)
	@XmlElement
	private String cargoDanagerFlag;
	//危险品等级(true)
	@XmlElement
	private String cargoDanagerClass;
	//是否海洋污染(true)
	@XmlElement
	private String cargoPollutionFlag;
	//危险品属性(true)
	@XmlElement
	private String cargoDanagerProperty;
	//危规页码(true)
	@XmlElement
	private String cargoImdgPage;
	//危险品标签(true)
	@XmlElement
	private String cargoSubLabel;
	//联合国编号(true)
	@XmlElement
	private String cargoUnNo;
	//应急措施编号(true)
	@XmlElement
	private String cargoEmsNo;
	//应急联系电话(true)
	@XmlElement
	private String cargoEmsTel;
	//医疗急救号(true)
	@XmlElement
	private String cargoMfagNo;
	//闪点(true)
	@XmlElement
	private String cargoFlashPoint;
	//危险品包装类别(true)
	@XmlElement
	private String cargoDangerUnitName;
	//危险品毛重(true)
	@XmlElement
	private String cargoDangerGrossWeight;
	//危险品净重(true)
	@XmlElement
	private String cargoDangerNetWeight;
	//危险品备注(true)
	@XmlElement
	private String cargoDangerRemarks;
	//副危险性(true)
	@XmlElement
	private String cargoViceDangerous;
	//技术品名(true)
	@XmlElement
	private String cargoTechnicalDesc;
	//外包装/件数(true)
	@XmlElement
	private String cargoOuterPackages;
	//内包装/件数(true)
	@XmlElement
	private String cargoInsidePackages;
	//危险品品名(true)
	@XmlElement
	private String cargoDangerDesc;
	public String getCargoDanagerFlag() {
		return cargoDanagerFlag;
	}
	public void setCargoDanagerFlag(String cargoDanagerFlag) {
		this.cargoDanagerFlag = cargoDanagerFlag;
	}
	public String getCargoDanagerClass() {
		return cargoDanagerClass;
	}
	public void setCargoDanagerClass(String cargoDanagerClass) {
		this.cargoDanagerClass = cargoDanagerClass;
	}
	public String getCargoPollutionFlag() {
		return cargoPollutionFlag;
	}
	public void setCargoPollutionFlag(String cargoPollutionFlag) {
		this.cargoPollutionFlag = cargoPollutionFlag;
	}
	public String getCargoDanagerProperty() {
		return cargoDanagerProperty;
	}
	public void setCargoDanagerProperty(String cargoDanagerProperty) {
		this.cargoDanagerProperty = cargoDanagerProperty;
	}
	public String getCargoImdgPage() {
		return cargoImdgPage;
	}
	public void setCargoImdgPage(String cargoImdgPage) {
		this.cargoImdgPage = cargoImdgPage;
	}
	public String getCargoSubLabel() {
		return cargoSubLabel;
	}
	public void setCargoSubLabel(String cargoSubLabel) {
		this.cargoSubLabel = cargoSubLabel;
	}
	public String getCargoUnNo() {
		return cargoUnNo;
	}
	public void setCargoUnNo(String cargoUnNo) {
		this.cargoUnNo = cargoUnNo;
	}
	public String getCargoEmsNo() {
		return cargoEmsNo;
	}
	public void setCargoEmsNo(String cargoEmsNo) {
		this.cargoEmsNo = cargoEmsNo;
	}
	public String getCargoEmsTel() {
		return cargoEmsTel;
	}
	public void setCargoEmsTel(String cargoEmsTel) {
		this.cargoEmsTel = cargoEmsTel;
	}
	public String getCargoMfagNo() {
		return cargoMfagNo;
	}
	public void setCargoMfagNo(String cargoMfagNo) {
		this.cargoMfagNo = cargoMfagNo;
	}
	public String getCargoFlashPoint() {
		return cargoFlashPoint;
	}
	public void setCargoFlashPoint(String cargoFlashPoint) {
		this.cargoFlashPoint = cargoFlashPoint;
	}
	public String getCargoDangerUnitName() {
		return cargoDangerUnitName;
	}
	public void setCargoDangerUnitName(String cargoDangerUnitName) {
		this.cargoDangerUnitName = cargoDangerUnitName;
	}
	public String getCargoDangerGrossWeight() {
		return cargoDangerGrossWeight;
	}
	public void setCargoDangerGrossWeight(String cargoDangerGrossWeight) {
		this.cargoDangerGrossWeight = cargoDangerGrossWeight;
	}
	public String getCargoDangerNetWeight() {
		return cargoDangerNetWeight;
	}
	public void setCargoDangerNetWeight(String cargoDangerNetWeight) {
		this.cargoDangerNetWeight = cargoDangerNetWeight;
	}
	public String getCargoDangerRemarks() {
		return cargoDangerRemarks;
	}
	public void setCargoDangerRemarks(String cargoDangerRemarks) {
		this.cargoDangerRemarks = cargoDangerRemarks;
	}
	public String getCargoViceDangerous() {
		return cargoViceDangerous;
	}
	public void setCargoViceDangerous(String cargoViceDangerous) {
		this.cargoViceDangerous = cargoViceDangerous;
	}
	public String getCargoTechnicalDesc() {
		return cargoTechnicalDesc;
	}
	public void setCargoTechnicalDesc(String cargoTechnicalDesc) {
		this.cargoTechnicalDesc = cargoTechnicalDesc;
	}
	public String getCargoOuterPackages() {
		return cargoOuterPackages;
	}
	public void setCargoOuterPackages(String cargoOuterPackages) {
		this.cargoOuterPackages = cargoOuterPackages;
	}
	public String getCargoInsidePackages() {
		return cargoInsidePackages;
	}
	public void setCargoInsidePackages(String cargoInsidePackages) {
		this.cargoInsidePackages = cargoInsidePackages;
	}
	public String getCargoDangerDesc() {
		return cargoDangerDesc;
	}
	public void setCargoDangerDesc(String cargoDangerDesc) {
		this.cargoDangerDesc = cargoDangerDesc;
	}
	
}

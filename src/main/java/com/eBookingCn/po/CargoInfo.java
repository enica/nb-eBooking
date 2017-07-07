package com.eBookingCn.po;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)  
public class CargoInfo{
	//HS代码(true)
	@XmlElement
	private String hsCode;
	//货物描述/品名(false)
	@XmlElement
	private String cargoDesc;
	//唛头(false)
	@XmlElement
	private String cargoMarks;
	//包装类别(false)
	@XmlElement
	private String cargoUnitName;
	//货物件数(false)
	@XmlElement
	private String cargoPackages;
	//毛重 单位(true)：kg 2位小数
	@XmlElement
	private String cargoNetWeight;
	//净重 KGS 单位(false)：kg 2位小数
	@XmlElement
	private String cargoGrossWeight;
	//体积 CBM 单位(false)：立方米 4位小数
	@XmlElement
	private String cargoVolume;
	
	public String getHsCode() {
		return hsCode;
	}
	public void setHsCode(String hsCode) {
		this.hsCode = hsCode;
	}
	public String getCargoDesc() {
		return cargoDesc;
	}
	public void setCargoDesc(String cargoDesc) {
		this.cargoDesc = cargoDesc;
	}
	public String getCargoMarks() {
		return cargoMarks;
	}
	public void setCargoMarks(String cargoMarks) {
		this.cargoMarks = cargoMarks;
	}
	public String getCargoUnitName() {
		return cargoUnitName;
	}
	public void setCargoUnitName(String cargoUnitName) {
		this.cargoUnitName = cargoUnitName;
	}
	public String getCargoPackages() {
		return cargoPackages;
	}
	public void setCargoPackages(String cargoPackages) {
		this.cargoPackages = cargoPackages;
	}
	public String getCargoNetWeight() {
		return cargoNetWeight;
	}
	public void setCargoNetWeight(String cargoNetWeight) {
		this.cargoNetWeight = cargoNetWeight;
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
}
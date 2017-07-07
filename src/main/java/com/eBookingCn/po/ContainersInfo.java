package com.eBookingCn.po;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)  
public class ContainersInfo {
	@XmlElement
	private String contNum20gp;
	@XmlElement
	private String contNum40gp;
	@XmlElement
	private String contNum40hq;
	@XmlElement
	private String contNum45hq;
	@XmlElement
	private String contNum45gp;
	public String getContNum45gp() {
		return contNum45gp;
	}
	public void setContNum45gp(String contNum45gp) {
		this.contNum45gp = contNum45gp;
	}
	public String getContNum20gp() {
		return contNum20gp;
	}
	public void setContNum20gp(String contNum20gp) {
		this.contNum20gp = contNum20gp;
	}
	public String getContNum40gp() {
		return contNum40gp;
	}
	public void setContNum40gp(String contNum40gp) {
		this.contNum40gp = contNum40gp;
	}
	public String getContNum40hq() {
		return contNum40hq;
	}
	public void setContNum40hq(String contNum40hq) {
		this.contNum40hq = contNum40hq;
	}
	public String getContNum45hq() {
		return contNum45hq;
	}
	public void setContNum45hq(String contNum45hq) {
		this.contNum45hq = contNum45hq;
	}
	
}

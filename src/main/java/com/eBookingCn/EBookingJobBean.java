package com.eBookingCn;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.annotation.Resource;

import com.eBookingCn.oxm.JaxbXmlUtil;
import com.eBookingCn.po.CargoInfo;
import com.eBookingCn.po.ConsignAddComplete;
import com.eBookingCn.po.ConsignAddCompleteResult;
import com.eBookingCn.po.ContainersInfo;
import com.eBookingCn.po.DanagerInfo;
import com.eBookingCn.po.ServiceInfo;
import com.eBookingCn.po.Tab;
import com.eBookingCn.service.TabService;

import cn.net.nbse.open.client.AbstractMessageClient;
import cn.net.nbse.open.client.soap.XMLMessageSOAPClient;

/** 
 *  
 * @author enica 
 * 
 */  
public class EBookingJobBean {  
	
	//public static String SYWL = "HITI0000000000000000000000000087";
	//public static String HYGJ = "HITI0000000000000000000000001202";
	//public static String HYGJ = "HITI000000000000000000000000031";
	public static String BLANK = "无";
	public static String ZERO = "0";
	private String remoteUrl;
	private String permit;
	private String key;
	private String operation;
	private String encrypt;
	private String supplierCode;
	private String custCode;
	
	@Resource
	private TabService tabService;

	public void printAnotherMessage(){    
		System.out.println("开始执行任务 ...");  
		
		//取数据库记录
		//Tab tab = tabService.getConsign();
		ArrayList<Tab> tabList = tabService.getConsigns();
		System.out.print(tabList.size());
		if(null != tabList && tabList.size() > 0){
			for(Tab tab:tabList){
				//po to vo
				ConsignAddComplete consignAddComplete = poToVo(tab);
				
				//vo to xml
				String str = JaxbXmlUtil.beanToXml(consignAddComplete);
				System.out.print(str);
		     
				AbstractMessageClient client = new XMLMessageSOAPClient();
				//client.setPermit("TEST_PERMIT");//许可证号：1af9b5c3-64f3-4cd0-9535-d9f5caf7bced
				//client.setKeyt("TEST_KEYT");//密钥：289052cf-6891-4373-820f-0582477d1695
				//client.setEncrypt("AES/PCBC/PKCS5Padding");//加密算法：AES/PCBC/PKCS5Padding
				//client.setOperation("TEST-ORDER-UPLOAD-COMPLETES");//消息上传服务标识符：e7cce5a8-40f1-4f4c-8147-c7a96b0bb345
				//client.setRemoteURL("http://open.nbse.net.cn/services/message?wsdl");//设置远程地址：http://open.nbse.net.cn/services/message?wsdl
				
				client.setPermit(getPermit());//许可证号：1af9b5c3-64f3-4cd0-9535-d9f5caf7bced
				client.setKeyt(getKey());//密钥：289052cf-6891-4373-820f-0582477d1695
				client.setEncrypt(getEncrypt());//加密算法：AES/PCBC/PKCS5Padding
				client.setOperation(getOperation());//消息上传服务标识符：e7cce5a8-40f1-4f4c-8147-c7a96b0bb345
				client.setRemoteURL(getRemoteUrl());//设置远程地址：http://open.nbse.net.cn/services/message?wsdl
				byte[] response;
				try {
					System.out.println("start to upload");
					response = client.upload(str);
					String responseStr = new String(response,"UTF-8");
					//responseStr = responseStr.replaceAll("ConsignAddCompleteResult", "consignAddCompleteResult");
					System.out.println(responseStr);	
					//回执解析
					ConsignAddCompleteResult result = JaxbXmlUtil.xmlToBean(responseStr, ConsignAddCompleteResult.class);
					System.out.println("retCode:" + result.getRetCode() +"; retMsg:" + result.getRetMsg());
					result.setSourceId(tab.getSourceId());
					tabService.updateConsigns(result);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		
		System.out.println("结束执行任务 ...");
		
    }    
	
	public ConsignAddComplete poToVo(Tab tab){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		ConsignAddComplete consignAddComplete = new ConsignAddComplete();
		consignAddComplete.setEntrustNo("");
		consignAddComplete.setContractNo("");
		consignAddComplete.setConsDate(sdf.format(new Date()));
		consignAddComplete.setCustCode(getCustCode());
		consignAddComplete.setSupplierCode(getSupplierCode());
		consignAddComplete.setConsPaymentTerm(getPayment(tab.getConsPaymentTerm()));
		consignAddComplete.setConsTransTerm(getTans(tab.getConsTransTerm()));
		consignAddComplete.setReceiptPlaceName("");
		consignAddComplete.setDeliveryPlaceName("");
		consignAddComplete.setPolNameEn(tab.getPolNameEn());
		consignAddComplete.setPotNameEn(tab.getPotNameEn());
		consignAddComplete.setPodNameEn(tab.getPodNameEn());
		consignAddComplete.setVessel(tab.getVessel());
		consignAddComplete.setVoyage(tab.getVoyage());
		consignAddComplete.setCarrierName(tab.getCarrierName());
		consignAddComplete.setEtd(sdf.format(tab.getEtd()));
		consignAddComplete.setEtcDate(sdf.format(new Date()));
		consignAddComplete.setAtc(sdf.format(new Date()));
		consignAddComplete.setCutOffDate(sdf.format(new Date()));
		consignAddComplete.setEta(sdf.format(new Date()));
		consignAddComplete.setMblNo(tab.getMblNo());
		consignAddComplete.setHblNo("");
		consignAddComplete.setShipmentDate(sdf.format(new Date()));
		consignAddComplete.setShipper(BLANK);
		consignAddComplete.setConsignee(BLANK);
		consignAddComplete.setNotifyParty(BLANK);
		
		ContainersInfo containersInfo = new ContainersInfo();
		containersInfo.setContNum20gp(tab.getCtnYs20());
		containersInfo.setContNum40gp(tab.getCtnYs40());
		containersInfo.setContNum40hq(tab.getCtnYs4h());
		containersInfo.setContNum45hq(tab.getCtnYs45());
		consignAddComplete.setContainersInfo(containersInfo);
		
		CargoInfo cargoInfo = new CargoInfo();
		cargoInfo.setHsCode("");
		cargoInfo.setCargoDesc(BLANK);
		cargoInfo.setCargoMarks(BLANK);
		cargoInfo.setCargoUnitName(BLANK);
		cargoInfo.setCargoPackages(tab.getCargoPackages());
		cargoInfo.setCargoGrossWeight(tab.getCargoGrossWeight());
		cargoInfo.setCargoNetWeight("");
		cargoInfo.setCargoVolume(tab.getCargoVolume());
		consignAddComplete.setCargoInfo(cargoInfo);
		
		ServiceInfo serviceInfo = new ServiceInfo();
		serviceInfo.setTrackServiceFlag(ZERO);
		serviceInfo.setCustomServiceFlag(ZERO);
		serviceInfo.setWarehouseServiceFlag(ZERO);
		serviceInfo.setInspectionServiceFlag(ZERO);
		serviceInfo.setInsuranceServiceFlag(ZERO);
		consignAddComplete.setServiceInfo(serviceInfo);
		
		DanagerInfo danagerInfo = new DanagerInfo();
		danagerInfo.setCargoDanagerFlag(ZERO);
		danagerInfo.setCargoDanagerClass(ZERO);
		danagerInfo.setCargoPollutionFlag(ZERO);
		danagerInfo.setCargoDanagerProperty(ZERO);
		danagerInfo.setCargoImdgPage(ZERO);
		danagerInfo.setCargoSubLabel(ZERO);
		danagerInfo.setCargoUnNo(ZERO);
		danagerInfo.setCargoEmsNo(ZERO);
		danagerInfo.setCargoEmsTel(ZERO);
		danagerInfo.setCargoMfagNo(ZERO);
		danagerInfo.setCargoFlashPoint(ZERO);
		danagerInfo.setCargoDangerUnitName(ZERO);
		danagerInfo.setCargoDangerGrossWeight(ZERO);
		danagerInfo.setCargoDangerNetWeight(ZERO);
		danagerInfo.setCargoDangerRemarks(ZERO);
		danagerInfo.setCargoViceDangerous(ZERO);
		danagerInfo.setCargoTechnicalDesc(ZERO);
		danagerInfo.setCargoOuterPackages(ZERO);
		danagerInfo.setCargoInsidePackages(ZERO);
		danagerInfo.setCargoDangerDesc(ZERO);
		consignAddComplete.setDanagerInfo(danagerInfo);

		consignAddComplete.setBillAmountCny(ZERO);
		consignAddComplete.setBillAmountUsd(ZERO);
		consignAddComplete.setRemarks("");
		consignAddComplete.setSourceId(tab.getSourceId());
		consignAddComplete.setPermit(getPermit());
		
		return consignAddComplete;
	}
	
	public String getTans(String key){
		String val = "";
		if("CY-CY".equalsIgnoreCase(key.trim())){
			val = "1";
		}else if("CY-DOOR".equalsIgnoreCase(key.trim())){
			val = "2";
		}else if("CY-DOOR".equalsIgnoreCase(key.trim())){
			val = "2";
		}else if("CFS-CFS".equalsIgnoreCase(key.trim())){
			val = "3";
		}else if("CY-CFS".equalsIgnoreCase(key.trim())){
			val = "4";
		}else if("DOOR-CY".equalsIgnoreCase(key.trim())){
			val = "5";
		}else if("DOOR-DOOR".equalsIgnoreCase(key.trim())){
			val = "6";
		}else if("DOOR-CFS".equalsIgnoreCase(key.trim())){
			val = "7";
		}else if("CFS-DOOR".equalsIgnoreCase(key.trim())){
			val = "8";
		}else if("CFS-CY".equalsIgnoreCase(key.trim())){
			val = "9";
		}
		
		return val;
	}
	
	public String getPayment(String key){
		String val = "";
		if("FREIGHT PREPAID".equalsIgnoreCase(key.trim())){
			val = "1";
		}else if("FREIGHT COLLECT".equalsIgnoreCase(key.trim())){
			val = "2";
		}else if("FREIGHT AS ARRANGED".equalsIgnoreCase(key.trim())){
			val = "3";
		}
		
		return val;
	}

	public String getRemoteUrl() {
		return remoteUrl;
	}

	public void setRemoteUrl(String remoteUrl) {
		this.remoteUrl = remoteUrl;
	}

	public String getPermit() {
		return permit;
	}

	public void setPermit(String permit) {
		this.permit = permit;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	public String getEncrypt() {
		return encrypt;
	}

	public void setEncrypt(String encrypt) {
		this.encrypt = encrypt;
	}

	public String getSupplierCode() {
		return supplierCode;
	}

	public void setSupplierCode(String supplierCode) {
		this.supplierCode = supplierCode;
	}

	public String getCustCode() {
		return custCode;
	}

	public void setCustCode(String custCode) {
		this.custCode = custCode;
	}
   
}  
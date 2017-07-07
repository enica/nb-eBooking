package com.eBookingCn;

import org.opennuts.util.FileUtils;

import cn.net.nbse.open.client.AbstractMessageClient;
import cn.net.nbse.open.client.soap.XMLMessageSOAPClient;

public class wsTest {

	public static void main(String[] args) throws Exception {
		AbstractMessageClient client = new XMLMessageSOAPClient();
		client.setPermit("TEST_PERMIT");//许可证号：1af9b5c3-64f3-4cd0-9535-d9f5caf7bced
		client.setKeyt("TEST_KEYT");//密钥：289052cf-6891-4373-820f-0582477d1695
		client.setEncrypt("AES/PCBC/PKCS5Padding");//加密算法：AES/PCBC/PKCS5Padding
		client.setOperation("TEST-ORDER-UPLOAD-COMPLETES");//消息上传服务标识符：e7cce5a8-40f1-4f4c-8147-c7a96b0bb345
		client.setRemoteURL("http://open.nbse.net.cn/services/message?wsdl");//设置远程地址：http://open.nbse.net.cn/services/message?wsdl
//		client.setPermit("TEST_PERMIT");
//		client.setKeyt("TEST_KEYT");
//		client.setOperation("TEST_RECEIVE");
//		client.setRemoteUrl("http://open.nbse.net.cn/services/message?wsdl");
//		client.setContent("测试");
		//System.out.println(FileUtils.getText("F:\\test\\yunjia.txt", "UTF-8"));
		byte[] response=client.upload(FileUtils.getText("D:\\IDE\\workspace-eclipse\\test.txt", "UTF-8"));
		//byte[] response = client.upload("测试正文");
		System.out.println("start to upload");
		System.out.println(new String(response,"UTF-8"));
		
	}

}

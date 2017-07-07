package com.eBookingCn;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StartUpQuartzJobs {
	static final Log log = LogFactory.getLog(StartUpQuartzJobs.class); // 日志  
	  
	public static void main(String args[]) throws Exception {  
	    log.info("开始启动定时任务 ...");  
	    ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");   
	    log.info("定时任务启动成功...");  
	    
	}  
}

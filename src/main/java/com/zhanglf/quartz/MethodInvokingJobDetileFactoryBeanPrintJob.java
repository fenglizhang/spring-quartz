package com.zhanglf.quartz;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.zhanglf.service.IShowService;

@Component
public class MethodInvokingJobDetileFactoryBeanPrintJob {
	
	@Resource(name=IShowService.SERVICEID)
	private IShowService showService;
	
	public void sayHello(){
		showService.print("MethodInvokingJobDetileFactoryBeanPrintJob");
	}
}

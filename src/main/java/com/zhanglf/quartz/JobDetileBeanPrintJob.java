package com.zhanglf.quartz;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;
import org.springframework.stereotype.Component;

import com.zhanglf.service.IShowService;
@Component
public class JobDetileBeanPrintJob extends QuartzJobBean {
	//这里的注入只能是set方法注入好使,使用註解不行！这也是和MethodInvokingJobDetileFactoryBean的区别之一。
//	@Resource(name=IShowService.SERVICEID)
	private IShowService showService;
	public void setShowService(IShowService showService) {
		this.showService = showService;
	}

	@Override
	protected void executeInternal(JobExecutionContext context)
			throws JobExecutionException {
		show();
	}
	
	public void show(){
		showService.print("JobDetileBeanPrintJob");
	}

}

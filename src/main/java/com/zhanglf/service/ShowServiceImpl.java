package com.zhanglf.service;

import org.springframework.stereotype.Service;

@Service(IShowService.SERVICEID)
public class ShowServiceImpl implements IShowService{
	public void print(String name){
		System.out.println("你好  "+name);
	}
}

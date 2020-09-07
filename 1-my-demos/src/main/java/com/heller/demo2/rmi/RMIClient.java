package com.heller.demo2.rmi;

import com.heller.demo2.rmi.service.HelloRMIService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RMIClient {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("demo2/rmi/client.xml");
		HelloRMIService helloRMIService = context.getBean(HelloRMIService.class);
		System.out.println(helloRMIService.add(2, 3));
	}
}

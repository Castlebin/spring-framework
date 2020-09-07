package com.heller.demo2.rmi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RMIServer {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("demo2/rmi/RMIServer.xml");
	}
}

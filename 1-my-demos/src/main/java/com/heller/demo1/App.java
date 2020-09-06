package com.heller.demo1;

import com.heller.demo1.service.X;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		X x = context.getBean(X.class);
		x.sayHello("Lily");
	}
}

package com.heller.bll.demo1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.heller.bll.demo1.service.X;

public class App {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(AppConfig.class);
		System.out.println(context);
		System.out.println(context.getBean(X.class));
	}
}

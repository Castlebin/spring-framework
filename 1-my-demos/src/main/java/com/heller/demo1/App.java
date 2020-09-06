package com.heller.demo1;

import com.heller.demo1.service.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		System.out.println(Arrays.toString(Arrays.stream(context.getBeanDefinitionNames()).toArray()));

		context.getBean(A.class).love("Lily");
		context.getBean(B.class).love("HanMeimei");
		context.getBean(C.class).love("LiLei");
		context.getBean(E.class).love("Ketty");
		context.getBean(G.class).love("Bob");
	}
}

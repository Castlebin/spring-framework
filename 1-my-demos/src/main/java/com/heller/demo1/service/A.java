package com.heller.demo1.service;

import org.springframework.stereotype.Component;

/**
	一个 单纯的 Bean，无引用，无 AOP 增强
 */
@Component
public class A {

	public A() {
		System.out.println("create A...");
	}

	public void love(String name) {
		System.out.println("A Love you, " + name);
	}

}

package com.heller.demo1.service;

import org.springframework.stereotype.Component;

/**
 * 一个 仅 AOP 增强过的 Bean，无注入
 */
@Component
public class C {

	public C() {
		System.out.println("create C...");
	}

	public void love(String name) {
		System.out.println("C Love you, " + name);
	}
}

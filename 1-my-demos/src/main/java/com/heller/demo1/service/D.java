package com.heller.demo1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 和 E 循环引用，无其他 AOP 增强
 */
@Component
public class D {

	@Autowired
	private E e;

	public D() {
		System.out.println("create D...");
	}

	public void love(String name) {
		System.out.println("D Love you, " + name);
	}
}

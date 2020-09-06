package com.heller.demo1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 和 D 循环引用，无其他 AOP 增强
 */
@Component
public class E {

	@Autowired
	private D d;

	public E() {
		System.out.println("create E...");
	}

	public void love(String name) {
		System.out.println("E Love you, " + name);
	}
}

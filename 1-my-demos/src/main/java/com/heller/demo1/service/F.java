package com.heller.demo1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 和 G 循环引用，并且 AOP 增强
 */
@Component
public class F {

	@Autowired
	private G g;

	public F() {
		System.out.println("create F...");
	}

	public void love(String name) {
		System.out.println("F Love you, " + name);
	}
}

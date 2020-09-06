package com.heller.demo1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 和 F 循环引用，并且 AOP 增强
 */
@Component
public class G {

	@Autowired
	private F f;

	public G() {
		System.out.println("create G...");
	}

	public void love(String name) {
		System.out.println("G Love you, " + name);
	}
}

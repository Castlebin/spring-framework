package com.heller.demo1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
	一个 单向 注入 其他 Bean 的简单 Bean
 */
@Component
public class B {

	@Autowired
	private A a;

	public B() {
		System.out.println("create B...");
	}

	public void love(String name) {
		System.out.println("B Love you, " + name);
	}
}

package com.heller.demo1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class X {

	@Autowired
	private Y y;

	public X() {
		System.out.println("create X...");
	}

	public void sayHello(String name) {
		System.out.println("Hello, " + name);
	}
}

package com.heller.demo1.service;

import org.springframework.stereotype.Component;

@Component
public class W {

	public W() {
		System.out.println("create X...");
	}

	public void love(String name) {
		System.out.println("Love you, " + name);
	}
}

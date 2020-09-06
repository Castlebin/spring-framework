package com.heller.demo1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Y {

	@Autowired
	private X x;

	public Y() {
		System.out.println("create Y...");
	}
}

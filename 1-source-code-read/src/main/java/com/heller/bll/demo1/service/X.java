package com.heller.bll.demo1.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class X {

	@Autowired
	private Y y;

	public X() {
		System.out.println("create X ...");
	}

}

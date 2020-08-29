package com.heller.bll.service;

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

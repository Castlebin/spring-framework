package com.heller.bll.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class Y {

	@Autowired
	private X x;

	public Y() {
		System.out.println("create Y ...");
	}

}

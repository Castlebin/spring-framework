package com.heller.demo2.rmi.service.impl;

import com.heller.demo2.rmi.service.HelloRMIService;

public class HelloRMIServiceImpl implements HelloRMIService {
	@Override
	public int add(int a, int b) {
		return a + b;
	}
}

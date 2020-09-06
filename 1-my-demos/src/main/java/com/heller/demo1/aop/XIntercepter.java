package com.heller.demo1.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class XIntercepter {

	@Pointcut("execution(* com.heller.demo1.service.X.*(..))")
	public void pointCut() { }

	@Before("pointCut()")
	public void before() {
		System.out.println("...before...");
	}

	@After("pointCut()")
	public void after() {
		System.out.println("...after...");
	}

	@Around("pointCut()")
	public Object around(ProceedingJoinPoint pjp) {
		System.out.println("...around before...");

		Object result = null;
		try {
			result = pjp.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}

		System.out.println("...around after...");
		return result;
	}

}

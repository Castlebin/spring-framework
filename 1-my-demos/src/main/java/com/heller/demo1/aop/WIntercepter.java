package com.heller.demo1.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class WIntercepter {

	@Pointcut("execution(* com.heller.demo1.service.W.*(..))")
	public void pointCut() { }

	@Before("pointCut()")
	public void before() {
		System.out.println("...w before...");
	}

	@After("pointCut()")
	public void after() {
		System.out.println("...w after...");
	}

	@Around("pointCut()")
	public Object around(ProceedingJoinPoint pjp) {
		System.out.println("...w around before...");

		Object result = null;
		try {
			result = pjp.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}

		System.out.println("...w around after...");
		return result;
	}

}

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
		System.out.println("...x before...");
	}

	@After("pointCut()")
	public void after() {
		System.out.println("...x after...");
	}

	@Around("pointCut()")
	public Object around(ProceedingJoinPoint pjp) {
		System.out.println("...x around before...");

		Object result = null;
		try {
			result = pjp.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}

		System.out.println("...x around after...");
		return result;
	}

}

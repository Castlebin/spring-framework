package com.heller.demo1.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class CInterceptor {

	@Pointcut("execution(* com.heller.demo1.service.C.*(..))")
	public void pointCut() { }

	@Before("pointCut()")
	public void before() {
		System.out.println("...c before...");
	}

	@After("pointCut()")
	public void after() {
		System.out.println("...c after...");
	}

	@Around("pointCut()")
	public Object around(ProceedingJoinPoint pjp) {
		System.out.println("...c around before...");

		Object result = null;
		try {
			result = pjp.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}

		System.out.println("...c around after...");
		return result;
	}

}

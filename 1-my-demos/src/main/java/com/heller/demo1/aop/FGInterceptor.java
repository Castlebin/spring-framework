package com.heller.demo1.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class FGInterceptor {

	@Pointcut("execution(* com.heller.demo1.service.F.*(..))" +
			"|| execution(* com.heller.demo1.service.G.*(..))")
	public void pointCut() { }

	@Before("pointCut()")
	public void before() {
		System.out.println("...f/g before...");
	}

	@After("pointCut()")
	public void after() {
		System.out.println("...f/g after...");
	}

	@Around("pointCut()")
	public Object around(ProceedingJoinPoint pjp) {
		System.out.println("...f/g around before...");

		Object result = null;
		try {
			result = pjp.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}

		System.out.println("...f/g around after...");
		return result;
	}

}

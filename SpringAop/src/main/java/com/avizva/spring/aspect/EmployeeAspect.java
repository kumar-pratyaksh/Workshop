package com.avizva.spring.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class EmployeeAspect {

	@Before("execution(public String getName())")
	public void getNameAdvice() {
		System.out.println("Function is going to be called");
		System.out.println(Thread.currentThread().getName());
	}

	@Before("execution(* com.avizva.spring.service.*.get*())")
	public void getAllAdvice() {
		System.out.println("Service method getter called");
	}

}

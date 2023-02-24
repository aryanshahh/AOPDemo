package com.AOP.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {
	
	
	@Before("execution(* com.AOP.Service.HelloImpl.helloUser(..))")
	public void printBefore() {
		System.out.println("Logging in...");
	}

	@After("execution(* com.AOP.Service.HelloImpl.helloUser(..))")
	public void printAfter() {
		System.out.println("What would you like to do..?");
	}

}

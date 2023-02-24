package com.AOP.Service;

public class HelloImpl implements HelloService{

	public void helloUser(String user) { 
		System.out.println("Hello "+user+" Welcome");
	}

}

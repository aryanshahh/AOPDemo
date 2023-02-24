package com.AOP;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.AOP.Service.HelloService;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );
    	ApplicationContext context =new ClassPathXmlApplicationContext("com/AOP/Config.xml");
    	HelloService serviceObject = context.getBean("hello", HelloService.class);
    	serviceObject.helloUser("Raj");
    }
}
  
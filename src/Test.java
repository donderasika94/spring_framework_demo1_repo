package com.capgemini.spring.test;

import org.springframework.context.ApplicationContext;
import com.capgemini.spring.renderer.MessageRenderer;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test{

	public static void main(String[] args){
		
	

		//constructor & setter injection using xml configuratuion

 		ApplicationContext context  = new  ClassPathXmlApplicationContext("context.xml");
		MessageRenderer renderer = (MessageRenderer)context.getBean("renderer");
		System.out.println(renderer.hashCode());
		

		MessageRenderer renderer1 = (MessageRenderer)context.getBean("renderer");
		System.out.println(renderer1.hashCode());
		renderer.render();
		
	}

}
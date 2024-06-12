package example.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class ReferanceInjectionExampleMain {

	public static void main(String[] args) {
		ApplicationContext context= 
		new ClassPathXmlApplicationContext("Spring-config2.xml");
		Object loadedobject = context.getBean("currentCustomer");
		System.out.println(loadedobject);


	}

}

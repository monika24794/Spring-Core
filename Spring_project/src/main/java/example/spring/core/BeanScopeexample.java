package example.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeexample {

	public static void main(String[] args) {
		ApplicationContext context = 
				 new ClassPathXmlApplicationContext("Spring-config3.xml");
		   Object obj= context.getBean("MyBean3");//1st
		   Object obj2=   context.getBean("MyBean3");//2nd
		   System.out.println(obj==obj2);
		   
		   
		   System.out.println("======================");
		   Object obj3= context.getBean("MyBean4");//1st
		   Object obj4=   context.getBean("MyBean4");//2nd
		   System.out.println(obj3==obj4);
	}
}

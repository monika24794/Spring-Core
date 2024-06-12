package example.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLoadingExampleMain {

	public static void main(String[] args) {
		 ApplicationContext context = 
				 new ClassPathXmlApplicationContext("Spring-config3.xml");//EAGAR Loading
		    context.getBean("MyBean2");//Lazy Instantiation
		    
		    
			
	}

}

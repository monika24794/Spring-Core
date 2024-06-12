package example.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClasspathXmlApplicatinContextMain {
public static void main(String[] args) {
	String configFile="spring-config.xml";
	ApplicationContext context=new ClassPathXmlApplicationContext(configFile);
	
	Object loadedObject=context.getBean("greet");
	GreetingService gs = (GreetingService)loadedObject;
	String replay =gs.sayGreeting();
	System.out.println(replay);
}
}

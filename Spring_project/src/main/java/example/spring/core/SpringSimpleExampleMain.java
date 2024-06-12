package example.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringSimpleExampleMain {

	public static void main(String[] args) {
		ApplicationContext context;
		String configPath = "./src/main/resources/Spring-config.xml";
		
		context = new FileSystemXmlApplicationContext(configPath);
		Object loadedobject=context.getBean("greet");
		//loaded object  call the method
		GreetingService gs = (GreetingService)loadedobject;
		//WelcomeService gs = (WelcomeService)loadedobject;
		
		String replay =gs.sayGreeting();
		System.out.println(replay);
	}

}

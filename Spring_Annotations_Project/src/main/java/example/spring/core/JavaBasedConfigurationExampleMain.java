package example.spring.core;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaBasedConfigurationExampleMain {

	public static void main(String[] args) {
		Class<Springconfig> configClass = Springconfig.class;
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(configClass);
		

		Object loadedObject = context.getBean("getHelloBean");
		GreetingService gs = (GreetingService) loadedObject;
		String replay = gs.sayGreeting();
		System.out.println(replay);
		
		System.out.println("==============================================================");
		loadedObject = context.getBean("greet");
		gs = (GreetingService) loadedObject;
		replay = gs.sayGreeting();
		System.out.println(replay);
		
		System.out.println("==============================================================");
		loadedObject = context.getBean("getCricketMatchResultBean");
		gs = (GreetingService) loadedObject;
		replay = gs.sayGreeting();
		System.out.println(replay);

	}

}

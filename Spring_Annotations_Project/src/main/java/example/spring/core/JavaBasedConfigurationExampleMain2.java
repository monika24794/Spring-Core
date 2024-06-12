package example.spring.core;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaBasedConfigurationExampleMain2 {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext();
		Class<Springconfig> configClass = Springconfig.class;
		
		context.register(configClass);// register
		context.refresh();// appay changes

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

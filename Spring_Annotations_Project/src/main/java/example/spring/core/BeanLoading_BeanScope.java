package example.spring.core;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanLoading_BeanScope {

	public static void main(String[] args) {
		Class<Springconfig> configClass = Springconfig.class;
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(configClass);
		Object obj= 
		context.getBean("MatchResultBean");
		System.out.println(obj);
		Object obj1= context.getBean("getCricketMatchResultBean");
		System.out.println(obj1);
		Object obj2= context.getBean("getCricketMatchResultBean");
		System.out.println(obj2);
		System.out.println("==========================");
		System.out.println(obj1==obj2);

	}

}

package example.spring.core;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AutoWiringExampleMAin {

	public static void main(String[] args) {
		Class<Springconfig2> configClass = Springconfig2.class;
		AnnotationConfigApplicationContext context=
				new AnnotationConfigApplicationContext(configClass);
		 Object obj =context.getBean("cust");
		 System.out.println(obj);

	}

}

package example.spring.core;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import desserts.IceCream;
import desserts.brownies.WalnutBrownie;
import juices.OrangeJuice;
import milkshake.MangoMilkshake;

public class PureAnnotationBasedExampleMain {

	public static void main(String[] args) {
		Class<Springconfig3> configClass = Springconfig3.class;
		AnnotationConfigApplicationContext context=
				new AnnotationConfigApplicationContext(configClass);
		
	Class<MyComponent> componentType= MyComponent.class;
		MyComponent myCompRef =
		context.getBean(componentType);
		myCompRef.testMyCompnent();
		
		Class<OrangeJuice> juiceComp= OrangeJuice.class;
		OrangeJuice juiceRef=context.getBean(juiceComp);
		juiceRef.testOrangeJuice();
		
		Class<MangoMilkshake> shakeComp= MangoMilkshake.class;
		MangoMilkshake shakeRef=context.getBean(shakeComp);
		shakeRef.testMangoMilkshake();

		Class<IceCream> icecreamComp= IceCream.class;
		IceCream icecreamRef= context.getBean(icecreamComp);
		icecreamRef.testMangoIceCream();

		Class<WalnutBrownie> WalnutBrownieComp= WalnutBrownie.class;
		WalnutBrownie WalnutBrownieRef= context.getBean(WalnutBrownieComp);
		WalnutBrownieRef.testeWalnutBrownie();
		 Object obj=context.getBean("sundae");
		 
		
		
		
		
	}

}

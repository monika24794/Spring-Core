package example.spring.core;

import org.springframework.stereotype.Component;

@Component //marks this class as a component than spring can manage it
public class MyComponent {

	public void testMyCompnent() {
		System.out.println("My Component test works................");
	}
}

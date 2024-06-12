package example.spring.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan
@ComponentScan(basePackages = {"example","juices","milkshake","desserts"})//for scanning base pkg single pkgjuices

public class Springconfig3 {

	//@bean method if any
	
}

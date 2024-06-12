package example.spring.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

@Configuration
public class Springconfig {
	
@Bean//marks this method as bean registration
// default id is the method name: getHelloBean
public GreetingService  getHelloBean() 
{ 
	GreetingService gs= new HElloService();
	return gs;
}
@Bean("greet")

public GreetingService  getWelcomeBean() 
{ 
	GreetingService gs= new WelcomeService();
	return gs;
}
@Bean
@Lazy// marks this bean as lazy
public GreetingService  MatchResultBean() 
{    //this is equivalent  to setter injection
	CricketMatchResult cm= new CricketMatchResult();
	cm.setWinningTeam("INDIA");
	cm.setLoseingTeam("Pakistan");
	cm.setWinningMargin(6);
	cm.setWinningType("Runs");
	return cm;
}
@Bean
@Scope("prototype")
public GreetingService  getCricketMatchResultBean() 
{    //this is equivalent  to Constructor injection
	GreetingService gs= new CricketMatchResult("INDIA", "Ireland", 6, "runs");
	return gs;
}
	
}

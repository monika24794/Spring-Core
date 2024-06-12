package example.spring.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

@Configuration
public class Springconfig2 {
	
@Bean("addr")
@Primary
public Address tempAddress()
{
	Address myAddress=new Address("Pune", 411015);
	return myAddress;
}

@Bean("addr1")
public Address temp2Address()
{
	Address myAddress=new Address("Nashik", 411015);
	return myAddress;
}
@Bean("cust")
public Customer getcustomer()
{
	//not setting permanent address  asking sprig to set it
	
	Customer customerRef=new Customer("monika", "c001", 27, null);
	return customerRef;
	
}

	
}

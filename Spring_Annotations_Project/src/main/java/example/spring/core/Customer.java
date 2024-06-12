package example.spring.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Customer {
	private String name;
	private String CustId;
	private int age;
	@Autowired
	//@Autowired(required = false)
	@Qualifier("addr1")
	 private Address parmantAddress;
	
	 public Customer() {

	}
	public Customer(String name, String custId, int age, Address parmantAddress) {
		super();
		this.name = name;
		CustId = custId;
		this.age = age;
		this.parmantAddress = parmantAddress;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCustId() {
		return CustId;
	}
	public void setCustId(String custId) {
		CustId = custId;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Address getParmantAddress() {
		return parmantAddress;
	}
	public void setParmantAddress(Address parmantAddress) {
		this.parmantAddress = parmantAddress;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", CustId=" + CustId + ", age=" + age + ", parmantAddress=" + parmantAddress
				+ "]";
	}
	
}

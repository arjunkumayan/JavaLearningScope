package Java8Features;

import java.util.Arrays;
import java.util.List;

public class StreamFilterFindAnyOrElse {

	public static void main(String[] args) {
	
		
		// list of customer object
		
		List<Customer> customersList =  Arrays.asList(
				                      new Customer("Tom", 30),
				                      new Customer("Steve", 32),
				                      new Customer("Peter", 34),
				                      new Customer("Simon", 35)
		
				);
		
		//1. filter:findAny
		
		Customer customer= customersList.stream()  // convert list to stream
		.filter(x -> "Peter".equals(x.getName())) // filter it for peter
		.findAny() // if it finds then return
		.orElse(null);
		
		System.out.println(customer.getName() + " " +customer.getAge());
		
		//1. filter: did not find any.. or else
		Customer customer1= customersList.stream()  // convert list to stream
				.filter(x -> "Arjun".equals(x.getName())) // filter it for peter
				.findAny() // if it finds then return
				.orElse(null);
		
		System.out.println(customer1);		
		
		//3. filter with multiple conditions:
		
		Customer customer2 =customersList.stream()
		.filter((x) -> "Simon".equals(x.getName()) && 35 == x.getAge())
		.findAny()
		.orElse(null);
		
		System.out.println(customer2.getName()+ " "+ customer2.getAge());
		
				
				

	}

}

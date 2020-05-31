package Java8Features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterMap {

	public static void main(String[] args) {
	
		List<Customer> customersList =  Arrays.asList(
                new Customer("Tom", 30),
                new Customer("Steve", 32),
                new Customer("Peter", 34),
                new Customer("Simon", 35)

                    );
		
	String name = customersList.stream()
		.filter(x -> "Peter".equals(x.getName()))
		.map(Customer::getName)
		.findAny()
		.orElse(null);
		
		System.out.println(name);
		System.out.println("-------------");
		// print all the names from the list avoid the age
		
		List<String> custNameList = customersList.stream()
		.map(Customer::getName)
		.collect(Collectors.toList());
		
		custNameList.forEach(System.out::println);
		System.out.println("-------------");
		
		// print all the age from the list avoid the name
		
		List<Integer> custAgeList = customersList.stream()
				.map(Customer::getAge)
				.collect(Collectors.toList());
		
		custAgeList.forEach(System.out::println);
		
	}

}

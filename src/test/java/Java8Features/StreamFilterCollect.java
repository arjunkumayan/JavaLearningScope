package Java8Features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterCollect {
	
	public static void main(String[] args) {
		
		List<String> productList = Arrays.asList("Shoes","Mac","iPhone","Battery Charger","Bat");
		
		System.out.println(productList);
		
		productList.forEach(ele -> System.out.println(ele));
		
		System.out.println("--------------");
		
		List<String>  result = productList.stream()
		           .filter(ele -> ! ele.equals("Shoes"))
		           .collect(Collectors.toList());
		
		result.forEach(ele -> System.out.println(ele));
		System.out.println("--------------");
		
		result.forEach(System.out::println);
		
		
		
		
		
		
		
	}

}

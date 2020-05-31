package Java8Features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsSetWithFlatMap {

	public static void main(String[] args) {

		
		Employee e1 = new Employee();
		e1.setName("Naveen");
		e1.addDevice("iphone9");
		e1.addDevice("Samsung9");
		e1.addDevice("iphoneX");
		e1.addDevice("macbook pro");
		
		
		Employee e2 = new Employee();
		e2.setName("Tom");
		e2.addDevice("lenovo windows10");
		e2.addDevice("Samsung9");
		e2.addDevice("iphone9");
		e2.addDevice("macbook air");
		
		
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(e1);
		empList.add(e2);
		
		List<String> deviceList = empList.stream()
		.map(x -> x.getDevices()) // Stream<Set<String>> 
		.flatMap(x -> x.stream())  // Steeam<String>
		.distinct()
		.collect(Collectors.toList());
		
		deviceList.forEach(x -> System.out.println(x));
		
	}

}

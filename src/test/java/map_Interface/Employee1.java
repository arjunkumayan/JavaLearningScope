package map_Interface;

import java.util.HashMap;
import java.util.Map;

public class Employee1 {

	int id;
	
	public Employee1(int id) {
		this.id = id;
		
	}
	
	
	

	


	public static void main(String[] args) {
		Employee1 e1= new Employee1(10);
		Employee1 e2= new Employee1(10);
		
		System.out.println(e1.equals(e2));
		
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		
		
		Map<Employee1,String> map= new HashMap<>();
		map.put(e1,"arjun");
		map.put(e2,"arjun");
		
		System.out.println(" hashmap size = "+map.size());
		
		
		Integer i1= new Integer(50);
		Integer i2= new Integer(50);
		
		Map<Integer,String> map2= new HashMap<>();
		map2.put(i1, "singh");
		map2.put(i2, "singh");
		
		System.out.println(i1.equals(i2));
		System.out.println(i1.hashCode());
		System.out.println(i2.hashCode());
		
		
		System.out.println("Integer size: "+map2.size());

	}

}

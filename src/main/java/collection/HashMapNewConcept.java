package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapNewConcept {

	public static void main(String[] args) {

		// it implements the ' abstractMap ' interface 
		// HashMap is a class implements Map interface
		// it contains only unique elements
		// Contains values on the basis of key and value pair
		//  it may have one null key and multiple null values
		// it maintains no order
		// it does not store the value on the basis on order
		// Non synchronized - not multithread safe
		// concurrent modification exception- fail- fast conditon - multiple thread may attach the object 
		
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(1, "Selenium");
		hm.put(2,"QTP");
		hm.put(3,"Automation");
		hm.put(4,"Test");
		hm.put(4, "Test1");
		hm.put(null, "Arjun");
		System.out.println(hm.get(null));
		
		
		System.out.println(hm.get(4));
		System.out.println(hm.get(1));
		
		System.out.println(hm.get(5)); // Note indexOut of Bound exception
		//How to iterate the map
		
		for(Entry<Integer, String> emap:hm.entrySet())
		{
			//System.out.println(emap);
			System.out.println(emap.getKey()+" "+emap.getValue());
			
		}
		
		Employee emp1=new Employee("Arjun", 26, "QA");
		Employee emp2=new Employee("sonu", 20, "Dev");
		Employee emp3=new Employee("manoj", 30, "Devops");
		Employee emp4=new Employee("sahil", 35, "test");
		
		HashMap<Integer,Employee> hmp=new HashMap<Integer,Employee>();
		
		hmp.put(1, emp1);
		hmp.put(2, emp2);
		hmp.put(3, emp3);
		hmp.put(4, emp4);
		
		// entrySet()- which is used to iterate the map
		
		for(Entry<Integer,Employee> m:hmp.entrySet())
		{
			int key=m.getKey();
			Employee e=m.getValue();
			System.out.println("Employee"+key+" Info");
			
			System.out.println(e.empName+" "+e.dept+" "+e.age);
		}
		
		
		
		
		
		
	}

}

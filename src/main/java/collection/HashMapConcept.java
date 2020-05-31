package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapConcept {

	public static void main(String[] args) {
		
		
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(1, "Selenium");
		hm.put(2, "QTP");
		hm.put(3, "TestComplete");
		hm.put(4, "TESTNG");
	hm.put(5,"QTP");
	System.out.println(" unique "+hm.get(4));
		System.out.println(hm.get(1));
		System.out.println(hm.get(4));
		
		System.out.println(" key set "+hm.keySet());
		System.out.println("hello"+hm.containsKey(1));
		
		System.out.println(hm.entrySet());
		
		for(Entry m : hm.entrySet())
		{
		System.out.println(m.getKey()+" "+m.getValue());	
		}

		hm.remove(3);
		System.out.println(hm.get(4));

		
		System.out.println(hm.get(3));
	
	Employee e1=new Employee("Arjun", 25, "QA");
	Employee e2=new Employee("Rahul",28,"CSE");
	Employee e3=new Employee("Manoj",30,"Dev");
	
	HashMap<Integer,Employee> emp=new HashMap<Integer,Employee>();
	emp.put(1,e1);
	emp.put(2, e2);
	emp.put(3, e3);
	
	for(Entry<Integer,Employee> m:emp.entrySet())
	{
		int key=m.getKey();
	            Employee e=m.getValue();
	            
	            System.out.println("key info "+key);
	            
	            System.out.println(e.empName);
	            System.out.println(e.dept);
	            System.out.println(e.age);
	            
	}
	
	
	
	}

}

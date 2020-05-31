package MapInterface;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import ListInterface.Employee;

public class HashMapConcept {

	public static void main(String[] args) {
		
		
		// hashmap implements map interface
		// extends abstract map
		
		// contains only unique elements
		// stores the values in the form of key and value pair
		// excel data, zip codes, env variable
		
		// it may have one null key and multiple null values
		// it maintains no order
		// non synchronized
		
		
		
		HashMap<Integer,String> hm=new HashMap<Integer,String>();

		hm.put(1, "Selenium");
		hm.put(2, "QTP");
		hm.put(3, "TestComplete");
		hm.put(3, "TT");
		hm.put(4, "REST");
		System.out.println(	hm.get(1));
hm.get(4);
System.out.println("duplicate "+hm.get(3));

hm.put(null, "Helllo");
hm.put(null, "Helllo1");
hm.keySet();


for(Entry<Integer, String> entryMap :hm.entrySet())
{
	System.out.println(entryMap.getKey());
	System.out.println(entryMap.getKey()+" "+entryMap.getValue());
}

System.out.println(hm);

hm.remove(4);
System.out.println(hm);
	Employee e1=new Employee("Tom",36,"QA");
	Employee e2=new Employee("peter",26,"DEV");
	Employee e3=new Employee("Navee",56,"RFT");
	
	HashMap<Integer,Employee> emp=new HashMap<Integer,Employee>() ;
	
	emp.put(1, e1);
	emp.put(2, e2);
	emp.put(3, e3);
	
	for(Entry<Integer, Employee> m:emp.entrySet())
	{
		int ekey=m.getKey();
		Employee e=m.getValue();
	System.out.println(ekey);
	System.out.println(e);
	
	}
	
	
	}

}

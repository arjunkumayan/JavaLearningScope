package collection;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class HashTableConcept {

	public static void main(String[] args) {
		
		Hashtable ht=new Hashtable();
		ht.put(1, "Tom");
		ht.put(2, "Test");
		ht.put(3, "Java");
		
		// create a clone of copy ht
		
		Hashtable hs=new Hashtable();
		
		hs=(Hashtable) ht.clone();
		
System.out.println("The values from ht"+ht);
System.out.println("The values from hs"+hs);
	
	ht.clear();
	
	System.out.println("The values from ht"+ht);
	System.out.println("The values from hs"+hs);
	
	
	Hashtable hs1=new Hashtable();
	hs1.put(1, "Naveen");
	hs1.put(2, "Managr");
	hs1.put(3, "Selenium");
	
	
	Hashtable hs2=new Hashtable();
	hs2.put(1, "Naveen");
	hs2.put(2, "Managr");
	hs2.put(3, "Selenium");
	//hs2.put(4, "RFT");
	
	Hashtable hs3=new Hashtable();
	hs3.put('A', "Naveen");
	hs3.put('B', "Managr");
	hs3.put('C', "Selenium");
	
	//hs3.put(null, "Selenium"); - null key not allowed
	
	//hs3.put('D', null);  - null value not allowed
	
	if(hs1.containsValue("Selenium"))
	{
		System.out.println("found");
		
	}
	//print all the values from hashtable using Enumeration- elements()
	Enumeration e=hs1.elements();
	
	System.out.println("print values from hs1");
	while(e.hasMoreElements())
	{
		System.out.println(e.nextElement());
	}
	
//  get all the values from hashtable using entrySet()  -- set of hastable values
	System.out.println("print using entry");
	
	Set s=hs1.entrySet();
	System.out.println(s);
	
	
	System.out.println(hs1.equals(hs2));
	
	if(hs1.equals(hs2))
	{
		System.out.println("both are equals");
	}
	
	
	
	System.out.println("the hashcode values of hs1"+hs1.hashCode());
	
	
	System.out.println(hs1.get(1));
	}

}

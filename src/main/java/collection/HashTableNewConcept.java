package collection;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class HashTableNewConcept {

	public static void main(String[] args) {
// HashMap - non Synchronized and HashTable - Synchronized
		// key,value pair
		// it stores the value on the basis of hashcode of object
		// it is similar to hashmap but its synchronized
		// stores the val on the basis of key-val
		
		// key-Object- hashcode-->value (key is store on the basis of object and each object is having a hashcode and value is stored on the basis of hashcode)
		//// it contains unique values
		
		// no null key and null values
		Hashtable h1=new Hashtable();
		h1.put(1, "Tom");
		h1.put(2, "Test");
		h1.put(3, "java");
		// h1.put(null, "Selenium");// null pointer exception
		// h1.put(4, "Automation");// null pointer exception
		
		
		Hashtable h2=new Hashtable();
		
		
		h2=(Hashtable) h1.clone();
		System.out.println(h1);
		System.out.println(h2);
		
		h1.clear();
		System.out.println(h1);
		System.out.println(h2);
		
		
		//contains value
		
		Hashtable st=new Hashtable();
		st.put("A", "Arjun");
		st.put("B", "binod");
		
		if(st.containsValue("Arjun"))
		{
			System.out.println("Value is find");
		}
		
		if(st.containsKey("A"))
		{
			System.out.println("key is found");
		}
		
		//print the values of hashtable using -Enumeration- elements()
		
		Enumeration e=st.elements();
		while(e.hasMoreElements())
		{
		System.out.println("print values from st="+e.nextElement());
		}
		//get all the values from hastable using - entrySet() - set of hashtable values
		
		Set s=st.entrySet();
		
		System.out.println("value of="+s);
		

		Hashtable st1=new Hashtable();
		st1.put("A", "Arjun");
		st1.put("B", "binod");
		
		
		// check both the hashtable are equals or not
		
		if(st.equals(st1))
		{
			System.out.println("Both are equal");
		}
		
		//get the value from a key
		
		System.out.println(st.get("A"));
		
		//get the hashcode of the hashtable object
		
		System.out.println("the hashcode value of st object is="+st.hashCode());
		
		System.out.println("Values from st1");
		System.out.println(st1);
		
		//generics
		Hashtable<String,String> ht1=new Hashtable<String,String>();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

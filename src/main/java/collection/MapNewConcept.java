package collection;

import java.util.HashMap;
import java.util.Map;

public class MapNewConcept {

	public static void main(String[] args) {
		
		Map<String,String> mp=new HashMap<String,String>();
		//map - key and value format
		// hashmap,hashtable,linkedhashmap,sortedmap,navigable map,TreeMap
		// 1. error codes (1.2.1 - fatal error)
		// map of managers and employess
		// test data storage
		// env variables/configuration
		// Headers in Rest API
		
		
		
		mp.put("Arjun","uk");
		mp.put("ankit","MP");
		mp.put("sathees","Bangalore");
		
		System.out.println(mp.get("Arjun"));
		for(int i=0;i<mp.size();i++)
		{
System.out.println(mp);
		}
		
		System.out.println(mp.containsKey("ankit"));
		System.out.println(mp.containsValue("MP"));
		
		
		// Map
		
		// put()
		// putAll()
		// get(key)
		//containsKey(key)
		//keySet()- returns the set value which help to iterate the map
		//entrySet()

	}

}

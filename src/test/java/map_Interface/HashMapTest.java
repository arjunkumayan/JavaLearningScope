package map_Interface;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		
		HashMap hm = new HashMap<>();
		hm.put("Arjun", 111);
		hm.put("anu", 111);
		hm.put("banu", 111);
		
		
		System.out.println(hm.get("Arjun"));
		System.out.println(hm.get(111));
		System.out.println(hm.containsKey("Arjun"));
		System.out.println(hm.containsKey("Arjun1"));
		System.out.println(hm.containsValue(111));
	
		
		Set s1 = hm.keySet();
		System.out.println("All keys: "+s1);
		
		Collection val = hm.values();
		System.out.println("All values: "+val);
		
		
		Set ss=hm.entrySet();
		System.out.println("All enteries: "+ss);
		
			
		Iterator  it=  ss.iterator();
		
		while(it.hasNext()) {
			Map.Entry m= (Map.Entry) it.next();
			
			System.out.println(m.getKey()+"-"+m.getValue());
		}
		}

}

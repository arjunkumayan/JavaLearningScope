package KKJavaTutorial;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapConcept {

	public static void main(String[] args) {
		HashMap h = new HashMap<>();
		h.put("ratan", 111);
		h.put("anu", 111);
		h.put("banu", 111);
		
		System.out.println(h.containsKey("ratan"));
		System.out.println(h.containsValue(111));
		
		Set s1 = h.keySet();
		System.out.println("all keys: "+s1);
		
		Collection c = h.values();
		System.out.println("all values: "+c);
		
		
		Set s2 = h.entrySet();
		System.out.println("All entries: "+s2);
		Iterator itr = s2.iterator();
		
		while(itr.hasNext()) {
			Map.Entry m= (Entry) itr.next();
			System.out.println(m.getKey()+ " "+m.getValue());
		}
		
		
		

	}

}

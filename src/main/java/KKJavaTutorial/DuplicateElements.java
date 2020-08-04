package KKJavaTutorial;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateElements {

	public static void main(String[] args) {
		
		
		String names[] = {"java","C","JavaScript","Ruby","C","python","java"};

		// compare each elements
		// time complexity - o(n2)
		for(int i=0 ; i<names.length ;i++) {
			for(int j=i+1; j<names.length ; j++) {
				if(names[i].equals(names[j])) {
					System.out.println(" duplicate element is:: "+names[i]);
				}
				
			}
		}
		
		
		// Using HashSet 
		// stores only unique values
		
		Set<String> store = new HashSet<String>();
		for(String name: names) {
			
			if(store.add(name) == false) {
				System.out.println(" duplicate element is with set example:: "+name);

				
			}
		}
		
		// using HashMap
		
		HashMap<String,Integer> storeMap = new HashMap<String,Integer>();
		
		
		for(String name:names) {
			Integer  count = storeMap.get(name);
			if(count ==null) {
				storeMap.put(name, 1);
				
			}
			else {
				storeMap.put(name, ++count);
			}
		}
		
		// get the values from this HashMap
		Set<String> ent = storeMap.keySet();
		for(String n:ent) {
			if(storeMap.get(n)>1) {
				System.out.println("The system output for dupllicate element is: "+n+ ": "+storeMap.get(n));
			}
		}
		
		Set<Entry<String, Integer>> entrySet = storeMap.entrySet();
		for(Entry<String, Integer> entry: entrySet) {
			if(entry.getValue()>1) {
				System.out.println("duplicate element is--::"+entry.getKey()+": "+entry.getValue());
				
			}
		}
		
		
		
	}

}

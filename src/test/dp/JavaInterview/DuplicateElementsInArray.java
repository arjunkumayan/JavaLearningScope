package JavaInterview;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateElementsInArray {

	public static void main(String[] args) {
		
		String names[] = {"java","javascript","ruby","c","python","c","java"};
		
		
		for( int i=0 ; i<names.length ; i++) {
			
			for( int j = i+1 ; j<names.length ; j++) {
				
				if(names[i].equals(names[j])) {
					System.out.println("Duplicates element is = "+names[i]);
				}
			}
		}
		
		
		//2. using Hashset : java collection
		
		Set<String> store = new HashSet<String>();
	
		for(int i=0 ; i<names.length  ; i++) {
			
//			boolean result = store.add(names[i]);
//			if(result) {
//				System.out.println("Not a duplicate");
//				}
//			else {
//				System.out.println("its a duplicate = =="+names[i]);
//			}
//			
			if(store.add(names[i])==false) {
				System.out.println("its a duplicate value: "+names[i]);
			}
		}
		
		System.out.println("=----------Hashmap ---");
		
		//3. Using Hashmap
		Map<String, Integer> storeMap = new HashMap<String,Integer>();
		
		for(String name: names) {
			
			Integer count = storeMap.get(name);
			if(count ==null) {
				storeMap.put(name, 1);
			}
			else {
				storeMap.put(name, ++count);
			}				
			
		}
		
		Set<Entry<String, Integer>> val= storeMap.entrySet();
		
		for(Entry<String,Integer> entry:val) {		
			
			if(entry.getValue()>1) {
				System.out.println("Duplicate elements is: "+entry.getKey());
			}
		}
//		
//		for(Entry test:val) {		
//			
//			System.out.println(test.getKey()+ " and "+test.getValue());
//			
//			
//		}
		
		
		
		
		
	}

}

package KKJavaTutorial;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateWordInStringArrayUsingHashMap2 {

	public static void main(String[] args) {
	
		String lang[] = {"java","c","c++","python","java","python"};
		
		
		HashMap<String,Integer> storeMap = new HashMap<>();
		
		for(String name:lang) {
			Integer count =storeMap.get(name);
			if(count ==null) {
				storeMap.put(name, 1);
			}
			else {
				storeMap.put(name, ++count);
			}			
		}
		
		Set<Entry<String, Integer>> getStoreMapValue = storeMap.entrySet();
		
		for(Entry<String, Integer> st:getStoreMapValue) {
			
			if(st.getValue()>1) {
				System.out.println("Key= "+st.getKey()+ " Value= "+st.getValue());
			}
		}
		
		
		
		
		
		

	}

}

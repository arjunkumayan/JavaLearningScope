package KKJavaTutorial;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateWordInStringArrayUsingHashMap {

	public static void main(String[] args) {
	
		String arr[] = {"java","c","c++","python","java","python"};
		
		
		HashMap<String,Integer> hm = new HashMap<>();
		
		for(String lang:arr) {			
			int count=0;
			if(hm.containsKey(lang)) {
				hm.put(lang, hm.get(lang)+1);
				}
			else {
				hm.put(lang, 1);
			}			
			// Extracting the values
			
			Set<Entry<String, Integer>> store = hm.entrySet();
					
			for( Entry<String, Integer>  st : store) {
				System.out.println(st.getKey() + " "+st.getValue());				
				if(st.getValue()>1) {
					System.out.println("Key = "+st.getKey()+" Value:  "+st.getValue());
				}
			}
			
		}
		
		
		

	}

}

package amazon;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMaptest2 {

	public static void main(String[] args) {
		String names = "java is java best programming language is java";
		
		String ar[] = names.split(" ");
		
		
		Map<String,Integer> storeMap = new HashMap<String,Integer>();
		
	
		
		for(String name: ar) {
			Integer count = storeMap.get(name);
			if(count == null) {
				storeMap.put(name, 1);
			}
			else {
				storeMap.put(name, ++count);
			}
//			if(storeMap.containsKey(name)) {
//				storeMap.put(name, storeMap.get(name)+1);
//			}
//			else {
//				storeMap.put(name, 1);				
//			}
			
			
		}

		
		Set<Entry<String,Integer>> set =storeMap.entrySet();
		for(Entry<String,Integer> entry: set) {
			if(entry.getValue()>1) {
				System.out.println("Duplicate key: "+entry.getKey()+ " value: "+entry.getValue());
			}
			
			//System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}

}

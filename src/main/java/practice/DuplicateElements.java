package practice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

public class DuplicateElements {

	public static void main(String[] args) {
		
		String names[] = {"java","javascript","ruby","c","python","java","ruby","c"};
		
//		for(int i=0 ; i<names.length ; i++) {
//			
//			for(int j = i+1; j<names.length ; j++) {
//				if(names[i].equals(names[j]))
//				System.out.println("Duplicate element is: "+names[i]);
//			}
//		}
		
		//2.
//		Set<String> storeSet = new HashSet<String>();		
//		for(String name: names) {			
//			if(storeSet.add(name) == false) {
//				System.out.println("Duplicate element is: "+name);				
//			}		
//		}
		
		//3. Using Hashmap
		
		Map<String,Integer> storeMap = new HashMap<String,Integer>();
		
//		for(String name: names) {			
//			if(storeMap.containsKey(name)) {				
//				storeMap.put(name, storeMap.get(name)+1);
//			}
//			else {
//				storeMap.put(name,1);
//			}
//		}
		
		for(String name1: names) {
			Integer count = storeMap.get(name1);
			if(count == null) {
				storeMap.put(name1, 1);
			}
			else {
	          storeMap.put(name1, ++count);			
			}
		}
		
//		Set<Entry<String, Integer>> storeValue = storeMap.entrySet();
//		
//		for(Entry<String, Integer> v: storeValue) {
//			//System.out.println(v.getKey()+ " " + v.getValue());
//			
//			if(v.getValue()>1) {
//				System.out.println("Duplicate element is: "+v.getKey());
//			}
//		}
		
		Set<Entry<String, Integer>> entrySet = storeMap.entrySet();
		Iterator<Entry<String, Integer>>  it1 = entrySet.iterator();
		while(it1.hasNext()) {
			 Entry<String,Integer> en=it1.next();			 
			System.out.println(en.getKey());
			System.out.println(en.getValue());			
		}
//		for(Entry<String,Integer> entry: entrySet)
//		{
//			if(entry.getValue()>1) {
//				System.out.println(entry.getKey() + " count: "+entry.getValue());
//			}
//		}
		
//		Set<String> ent=storeMap.keySet();
//		
//		Iterator<String> it = ent.iterator();
//		
//		while(it.hasNext()) {
//			System.out.println(" Map value: "+it.next());
//		}

		
		TreeSet<String> tr=  new TreeSet<String>();
		//tr.add(null);
		
		//tr.add(null);
		
		tr.add("arjun");
		tr.add("singh");
		
		Iterator<String> itr = tr.iterator();
		while(itr.hasNext()) {
			String str = itr.next();
			System.out.println(str);
		}
	}

}

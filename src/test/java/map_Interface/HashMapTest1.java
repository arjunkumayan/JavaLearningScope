package map_Interface;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapTest1 {

	public static void main(String[] args) {
		
		HashMap<Integer,String> mapTest = new HashMap<>();
		mapTest.put(101, "Arjun");
		mapTest.put(102, "Priyank");
		mapTest.put(103, "Kuldeep");
		mapTest.put(104, "Mukesh");
				
		mapTest.put(null, null);
		
		mapTest.put(null, null);
		mapTest.put(105, null);
		
		
		Set<Integer> keysSet = mapTest.keySet();
		keysSet.forEach(values ->{
			System.out.println(values);
		});
		
		System.out.println("Values ---------------");
		Collection<String> valuesSet = mapTest.values();
		valuesSet.forEach(values->{
			System.out.println(values);
		});
		
		System.out.println(" test ------------");
		boolean va = mapTest.containsKey(101);
         System.out.println(va);
         
         boolean test= mapTest.containsValue("Kuldeep");
         System.out.println(test);
         
         Set<Entry<Integer, String>> setValues = mapTest.entrySet();
         Iterator<Entry<Integer, String>> it = setValues.iterator();
         while(it.hasNext()) {
        	 Entry<Integer, String> entry= it.next();
        	 System.out.println(entry.getKey()+ " "+entry.getValue());
       
        	 
         }
         
        
         for(Map.Entry<Integer, String> e: mapTest.entrySet()) {
        	 
        	 System.out.println("testing another way");
        	 System.out.println(e.getKey()+" :" +e.getValue());
        	 
         }
      
		
	}

}

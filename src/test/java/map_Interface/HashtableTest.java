package map_Interface;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashtableTest {

	public static void main(String[] args) {
		Hashtable<String,String> hs = new Hashtable<>();
		
		//hs.put("11", null);
		 // hs.put(null, "111");
         hs.put("1", "one");
         hs.put("2", "two");
         hs.put("3", "three");
         hs.put("4", "four");
         
         System.out.println(hs.get("1"));
         System.out.println(hs.isEmpty());
         
         hs.remove("3");
         
         System.out.println(hs.containsKey("3"));
         System.out.println(hs.containsValue("three"));
         System.out.println(hs.containsValue("four"));
         
         hs.keys();
         Set<String> sss = hs.keySet();
         for(String s:sss) {
        	 System.out.println(s);
         }
         
         Collection<String> val =  hs.values();
         for(String v:val) {
        	 System.out.println(v);
         }
         System.out.println(hs.containsValue("three"));
         Set<Entry<String, String>> se= hs.entrySet();
         Iterator<Entry<String, String>> it= se.iterator();
         while(it.hasNext()) {
        	 Entry<String, String> entry= it.next();
        	 System.out.println(entry.getKey()+" - "+entry.getValue());
         }
         
         
	}

}

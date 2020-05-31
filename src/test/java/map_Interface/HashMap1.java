package map_Interface;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap1 {

	public static void main(String[] args) {
	
		HashMap<Object,Object> hm = new HashMap<>();
		/*
		 * hm.put(null, 1); hm.put(null, 2); hm.put(3, null);
		 */
		
		hm.put("Yerwada", 411006);
		hm.put("pimpri",  411018);
		hm.put("wagholi", 411008);
		hm.put("Kharadi", 411010);
		hm.put("hadapsar", 411020);
		hm.put("kharalwadi", 411019);
		hm.put(null, 1);
		hm.put(null, 2);
		System.out.println(hm.entrySet());
		
		Set k = hm.entrySet();
		
		
		for(Object key: k)
		{
			System.out.println(key);
		}
		
		Set<Entry<Object, Object>> map =hm.entrySet();
		System.out.println(map);
		System.out.println();
		for(Map.Entry map1 : hm.entrySet())
		{
			System.out.println(map1.getKey()+ " Value=  "+map1.getValue());
			
		}
		
		System.out.println();
		for(Entry<Object, Object> h: hm.entrySet()) {
			System.out.println(h.getKey());
			System.out.println(h.getValue());
			System.out.println(h.getKey().equals("pimpri"));
			if(h.getKey().equals("pimpri"))
			{
				System.out.println("Value = "+h.getValue());
			}
			
		}
	}

}

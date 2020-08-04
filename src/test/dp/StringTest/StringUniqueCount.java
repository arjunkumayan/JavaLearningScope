package StringTest;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class StringUniqueCount {
	
	public static int findUnqiueCharactersString(String str) {
		
		if(str==null || str.isEmpty() || str.length() ==0) {
			return 0;
		}
		
		Set<Character> set = new HashSet<>();
		
		for(int i=0; i<str.length() ; i++) {
			set.add(str.charAt(i));
		}
		
		
		return set.size();
	}
	

public static int findUnqiueCharactersStringUsingMap(String str) {
		
		if(str==null || str.isEmpty() || str.length() ==0) {
			return 0;
		}
		
		Map<Character,Integer> map = new HashMap<>();
		
		int count=0;
		
		for(int i=0; i<str.length() ; i++) {
			
			if(map.containsKey(str.charAt(i))) {
				map.put(str.charAt(i), map.get(str.charAt(i))+1);
			}
			 else { map.put(str.charAt(i), 1); }
			 			
		
		}
		
		Set<Character> keysTest = map.keySet();
		keysTest.forEach(Val->{
			System.out.println(Val);
		});
		
		System.out.println(map);
//		Set<Entry<Character, Integer>> entry = map.entrySet();
//		
//		System.out.println(entry);
//		
		
		
		return 1;
	}
	
	public static void main(String[] args) {
		String str = "bccbababd";
		
	//	System.out.println(findUnqiueCharactersString(str));
		findUnqiueCharactersStringUsingMap(str);

	}

}

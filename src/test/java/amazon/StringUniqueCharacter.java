package amazon;

import java.util.HashSet;
import java.util.Set;

public class StringUniqueCharacter {

	public static void main(String[] args) {
	
		String str = "bccbababd";
		
		Set<Character> s = new HashSet<>();
		
		for(int i=0 ; i<str.length() ; i++) {
			
			boolean result = s.add(str.charAt(i));
			
			if(result == false) {
				System.out.println(str.charAt(i) + "is duplicate ");
			}
			
		}
		
		System.out.println(s.size());
	}

}

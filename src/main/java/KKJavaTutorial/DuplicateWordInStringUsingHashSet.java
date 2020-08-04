package KKJavaTutorial;

import java.util.HashSet;

public class DuplicateWordInStringUsingHashSet {

	public static void main(String[] args) {

		String arr[] = {"java","c","c++","python","java","python"};
		
		
		
		HashSet<String> hs= new HashSet<>();
		
		boolean flag = false;
		for(String s:arr) {
			
		//	System.out.println(s);
			//System.out.println(hs.add(s));
				
			
			if(hs.add(s)!=true) {
				System.out.println("Duplicate is: "+s);
				flag = false;
			}
			else {
				System.out.println("Not a duplicate value");
				
			}
			
			if(flag ==false) {
				System.out.println("There are no duplicates");
			}
			
			
		}

	}

}

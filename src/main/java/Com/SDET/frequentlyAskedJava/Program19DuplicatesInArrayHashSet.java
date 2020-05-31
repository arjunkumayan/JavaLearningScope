package Com.SDET.frequentlyAskedJava;

import java.util.HashSet;

public class Program19DuplicatesInArrayHashSet {

	public static void main(String[] args) {

		
		String arr[] = {"java","c","c++","Python","java"};
		
		// logic- HashSet- does not take duplicate
		HashSet<String> langs = new HashSet<String>();
		
		//System.out.println(langs.add("java"));
		//System.out.println(langs.add("python"));
		//System.out.println(langs.add("java"));
		
		boolean flag = false;
		
		for(String value: arr)
		{
			if(langs.add(value)==false)
					{
				System.out.println(" duplicates elements: "+value);
				flag = true;
				
					}
		}
		
		if(flag==false)
		{
			System.out.println(" not duplicate found ");
		}
		
	}

}

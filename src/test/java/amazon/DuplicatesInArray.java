package amazon;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicatesInArray {

	public static void main(String[] args) {
		int arr[] = {1,4,4,4,5,6,7,7,8};
		
		List<Integer> list= new ArrayList<Integer>();
		
		Set<Integer> set = new HashSet<Integer>();
		
		for(int i=0 ; i<arr.length ; i++) {
			
			if(set.add(arr[i])) {
				System.out.println("value: "+arr[i]);
			}	
			
		}

		System.out.println(set.toString());
	}

}

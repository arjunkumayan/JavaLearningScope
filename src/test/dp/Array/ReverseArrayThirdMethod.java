package Array;

import java.util.Arrays;
import java.util.Collections;

public class ReverseArrayThirdMethod {

	public static void reverseArray(int arr[]) {
		
		if(arr.length<1) {
			return ;
		}
				
		int len = arr.length;
		
		int t=0;
		for(int i=0; i<len/2 ; i++) {
			t = arr[i];
			arr[i] = arr[len-i-1];
			arr[len-i-1]=t;
		}
	
		
		
		
		
	}
	
	public static void main(String[] args) {
		
		Integer arr[] = {1,2,3,4,5};
		
		System.out.println("Before reversing the main array: ");
		for(int i=0 ;i<arr.length ; i++) {
			System.out.print(arr[i]+ " ");
		}
		
		Collections.reverse(Arrays.asList(arr));
	   
	    
	    System.out.println("After reversing the main array: ");
		for(int i=0 ;i<arr.length ; i++) {
			System.out.print(arr[i]+ " ");
		}
	
		

	}

}

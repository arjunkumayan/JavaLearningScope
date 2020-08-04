package Array;

import java.util.Arrays;
import java.util.Collections;

public class ReverseArray {

	public static int[] reverseArray(int arr[]) {
		
		int len = arr.length;
		int newArr[] = new int[len];
		
		int j=len;
		for(int i=0; i<len; i++) {
			
			newArr[j-i-1] = arr[i];
		}
		
		return newArr;
		
	}
	
	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5};
		
		Integer arr1[] = {1,2,3,4,5};
		
		 Collections.sort(Arrays.asList(arr1));
		
		System.out.println(" arr1");
		for(int i=0; i<arr1.length ; i++) {
			System.out.println(arr1[i]+ " ");
		}
		
		System.out.println("Before reversing the main array: ");
		for(int i=0 ;i<arr.length ; i++) {
			System.out.print(arr[i]+ " ");
		}

		
	System.out.println("After reversing");
		
	int newTypeArr[] =reverseArray(arr);
		
	for(int i=0 ;i<arr.length ; i++) {
		System.out.print(newTypeArr[i]+" ");
	}
		

	}

}

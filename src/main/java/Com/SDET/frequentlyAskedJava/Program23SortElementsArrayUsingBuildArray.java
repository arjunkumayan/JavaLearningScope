package Com.SDET.frequentlyAskedJava;

import java.util.Arrays;
import java.util.Collections;

public class Program23SortElementsArrayUsingBuildArray {

	public static void main(String[] args) {
    int arr[] = {10,50,40,60,90,80,120};
    int arr1[] = {9,50,40,80,90,20,19};
    System.out.println("Before sorting array"+Arrays.toString(arr));
   
    int len = arr.length;
    // Approach -1 
    Arrays.parallelSort(arr);
    
    Arrays.parallelSort(arr);
  		
    System.out.println("after sorting array: "+Arrays.toString(arr));	
    
    // Approach - 2
    
        Arrays.sort(arr1);
		System.out.println("After sorting the array: "+Arrays.toString(arr1));
		
		
		// Approach - 3 - descending order
		 Integer arr2[] = {19,50,90,80,10,20,29};
		 Arrays.sort(arr2,Collections.reverseOrder());
		 System.out.println("After sorting the array: "+Arrays.toString(arr2));
		
	}

}

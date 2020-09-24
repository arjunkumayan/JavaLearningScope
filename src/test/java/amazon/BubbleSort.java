package amazon;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {


		int arr[] = {4,2,1,5,3};
		
		System.out.println("Before Sorting: "+Arrays.toString(arr));
		
		
		int n= arr.length;
		
		for(int i=0 ; i<n ; i++) {
			
			for(int j=0 ; j<n-1 ; j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
				
			}
		}
		

		System.out.println("Array after Sorting: "+Arrays.toString(arr));
	}

}

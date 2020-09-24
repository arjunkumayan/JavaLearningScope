package amazon;

import java.util.Arrays;

public class ArrayRotateLib {
	
	public static int[] reverseArray1(int arr[], int n) {
		
		if(arr.length<=1) {
			return arr;
		}
		int len = arr.length;		
		int new_array[] = new int[n];
		int j=n;
		
		for(int i=0; i<n ; i++) {
			new_array[j-i-1] = arr[i];
		}
		
		return new_array;
	}
	
	public static void reverseArray2(int arr[], int n) {
		if(arr.length<=1){
			return;
		}
		
		for(int i=0 ; i<n/2; i++) {
			int temp = arr[i];
			arr[i] = arr[n-i-1];
			arr[n-i-1] = temp;
		}
		
	}
	
	public static void printArray(int arr[]) {
		
		for(int i=0 ; i<arr.length; i++) {
			System.out.println(arr[i]+" ");
		}
	}

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7};
		
 // int a[] = reverseArray1(arr,7);

  //System.out.println(Arrays.toString(a));
		//printArray(arr);
		
  reverseArray2(arr, 7);
  
  printArray(arr);
  
	}

}

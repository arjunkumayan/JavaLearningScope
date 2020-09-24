package amazon;

import java.util.Arrays;
import java.util.Collections;

public class ArrayRotate {
	public static void arrayNumber(int arr[], int d, int n) {		
		for(int i=0; i <d ; i++) {
			arrayRotate(arr, n);
		}		
	}
	
	public static void arrayRotate(int arr[], int n) {
		int temp = arr[0];
		for(int i=0; i <n-1 ; i++) {			
			arr[i] = arr[i+1];
			arr[i+1] = temp;
		}
	}
	
	public static void printArray(int arr[], int n) 
    { 
        for (int i = 0; i < n; i++) 
            System.out.print(arr[i] + " "); 
    } 

	public static void main(String[] args) {
	
		int arr[] = {1,2,3,4,5,6,7};
		
		arrayNumber(arr, 2, 7);
		
		printArray(arr, 7);
		
		
		String str1 = "HELLO";
		String str2 = "LEHLO";
		
		char ch[] = str1.toCharArray();
		
		Arrays.sort(ch);
		
		char ch2[] = str2.toCharArray();
		
		Arrays.sort(ch2);
		
		String.valueOf(ch).equals(String.valueOf(ch2));

	}

}

package Com.SDET.frequentlyAskedJava;

import java.util.Arrays;

public class Program22BubbleSort {

	public static void main(String[] args) {
    int arr[] = {10,50,40,60,90,80,120};
    System.out.println("Before swapping array"+Arrays.toString(arr));

 // two for loops
    // first for total paas
    // second for swaping after comparing
    
    int len = arr.length;
    
    for(int i =0; i<len-1 ; i++) // number of passes
    {
    	for( int j = 0; j<len-1 ; j++)  // after first passed the greatest number will bubble up at last positiion
    	{
    		if(arr[i]<arr[j])
    		{
    			int temp = arr[i];
    			arr[i]= arr[j];
    			arr[j]=temp;
    		}
    	}
    }
		
    System.out.println("after swapping array: "+Arrays.toString(arr));	
		
	}

}

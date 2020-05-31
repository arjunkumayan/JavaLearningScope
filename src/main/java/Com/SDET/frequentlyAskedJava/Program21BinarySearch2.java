package Com.SDET.frequentlyAskedJava;

import java.util.Arrays;

public class Program21BinarySearch2 {

	
	//   Binary Search - 
	/*   Sort the order
	 *   find the mid element
	 *  then decide whether to go left side or right side
	 *  
	 *  
	 * 
	 * 
	 */
	public static void main(String[] args) 
	{
		int arr[] = {13,15,18,19,40,70,100};
		
		System.out.println(Arrays.binarySearch(arr, 40));
		
		String ar = Arrays.toString(arr);	
		System.out.println(ar);

	}

}

package CommonlyAskedInterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;

public class Program16CheckTwoArrays {
	
	public static ArrayList<Integer> checkArrays(int array[])
	{
		ArrayList<Integer> arrList1 = new ArrayList<Integer>();

		ArrayList<Integer> arrList2 = new ArrayList<Integer>();
		
		int len = array.length;
		
		for( int i =0 ;i<len ;i++)
		{
			arrList1.add(array[i]);
			
		}
		return arrList1;
		
		
	}

	public static void main(String[] args) {

		
		int arr1[] = {1,2,3,4,6,7};
		int arr2[] = {1,2,3,4,5,7};
		
		Boolean status = Arrays.equals(arr1, arr2);
		System.out.println(status);
		
		
		ArrayList<Integer> a1 =checkArrays(arr1);
		ArrayList<Integer> a2 =checkArrays(arr2);
		if(a1.equals(a2))
		{
			System.out.println("Arrays are equal");
		}
		else
		{
			System.out.println("arrays are not equal");
		}
		
		
		
		
		
		
		
	}

}

package CommonlyAskedInterviewQuestions;

import java.util.ArrayList;
import java.util.List;

public class Program15PrintEvenOdd {

	public static void main(String[] args) {

		int a[] = {1,3,5,6,10};
		
		List<Integer> evenList= new ArrayList<Integer>();
		List<Integer> oddList= new ArrayList<Integer>();
		
		for(int i = 0; i<a.length ; i++)
		{
			if(a[i]%2 == 0)
			{
				evenList.add(a[i]);
				//System.out.println("Even numbers are "+a[i]);
			}
			else {
				oddList.add(a[i]);
				//System.out.println("Odd numbers are "+a[i]);
			}
			
		}
		
		System.out.println("Even numbers are: "+evenList);
		System.out.println("Odd numbers are: "+oddList);
		
		
		
	}

}

package CommonlyAskedInterviewQuestions;

public class Program17MissingNumberInArray {

	public static void main(String[] args) {
     // Array should not have duplicates
		
		// no need to be in sorted order
		// values should be in proper range
		
		
		int a[] = {1,2,3,4,6};
		int sum1 = 0;
		int sum2 = 0;
		for(int i =0 ;i<a.length ; i++)
		{
			sum1 = sum1+ a[i];
			
		}
		int lastNumber = a.length;
		System.out.println("Last number:"+lastNumber);
		
		for(int i=1 ;i<=6 ; i++)
		{
			sum2 = sum2+i;
			System.out.println(sum2);
		}
		
		System.out.println("Sum of elements in array: "+sum1);
		System.out.println("Sum of all in range: "+sum2);
		System.out.println("Missing number is: "+(sum2-sum1));
		
		
	}

}

package CommonlyAskedInterviewQuestions;

public class FactorialNumber {

	public static void main(String[] args) {

		// 5! = 5*4*3*2*1 = 120
		
		int num = 5;
		getFact(5);
		
		int fact1 = 1;
		int k = 1;
		
		while(k<=num)
		{
			fact1 = fact1*k;
			k++;
			
		}
		
		System.out.println("Factorial of a number "+ num + " is "+fact1);
	}
	
	public static void getFact(int num)
	{
		int fact = 1;
		for(int i =1; i<=num ; i++)
		{
			fact = fact *i;
		}
		System.out.println("Factorial of "+ num + " is "+fact);
					
		
	}

}

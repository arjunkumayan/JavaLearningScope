package CommonlyAskedInterviewQuestions;

public class Program13FactorialNumber {

	public static void main(String[] args) {

		// 5! = 5 *4*3*2*1
		
		
		int num = 6;
		long fact = 1;
		
		for(int i =1; i<=num ; i++)
		{
			fact = fact*i;
			
		}
		
		System.out.println("Factorial of a number = " +fact);
		

		long fact1 = 1;
		for(int i =num; i>0 ; i--)
		{
			fact1 = fact1*i;
			
		}
		System.out.println("factorial 1 of a number "+fact1);
		
	}

}

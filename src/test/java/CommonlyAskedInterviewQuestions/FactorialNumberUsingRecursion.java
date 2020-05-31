package CommonlyAskedInterviewQuestions;

public class FactorialNumberUsingRecursion {
	
	public static int factorialNumber(int num)
	{
		if(num ==0)
		{
			return 1;
		}
		else {
			return num * factorialNumber(num-1);
		}
		
	}

	public static void main(String[] args) {
		
		// 5 = 5*4 *3 *2 *1
	int num = 6;
	int fact = factorialNumber(num);
	System.out.println("Factorial is: "+fact);

	}

}

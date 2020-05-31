package CommonlyAskedInterviewQuestions;

public class CheckPrimeNumber {
	// Check whether a number can be expressed as sum of two prime numbers
	// 34 =   3+31, 5 +29, 11+23 , 17+17
	
	public static boolean checkPrimeNumber(int num)
	{
		boolean isPrime = true;
		for(int i =2; i<=num/2 ; i++)
		{
			if(num%i == 0)
			{
				isPrime = false;
				break;
				
			}
		}
		return isPrime;
		
		
	}
	
	public static void main(String[] args) {
		
		int num = 34;
		boolean flag = false;
		for(int i =2; i<=num/2 ; i++)
		{
			if (checkPrimeNumber(i)) {
				
				if(checkPrimeNumber(num-i))
				{
					System.out.println(num + " = "+ i + " + "+ (num-i) );
					flag =true;
				}
				
			}
			
			
		}
			if(!flag)
			{
				System.out.println(num + " can not be expressed as the sum of two numbers");
			}
		System.out.println(checkPrimeNumber(59));
		
	}

}

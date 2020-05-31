package Com.SDET.frequentlyAskedJava;

public class Program11PrimeOrNot {
	
	public static void isPrime(int num)
	{
		int count = 0;
		
		
		if(num>1)
		{
			for(int i=1 ; i<=num ; i++)
			{
				if(num%i == 0)
				{
					count++;
				}
			}

			if(count==2)
			{
				System.out.println(" This is a prime number ");
			}
			else {
				System.out.println("Not a prime number");
			}
			
			
		}
		else {
			
			System.out.println(" not a prime number");
		}
		
	
	}

	public static void main(String[] args) {

		// number >1
		// factors - 1 or itself
		
		// 19 - 1 and 19 - prime
		// 28 - 1,2,4,7,14,28 - not a prime number
		isPrime(19);
		isPrime(6);
		isPrime(50);
		isPrime(28);
		isPrime(77);
		
	}

}

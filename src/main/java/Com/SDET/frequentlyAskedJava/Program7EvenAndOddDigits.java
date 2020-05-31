package Com.SDET.frequentlyAskedJava;

public class Program7EvenAndOddDigits {

	public static void main(String[] args) {

		
		int number = 7312445;
		int evenCount = 0;
		int oddCount = 0;
		
		while(number >0)
		{
			int remainder = number % 10;
			number = number/10;
			if(remainder %2==0)
			{
				++evenCount;
			}
			else
			{
				++oddCount;
			}
		}
		
		System.out.println("Even digit " +evenCount);
		System.out.println("Odd digit "+oddCount);
	}

}

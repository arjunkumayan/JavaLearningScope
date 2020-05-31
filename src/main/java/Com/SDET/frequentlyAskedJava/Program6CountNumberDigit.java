package Com.SDET.frequentlyAskedJava;

public class Program6CountNumberDigit {
	
	public static int countADigit(int n)
		{
		
		int count = 0;
		
		int number = n;
	   while(number > 0)
	   {
		   number = number/10;
		   ++count;
		   
		   
		   }
		return count;
		
		
	}

	public static void main(String[] args) {
		System.out.println(countADigit(12345));
		System.out.println(countADigit(-12345));

	}

}

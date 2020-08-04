package KKJavaTutorial;

public class CountsSumOfDigitsInNumber {

	public static void main(String[] args) {
		int number = 1456;
		// Even digit = 3 and Odd = 3
		
		
		int sumCount = 0;
		
		
		while(number>0) {
			
			int rem = number%10;
			
			sumCount = sumCount +rem;
			
			number = number/10;
			
		}
		
		System.out.println("sumCount Count: "+sumCount);
			

	}

}

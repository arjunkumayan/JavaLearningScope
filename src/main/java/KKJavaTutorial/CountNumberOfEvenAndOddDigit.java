package KKJavaTutorial;

public class CountNumberOfEvenAndOddDigit {

	public static void main(String[] args) {
		int number = 145678166;
		// Even digit = 3 and Odd = 3
		
		
		int evenCount = 0;
		int oddCount = 0;
		
		while(number>0) {
			
			int rem = number%10;
			number = number/10;
		
			if(rem%2==0) {
				++evenCount;
				//System.out.println(evenCount);
			}
			else {
				++oddCount;
			}
				
			
		}
		
		System.out.println("Even Count: "+evenCount);
		System.out.println("Odd count: "+oddCount);
		

	}

}

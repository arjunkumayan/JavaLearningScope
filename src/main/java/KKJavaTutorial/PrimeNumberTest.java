package KKJavaTutorial;

public class PrimeNumberTest {

	public static void main(String[] args) {

		
	 boolean b1 = isPrime(3);
	 System.out.println(b1);
	 
	 printPrimeNumber(10);

	}

	private static boolean isPrime(int number) {
		
		if(number<=1) {
			return false;
		}
		for(int i=2; i<number ; i++) {
		if(number%i==0) {
			return false;
		}
		}
		
		return true;
	}
	
	public static void printPrimeNumber(int num) {
		
		for(int i=1 ; i<=num ; i++) {
			if(isPrime(i)) {
				System.out.println("Prime number: "+i);
			}
		}
	}

}

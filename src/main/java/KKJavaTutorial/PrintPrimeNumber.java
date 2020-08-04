package KKJavaTutorial;

public class PrintPrimeNumber {

	public static void main(String[] args) {
		System.out.println(isPrimeNumber(1));
		System.out.println(isPrimeNumber(0));
	System.out.println(isPrimeNumber(10));
//	System.out.println(isPrimeNumber(2));
//	System.out.println(isPrimeNumber(5));
//	System.out.println(isPrimeNumber(-5));
	
	 getPrimeNumber(10);

	}

	private static boolean isPrimeNumber(int num) {
		if(num<=1) {
			return false;
		}
		for(int i=2 ;i<num ; i++) {
			if(num%i==0) {
				return false;
			}		}
		return true;
	}
	
	public static void getPrimeNumber(int num) {
		
		for(int i=2; i<num ;i++) {
			if(isPrimeNumber(i)==true) {
				System.out.println(i+ "is prime number");
			}
		}
	}

}

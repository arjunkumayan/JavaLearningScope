package basic;

public class Factorial {

	public static void main(String[] args) {
		
	System.out.println(fact(5));
		System.out.println(factorial(5));
	}

	
	private static int factorial(int n) {
		
		int fact = 1;
		if(n==1) {
			return 1;
		}
		
		for(int i=1; i<=n ; i++) {
			fact = fact*i;
		}
		return fact;
		
	}


	private static int fact(int n) {
		
		if(n==1) {
			return 1;
		}
		return n * fact(n-1);
		
	}

}

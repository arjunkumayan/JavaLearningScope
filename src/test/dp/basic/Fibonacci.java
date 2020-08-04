package basic;

public class Fibonacci {
	
	public static void fibo(int n) {
		
		int a=0;
		int b= 1;

		System.out.print(a+ " "+b+" ");
		for(int i=2 ; i<=n; i++) {
			
			int sum = a+b;
			System.out.print(sum+ " ");
			a=b;
			b=sum;
			sum=a;
					
		}
	}

	public static void main(String[] args) {
		
		
		System.out.println(getFibonacciNumber(7));
		fibo(7);

	}

	private static int getFibonacciNumber(int n) {
		if(n<=1) {
			return n;
		}
		
		return getFibonacciNumber(n-1)+getFibonacciNumber(n-2);
		
		
	}

}

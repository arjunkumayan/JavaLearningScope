package KKJavaTutorial;

import java.util.Scanner;

public class FibonacciNumber {

	public static void main(String[] args) {
		
		
//		Scanner sc= new Scanner(System.in);
//		System.out.println("Enter first number");
//		int n1 = sc.nextInt();
//		
//		System.out.println("Enter second number");
//		int n2 = sc.nextInt();
		
		int n1=0,n2=1;
		int sum=0;
		System.out.println(n1+"  "+n2);
		System.out.println("Enter the nuber upto you want to generate the fibonacci number");
		
		//int num = sc.nextInt();
		for(int i=2 ; i<10; i++)
		{
			sum = n1+n2;
			System.out.println(" "+sum);
			
			n1=n2;
			n2=sum;
						 
		}

	}

}

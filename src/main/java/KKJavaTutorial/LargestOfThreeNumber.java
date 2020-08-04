package KKJavaTutorial;

import java.util.Scanner;

public class LargestOfThreeNumber {

	public static void main(String[] args) {
		
		
	//	int a=50,b=40,c=30;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter first number");
		int a = sc.nextInt();
		
		System.out.println("Enter second number");
		int b = sc.nextInt();
		
		System.out.println("Enter third number");
		int c = sc.nextInt();
		
		if(a>b && a>c) {
			System.out.println("A is largest: "+a);
		}
		else if(b>c) {
			System.out.println("B is largest"+b);
		}
		else {
			System.out.println("C is largest"+c);
		}
	}

}

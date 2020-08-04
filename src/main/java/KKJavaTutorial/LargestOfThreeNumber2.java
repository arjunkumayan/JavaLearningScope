package KKJavaTutorial;

import java.util.Scanner;

public class LargestOfThreeNumber2 {

	public static void main(String[] args) {
		
		
	//	int a=50,b=40,c=30;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter first number");
		int a = sc.nextInt();
		
		System.out.println("Enter second number");
		int b = sc.nextInt();
		
		System.out.println("Enter third number");
		int c = sc.nextInt();
		
		
		int largest1 = a>b?a:b; // largest from A
		int largest2= c>largest1?c:largest1; // largest from C
		
		System.out.println("Largest of number"+largest2);
		
	}

}

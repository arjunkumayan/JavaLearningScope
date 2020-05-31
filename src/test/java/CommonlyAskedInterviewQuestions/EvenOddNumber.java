package CommonlyAskedInterviewQuestions;

import java.util.Scanner;

public class EvenOddNumber {

	public static void main(String[] args) 
	{

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter the number");
		int number = sc.nextInt();
		
		if(number%2==0)
		{
			System.out.println("This is even number");
		
		}
		else
		{
			System.out.println("This is odd number");
		}
		
		
	}

}

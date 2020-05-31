package CommonlyAskedInterviewQuestions;

import java.util.Scanner;

public class P28Calculator {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		System.out.println("enter two number");
		double first = reader.nextInt();
		double second = reader.nextInt();
		System.out.println("enter the operator:(+, -, *, /, ); ");
		char operator = reader.next().charAt(0);
		
         double result = 0;
       
		switch (operator) {
		case '+':
			result =  first +  second;
			break;
		case '-':
			result =  first -  second;
			break;
		case '*':
			result =  first *  second;
			break;
		case '/':
			result =  first /  second;
			break;

		default:
			System.out.println("Please enter the correct operator");
			break;
		}
		
		System.out.println(result);
	}

}

package CommonlyAskedInterviewQuestions;

import java.util.Scanner;

public class VowelAndConstant {

	public static void main(String[] args) {

		// A, E, I, O, U
		/*
		 * Scanner sc = new Scanner(System.in);
		 * System.out.println(" please enter the character ");
		 * 
		 * String characterEnter = sc.next();
		 */
		
		char ch='e';
		
	if(ch == 'a' || ch == 'e' || ch =='i' || ch =='o' || ch=='u')
      {
	    System.out.println(ch+" is vowel");
      }
     else
          {
	            System.out.println(ch+" is constant");
          }
	
	
	switch(ch)
	{
	case 'a':
	case 'e':
	case 'i':
	case 'o':
	case 'u':
		
		System.out.println(ch+ " is vowel");
	    break;
	   
	default:
		System.out.println(ch+ " is consonant");
	
	
	}
	
	}

}

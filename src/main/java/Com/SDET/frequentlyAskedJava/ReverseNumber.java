package Com.SDET.frequentlyAskedJava;

import java.util.Scanner;

public class ReverseNumber {

	// 1. using algorithm

	public static int reverseTheNumber(int num) {
		int rev = 0;

		while (num != 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
			
		}
		return rev;

		
	}

	public static void main(String[] args) {
		
		int reverse=reverseTheNumber(65432);
		System.out.println(reverse);
		
		//2 using StringBuffer
		int number = 98765;
		
		StringBuffer sb=new StringBuffer(String.valueOf(number));
		StringBuffer revnum=
				sb.reverse();
		
		System.out.println(revnum);
		
		//3. using StringBuilder
		
		StringBuilder sbu=new StringBuilder();
		
		sbu.append(number);
		
		StringBuilder sbuilder=sbu.reverse();
		
		System.out.println("String builder="+sbuilder);
		
		

	}

}

package KKJavaTutorial;

import java.util.Arrays;

public class CheckArraysEquals {

	public static void main(String[] args) {
		int a1[] = {1,4,6,7};
		int a2[] = {1,4,6,7};
		
		
		boolean test = Arrays.equals(a1, a2);
		System.out.println(test);
	}

}

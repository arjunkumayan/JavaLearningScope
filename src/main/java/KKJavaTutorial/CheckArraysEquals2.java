package KKJavaTutorial;

import java.util.Arrays;

public class CheckArraysEquals2 {
	
	

	public static void main(String[] args) {
		int a1[] = {1,4,6,7};
		int a2[] = {1,4,6,7};
		
	    checkArrayEquality(a1,a2);
		
	}

	private static void checkArrayEquality(int[] a1, int[] a2) {
		
         boolean status = false;
		
		if(a1.length ==a2.length) {
			// compare rest of element
			
			for(int i=0; i<a1.length; i++) {
				if(a1[i]!=a2[2]) {
					status = false;
				}
				
			}
			
		}
		else {
			status = false;
		}
		
		if(status=true) {
			System.out.println("Arrays are equals");
		}
		else {
			System.out.println("Arrays are not equal");
		}
		
	}

}

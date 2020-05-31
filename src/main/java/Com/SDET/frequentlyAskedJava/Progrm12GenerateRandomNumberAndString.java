package Com.SDET.frequentlyAskedJava;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

public class Progrm12GenerateRandomNumberAndString {

	public static void main(String[] args) {

		
		Random rand = new Random();
		
		int num =rand.nextInt(100);
		System.out.println(num);
		
		double randDob = rand.nextDouble();
		System.out.println(randDob);
		
		
		Boolean value =rand.nextBoolean();
		System.out.println(value);
		
		
		long l =rand.nextLong();
	    System.out.println(l);
	    
	    
	    // approach 2 - Math class only decimal number
	   double d = Math.random();
	   System.out.println("Math value of double: "+d);
	    
	   
	   // Approach 3 - apache commons-lang API
	   
	  String randNumber = RandomStringUtils.randomNumeric(10);
	  	  System.out.println(randNumber);
	  	  
	  	String randString =   RandomStringUtils.randomAlphanumeric(5);
	  	System.out.println(randString);
	  	
	  	
	  	
	  	
	  	
	   
	   
	   
	    
	}

}

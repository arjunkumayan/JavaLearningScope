package KKJavaTutorial;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

public class GenerateRandomNumbersAndString {

	public static void main(String[] args) {
		// 1. Random Class
		
		Random rand = new Random();
		
		int r = rand.nextInt(100);
		System.out.println(r);
		
		double rand_dbl = rand.nextDouble();
		System.out.println(rand_dbl);
		
		
		
		// 2. to generate the number using Math class
		
		double d = Math.random();
		System.out.println(d);
		
		// 3rd Approach - Apached commns -lang api
		
		
		//RandomStringUtils rand1 = new RandomStringUtils();
		String ra = RandomStringUtils.randomNumeric(5);
		
		System.out.println(Integer.parseInt(ra));
		
		System.out.println(ra);
		String test = RandomStringUtils.randomAlphabetic(10);
		System.out.println(test);
		
		

	}

}

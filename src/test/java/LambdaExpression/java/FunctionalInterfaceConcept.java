package LambdaExpression.java;

import java.util.function.Function;

public class FunctionalInterfaceConcept {

	public static void main(String[] args) {
		
		/*
		 * Type Parameters:
          T - the type of the input to the function
          R - the type of the result of the function
		 * 
		 */
		
		Function<String,Integer> func = x -> x.length();
		
		int len = func.apply("This is Java 8");
		System.out.println(len);
		
		// Chaining function
		
		Function<Integer,Integer> func2 = x -> x*2;
		
		int len1 = func.andThen(func2).apply("This is Arjun Here");
		
		System.out.println(len1);

	}

}

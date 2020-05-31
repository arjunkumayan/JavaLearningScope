package Java8Features;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimeNumberWithParallelStream {

	public static void main(String[] args) {
		
		System.out.println(isPrime(7));
		System.out.println(isPrime(4));
		System.out.println(isPrime(2));
		
		System.out.println(isPrime(1));
		System.out.println(isPrime(24));
		
		long count = Stream.iterate(0, n -> n+1).limit(1000000).parallel()
		.filter(PrimeNumberWithParallelStream ::isPrime)
		.peek(x -> System.out.println(x))
		.count();
		System.out.println("totla prime numbers: "+ count);
		
		
		
	}
	
	public static boolean isPrime(int number) {
		
		if(number<=0) { return false;}
		
    	return ! IntStream.rangeClosed(2, number/2).anyMatch(x -> number%x == 0);
			
		
	}

}

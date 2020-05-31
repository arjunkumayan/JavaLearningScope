package Java8Features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.BaseStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ParallelStreamConcept {

	public static void main(String[] args) {

		ForkJoinPool corePools = ForkJoinPool.commonPool();
		
		System.out.println(corePools.getParallelism());
		
		Stream stream =	Stream.of("Naveen","Tom","Selvin","Peter","Raj","simon");
		// BaseStream parallelStream = stream.parallel();
		Stream.of("Naveen","Tom","Selvin","Peter","Raj","simon").forEach(System.out::println);
		
		System.out.println("-----------------------------------");
		//2. use parallelStream() method on a collection steam
		Stream.of("Naveen","Tom","Selvin","Peter","Raj","simon").parallel()
		.forEach(System.out::println);
		
		System.out.println("-----------------------------------");
		Arrays.asList("Naveen","Tom","Selvin","Peter","Raj","simon")
		.parallelStream()
		.forEach(System.out::println);
		
		//1 to 10:
		System.out.println("-------normal stream----------------------------");
		IntStream.range(1, 10).forEach(System.out::println);
		
		System.out.println("-------parallel stream----------------------------");
		IntStream.rangeClosed(1, 10).parallel().forEach(System.out::println);
		
		
		// to print from 1-z --> 97 to 122
		System.out.println(getAlphabetsList());
		
		getAlphabetsList().stream().forEach(System.out::println);
		System.out.println("----parallel stream----------");
		getAlphabetsList().parallelStream().forEach(System.out::println);
		
		// check stream is running in parallel mode: isParallel() method:
		
		IntStream range = IntStream.range(1, 10);
		System.out.println(range.isParallel()); //false
		
		IntStream range1 = IntStream.range(1, 10);
		range1.parallel().isParallel(); // true
		System.out.println(range1.isParallel());
		
	}
	
	
	public static List<String> getAlphabetsList() {
		List<String> alpha = new ArrayList<String>();
		
		int n = 97;
		while(n<=122) {
			char c = (char) n;
			alpha.add(String.valueOf(c));	
			n++;
		}
		
		return alpha;
	}

}

package Java8Features;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class InfiniteStream {

	public static void main(String[] args) {
		
		// Infinite Streams used to generate infinite stream of data
		
		//1. iterate()
		// static (T seed, UnaryOperator<T> f)
		// return a stream --> Stream<T>
		
		List<Integer> collect = IntStream.iterate(0, n -> n+2)
		.mapToObj(Integer::valueOf)
		.limit(10)
		.collect(Collectors.toList());
	
		System.out.println(collect);
		
		// 2. generate()
		// 
		
		List<Integer> collect2 = Stream.generate(()  -> (new Random()).nextInt(10))
                             .limit(20)
                             .collect(Collectors.toList());
                   System.out.println(collect2);          
		

	}

}

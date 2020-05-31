package Java8Features;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamsStringArrayWithFlatMap {
	// can not use the filter when you get the Stream<String[]> - arrays of stream so go with flat map

	public static void main(String[] args) {


		String data[][] = new String[][] {{"a","b"},{"c","d"},{"e","f"}};
		
		Stream<String[]> dataStream = Arrays.stream(data);
		Stream<String> streamFlatMap= dataStream.flatMap(x -> Arrays.stream(x));
		
		Stream<String>  dataStreamFilter = streamFlatMap.filter(x -> "a".equals(x.toString()));
		
		dataStreamFilter.forEach(System.out::println);
		
		
		
		Stream<String> finalStream =Arrays.stream(data).flatMap(x -> Arrays.stream(x)).filter(x ->"c".equals(x.toString()));
		
		finalStream.forEach(System.out::println);
		
	}

}

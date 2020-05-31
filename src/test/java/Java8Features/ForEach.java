package Java8Features;

import java.util.Arrays;
import java.util.List;

public class ForEach {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,8,9,7,6);
		
		list.forEach(i -> System.out.println(i));

	}

}

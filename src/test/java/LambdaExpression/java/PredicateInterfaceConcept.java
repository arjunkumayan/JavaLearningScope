package LambdaExpression.java;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class PredicateInterfaceConcept {

	public static void main(String[] args) {
		
		
		Predicate<Integer> func = x -> x>5;
		
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		
		List<Integer> collectionList = list.stream().filter(func).collect(Collectors.toList());
		System.out.println(collectionList);
		
		
		//Predicate with and 
		
		List<Integer> collList1 = list.stream().filter(x -> x>5 && x<10 ).collect(Collectors.toList());

		System.out.println(collList1);
		
		List<String> nameList = Arrays.asList("Naveen","Navee","Nav","Java","jav","ja");
		
		Predicate<String> namesExp = x ->x.startsWith("Nav");
		
		List<String> newNameList= nameList.stream().filter(namesExp.negate()).collect(Collectors.toList());
		
		System.out.println(newNameList);
		
	}

}

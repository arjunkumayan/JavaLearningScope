package set_Interface;

import java.util.TreeSet;

public class TreeSetTest {
	
	public void display() {
		int i=0;
		System.out.println(i);
	}

	public static void main(String[] args) {
		TreeSet<String> test = new TreeSet<>();
		test.add("te");
	     
		//test.add(null);
		test.add("arjun");
		test.add("arjun123");
		
		test.add("singh");
		test.add("aar");
		
		test.add("123");
		
		test.forEach(values ->{
			System.out.println(values);
		});

	}

}

package ListInterface;

import java.util.ArrayList;

public class CollectionAutoboxing {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(10);
		al.add("Arjun");
		al.add(null);
		al.add(null);
		al.add("Arjun");
		al.add('a');
		al.add(10.5);
		
		al.forEach(values ->{
			System.out.println(values);
		});

		// duplicates
		// insertion order
		// non-synchronized
		// homogeneours - all objects
		// null insertion
		System.out.println("Printing values");
		for(int i=0 ;i<al.size(); i++) {
			System.out.println(al.get(i));
		}
	}

}

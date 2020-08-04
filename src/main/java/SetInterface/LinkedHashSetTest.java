package SetInterface;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetTest {

	public static void main(String[] args) {
LinkedHashSet s= new LinkedHashSet<>();
// it maintains insertion order
// hashtable + LinkedList
s.add(null);
s.add("D");
s.add("A");
s.add(10);
s.add("A");
System.out.println(s.toString());
	}

}

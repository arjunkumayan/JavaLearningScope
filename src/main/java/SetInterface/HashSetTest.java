package SetInterface;

import java.util.HashSet;

public class HashSetTest {

	public static void main(String[] args) {
HashSet s= new HashSet<>();

s.add(null);
s.add("D");
s.add("A");
s.add(10);
s.add("A");
System.out.println(s.toString());
	}

}

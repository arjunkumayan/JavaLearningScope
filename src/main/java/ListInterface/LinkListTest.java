package ListInterface;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkListTest {

	public static void main(String[] args) {
		LinkedList l = new LinkedList<>();
		l.add("10");
		l.add("20");
		
		ArrayList al = new ArrayList<>(l);
		al.forEach(values ->{
			System.out.println(values);
		});

	}

}

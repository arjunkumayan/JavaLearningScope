package ListInterface;

import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {
		
		
		ArrayList al =new ArrayList();
		Integer i = new Integer(10);
		al.add(i);
		al.add("A");
		al.add("B");
		al.add('a');
		al.add(190);
		al.add(null);
		System.out.println(al);
		System.out.println(al.toString());
		
		System.out.println(al.remove(0));
		System.out.println(al.toString());
		System.out.println(al.remove(i));
		System.out.println(al.toString());
		

	}

}

package ListInterface;

import java.io.ObjectInputStream.GetField;
import java.lang.reflect.Field;
import java.util.ArrayList;

public class ArrayListCapacity {

	public static void main(String[] args) {
 ArrayList<Integer> al = new ArrayList<>();

 for(int i=0; i<=10 ; i++) {
	 al.add(i);
	 System.out.println("Size: "+al.size());
 }
 

 System.out.println("Printing");
 al.forEach(values ->{
	 System.out.println(values);
 });
	}

}

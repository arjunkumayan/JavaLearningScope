package amazon;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class ArraysTest {
	
	public static String sortStr(String str) {
		
		
		char[] ch = str.toCharArray();
		
		Arrays.sort(ch);
		
		return String.valueOf(ch);
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int[] a = {10,5,20,11,6};
     
     System.out.println("Before sorting");
     for(int ar: a) {
    	 System.out.println(ar);
     }
		
     
     Arrays.sort(a);
     System.out.println("After sorting");
     for(int ar: a) {
    	 System.out.println(ar); // DNSO
     }
     
     String[] s = {"A","Z","B"};
     System.out.println("Object array before sorting");
     
     for(String st: s) {
    	 System.out.print(st);
     }
     
     
     Arrays.sort(s);
     
  System.out.println("Object array after sorting");
     
     for(String st: s) {
    	 System.out.print(st);
     }
     
     Arrays.sort(s, new MyComparator());
     
     for(String sst: s) {
    	 System.out.print(" ");
    	 System.out.println(sst);
     }
		
     
     String str1= "HELLO";
     String str2 = "LLOEH";
     
     boolean result = sortStr(str1).equalsIgnoreCase(sortStr(str2));
     
     System.out.println(result);
     
     sortStr(str2);
     System.out.println(sortStr(str1));
     System.out.println(sortStr(str2));
     
     int al[] = {10,20,50,60,5,6,1};
     Arrays.asList(al);
     
     String[] st = {"A","Z","B"};
     
     List<String> li = Arrays.asList(st);
     
     
     System.out.println(li.toString());
     
     Iterator<String> iterator = li.iterator();
     while(iterator.hasNext()) {
    	 System.out.println(iterator.next());
     }
     
	}
	
	
	
	


}

class MyComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		String I1=  (String) o1;
		String I2 = (String) o2;
		
		return I1.compareTo(I2);
	}
	
}

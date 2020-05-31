package collection;

import java.util.ArrayList;
import java.util.Iterator;
/**
 * 
 * @author asingh6766
 *
 */

public class ArrayListNewConcept {

	public static <E> void main(String[] args) {

		// ArrayList - it is dynamic array
		int a[]=new int[2]; // static array - it will indexOutOfBound exception if try to use the value at a[4]
		// size is fixed 
		// Dynamic array- ArrayList
		
		// 1. can contain duplicate values
		// 2- it maintain insertion order
		// 3. Not synchronized - not thread safe
		// 4/ allows random access because it allows/stores values on the basis of index
		
		ArrayList arr=new ArrayList();
		arr.add(10);
		arr.add(20);
		arr.add(30);
		arr.add(70);
		
		System.out.println(arr.size());
		arr.add(40);
		arr.add(50);
		arr.add(50);
		arr.add("arjun");
		arr.add('e');
		arr.add(13.4f);
		
		System.out.println(arr.size());
		System.out.println(arr.get(6)+" "+arr.get(5));
		
		for(int i=0;i<arr.size();i++)
		{
			System.out.println("ArrayList values are: "+arr.get(i));
		}

ArrayList<Integer> arr1=new ArrayList<Integer>();
arr1.add(100);
//arr1.add("selenium");

ArrayList<String> arr2=new ArrayList<String>();
arr2.add("Arjun");

ArrayList<E> arr5=new ArrayList<E>();


		
		// I can store user defined class object also

EmployeeDetails e1=new EmployeeDetails("Arjun",26,"QA");
EmployeeDetails e2=new EmployeeDetails("Naveen",29,"Dev");
EmployeeDetails e3=new EmployeeDetails("Sameer",26,"Java");

		
	
	
	ArrayList<EmployeeDetails> alist=new ArrayList<EmployeeDetails>();
	alist.add(e1);
	alist.add(e2);
	alist.add(e3);
	
	
	Iterator<EmployeeDetails> it=alist.iterator();
	while(it.hasNext())
	{
		
	EmployeeDetails empd=it.next();
	System.out.println(empd.name+" "+empd.dept+" "+empd.age);
	
	
	
	
	
	}
	ArrayList<String> ar6=new ArrayList<String>();
	ar6.add("amol");
	ar6.add("jay");
	
	ArrayList<String> ar7=new ArrayList<String>();
	ar7.addAll(ar6);
	System.out.println(ar6.size());
	
	
	
	}

}

package ListInterface;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static void main(String[] args) {

		
		ArrayList al=new ArrayList();
		
		al.add(10);
		al.add(20);
		System.out.println(al.size());
		
		al.add("Arjun");
		al.add(40);
		al.add(40);
		al.add(0);
		al.add(0);
		al.add('A');
		al.add(true);
		
		System.out.println(al.size());
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		
		
		ArrayList<Integer> ar=new ArrayList<Integer>();
		ar.add(10);
		ar.add(20);
		ar.add(30);
		
		//ArrayList<E> an=new ArrayList<E>();
		
		Employee e1=new Employee("Arjun",25,"QA");
		Employee e2=new Employee("TOM",27,"Dev");
		Employee e3=new Employee("Peter",28,"Devops");
		
		
		
		
		ArrayList<Employee> ar1=new ArrayList<Employee>();
		ar1.add(e1);
		ar1.add(e2);
		ar1.add(e3);
		
		// iterator to iterate the value
		
		Iterator<Employee> it=ar1.iterator();
		while(it.hasNext())
		{
			Employee emp=it.next();
			
		System.out.println(emp.age+""+emp.dept+""+emp.name);
		
		}
		
		
		//********************
		
		// addAll()
		
		ArrayList<String> ar5=new ArrayList<String>();
		
		
		ar5.add("Selenium");
		ar5.add("QTP");
		
		
		ArrayList<String> ar6=new ArrayList<String>();
		ar6.add("Java");
		ar6.addAll(ar5);
		
		System.out.println(ar6.size());
		
		Iterator<String> it1=ar6.iterator();
		
		while(it1.hasNext())
		{
			String name1=it1.next();
			System.out.println(name1);
		}
		//retainAll()
		
ArrayList<String> ar7=new ArrayList<String>();
		
		
ar7.add("Selenium");
ar7.add("QTP");
	
		
ArrayList<String> ar8=new ArrayList<String>();
		
		
ar8.add("java");
ar8.add("QTP");
		

ar7.retainAll(ar8);

for(int j=0;j<ar7.size();j++)
{
	System.out.println(ar7.get(j));
}
	}

}

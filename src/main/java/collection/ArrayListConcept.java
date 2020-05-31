package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(30);
		al.add(50);
		System.out.println(al.size());
		al.add(60);
		al.add(50);
		
		System.out.println(al.size());
		
	al.add(2, 90);
	System.out.println(al.get(2));
	
	
	al.add("arjun");
	al.add('A');
	al.add(true);
	al.add(false);
	al.add(10.20);
	al.add(23.4f);
	System.out.println("_________________");
	for(int i=0;i<al.size();i++)
	{
		
		if(al.get(i).equals("arjun"))
		{
		System.out.println(al.get(i));
		break;
	}
	}
	System.out.println("***************************");
	
	System.out.println("generic functions");
	ArrayList<String> array=new ArrayList<String>();
	array.add("Arjun");
	array.add("sing");
	array.add("kumayan");
	
	for(int i=0;i<array.size();i++)
	{
		System.out.println(array.get(i));
	}
	
	
	System.out.println("*************Integer**********");
	
	ArrayList<Integer> arr=new ArrayList<Integer>();
arr.add(5);
arr.add(90);
arr.add(54);
arr.add(67);

for(int i=0;i<arr.size();i++)
{
	if(arr.get(i)==90)
	{
		System.out.println(arr.get(i));
}}

System.out.println("**********Employee*******");
Employee e1=new Employee("Arjun", 26, "QA");
Employee e2=new Employee("Rahul",40,"Admin");
Employee e3=new Employee("mohan", 35, "Dev");

ArrayList<Employee> ar4=new ArrayList<Employee>();
ar4.add(e1);
ar4.add(e2);
ar4.add(e3);
// iterator to traverse the values
Iterator<Employee> it=ar4.iterator();

while(it.hasNext())
{
  Employee emp=it.next();
  System.out.println(emp.empName+" "+emp.dept+" "+emp.empName);

}

ArrayList ar5=new ArrayList();
ar5.add("TestNG");
ar5.add("Selenium");
ar5.add("QTP");


ArrayList ar6=new ArrayList();
ar6.add("TestNG");
ar6.add("Selenium");
ar6.add("QTP");

ar5.addAll(ar6);
for(int i=0;i<ar5.size();i++)
{
	System.out.println(ar5.get(i));
}
System.out.println("************");

ar5.remove(1);
for(int i=0;i<ar5.size();i++)
{
	System.out.println(ar5.get(i));
}

System.out.println("#########");
ArrayList ar7=new ArrayList();
ar7.add("TestNG");
ar7.add("Selenium");
ar7.add("QTP");


ArrayList ar8=new ArrayList();
ar8.add("TestNG");
ar8.add("Selen");
ar8.add("QTPSTR");

ar7.retainAll(ar8);

for(int i=0;i<ar7.size();i++)
{
	System.out.println(ar7.get(i));
}

}
}

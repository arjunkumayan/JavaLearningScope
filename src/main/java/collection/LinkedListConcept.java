package collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {
		
		
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("Test");
		ll.add("QTP");
		ll.add("Selenium");
		ll.add("RPA");
		ll.add("RFT");
		ll.add("Jenkis");
		System.out.println("Content of linked list"+ll);
		ll.addFirst("TESTNG");
		ll.addLast("Automation");
		
		System.out.println("Content of linked list"+ll);

	ll.add(4, "Arjun");
	System.out.println(ll.get(4));
	
	System.out.println(ll.getFirst());
	
	ll.set(5, "Naveen");
	System.out.println(ll.get(5));
	
	ll.remove("Selenium");
	System.out.println(ll);
	ll.removeFirst();
	ll.removeLast();
	System.out.println(ll);
	ll.remove(2);
	System.out.println(ll);
	
	for(int i=0;i<ll.size();i++)
	{
		System.out.println(ll.get(i));
	}
	
	for(String s:ll)
	{
		System.out.println(s);
	}
	
	System.out.println("***************");
	Iterator<String> it=ll.iterator();
	while(it.hasNext())
	{
		String em=it.next();
		System.out.println(em);
	}
	System.out.println("$$$$$$$$");
	
	int num=0;
	while(num<ll.size())
	{
		System.out.println(ll.get(num));
		num++;
		
	}
	
	}

}

package collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkListNewConcept {

	public static void main(String[] args) {
//special dynamic array which stores values on the basis of list
		// nodes
		// every nodes created into two parts-
		// one -  stores data,  two- stores address of second node 
		// each list is having the one main node - HEAD and its pointing to the first node data
		// last point node pointing to null- earth 
		// Singly linked list
		
		
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("Test");
		ll.add("QTP");
		ll.add("Selenium");
		ll.add("RPA");
		ll.add("RFT");
		
		System.out.println("content of linked list"+ll);
		
		//addFirst:
		
		ll.addFirst("Arjun");
		//addLast:
		ll.addLast("Automation");
		
		
		System.out.println("content of linked list"+ll);
		
		
		//get:
		
		System.out.println(ll.get(0));
		for(int i=0;i<ll.size();i++)
		{
			System.out.println("inner loop"+ll.get(i));
		}
		
		
		ll.set(1,"Tom");
		System.out.println(ll.get(1));
		
		
		ll.removeFirst();
		ll.removeLast();
		System.out.println(ll);
		System.out.println("***********");
		
		for(String link:ll)
		{
			System.out.println(link);
		}
		
		System.out.println("using iterator");
		
		Iterator<String> it=ll.iterator();
		while(it.hasNext())
		{
			String value=it.next();

			System.out.println(value);
	}
		
		System.out.println("While loop");
		int num=0;
		while(ll.size()>num)
		{
			System.out.println(ll.get(num));
			
			num++;
		}

}
}
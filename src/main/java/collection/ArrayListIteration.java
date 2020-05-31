package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListIteration {

	public static void main(String[] args) {

		ArrayList<String> tvSeries=new ArrayList<String>();
		tvSeries.add("Game of thrones");
		tvSeries.add("Breaking Bad");
		tvSeries.add("The Big ban theory");
		tvSeries.add("The walking Dad");
		tvSeries.add("Prison Break");
		
		//1. Using java 8 with for-each loop and lambda expression
		
		tvSeries.forEach(shows->{ System.out.println(shows);});
		
		System.out.println("***************");
		//2. iterator
		
		Iterator<String> it=tvSeries.iterator();
		while(it.hasNext())
		{
			String value=it.next();
			
			System.out.println("value"+value);
		}
		
		System.out.println("**************");
	
	//4. using iterator and java 8 forEachRemaining() method
		
		Iterator<String> it1=tvSeries.iterator();
		it1.forEachRemaining(showsTest->{
			System.out.println(showsTest);
			});
		
		System.out.println("***********");
		//4.using for-each loop
		for(String showsTable:tvSeries)
		{
			System.out.println(showsTable);
		}
		
	//5. for loop with order
		
		for(int i=0;i<tvSeries.size();i++)
	
		{
			System.out.println(tvSeries.get(i));
		}
	System.out.println("&&&&&&&&&&&&");
	
	//6. using listIterator to traverse in both the direction
		ListIterator<String> tvSerieslistIterator=tvSeries.listIterator(tvSeries.size());
		while(tvSerieslistIterator.hasPrevious())
		{
			String show=tvSerieslistIterator.previous();
			System.out.println(show);
		}
	
	
	
	}

}

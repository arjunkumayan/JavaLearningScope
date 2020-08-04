package KKJavaTutorial;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListIteration {
	
	public static void main(String[] args) {
		
		ArrayList<String> tvSeries = new ArrayList<>();
		
		tvSeries.add("game of thrones");
		tvSeries.add("The walking dead");
		tvSeries.add("The Big Bang Theory");
		tvSeries.add("The pigeon brake");
	
		// for each with lambda
		System.out.println("-----------------------------------");
		tvSeries.forEach(shows ->{
			System.out.println(shows);
			
		});
		
		//Using iterator
		System.out.println("-----------------------------------");
		
		Iterator<String>  it =tvSeries.iterator();
		while(it.hasNext()) {
			String series = it.next();
			System.out.println(series);
		}
		
		//Using iterator and forEachRemaining
		System.out.println(" Using for eachRemaining-----------------------------------");
		
		it = tvSeries.iterator();
		it.forEachRemaining(shows->{
			System.out.println(shows);
		});
		
		// Using Simple For each
		System.out.println("---- For Each ----");
		for(String sh:tvSeries) {
			System.out.println(sh);
		}
		
		// using index
		System.out.println("----------------index-------------");
		for(int i=0; i<tvSeries.size() ;i++) {
			System.out.println(tvSeries.get(i));
		}
		//Using listIterator
		System.out.println("-----------------------------------");
		
		ListIterator<String> it1=tvSeries.listIterator(tvSeries.size());
		while(it1.hasPrevious()) {
			System.out.println(it1.previous());
		}
		
	}

}

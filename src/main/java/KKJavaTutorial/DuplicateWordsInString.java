package KKJavaTutorial;

import java.util.HashMap;
import java.util.Set;

public class DuplicateWordsInString {
	
	// Hey java is java best language 
	
	
	

	public static void main(String[] args) {
		findDuplicateWords("Hey java is java best language is java");
		findDuplicateWords("Hey python is not java but best language is python not java");

		findDuplicateWords("Hi");
		
		findDuplicateWords("100 100 200 300 400 100 300");
	}
	
	public static void findDuplicateWords(String inputString) {
		
		String words[] = inputString.split(" ");
		
		// Create one hashmap
		
		HashMap<String,Integer> wordCount = new HashMap<String,Integer>();
		
		
		// to check the each word in given array
		
		for(String word: words) {
			// if word in present in array
			
			if(wordCount.containsKey(word)) {
				wordCount.put(word.toLowerCase(),wordCount.get(word)+1 );
			}
			else {
				wordCount.put(word, 1);
			}
			
		}
		
		// extracting all the keys of map - wordCount
		
		Set<String> wordsInString = wordCount.keySet();
		
		// loop
		
		for(String word: wordsInString) {
			if(wordCount.get(word)>1) {
				System.out.println(word + " : "+wordCount.get(word));
			}
		}
		
		
	}

}

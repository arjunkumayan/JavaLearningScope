package KKJavaTutorial;

import java.util.HashMap;
import java.util.Set;

public class DuplicateWordInString {

	public static void main(String[] args) {
		
		findDuplicateWordInString(" Hey java and Python and Python is java but best language is java");
		
	}

	private static void findDuplicateWordInString(String inputString) {
		
		String[] words = inputString.split(" ");
		
		HashMap<String,Integer> wordCount = new HashMap<>();
				
		for(String word:words) {
			
			if(wordCount.containsKey(word)) {
				wordCount.put(word.toLowerCase(), wordCount.get(word)+1);
			}
			else {
				wordCount.put(word.toLowerCase(), 1);
			}
		}
		
		// extract the value from map
		
		Set<String> wordInString = wordCount.keySet();
		
		for(String wordsTest:wordInString) {
			//System.out.println(wordsTest);
			
			if(wordCount.get(wordsTest)>1) {
				System.out.println(wordsTest+ ":"+wordCount.get(wordsTest));
			}
		}
		
		
	}

}

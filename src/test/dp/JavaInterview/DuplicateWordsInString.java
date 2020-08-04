package JavaInterview;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateWordsInString {
	
	public static void findDuplicateWords(String inputString) {
		
		String  words[]= inputString.split(" ");
		
		Map<String,Integer> wordCount = new HashMap<String, Integer>();
		
		for(String word:words) {
			
			if(wordCount.containsKey(word)) {
				wordCount.put(word, wordCount.get(word)+1);
			}
			else {
				wordCount.put(word, 1);
			}		
		}
		
		Set<Entry<String, Integer>> entry= wordCount.entrySet();
		
		for(Entry<String,Integer> val:entry) {
			
			System.out.println("key: "+val.getKey()+ ": Value = "+val.getValue());
			if(val.getValue()>1) {
				System.out.println("Duplicate value is: "+val.getKey());
			}
		}
		
		Set<String> wordsInString = wordCount.keySet();
		
		for(String word:wordsInString) {
			
			if(wordCount.get(word)>1) {
				System.out.println(word+" : " +wordCount.get(word));
			}
		}
		
		
		
	}

	public static void main(String[] args) {
	
		
		String words = "hey java is java but best language is java";
		findDuplicateWords(words);
		
		

	}

}

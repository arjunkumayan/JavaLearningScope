package amazon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class FrequencyOfWord {
	
	public static List<String> getFrequentWord(String str) {
		
		str  = str.replaceAll("[^a-zA-Z0-9]", " ");
		
		String[]  allWords = str.split(" +");
		Map<String, Integer> countingMap = new HashMap<String,Integer>();
		
		for(String word : allWords) {
			word = word.toLowerCase();
			countingMap.put(word, countingMap.getOrDefault(word, 0)+1);
		}

		System.out.println(countingMap.toString());
		
		TreeMap<String,Integer> mostFrequentMap = new TreeMap<>((e1, e2)-> {
			int freq1 = countingMap.get(e1);
			int freq2 = countingMap.get(e2);
			
			if(freq1 !=  freq2) {
				return freq2 - freq1;
			}
			
			return e1.compareTo(e2);
			
		});
		
		mostFrequentMap.putAll(countingMap);
		
		System.out.println(mostFrequentMap.toString());
		
		List<String> mostFrequentWords = new ArrayList<>();
		int totalFreq =  mostFrequentMap.firstEntry().getValue();
		
		while(!mostFrequentMap.isEmpty()) {
			
			Map.Entry<String, Integer> word= mostFrequentMap.pollFirstEntry();
			if(word.getValue() == totalFreq) {
				mostFrequentWords.add(word.getKey());
			}
			else {
				break;
			}
		}
		
		return mostFrequentWords;
	}
	

	public static void main(String[] args) {
		
		String str = "Best item in category. Lenovo samsung lenovo ? item";
		List<String> str1= getFrequentWord(str);
		
		System.out.println(str1.toString());
		
		String arr = "HELLO";
		char ar[] = arr.toCharArray();
		
		List arj = Arrays.asList(ar);
		
		System.out.println(arj);
		
				
	}

}

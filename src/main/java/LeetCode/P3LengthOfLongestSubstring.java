package LeetCode;

import java.util.HashSet;

public class P3LengthOfLongestSubstring {
	
	public static int lengthOfLongestSubstring(String s)
	{
		int maxLength = 0;
		HashSet<Character> set = new HashSet<>();
		
		int i=0;
		int j=0;
		
		while(j<s.length())
		{
			if(!set.contains(s.charAt(j)))
			{
				set.add(s.charAt(j));
				j++;
				maxLength = Math.max(maxLength, j-i);
				System.out.println(set);
			}
			else
			{
				set.remove(s.charAt(i));
				i++;
				
				
			}
		
		}
		return maxLength;
		
		
		
	}

	public static void main(String[] args) {

		System.out.println(lengthOfLongestSubstring("abcabcbb"));
		//System.out.println(lengthOfLongestSubstring("bbbb"));
		//System.out.println(lengthOfLongestSubstring("pwwkew"));
		
		
		
	}

}

package LeetCode;

import java.util.HashMap;

public class P1TwoSumSecondApproach {

	// this solution will return the index where it mets the target value
	public static int[] twoSum(int nums[], int target)
	{
		
		int[] result = new int[2];
		if(nums == null || nums.length==0)
		{
			return result;
		}
		
		
		// key - store the value
		// value - store the index
		HashMap<Integer,Integer> visited = new HashMap<>();
		for(int i = 0; i< nums.length; i++)
		{
			if(visited.containsKey(target-nums[i]))
			{
				result[0] = visited.get(target-nums[i]);
				result[1] = i;
			}
			visited.put(nums[i], i);
		}
		return result;
	}
	
	public static void main(String[] args) {
		
		int arr[] = { 2,7,11,15};
		
		int a[] = twoSum(arr,9);
		System.out.println(a[0]);
		System.out.println(a[1]);
	}

}

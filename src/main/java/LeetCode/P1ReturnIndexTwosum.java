package LeetCode;

public class P1ReturnIndexTwosum {
	
	public static void twoSum(int nums[], int target)
	{
		int len = nums.length;
		
		int i = 0;
		int j = len-1;
		//int target = 9;
		
		int[] result = new int[2];
		
		while(i<j)
		{
			if(nums[i]+nums[j]==target)
			{
						
				System.out.println("index are: "+i+" " +j );
				break;
				
			}
			if(nums[i]+nums[j]<target)
			{
				i++;
			}
			if(nums[i]+nums[j]>target)
			{
				j--;
			}
			
		}
			
		
	}

	public static void main(String[] args) 
	{
		 int arr[] = {2,7,11,15};
		twoSum(arr,9);
		

	}

}

package LeetCode;

public class P1TwoSum {
	
	public static void indexOfTwosum(int arr[], int target, int n)
	{
	  for(int i=0;i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length ; j++)
			{
				if(arr[i]+arr[j]==target)
				{
					System.out.println(" i and j index are"+i+" "+j);
				}
			}
		}
		
		
		
	}
	

	public static void main(String[] args) {

	int arr[] = {2,7,11,15};
	int target=9;
	
	indexOfTwosum(arr, 9, 4);
	
	
	}

}

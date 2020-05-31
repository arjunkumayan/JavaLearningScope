package Com.SDET.frequentlyAskedJava;

public class Program21BinarySearch {

	
	//   Binary Search - 
	/*   Sort the order
	 *   find the mid element
	 *  then decide whether to go left side or right side
	 *  
	 *  
	 * 
	 * 
	 */
	public static void main(String[] args) 
	{
		int arr[] = {13,15,18,19,40,70,100};
		
		int len = arr.length;
		
		int l = 0;
		int h = len-1;
		
		int key = 100;
		boolean flag = false;
		
		while(l<=h)
		{
			int mid = (l+h)/2;
			
			if(arr[mid]==key)
			{
				System.out.println("element found");
				flag = true;
				break;
			}
			if(arr[mid]<key)
			{
				
				l = mid+1;
			
			}
			if(key>mid)
			{
				h = mid -1;
			}
			
			
		}
		
		
		if(flag == false)
		{
			System.out.println(" Element is not available in the array");
		}
		
		
		
	}

}

package LeetCode;

public class RotateArray {
	
	public void rotateTheArray(int arr[], int d, int n)
	{		
		for(int i=0; i<d ; i++)
		{
			leftRotateByOne(arr,n);
		}
	}

	public void leftRotateByOne(int arr[], int n)
	{	
	int temp = arr[0];
	for(int i = 0; i< n-1 ; i++)
	{
		arr[i] = arr[i+1];
		arr[i+1] = temp;
		
	}
	}
	
	public void printArray(int arr[],int n)
	{
		for(int i=0; i<n; i++)
		{
			System.out.println(arr[i]+ " ");
		}
	}
	
	public static void main(String[] args) {
		RotateArray rotate = new RotateArray();
		
		int arr[] = {1,2,3,4,5,6,7};
		rotate.rotateTheArray(arr, 2, 7);
		
		rotate.printArray(arr, 7);
		
	}
}


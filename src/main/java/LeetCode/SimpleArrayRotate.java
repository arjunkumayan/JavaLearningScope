package LeetCode;

public class SimpleArrayRotate {
	void rotate(int arr[], int d)
	{
		for(int i=0; i<d ; i++)
		{
			rotateTheArray(arr);
		}
		
	}
	
	void rotateTheArray(int arr[])
	{
		int temp = arr[0];
		for(int i=0; i<arr.length-1; i++)
		{
			arr[i] = arr[i+1];
			arr[i+1] = temp;
		
			
		}
	}

	void printArray(int arr[]) {
		for(int i =0 ;i<arr.length ; i++)
		{
			
				System.out.println(arr[i]+" ");
		}
	}
	public static void main(String[] args) {

		int arr[] =  {1,2,3,4,5,6,7};
		
		SimpleArrayRotate rotate = new SimpleArrayRotate();
		rotate.rotate(arr,2);
		rotate.printArray(arr);
		
		
	}

}

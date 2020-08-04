package JavaInterview;

public class RotateArray {

	
	public static void getRotatedArray(int arr[], int d, int n) {
		
		for(int i=0; i<d ; i++) {
			leftRotateArray(arr,n);
			
		}
		
		
	}
	private static void leftRotateArray(int arr[], int n) {
		
		int temp = arr[0];
		for(int i=0 ; i<n-1 ; i++) {
			arr[i] = arr[i+1];
			arr[i+1] = temp;
		}
		
	}
	
	public static void printArray(int arr[], int n) {
		
		for(int i=0 ; i<n ; i++) {
			System.out.print(arr[i] +" ");
		}
		
	}
	public static void main(String[] args) {
	
		
		
		int arr[] = {1,2,3,4,5,6,7};
		getRotatedArray(arr, 2, 7);
		printArray(arr, 7);
	}

}

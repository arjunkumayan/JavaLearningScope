package amazon;

public class ArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// First missing number
		int arr[] = {-2,11,1,-3,2,10,4};
		
		
		for(int i= 0 ; i<arr.length-1 ; i++) {
		
			for(int j= 0 ; j <arr.length-1-i; j++) {
				
				if(arr[j] > arr[j+1]) {				
				int temp =  arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
				
				}
			}
		}
		int arr2[] = new int[arr.length];		
		
		for(int i= 0 ; i<arr.length ; i++) {
			//System.out.println(arr[i]);			
			if(arr[i]>0) {
				arr2[i]  = arr[i];				
			}
		}
		
		for(int i= 0 ; i<arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		
		
	}

}

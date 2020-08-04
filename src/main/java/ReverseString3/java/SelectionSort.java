package ReverseString3.java;

public class SelectionSort {
	
	void sort(int arr[]) {
		int n= arr.length;
		
		for(int i=0 ; i<n-1; i++) {
			int min_index = i;
			for(int j=i+1 ; j<n;j++) {
				if(arr[j]<arr[min_index]) {
					min_index=j;
				}
		}
			int temp = arr[min_index];
			arr[min_index] = arr[i];
			arr[i]=temp;
			}
		}
	
	
	void printArray(int arr[]) {
		int n= arr.length;
		for(int i=0; i<n; i++) {
			System.out.println(arr[i]+ " ");
		
			
		}
		
	}

	public static void main(String[] args) {
		SelectionSort ob = new SelectionSort();
		int arr[] = {64,25,12,22,11};
		ob.sort(arr);
		System.out.println("Sorted Arrat");
		ob.printArray(arr);
		
	}

}

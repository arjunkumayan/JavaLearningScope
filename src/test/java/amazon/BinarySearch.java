package amazon;

public class BinarySearch {
	
	public static void main(String[] args) {
		
		
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		
		int key = 7;
		
		int l = 0;
		int h =  arr.length-1;
		boolean flag = false;
		
		while(l<=h) {			
			
			int m = (l+h)/2;
			
			if(key == m) {
				
				System.out.println("Element is fount..");
				flag = true;
				break;
			}
			
			if(arr[m] >key) {
				h = m-1;
				
			}
			
			if(arr[m] < key) {
				l = m+1;
				
			}
			
		}
		
		if(flag == false) {
			System.out.println("element is not found");
		}
	}

}

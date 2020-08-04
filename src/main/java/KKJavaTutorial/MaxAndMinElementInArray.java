package KKJavaTutorial;

public class MaxAndMinElementInArray {

	public static void main(String[] args) {
	
		int arr[] = {50,30,400,20,60,10};
		
		int max = arr[0];
		int min = arr[0];
		
		for(int i=1; i<arr.length; i++) {
			
			if(arr[i]> max)
			{
				max= arr[i];
				
			}
			else {
				min = arr[i];
			}
		}
		
		System.out.println("Maximum value is: "+max);
		System.out.println("Minimum value is: "+min);
		
		
		
	}

}

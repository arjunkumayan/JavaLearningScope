package Com.SDET.frequentlyAskedJava;

public class program14SumOfElementsInArray {

	public static void main(String[] args) {

		
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		
		//int sum[] = new int[arr.length];
		int sum1 =0;
		
		
		for(int i=0 ; i<arr.length ; i++)
		{
			sum1= arr[i]+sum1;
		}
		
		System.out.println(sum1);
		
		int sum = 0;
		for(int i : arr)
					{
			
			sum = sum+i;
		}
		System.out.println(sum);
		
		
	}

}

package arrayDemo;

public class MultidimensionalDemo {

	public static void main(String[] args) {
  int arr[][] = {{2,7,9},{3,6,9},{6,7,9}};
  
 // System.out.println(arr.length);
  
  for(int i=0; i<arr.length; i++)
  {
	  for(int j=0; j<arr.length ; j++)
	  {
		  System.out.print(arr[i][j] + "  ");
		 
		  
	  }
	  System.out.println();
	  
  }
	}

}
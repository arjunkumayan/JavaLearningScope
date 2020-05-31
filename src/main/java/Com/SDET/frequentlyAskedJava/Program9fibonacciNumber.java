package Com.SDET.frequentlyAskedJava;

public class Program9fibonacciNumber {

	public static void main(String[] args) {
      int a = 1;
      int b = 2;
      int sum;
      int n =10;
      System.out.println(a);
      System.out.println(b);
      for(int i=1 ; i<n ; i++)
      {
    	  sum = a+b;
    	  System.out.println(sum);
     	   a= b;
    	   b= sum;
      }
		
      
		
	}

}

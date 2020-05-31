package Com.SDET.frequentlyAskedJava;

public class Program8SumOfDigitsNumber {

	public static void main(String[] args) {
 // 1234= 10
		
		
		int number = 12345;
		
	   int sum= 0;
	   
	   while(number>0)
	   {
		   int remainder = number%10;
		   
		   sum = sum+remainder;
		   number = number/10;
	   }
	   System.out.println(sum);
	}

}

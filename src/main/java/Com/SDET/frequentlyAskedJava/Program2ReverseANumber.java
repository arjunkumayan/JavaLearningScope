package Com.SDET.frequentlyAskedJava;

public class Program2ReverseANumber {
	
	
	public static int reverseTheNumber(int n) {
		
		int num = n;
		
		int rev = 0;
		int remainder;
		
		while(num != 0)
		{
			remainder = num%10;
			rev = rev*10 + remainder;
			num = num / 10;
		
		}
		
		return rev;
		
	}
	
		public static void main(String[] args) {

		System.out.println(reverseTheNumber(1892));
		System.out.println(reverseTheNumber(12));
		System.out.println(reverseTheNumber(12210));
			
	}

}

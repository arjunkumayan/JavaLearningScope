package Com.SDET.frequentlyAskedJava;

public class Program4PalindromeNumber {
	
public static Boolean palindromicNumber(int n) {
		
		int num = n;
		if(num<0 || (num % 10==0))
		{
			return false;
		}
		
		int rev = 0;
		int remainder;
		
		while(num != 0)
		{
			remainder = num%10;
			rev = rev*10 + remainder;
			num = num / 10;
		}		
		return (rev==n);
		
	}
	

	public static void main(String[] args) {

		System.out.println(palindromicNumber(1234));
		System.out.println(palindromicNumber(1221));
		System.out.println(palindromicNumber(-1221));
		
	}

}

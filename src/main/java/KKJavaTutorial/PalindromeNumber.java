package KKJavaTutorial;

public class PalindromeNumber {
	
	public static void reverseNumber(int number) {
		
		int original = number;
		
		int num = number;
		int reverse = 0;
		while(num!=0) {
			int rem = num%10;
			reverse =  reverse*10 + rem;
			num = num/10;
		}
		
		if(original==reverse) {
			System.out.println(reverse);
			System.out.println("The number is palindrome");
		}
		else {
			System.out.println(reverse);
			System.out.println("The number is not palindrome");
		}
		
	}

	public static void main(String[] args) {
		//16461
		
		reverseNumber(16461);
		reverseNumber(16434461);


		
		
	}

}

package basic;

public class PalindromeNumber {

	public static void main(String[] args) {
    isPalindrome(121);

    isArmStrongNumber(153);
    
	}

	private static void isArmStrongNumber(int n) {
		
		int number =n;
		int sum = 0;
		while(number !=0) {
			
			int rem = number%10;
			sum = (int) (sum+Math.pow(rem, 3));
			
			number = number/10;
			
		}
		
		System.out.println(sum);
		System.out.println(sum==n);
		if(n == sum) {
			System.out.println("Armstrong number");
		}
		else {
			System.out.println("Not a armstrong number");
		}
		
	}

	private static void isPalindrome(int n) {
	
		 	int actualNumber = n;
		 	int number = n;
		 	int sum = 0;
		 	String sum1 = " ";
		 	
		 	while(number!=0) {
		 		
		 		int rem = number %10;
		 		sum = sum*10 + rem;
		 		sum1 = String.valueOf(rem)+sum1;
		 		number = number/10;
		 	}
		 	
		 	if(actualNumber == sum) {
		 		System.out.println("this is palindrome");
		 	}
		 	else {
		 		System.out.println("Not a palindrome number");
		 	}
		System.out.println(sum1);
	}

}

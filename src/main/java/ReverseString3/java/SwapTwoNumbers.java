package ReverseString3.java;

public class SwapTwoNumbers {

	public static void main(String[] args) {

		int a=10;
		int b= 20;
		
		System.out.println("Before Swapping: ");
        System.out.println("a= "+a);
        System.out.println("b= "+b);
        
		/*
		 * int temp=a;
		 *  a=b;
		 *   b=temp;
		 * 
		 * System.out.println("After Swapping: "); System.out.println("a= "+a);
		 * System.out.println("b= "+b);
		 */
        
        
        a= a+b; // 20+10 = 30
        b=a-b;
        a=a-b;
        
        System.out.println("After Swapping: ");
        System.out.println("a= "+a);
        System.out.println("b= "+b);
        
        
	}

}

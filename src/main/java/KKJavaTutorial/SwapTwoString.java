package KKJavaTutorial;

public class SwapTwoString {

	// WAP to swap strings without using temp/third variable
	
	public static void main(String[] args) {
		
		String a = "Hello";
		String b = "world";
		
		System.out.println("Before swappping");
		System.out.println("the value of a is: "+a);
		System.out.println("the value of b is: "+b);
		
		
		// append
		a = a+b; // HelloWorld
		
		// store initial string a in string b
		b=a.substring(0,a.length()-b.length());
		
		// store initial string b in string a
		
		a = a.substring(b.length());
		
		System.out.println("after swappping");
		System.out.println("the value of a is: "+a);
		System.out.println("the value of b is: "+b);
		
		
		
		

	}

}

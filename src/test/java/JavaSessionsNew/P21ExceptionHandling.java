package JavaSessionsNew;

public class P21ExceptionHandling {

	// Unwanted error which is terminating your program
	// there is a difference between errors and exception
	// Errors - syntax error, RAM issue, stack overflow error  - coming due to human mistake
 	// Exception - due to runtime and compile time issue
	public static void main(String[] args) {

		System.out.println("A");

		try {
			int i = 9 / 0;
		} 
		
		catch (Throwable e) {
			System.out.println("some exception occured");
			e.printStackTrace();
		}
		finally
		{
			System.out.println("Finally block");
		}

		System.out.println("B");

	}

}

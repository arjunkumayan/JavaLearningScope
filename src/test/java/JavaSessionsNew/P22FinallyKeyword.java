package JavaSessionsNew;

public class P22FinallyKeyword {

	public static void main(String[] args) {

		// finally block will be executed does not matter whether exception is thrown or not finally block will be executed
		
		try
		{
			int i = 9/0;
		}
		finally
		{
			
			System.out.println("Finally block");
		}
	}

}

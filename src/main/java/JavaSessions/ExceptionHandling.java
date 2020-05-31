package JavaSessions;

public class ExceptionHandling {

	public static void main(String[] args) {

		System.out.println("A");

		try {
			int i = 9 / 0;
		} 
		catch (Throwable e) {
			System.out.println("some exception occured");
			e.printStackTrace();
		}

		System.out.println("B");

	}

}

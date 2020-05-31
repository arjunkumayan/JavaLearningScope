package JavaSessions;

public class MainMethodOverloading {

	public static void main(String args[]) {

		System.out.println("this is my main method for Java");
		MainMethodOverloading.main(10);
		MainMethodOverloading.main("Test");
		
	}

	public static void main(int i) {

		System.out.println(i);
	}

	public static void main(String a) {

		System.out.println(a);
	}

}

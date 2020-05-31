package box.test.javaSecondRound;
// can we overload the main method- yes we can overload the main method

public class MainMethodOverloading {

	public static void main(String[] args) {
		System.out.println("this is my main method for java");
		
		MainMethodOverloading.main(10);
		MainMethodOverloading.main("Arjun");
	}
	public static void main(int i) {
		System.out.println(i);

	}

	public static void main(String a) {
		System.out.println(a);

	}
}

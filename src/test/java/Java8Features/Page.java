package Java8Features;

@FunctionalInterface
public interface Page {
	
	public void greet();  // Interface with only one abstract method but other static and default method are allowed
	
	default void display()
	{
		System.out.println("display");
	}

	static void test() {
		System.out.println("test");
	}
}

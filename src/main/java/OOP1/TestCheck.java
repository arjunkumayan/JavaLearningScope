package OOP1;

public class TestCheck extends TestPrivate {
	public void display()
	{
		System.out.println(x);
	}
    static int x = 30;
	public static void main(String[] args) {
		TestCheck t = new TestCheck();
		t.display();
		/*
		 * System.out.println(TestCheck.x); // System.out.println(TestPrivate.x);
		 */	}

}

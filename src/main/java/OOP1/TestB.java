package OOP1;

public class TestB extends TestA{
	public void m1() {
		System.out.println("m1 method in child");
	}

	public static void main(String[] args) {
	
		TestB b = new TestB();
		b.m1();
		TestA a = new TestA();
		
		a.m1();
	
		TestA a1 = new TestB();
		
		a1.m1();

	}

}

package staticAndNonStaticDemo;

public class Test {
	
	static int a=50;
	int b=20;
	final int d=10;
	
		
	public void show()
	{
		System.out.println(a);
	}

	public static void main(String[] args) {
		Test t = new Test();
		t= null;
		System.out.println(t.a);
		System.out.println(t.b);
	   
	}
	
	
}

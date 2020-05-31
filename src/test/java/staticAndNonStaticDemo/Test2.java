package staticAndNonStaticDemo;

public class Test2 {
	
	static int a=50;
	int b=20;
	final int d=10;
	
	
	static
	{
		System.out.println("Inside static block");
		System.out.println(a);
		//System.out.println(b);
	}
	public void show()
	{
		//d=30;
		System.out.println(a);
	}

	public static void main(String[] args) {
	    System.out.println(a);
	    marks();

		Test2 t  = new Test2();
		t= null;
        t.show();
        System.out.println(t.a);
	}
	
	static void marks()
	{
		System.out.println(a);
	}

}

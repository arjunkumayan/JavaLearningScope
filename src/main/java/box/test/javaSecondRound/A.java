package box.test.javaSecondRound;

public class A {
	
	//public final static int x;
	final static int i=10;

	public static void main(String[] args) {
		A aa=new A();
		aa.xyz();
	B.main(args);
	System.out.println("A main");
	//System.out.println(i);

	}
	
	public void xyz()
	{
		int i=20;
	System.out.println(i);
	}
	
	

}

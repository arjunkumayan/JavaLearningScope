package OOP3;

public class ChildTest  extends MySon implements Parent{

	//
	@Override
	public void myDad() {
		System.out.println("This is overriden method");
		
	}
	
	
	public static void main(String args[])
	{
		ChildTest ct=new ChildTest();
		ct.myDad();
	}

}

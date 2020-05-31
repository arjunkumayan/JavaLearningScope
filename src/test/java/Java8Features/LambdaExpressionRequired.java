package Java8Features;

interface A{
	void show();
}

class xyz implements A{

	@Override
	public void show() {
		System.out.println("Hello");
		
	}
	
}
public class LambdaExpressionRequired {

	public static void main(String[] args) {
		
		A obj = new xyz();
		obj.show();
		
		
		A Obj1 = new A() { // Anonymous class
			
			public void show() {
				System.out.println("Hello");
				
			}
		};
		

	}

}

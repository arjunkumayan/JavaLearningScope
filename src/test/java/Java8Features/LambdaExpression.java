package Java8Features;
//Lambda expression - to remove the anonymous inner class

interface A1{
	void show(int i);
}

class xyz1 implements A1{

	@Override
	public void show(int i) {
		System.out.println("Hello");
		
	}
	
}
public class LambdaExpression {

	public static void main(String[] args) {
		
//		A1 obj = new xyz1();
//		obj.show(10);
//		
		
		A1 Obj1;
//		Obj1= new A1() { // Anonymous class
//			
//			public void show(int i) {
//				System.out.println("Hello");
//				
//			}
//		};
		
		Obj1 = (i) -> System.out.println("Hello = "+i);
		Obj1.show(20);
	}

}

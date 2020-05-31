package JavaLogical;

public class Test extends Truck implements Car {

	public static void main(String[] args) {
		Truck t1	= new Test();
		Car c1	= new Test();
		t1.fuel();
		c1.fuel();
	}

	@Override
	public void fuel() {
		System.out.println("Overridden method in Test class");
		
	}
	
	// which method is overridden

}

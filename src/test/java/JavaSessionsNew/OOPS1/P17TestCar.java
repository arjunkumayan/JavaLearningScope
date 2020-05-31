package JavaSessionsNew.OOPS1;

public class P17TestCar {
	
	/* 1. final class - to prevent the method inheritance
	 * 2. final method - to prevent method overrding
	 * 3. Static method - Can't overload - because belongs to class and common memory allocations
	 * 4. if both parent and child has the static method - then 
	 * 5. Method overrding - run time polymorphism
	 * 6. method overloading - comile time polymorphism
	 * 7- why static method is not allowed
	 * 8 - Can i create the constructor of car class
	 * 
	 * 
	 */

	public static void main(String[] args) {

		P17BMW b = new P17BMW();
		b.start();
		b.stop();
		b.refuel();
		b.theftSafety();
		b.engine();
		
		
		P17Car c = new P17Car();
		c.start();
		c.stop();
		c.refuel();
		c.engine();
		
		//Top casting:
		P17Car c1 = new P17BMW();//child class object can be referred by parent class ref variable - Run TimePolymorphism
		c1.start();
		c1.stop();
		c1.refuel();
	//	c1.theftSafety();  // can not call because it is not available in Car class and not overridden
		
		//down casting:
		P17BMW b1 = (P17BMW) new P17Car();//ClassCastException
		
		
		
	}

}

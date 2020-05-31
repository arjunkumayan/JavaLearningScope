package JavaSessionsNew.OOPS1;

public class P17BMW extends P17Car {
	
	public P17BMW(){
		super();
		System.out.println("BMW const");
	}

	//Method Overriding : run Time Polymorphism
	
	public void start() {
		System.out.println("BMW -- start");
	}

	public void theftSafety() {
		System.out.println("BMW -- theftSafety");
	}

}

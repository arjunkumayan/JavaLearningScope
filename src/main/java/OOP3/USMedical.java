package OOP3;

public interface USMedical {

	int min_fee=50;
	static final int min_fee1=60;
	// bydefault static in nature
	// bydefault final in nature- can not change the value
	// properties
	
	
	// can not have method body
	// only method declaration
	public void cardioServices();
	public void oncologlogyServices();
	public void neuroServices();
	// interface can not have any method body
	// only method declaration
	// only method prototype
	
	
	public void insuranceService();
	
	
	public void doctorsInternship(int doctors);
	public void doctorsInternShip(int doctors, int nurse);
	
	
	// in jdk 1.8
	// can have default method having method body
	default void logo()
	{
		System.out.println("US Medical logo");
	}

// how to call this logo method
	
	// you can not have static method
	// static method can not be overridden
//	public static void cardiotest();
	
	static void parking()
	{
		System.out.println("US Medical Parking");
	}
}

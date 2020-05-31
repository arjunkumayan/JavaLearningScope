package JavaSessionsNew.OOPS3;

public interface USMedical {
	
	static final int min_fee = 50;
	
	public void cardioServices();
	
	public void oncologyServices();
	
	public void neuroServices();
	
	public void medicalInsurance();
	
	
	//in JDK 1.8:
	//can have default method having method body:
	
	
	  default void logo(){ System.out.println("US Medical Logo"); }
	  
	  static void parking(){ System.out.println("US Medical Parking"); }
	 

	//void doctorsInternship(int doctors, int nurse);
	
	
	
	//can not have any methods body
	//only method declaration
	//only method prototype
	//can not create the object of Interface

	
	
	
	

}

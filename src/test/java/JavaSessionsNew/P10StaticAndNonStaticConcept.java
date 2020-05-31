package JavaSessionsNew;

public class P10StaticAndNonStaticConcept {

	public static void main(String[] args) {
		// how to call static methods:  no need to create the object
		//1. using ClassName
		P10StaticAndNonStaticConcept.getSchoolName();
				
		//2. call them directly
		getSchoolName();
		
		// how to call non static method: need to create object

		P10StaticAndNonStaticConcept obj = new P10StaticAndNonStaticConcept();
		obj.getName();
		obj.getSchoolName();
		
		// the method which is common to all should be treated as static
	}

	
	public void getName()
	{
		System.out.println("Get Name Method");
	}
	
	public static void getSchoolName()
	{
		System.out.println("Get School name method");
	}
	
	// static for memory management point of view 
}

package box.test.javaSecondRound;

public class StaticAndNonStaticConcept {

	public static void main(String[] args) {

		
		//how to call static method: no need to create the object
		// 1. call by class name:
		
		StaticAndNonStaticConcept.getSchoolName();
		//2. Call them directly:
		getSchoolName();
		
		//StaticAndNonStaticConcept.getName();
		// how to call non static method: need to create the object
		StaticAndNonStaticConcept obj=new StaticAndNonStaticConcept();
		obj.getName();
		obj.getSchoolName();
		
		// java memory divided into two part
		//Heap memory and Stack Memory
		
		// object will be created inside the heap memory
		
		// obj will refer the reference of object
		
	}
	
	public void getName()
	{
		System.out.println("Get Name method");
	}
	
	public static void getSchoolName()
	{
		System.out.println(" get school name method");
		
	}

}

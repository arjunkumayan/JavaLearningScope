package JavaSessions;

public class StaticAndNonStaticConcept {

	public static void main(String[] args) {

		//how to call static methods: no need to create the object
		//1. call by class name:
		StaticAndNonStaticConcept.getSchoolName();
		
		//2. call them directly:
		getSchoolName();
		
		
		//how to call non static methods: need to create the object
		StaticAndNonStaticConcept obj = new StaticAndNonStaticConcept();
		obj.getName();
		obj.getSchoolName();
		
	}
	
	
	
	public void getName(){
		System.out.println("get name method");
	}
	
	public static void getSchoolName(){
		System.out.println("get school name method");
	}
	
	
	
	
	
	

}

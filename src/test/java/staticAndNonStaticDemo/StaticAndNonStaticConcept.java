package staticAndNonStaticDemo;

public class StaticAndNonStaticConcept {
	// global vars: scope of global var is across all the functions with some condition 
	// if it is staic - call directly or using the classname
	// you can call the static method and vars using obj but not preferrable because these are class variables and not part of object 
	// so unnecessary no need to call using the object
	/*
	 *  Static - for memory management 
	 *  one copy of object across the class
	 *  static stuff are initialized when the class is loaded and destroyed when the class is finished
	 *  Non static - Local variable - are loaded when the block is executed and destroyed when the function finished execution
	 *  Non static - instance variable  are loaded when the object is created and destroyed when the object is destroyed
	 * 
	 * 
	 */
	String name = "Tom";
	static int age = 25;
	
	public static void sum()
	{
		System.out.println(" sum method ");
	}
	
	public void sendMail()
	{
		System.out.println(" send mail method ");
	}

	public static void main(String[] args) {
		// direct calling
		sum();
		System.out.println(age);
		
		// using class name
		System.out.println(StaticAndNonStaticConcept.age);
		StaticAndNonStaticConcept.sum();
		
		
		// non static - using object only
		StaticAndNonStaticConcept obj = new StaticAndNonStaticConcept();
		obj.sendMail();
		System.out.println(obj.name);

	}

}

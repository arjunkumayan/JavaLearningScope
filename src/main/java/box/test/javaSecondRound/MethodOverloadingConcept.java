package box.test.javaSecondRound;

public class MethodOverloadingConcept {

	public static void main(String[] args) {

		MethodOverloadingConcept obj=new MethodOverloadingConcept();
		obj.login();
		obj.login(12345);
		obj.login("arjun", "pwd","Admin");
		
		
	}
	
	// Method overloading: within the class, having different methods with same name 
	//but different number of parameters 
	//and different type of parameter
	
	// many+forms --> polyMorphism - Compile time polymorphism
	// method overloading is one of the example of polymorphism
	
	
	public void login()
	{
		System.out.println("o param login method");
	}
	
	public void login(String userName)
	{
	System.out.println("1 param login method");
	}
	
	public void login(long phoneNumber)
	{
		System.out.println(" 1 param login method");
	}
	
	public void login(String email,String password)
	{
	System.out.println("2 param method");	
	}

	public void login(String email,String password,String role)
	{
		System.out.println("3 param method");
	}
	
	public void login(int otp)
	{
		
	}
	public void search(String product)
	{
		
	}
	
	public void search(String product,int price)
	{
		
	}
	public void search(String product,int price,String color)
	{
		
	}
	
	public void userRegistration(String email,String pwd,String phone)
	{
		System.out.println();
	}

	public void userRegistration(String email,String pwd,String phone,String address)
	{
		System.out.println();
	}
	

	public void userRegistration(String email,String pwd,String phone,int pincode)
	{
		System.out.println();
	}
	
}

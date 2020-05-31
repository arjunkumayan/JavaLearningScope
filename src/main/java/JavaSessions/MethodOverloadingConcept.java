package JavaSessions;

public class MethodOverloadingConcept {

	public static void main(String[] args) {
		
		MethodOverloadingConcept obj = new MethodOverloadingConcept();
		obj.login(9898989);
		obj.login(1234);

	}

	// Method Overloading: within the class, having different methods with same
	// name but different number of parameters
	// and different types of parameters
	
	//many+forms --> Compile Time PolyMorphism

	public void login() {
		System.out.println("0 param login method");
	}

	public void login(String username) {
		System.out.println("1 param login method");
	}

	public void login(long number) {
		System.out.println("1 param login method");
	}
	
//	public void login(int otp) {
//
//	}

	public void login(String email, String password) {
		System.out.println("2 params login method");

	}

	public void login(String email, String password, String role) {
		System.out.println("3 params login method");

	}

	

	public void search(String product) {

	}
	

	public void search(String product, int price) {

	}

	public void search(String product, int price, String color) {

	}

	public void userRegistration(String email, String pwd, String phone) {

	}

	public void userRegistration(String email, String pwd, String phone, String address) {

	}

}

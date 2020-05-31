package JavaSessionsNew.OOPS2;

public class TestCompany {

	public static void main(String[] args) {

		Company comp = new Company();
		comp.setName("IBM");
		
		System.out.println(comp.getName());
		
		System.out.println(comp.name);
		

		comp.setProjectName("AI");
		System.out.println(comp.getProjectName());
		
	}

}

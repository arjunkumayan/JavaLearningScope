package personalPractice;

public class SymboisisCollege implements USEducation,UKEducation,IndiaEducation {

	

	@Override
	public void computerScienceDepartment() {
		
		System.out.println("Symboisis--- Computer science department");
	}

	@Override
	public void informationTechnologyDepartMent() {
		System.out.println("Symboisis--- Information technology department");
		
	}

	@Override
	public void libraryStore() {
		System.out.println("Symboisis--library store department");
		
	}

	//@Override
	public void electronicsDepartMent() {
		System.out.println("Symboisis-- electronics department");
	}

	//@Override
	public void sportsDepartment() {
		System.out.println("symboisis-- sportsDepartment");		
	}

	@Override
	public void educationLoanDepartment() {
		System.out.println("Symboisis-- Education loan department");
		
	}

	@Override
	public void administrativeDepartment() {
		System.out.println("Symboisis--- admin department");
		
	}

}

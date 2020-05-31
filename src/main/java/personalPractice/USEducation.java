package personalPractice;

public interface USEducation {
	
//	by default final static in nature
	
	final static int courseYears=4;
	public void computerScienceDepartment();
	
	public void informationTechnologyDepartMent();
	
		
	public void libraryStore();
	
	default void laboratory()
	{
		System.out.println("this is US laboratory department");
		
	}
	
	
	static void loan()
	{
		System.out.println("Loan department of US Education");
	}
	
	// can not create a static declaration method because can not override the static method
	
	public static void compulsorySubject()
	{
		System.out.println("compulsory subject ");
	}
	
	

}

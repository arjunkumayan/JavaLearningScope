package practice;

public class MyUniversity {

	String univName;
	String courseName;
	String collegeName;
	int courseYears;
	String departMent;
	static String univState="Delhi";
	static double courseFee=400000;
	
	
	public MyUniversity()
	{
		System.out.println("this is default constructor");
	}
	
	public MyUniversity(String univName,String collegeName,String courseName,int courseYears,String dept)
	{
		
		this.univName=univName;
		this.collegeName=collegeName;
		this.courseName=courseName;
		this.courseYears=courseYears;
		this.departMent=dept;
		
	}
	
	
	
	
	
	
	
	
	
	
}

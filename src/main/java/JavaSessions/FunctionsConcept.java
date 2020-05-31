package JavaSessions;

import java.util.ArrayList;

public class FunctionsConcept {

	public static void main(String[] args) {

		//call a function
		//create the Object of the class: use new keyword
		FunctionsConcept obj = new FunctionsConcept();
		
		obj.test();//calling the function
		obj.getMyCountry();
		String n = obj.getTrainerName();
		System.out.println(n+" Khunteta");
		System.out.println(obj.sum());
		
		String ar[] = obj.getStudentList();
		System.out.println(ar[0]);
		
		int sum = obj.addition(10, 20);
		System.out.println(sum);
		
		int sum1 = obj.addition(100, 20);
		System.out.println(sum1);
		
		String city = obj.getCountryCapital("India");
		System.out.println(city);
		
		System.out.println(obj.isUSCitizen("Elena"));
		
		if(obj.isUSCitizen("Elena")){
			System.out.println("free medical service");
		}
		
		double marks = obj.getStudentMarks("Tom");
		System.out.println(marks);
		
	}	
	//can not create a function inside a function
	//duplicate functions are not allowed
	
	//1. simple function: no input and no return
	//void - does not return anything
	public void test(){
		System.out.println("test method");
	}
	
	public void getMyCountry(){
		System.out.println("India");
		String name = "Naveen";
		System.out.println(name);
	}
	
	//2. no input but some return
	public String getTrainerName(){
		String name = "Naveen";
		return name;
	}
	
	public int sum(){
		System.out.println("sum method");
		int a = 10;
		int b = 20;
		int c = a+b;
		return c;
	}
	
	public String[] getStudentList(){
		System.out.println("get student list");
		String student[] = new String[3];
		student[0]="Athira";
		student[1]="Shalu";
		student[2]="Bharath";
		
		return student;
	}
	
	public ArrayList<String> getPlayersName(){
		System.out.println("getPlayersName");
		ArrayList<String> ar = new ArrayList<String>();
		ar.add("Virat");
		ar.add("Sachin");
		ar.add("Sunil");
		
		return ar;
	}
	

	//3. some input and some return:
	public int addition(int x, int y){
		System.out.println("addition method");
		int z = x+y;
		return z;
	}
	
	public String getCountryCapital(String countryName){
		System.out.println("get Country Capital");
		
		if(countryName.equals("India")){
			return "New Delhi";
		}
		else if(countryName.equals("USA")){
			return "Washignton DC";
		}
		else if(countryName.equals("Russia")){
			return "Moscow";
		}
		
		return null;

	}
	
	public boolean isUSCitizen(String personName){
		
		System.out.println("isUSCitizen method");
		
		if(personName.equals("Naveen")){
			return false;
		}
		else if(personName.equals("Elena")){
			return true;
		}
		
		return false;
		
	}
	
	
	public double getStudentMarks(String studentName){
		System.out.println("getStudentMarks method");
		
		if(studentName.equals("Nisha")){
			return 90;
		}
		else if(studentName.equals("Swapn")){
			return 99;
		}
		else if(studentName.equals("Naveen")){
			return 10;
		}
		else if(studentName.equals("Ravi")){
			return 100;
		}
		else if(studentName.equals("Amit")){
			return 80;
		}
		else{
			System.out.println(studentName + " is not defined, please define this student in your DB");
			return -1;
		}
		
	}
	
	
}

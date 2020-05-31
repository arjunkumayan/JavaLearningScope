package JavaSessions;

import java.util.ArrayList;

public class Employee {
	
	String name;
	int age;
	ArrayList<String> laptops; 
	
	public Employee(String name, int age, ArrayList<String> laptops){
		
		this.name = name;
		this.age = age;
		this.laptops = laptops;
		
	}
	
	
	public static void main(String args[]){
		
		ArrayList<String> laptopLists = new ArrayList<String>();
		laptopLists.add("MAC BOOK PRO");
		laptopLists.add("Windows Lenovo");
		laptopLists.add("Mac Book AIR");
		
		Employee emp1 = new Employee("Tom", 25, laptopLists);
		
		System.out.println(emp1.name);
		System.out.println(emp1.age);
		System.out.println(emp1.laptops);
		
		
		 //00 01 02 03
		// 10 11 12 13
		
		for(int i=0; i<=9; i++){
			for(int j=0; j<=9; j++){
				System.out.print(i+""+j+" ");
			}
			System.out.println();
		}
		
		
		
	}
	
	
	
	
	

}

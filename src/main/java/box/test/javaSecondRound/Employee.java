package box.test.javaSecondRound;

import java.util.ArrayList;

public class Employee {

	String name;
	int age;
	ArrayList<String> laptops;

	public Employee(String name, int age, ArrayList<String> laptops) {

		this.name = name;
		this.age = age;
		this.laptops = laptops;

	}

	public static void main(String args[]) {
		ArrayList<String> laptopList = new ArrayList<String>();
		laptopList.add("Mac book PRO");
		laptopList.add("Windows lenovo");
		laptopList.add("Mac book air");
		Employee emp1 = new Employee("Tom", 25, laptopList);
		System.out.println(emp1.name);
		System.out.println(emp1.age);
		System.out.println(emp1.laptops);
	}
}

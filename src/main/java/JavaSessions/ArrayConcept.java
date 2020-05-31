package JavaSessions;

public class ArrayConcept {

	public static void main(String[] args) {

		// two major limitations:
		// 1. static array: size is fixed: to solve this problem, we use
		// ArrayList - dynamic arrays
		// 2. can not store different data types: to solve this problem, we use
		// Object Static Array or ArrayList

		// 1. int array:
		int i[] = new int[4];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		// i[4]=50;//ArrayIndexOutOfBoundsException

		System.out.println(i[0]);
		System.out.println(i[3]);
		// System.out.println(i[4]);//ArrayIndexOutOfBoundsException

		System.out.println(i.length);// length of array

		// how to print all the values of array: for loop

		for (int k = 0; k < i.length; k++) {
			System.out.println(i[k]);
		}

		// 2. double array:
		double d[] = new double[2];
		d[0] = 12.33;
		d[1] = 100;

		// String Array:
		String s[] = new String[4];
		s[0] = "Java";
		s[1] = "Python";
		s[2] = "Ruby";
		s[3] = "JavaScript";

		for (int p = 0; p < s.length; p++) {

			if (s[p].equals("JavaScript")) {
				System.out.println("I hate " + s[p]);
			}

			else {
				System.out.println("I love " + s[p]);
			}
		}

		String studentNames[] = new String[5];
		studentNames[0] = "Irina";
		studentNames[1] = "Sumi";
		studentNames[2] = "Akshay";
		studentNames[3] = "Nisha";
		studentNames[4] = "Bongani";

		for (int count = 0; count < studentNames.length; count++) {
			// System.out.println(studentNames[count]);

			if (studentNames[count].equals("Irina")) {
				System.out.println(studentNames[count] + " she is Russian");
			} else if (studentNames[count].equals("Sumi")) {
				System.out.println(studentNames[count] + " she is from Bangladesh");
			} else if (studentNames[count].equals("Akshay")) {
				System.out.println(studentNames[count] + " she is from India");
			} else if (studentNames[count].equals("Nisha")) {
				System.out.println(studentNames[count] + " she is from India");
			} else {
				System.out.println(studentNames[count] + " student country is not defined");
			}
		}
		
		
		//Object Static Array:
		Object empData[] = new Object[5];
		empData[0]="Tom";
		empData[1]=25;
		empData[2]='m';
		empData[3]=1000.33;
		empData[4]=true;
		
		

	}

}

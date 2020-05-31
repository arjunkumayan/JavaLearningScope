package JavaSessions;

public class StringConcat {

	public static void main(String[] args) {

		System.out.println("hello naveen");
		
		int i = 10;
		System.out.println(i);
		
		System.out.println(100+200);
		
		int age = 25;
		System.out.println("age of Tom is "+age);
		
		int foodBill = 25;
		int cocktailBill = 100;
		int totalBill = foodBill + cocktailBill;
		System.out.println("total bill need to be paid "+ totalBill);
		System.out.println("total bill need to be paid "+ foodBill+cocktailBill);
		System.out.println("total bill need to be paid "+ (foodBill+cocktailBill));

		
		int a = 100;
		int b = 200;
		String x = "Hello";
		String y = "World";
		
		System.out.println(a+b);
		System.out.println(x+y);
		
		System.out.println(a+x+y);
		System.out.println(a+b+x+y);
		System.out.println(x+y+a+b);//HelloWorld100200
		System.out.println(x+y+(a+b));//HelloWorld300
		
		System.out.println("the value of a is: "+ a);
		System.out.println("the value of b is: "+ b);
		System.out.println("the sum is: "+ (a+b));
		

		byte b1 = 100;
		byte b2 = 25;
		byte diff = (byte) (b1-b2);//int 75 --> byte 75
		System.out.println(diff);
		System.out.println(b1-b2);
		
		int d1 = b1-b2;
		
		long l1 = 1000;
		long l2 = 500;
		
		System.out.println("Hello " + " World");
		System.out.println(x+" "+y);

	}

}

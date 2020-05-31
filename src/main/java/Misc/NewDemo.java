package Misc;

public class NewDemo {
	// Non static variable is not allowed to access inside the static method
	// because non static variables are instance variable and to access the non static variable you need the instance through which you can access the non static variables
	

	int c;
	public static void main(String[] args) 
	{
		NewDemo obj = new NewDemo();
		System.out.println(obj.c);
	}
	
	public void show()
	{
		System.out.println(c);
	}

}

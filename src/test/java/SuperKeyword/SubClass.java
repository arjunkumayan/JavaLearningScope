package SuperKeyword;

public class SubClass extends ParentClass
{
	public SubClass()
	{
		System.out.println("I am in child class constructor");
	}

	public SubClass(String str)
	{
		super(str);// to make call to parameterized constructor of parent class
		System.out.println("I am in child class constructor: " + str);
	}
	public static void main(String[] args) {
		
		//SubClass obj = new SubClass();
		
		SubClass obj1 = new SubClass("Arjun");
		
		

	}

}

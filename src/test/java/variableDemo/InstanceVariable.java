package variableDemo;
// instance variable - for each object you will get the different value
// There is no concept of Global variable is Instance variable only
// non static variable

public class InstanceVariable {
	int roll;
	double marks;
	int result=10;
	
	final int value;
	
	

	public InstanceVariable(int roll, double marks) 
	{
	this.roll=roll;
	this.marks=marks;
	value=10;
		
	}
	public static void main(String[] args) {
		InstanceVariable obj1 = new InstanceVariable(10,30.5);
		InstanceVariable obj2 = new InstanceVariable(20,80.3);
		InstanceVariable obj3 = new InstanceVariable(15,45.9);
		
		obj1.show();
		obj2.show();
		obj3.show();
				
	}

	public void show()
	{
		System.out.println("final variable value is:"+value);
		int result=1; // higher preference to local variable
		System.out.println("Roll no. "+roll+ " marks are: "+marks);
		System.out.println(result);
	}
}
	

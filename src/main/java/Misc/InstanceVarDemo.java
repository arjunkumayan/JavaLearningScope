package Misc;

// There is no concept of Global variable is Instance variable only
// non static variable

public class InstanceVarDemo {
	int roll = 10;
	double marks= 80.5;
	int result;

	public static void main(String[] args) {
		InstanceVarDemo demo = new InstanceVarDemo();
		InstanceVarDemo demo1 = new InstanceVarDemo();
		InstanceVarDemo demo2 = new InstanceVarDemo();
		
		demo.show();
		demo1.show();
		demo2.show();
		
		
	}

	public void show()
	{
		System.out.println("Roll no. "+roll+ " marks are: "+marks);
	}
}
	

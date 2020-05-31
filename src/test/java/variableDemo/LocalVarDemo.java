package variableDemo;
/*
 * within methods, constructor, blocks
 * Compulsory to initialize the local variables ow compile error
 * They are created once method,block or constructor is created
 */

public class LocalVarDemo {
	int result;

	public static void main(String[] args) {
		
		int x=10;
		// mandatory to initialize for local variables
		// even can't check outside the block
		
		System.out.println(x);
		
	}

	public void show()
	{
		//System.out.println("marks are: "+marks);
	}
	public void marks()
	{
		int marks=90;
	}
	
	public void printNames() 
	{ // block concept
		for(int i=0; i<5 ; i++)
		{
			System.out.println(i);
		}
		// System.out.println("I value is: "+i); can not access here
	}
}

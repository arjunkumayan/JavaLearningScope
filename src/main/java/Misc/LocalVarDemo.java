package Misc;

public class LocalVarDemo {
	int result;

	public static void main(String[] args) {
		
		int x=0;
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

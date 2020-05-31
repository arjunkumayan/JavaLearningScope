package ThisKeyword;



public class MyDrivers {
	
	
	public MyDrivers()
	{
		this("jdbc");
		System.out.println("Loading my drivers");
	}
	
	public MyDrivers(String name)
	{this(10);
		System.out.println("Loading my drivers: "+name);
	}
	public MyDrivers(int count)
	{
		System.out.println("Total count is: "+count);
	}
	
	public void display()
	{
		System.out.println("I am in display method");
		
	}
	
	public static void main(String args[])
	{
		MyDrivers obj=new MyDrivers();
		//MyDrivers obj1=new MyDrivers("JDBC");
		//MyDrivers obj2=new MyDrivers(10);
		
		//WebDriver driver = new ChromeDriver();
		
	}

}

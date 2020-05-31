package SuperKeyword;

public class ChildClass extends BaseClass {

	int int_rate=10;
	
	public static void main(String args[])
	{
		ChildClass obj = new ChildClass();
		//obj.showMeInterestRateFromPVTBank();
	}
	public ChildClass()
	{
		System.out.println("Child Constructor");
	}
	
	public void showMeInterest()
	{
		
		System.out.println("I am in child class");
	}
	
	public void showMeInterestRateFromPVTBank()
	{
	//	showMeInterest();
		super.showMeInterest();
		
		System.out.println("Current intrest rate from pvt bank is: "+ super.int_rate);
	}
}

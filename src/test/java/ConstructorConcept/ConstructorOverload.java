package ConstructorConcept;

public class ConstructorOverload {
	String name;
	
	int marks;

	public static void main(String[] ars) {
		ConstructorOverload c = new ConstructorOverload()	;
				}
	
	public ConstructorOverload()
	{
		System.out.println("Welcome to constructor");
	}
	public ConstructorOverload(String str)
	{
		System.out.println("Welcome to constructor"+str);
		name=str;
	}
	
	public ConstructorOverload(int amount)
	{
		marks = amount;
		System.out.println("Welcome to constructor"+amount);
	}
	
	public ConstructorOverload(String str1, String str2)
	{
		System.out.println("Welcome to constructor" +str1+" "+str2);
	}
	public void displayResult()
	{
		System.out.println("Marks are 90");
	}

}

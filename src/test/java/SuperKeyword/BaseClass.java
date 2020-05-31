package SuperKeyword;

public class BaseClass {
	/*
	 * Super keyword is reserved keyword
	 * Super can use with the inheritance concept - parent - child concept
	 * super can be used with-
	 * Variable- when you have a same variable in parent and child class and you want to call parent variable from child class
	 * Methods - when you same methods in both parent and child class and you want to call the parent method from child class
	 * Constructor - when you want to call the parent constructor from child class
	 * 
	 * 
	 * In child class bydefault the compiler insert the super() call which will call the default constructor in parent class
	 * if you don't have the default constructor in parent class it will throw compile time error.
	 *
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	
	int int_rate=8;
	
	public BaseClass()
	{
		System.out.println("super constructor");
	}
	public BaseClass(String name)
	{
		System.out.println("I am in parent class constructor: "+name);
	}
	public void showMeInterest()
	{
		System.out.println("I am in parent class");
	}
	
	
	
	

}

package variableDemo;
// Instance variable

// When you create a object then the copy of each instance variable is given to the object -- if it is not assigned then default value is assigned otherwise the value
/// given is assigned
// int - 0
/* int - 0
 * double - 0.0
 * float - 0.0
 * boolean - false
 * byte = 0
 * short = 0
 * long - 0
 */

// There is no concept of Global variable is Instance variable only
// non static variable

/* 1-  there is no concept of global variable in java
 * 2- Instance variable are the variable which are declared inside the class but outside
 * the methods, blocks and constructor
 * 3- if you don't provide any values then java will provide the default values
 * 4- why we call instance variable because there values are unique to each instance of class
 *  5- Instance variable are created when the object is created and destroyed when object is destroyed
 * 
 */

public class InstanceVarDemo {
	int roll = 10;
	double marks = 80.5;
	int result;

	public static void main(String[] args) {
		InstanceVarDemo demo = new InstanceVarDemo();
		InstanceVarDemo demo1 = new InstanceVarDemo();
		InstanceVarDemo demo2 = new InstanceVarDemo();

		demo.show();
		demo1.show();
		demo2.show();

	}

	public void show() {
		System.out.println("Roll no. " + roll + " marks are: " + marks);
	}
}
/*
 * Local Variables
Instance Variables
Static Variables
Static Variables: When a variable is declared as static, then a single copy of the variable is created and shared among all objects at a class level. Static variables are, essentially, global variables. All instances of the class share the same static variable.
 We can create static variables at class-level only. See here
static block and static variables are executed in order they are present in a program.

Local Variables: A variable defined within a block or method or constructor is called local variable.
These variable are created when the block in entered or the function is called and destroyed after exiting from the block or when the call returns from the function.
The scope of these variables exists only within the block in which the variable is declared. i.e. we can access these variable only within that block.
Initialisation of Local Variable is Mandatory.

Instance Variables: Instance variables are non-static variables and are declared in a class outside any method, constructor or block.
As instance variables are declared in a class, these variables are created when an object of the class is created and destroyed when the object is destroyed.
Unlike local variables, we may use access specifiers for instance variables. If we do not specify any access specifier then the default access specifier will be used.
Initialisation of Instance Variable is not Mandatory. Its default value is 0
Instance Variable can be accessed only by creating objects.

 */

package variableDemo;

// Each objec assigning the different values to the instance variable

public class InstanceVariableNew {

	static int testCount=10;
	int covid19_pune;
	int covid19_delhi;
	
	public static void main(String[] args) {
	
		InstanceVariableNew obj1 = new InstanceVariableNew();
		obj1.covid19_pune = 1000;
		obj1.covid19_delhi = 5000;
		obj1.show();
		
		InstanceVariableNew obj2 = new InstanceVariableNew();
		obj2.covid19_pune=  20;
		obj2.covid19_delhi= 90;
		obj2.show();
	}
	
	public void show() {
		int testCount = 0;
		System.out.println(testCount);
		System.out.println("total positive cases in pune are: "+covid19_pune);
		System.out.println("total positive cases in delhi are: "+covid19_delhi);
	}

}

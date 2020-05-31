package JavaSessionsNew;

public class P15MyCar {
	
	// P16CreateCar relation

	// Framework of CAR
	// through which we can create the car
	// BMW, Audi, 
	// 1 Template for University  - so this will define the class or blueprint of entity
	// 1 template of hospital
	// 1 template of banks
	/* Class property
	 * Data member of class - Class variables and methods together
	 * 
	 * 
	 */
	
	// class variables
	
	String name;
	String color;
	String model;
	String engine;
	int price;
	double milage;
	
	static int wheels = 4;
	
	
	// class methods
	
	public void start()
	{
		
	}
	public void stop() {

	}

	// constructor: used to give properties to objects 
	// initialize the value of objects when objects calls
		public P15MyCar() { // 0 param
			System.out.println("default const");
		}

		public P15MyCar(int i) {
			System.out.println("1 param const");
		}

		public P15MyCar(String name, String color, String model, String engine, int price, double milage) {
			this.name = name;
			this.color = color;
			this.model = model;
			this.engine = engine;
			this.price = price;
			this.milage = milage;

		}
		
		public P15MyCar(String name, String color, String model) {
			this.name = name;
			this.color = color;
			this.model = model;

		}


}

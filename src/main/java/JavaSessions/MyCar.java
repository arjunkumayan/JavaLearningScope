package JavaSessions;

public class MyCar {

	// class variables:
	String name;
	String color;
	String model;
	String engine;
	int price;
	double milage;

	static int wheels = 4;

	// constructor:
	public MyCar() { // 0 param
		System.out.println("default const");
	}

	public MyCar(int i) {
		System.out.println("1 param const");
	}

	public MyCar(String name, String color, String model, String engine, int price, double milage) {
		this.name = name;
		this.color = color;
		this.model = model;
		this.engine = engine;
		this.price = price;
		this.milage = milage;

	}
	
	public MyCar(String name, String color, String model) {
		this.name = name;
		this.color = color;
		this.model = model;

	}


	// class methods:
	public void start() {

	}

	public void stop() {

	}

}

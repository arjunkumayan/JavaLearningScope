package JavaSessions;

public class CreateCar {

	public static void main(String[] args) {

		MyCar obj = new MyCar(10);
		
		MyCar bmw = new MyCar("BMW", "White", "X3", "Petrol", 60, 10.33);
		MyCar maruti = new MyCar("maruti", "Red", "Alto", "Petrol", 4, 20);
		MyCar merck = new MyCar("merck", "Black", "E Class", "Petrol", 75, 15);
		MyCar audi = new MyCar("audi", "Blue", "Q3", "Diesel", 70, 8);
		MyCar honda = new MyCar("honda", "civic", "iVtec");


		System.out.println(bmw.name);
		System.out.println(bmw.model);
		System.out.println(bmw.milage);
		
		
		System.out.println(maruti.color);
		
		System.out.println(audi.name + " " + audi.color + " "+ audi.model + " " + audi.price + " "+ MyCar.wheels);

	}

}

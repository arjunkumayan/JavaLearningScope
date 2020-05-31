package JavaSessionsNew;


public class P16CreateCar {

	public static void main(String[] args) {
		
		// whenever you are creating the object the constructor will be called
		// when you are not passing any argument then the 0 default constructor will be called

		P15MyCar obj1 = new P15MyCar();
		P15MyCar obj = new P15MyCar(10);
		
		P15MyCar bmw = new P15MyCar("BMW", "White", "X3", "Petrol", 60, 10.33);
		P15MyCar maruti = new P15MyCar("maruti", "Red", "Alto", "Petrol", 4, 20);
		P15MyCar merck = new P15MyCar("merck", "Black", "E Class", "Petrol", 75, 15);
		P15MyCar audi = new P15MyCar("audi", "Blue", "Q3", "Diesel", 70, 8);
		P15MyCar honda = new P15MyCar("honda", "civic", "iVtec");


		System.out.println(bmw.name);
		System.out.println(bmw.model);
		System.out.println(bmw.milage);
		
		
		System.out.println(maruti.color);
		
		System.out.println(audi.name + " " + audi.color + " "+ audi.model + " " + audi.price + " "+ P15MyCar.wheels);

	}

}

package box.test.javaSecondRound;

public class CreateCar {

	public static void main(String[] args) {

		//MyCar obj=new MyCar();
		MyCar obj=new MyCar(10);

		MyCar bmw=new MyCar("BMW","White","x3","petrol",600000,10.33);
		System.out.println(bmw.name+" "+bmw.engine+" "+bmw.color+" "+bmw.price+" "+bmw.model);
		
		MyCar maruti=new MyCar("maruti","Red","Alto","petrol",4,20);
		System.out.println(maruti.name+" "+maruti.engine+" "+maruti.color+" "+maruti.price+" "+maruti.model);
		
		MyCar merck=new MyCar("merck","Red","E Class","petrol",75,15);
		
		MyCar audi=new MyCar("audi","blue","Q3","Diesel",50,8);
		System.out.println(audi.color+" "+audi.model+" "+audi.price+" "+MyCar.wheels);
		// constructor - creating/defining the object
		
		
	}

}

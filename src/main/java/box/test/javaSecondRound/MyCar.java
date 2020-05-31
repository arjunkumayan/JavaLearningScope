package box.test.javaSecondRound;

public class MyCar {
	
	// what is class
	// a blueprint of specific entity- class of car class and class will generate the object
	// Class will give the blueprint how the object is created
	// blueprint of different object
	
	//class vars:
	String name;
	String color;
	String model;
	String engine;
    int price;
    double mileage;
    static int wheels=4;
    
    //constructor:
    /// don't return any value
    // can overload constructor- yes we can
    //when object of this class is created the constructor is called immediately
    
    // the purpose of constructor is used to create the object s
    
    public MyCar() //0 Param constructor
    {
    	System.out.println("default const");
    	
    }
    public MyCar(int i)
    {
    	
    }
    public MyCar(String name,String color,String model,String engine,int price,double milage)
    {
    	
    	this.name=name;
    	this.color=color;
    	this.model=model;
    	this.engine=engine;
    	this.price=price;
    	this.mileage=milage;
    	
    }
    
    // Class methods:
    
    public void start()
    {
    	
    }
    public void stop()
    {
    	
    }
     


}

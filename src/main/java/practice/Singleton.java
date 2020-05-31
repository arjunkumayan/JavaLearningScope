package practice;

public class Singleton {
	
	// singleton class is a class that has only one instance of a class at a time
	// 1. make the constructor private
	//2.  write a public static method(getinstance) that has return type of object of this singleton class(lazy initilization)
	
	
	private static Singleton singleton_instance=null;
	public String str;
	
	private Singleton()
	{
		str="Hey I am using singleton pattern";
	}

	public static Singleton get_instance()
	{
		if(singleton_instance==null)
			singleton_instance=new Singleton();
		return singleton_instance;
		
		
	}
	
	
	public static void main(String[] args) {
		
		Singleton x=Singleton.get_instance();
		Singleton y=Singleton.get_instance();
		Singleton z=Singleton.get_instance();
		
		x.str=(x.str).toUpperCase();
		System.out.println(x.str);
		System.out.println(y.str);
		System.out.println(z.str);
		
		
		z.str=(z.str).toLowerCase();
		System.out.println(x.str);
		System.out.println(y.str);
		System.out.println(z.str);
	
	
	}

}

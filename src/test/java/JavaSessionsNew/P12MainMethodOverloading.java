package JavaSessionsNew;


public class P12MainMethodOverloading {
	 //Static stuff can't be accessed inside the static stuff
	 //non Static stuff can be accessed inside the static stuff
	
	static int a=10;
	int b=20;
	
	public void display()
	{
		System.out.println(a);
		System.out.println(b);
	}
	


	public static void main(String[] args) {
		System.out.println("this is my main method for Java");
		P12MainMethodOverloading.main(10);
		P12MainMethodOverloading.main("Test");

	}

	public static void main(int i) {

		System.out.println(i);
		//System.out.println(b); //Static stuff can't be accessed inside the static stuff
	}

	public static void main(String a) {

		System.out.println(a);
	}

}

package Com.SDET.frequentlyAskedJava;

public class Program1SwapNumbers {

	public static void main(String[] args) {

		//1 . first ways
		int a = 10;
		int b = 20;
		
		int temp;
		
		System.out.println("Before swapping");
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("After swapping");

		temp = a;
		a=b;
		b=temp;
		System.out.println(a);
		System.out.println(b);
		
		//2. second ways
		
		int t1 = 30;
		int t2 = 50;
		System.out.println("Before swapping");
		System.out.println("t1: "+t1+" and t2: "+t2);
		t1 = t1+t2;  // 80
		t2= t1-t2;   // 80-50 = 30
		t1 = t1-t2;   // 80 - 30 = 50
		
		System.out.println("t1: "+t1+" and t2: "+t2);
		
		
		
		
	}

}

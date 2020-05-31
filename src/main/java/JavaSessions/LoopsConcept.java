package JavaSessions;

public class LoopsConcept {

	public static void main(String[] args) {

		//to print 1 to 10
		//loops:
		//1. while:
		int i = 1; //initialization
		while(i<=10){//conditional
			System.out.println(i);//logic
			i=i+1;//incremental
		}
		
		int k =1;
		while(k<=10){
			System.out.println("Testing " + k);
			k=k+1;
		}
		
		
		//2. for loop:
		for(int p=0; p<=10; p=p+1){
			System.out.println(p);//0 1 2
		}
		
		//even numbers - 1 to 10 --> 2 4 6 8 10
		for(int even=2; even<=10; even=even+2){
			System.out.println(even);
		}
		
		//odd numbers: 1 to 10--> 1 3 5 7 9
		for(int odd=1; odd<=10; odd=odd+2){
			System.out.println(odd);
		}
		
		//for - if:
		for(int s = 1; s<=100; s++){
			System.out.println(s);
			if(s % 5==0){
				System.out.println("Hey Buddy!!!");
			}
		}
		
		//5%5 = 0
		//5%2 = 1
		//9%2 = 1
		//100%50 = 0
		
		
	}

}

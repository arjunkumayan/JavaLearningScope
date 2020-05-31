package JavaSessions;

public class ComaprisonOperators {

	public static void main(String[] args) {

		int a = 200;
		int b = 200;
		
		if(b>a){
			System.out.println("b is greater than a");
		}
		else{
			System.out.println("a is greater than or equal to b");
		}
		
		if(a==b){
			System.out.println("both are equal");
		}
		
		if(a>=b){
			System.out.println("a is greater than or equal to b");
		}
		
		//> < >= <= == !=
		
		boolean flag = true;
		if(!flag){
			System.out.println("PASS");
		}
		else{
			System.out.println("FAIL");
		}
		
		if(a!=b){
			
		}
		
		//dead code:
		boolean t=false;
		if(t){
			System.out.println("TEsting");
		}
		
		if(false){
			System.out.println("TEsting");
		}
		
		if(true){
			System.out.println("TEsting");
		}
		
		//WAP to find out the max number (given three numbers)
		int x = 600;
		int y = 700;
		int z = 300;
		//&& - Short Circuit Operator
		
		if(x>y && x>z){//false && true
			System.out.println("x is the highest number");
		}
		else if(y>z){//true
			System.out.println("y is the highest number");
		}
		else{
			System.out.println("z is the highest number");
		}
		
		
	}

}

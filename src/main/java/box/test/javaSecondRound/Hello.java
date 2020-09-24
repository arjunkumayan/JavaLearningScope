package box.test.javaSecondRound;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		double x  = 3.14;
		
		int y = (int)Math.abs(x);
		
		System.out.println(y);
		
		String a = "abc";
		String b = "abc";
		
		String c = new String("abc");
		
		if(a==c && a.equals(b)) {
			System.out.println("hell");
			
		}
		else
		{
			System.out.println("hhhh");
		}
	}

}

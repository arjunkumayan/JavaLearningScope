package JavaSessions;

public class WrapperClasses {

	public static void main(String[] args) {

		String x = "100";
		System.out.println(x+20);//10020 -- 120
		
		//convert string to int:
		int i = Integer.parseInt(x);//100
		System.out.println(i+20);
		
		String y = "12.33";
		System.out.println(y+100);
		
		double d = Double.parseDouble(y);//12.33
		System.out.println(d+100);
		
		String total = "1000";
		System.out.println(total+20);
		
		int actualAmount = Integer.parseInt(total)+20;
		System.out.println(actualAmount);
	
//		String h = "100T";
//		int g = Integer.parseInt(h);//120T --> NumberFormatException
//		System.out.println(g+20);
		
		//int to String:
		int m = 100;
		System.out.println(m+20);//120 -- 10020
		
		String n = String.valueOf(m);//"100"
		System.out.println(n+20);
		
		System.out.println(m+"20");
		System.out.println(m+""+20);
		
		
	}

}

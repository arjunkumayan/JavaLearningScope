package JavaSessions;

public class StringManipulation {

	public static void main(String[] args) {

		String str = "I love java but I do not like javascript";
		
		System.out.println(str.length());
		
		System.out.println(str.charAt(37));
		
		System.out.println(str.charAt(5));

		//System.out.println(str.charAt(38));//StringIndexOutOfBoundsException

		System.out.println(str.indexOf("I"));
		
		System.out.println(str.indexOf("love"));
		
		System.out.println(str.indexOf("j"));//1st j
		
		System.out.println(str.indexOf("j", str.indexOf("j")+1));//2nd j
		
		System.out.println(str.indexOf("java"));
		
		System.out.println(str.indexOf("Naveen")); //-1
		
		if(str.indexOf("python")==-1){
			System.out.println("pass");
		}

		//trim:
		String s1 = "     hello world    ";
		System.out.println(s1.trim());
		
		//replace:
		String date = "01-01-1995"; //01/01/1995
		System.out.println(date.replace("-", "/"));
		
		System.out.println(s1.replace(" ", ""));
		
		//upper case:
		String name = "my name is naveen";
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		
		//sub string:
		String s2 = "your total amount is 1500 USD";
		//System.out.println(s2.substring(21, 25));
		//System.out.println(s2.indexOf("USD"));
		//System.out.println(s2.substring(21, s2.indexOf("USD")-1));
		System.out.println(name.substring(11));
		
		String total = s2.substring(21, s2.indexOf("USD")-1);
		int totalValue = Integer.parseInt(total);
		System.out.println(totalValue+100);
		
		
		//split: 
		String lang = "Java-Python-JavaScript-Ruby";
		String language[] = lang.split("-");
		System.out.println(language[0]);
		
		for(int i=0; i<language.length; i++){
			System.out.println(language[i]);
		}
		
		String user1Data = "Nisha;Mathew;22;IBM;nisha@ibm.com;123";
		String user2Data = "Jatinder Bali 25 MS jati@ms.com 555";
		
		getUserData(user1Data, ";");
		getUserData(user2Data, " ");

		
		String pop = "testxXseleniumXxXJavaXxPython";
		String pop1[] = pop.split("Xx");
		System.out.println(pop1[0]);
		System.out.println(pop1[1]);
		System.out.println(pop1[2]);

		String data = "test;pop;radar;animal";
		System.out.println(data.split(";")[0]);
		
		//equals:
		String st1 = "hey this is naveen here";
		String st2 = "hey This is naveen here";
		
		System.out.println(st1.equals(st2));
		System.out.println(st1.equalsIgnoreCase(st2));
		
		//contains:
		System.out.println(st1.contains("naveen"));
		
		String mesg = "Welcome Admin";
		if(mesg.contains("Admin")){
			System.out.println("logged in successfully");
		}else{
			System.out.println("login failed");
		}
		
	}
	
	
	public static void getUserData(String userdata, String splitChar){
		String user[] = userdata.split(splitChar);
		for(int i=0; i<user.length; i++){
			System.out.println(user[i]);
		}
	}
	
	

}

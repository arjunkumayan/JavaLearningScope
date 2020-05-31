package JavaSessionsNew;

public class P28StringManipulation {

	public static void main(String[] args) {

		String name = "my name is arjun singh";
		// SubString
		String s2 = "your total amount is 1500 USD";
		
		System.out.println(s2.substring(5));
		System.out.println(s2.substring(5, 12));
		
		String s3 = "your total amount is 1500 USD";
		
		System.out.println(s2.substring(21, 25));
	    System.out.println(s2.indexOf("USD"));
		System.out.println(s2.substring(21, s2.indexOf("USD")-1));
		System.out.println(name.substring(11));
		
		String total = s2.substring(21, s2.indexOf("USD")-1);
		int totalValue = Integer.parseInt(total);
		System.out.println(totalValue+100);
		
		String field= "This is amount of 1900 USD";
		
		System.out.println(field.substring(18, 22));
		System.out.println(field.substring(18, field.indexOf("USD")-1));
        
		// Convert the string to integer using Wrapper class
		String total1 = field.substring(18, field.indexOf("USD")-1);
        
		int value = Integer.parseInt(total1);
		System.out.println(value);
		System.out.println(value+10);
		
		
		// split
		
		String lang ="java-python-ruby-rails-javascript";
		String[] courses= lang.split("-");
		for(int i =0 ; i<courses.length ; i++)
		{
			
			System.out.println(courses[i]);
		}
		
		//split: 
				String lang1 = "Java-Python-JavaScript-Ruby";
				String language[] = lang1.split("-");
				System.out.println(language[0]);
				
				for(int i=0; i<language.length; i++){
					System.out.println(language[i]);
				}
				

				String user1Data = "Nisha;Mathew;22;IBM;nisha@ibm.com;123";
				String user2Data = "Jatinder Bali 25 MS jati@ms.com 555";
				getUserData(user1Data,";");
				getUserData(user2Data, " ");

				
				String pop = "testXxseleniumXxJavaXxPython";
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
			System.out.println(st1.contains("naveen"));
			
			System.out.println(st1.contentEquals("hey this is Naveen here"));
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

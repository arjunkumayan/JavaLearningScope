package JavaSessions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FinallyKeyword {

	public static void main(String[] args) {

//		try{
//		int i = 9/0;
//		}
//		
//		
//		finally{
//			System.out.println("finally block");
//		}
//		
		int p = 50;
		
		System.out.println("going to run try block");
		try{
			int div = p/0;
		}
		catch(Exception e){
			System.out.println("some exception");
			e.printStackTrace();
		}
				
		finally{
			System.out.println("exception coming or not...");
		}
		
		
		Properties prop = new Properties();
		try {
			FileInputStream ip = new FileInputStream("/Users/NaveenKhunteta/Documents/workspace/July2019JavaSession"
					+ "/src/JavaSessions/Car.java");
			prop.load(ip);
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
	}

}

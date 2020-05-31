package JavaSessionsNew;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class P23FinallyBlock {

	public static void main(String[] args) {
		// we can write the try with finally block
		// without catch block but finally block is required

		int p = 50;
		
		System.out.println("---Going to run try block---");
		
		try
		{
			// int d = p/50;
			int d = p/0;
		}
	     catch(Exception e)
		{
		   System.out.println(" some exception");
		   e.printStackTrace();
		}
		
	//	System.out.println("Hello");  // this is not allowed between catch and finally
		
		finally
		{
			
			System.out.println(" Exception coming or not....");
		}
		
		Properties prop = new Properties();
		try {
			FileInputStream ip = new FileInputStream("Car.java");
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

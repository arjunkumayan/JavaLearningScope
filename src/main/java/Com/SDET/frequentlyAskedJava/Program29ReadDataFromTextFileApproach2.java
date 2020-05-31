package Com.SDET.frequentlyAskedJava;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Program29ReadDataFromTextFileApproach2 {

	public static void main(String[] args) throws IOException {

		// Approach 1- Using Scanner and file
		
		File file = new File("D:\\\\Users\\\\asingh6766\\\\eclipse-workspace\\\\JavaLearning\\\\src\\\\main\\\\java\\\\Com\\\\SDET\\\\frequentlyAskedJava\\\\test.txt");
		
		
		Scanner sc = new Scanner(file);
		//now read to file
		
		// to read the content of file
		
		// this is one way
		/*
		 * while(sc.hasNextLine()) { System.out.println(sc.nextLine()); }
		 */
		
		
		// without using loop
		// Approach -3 
		
		sc.useDelimiter("\\z");
		
		System.out.println(sc.next());
		
		
		
	}

}

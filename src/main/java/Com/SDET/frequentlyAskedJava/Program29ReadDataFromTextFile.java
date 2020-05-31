package Com.SDET.frequentlyAskedJava;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Program29ReadDataFromTextFile {

	public static void main(String[] args) throws IOException {

		// Approach 1- Using FileReader  BufferedReader
		
		FileReader fr = new FileReader("D:\\Users\\asingh6766\\eclipse-workspace\\JavaLearning\\src\\main\\java\\Com\\SDET\\frequentlyAskedJava\\test.txt");
		BufferedReader br = new BufferedReader(fr);
		
		String str;
		
		while((str= br.readLine())!=null)
		{
			System.out.println(str);
			
		}
		br.close();
	}

}

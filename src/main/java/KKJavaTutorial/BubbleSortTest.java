package KKJavaTutorial;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSortTest {

	public static void main(String[] args) {
	
		Scanner scanner = null;
		try {
		System.out.println("Enter input Array size");
		scanner = new Scanner(System.in);		
		int inputArraySize = scanner.nextInt();
		
		int[] inputArray = new int[inputArraySize];
		System.out.println("Enter "+inputArraySize+" Array Elements");
		for(int i=0; i<inputArray.length;i++) {
			inputArray[i] = scanner.nextInt();	
		}
		
		System.out.println("Original Array");
		System.out.println(Arrays.toString(inputArray));
		
		
		int sortedArray[] = bubbleSort(inputArray);
		System.out.println("Sorted Array");
		System.out.println(Arrays.toString(sortedArray));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			if(scanner !=null) {
				scanner.close();
			}
		}

	}
	
	public static int[] bubbleSort(int[] inputArray) {
		boolean sorted = false;
		for(int i=0; i<inputArray.length-1 ; i++) {
			for(int j=0; j<inputArray.length-1 ; j++) {
				if(inputArray[j]>inputArray[j+1]) {
					int temp = inputArray[j];
					inputArray[j] = inputArray[j+1];
					inputArray[j+1] = temp;
					sorted = true;
				}
			}
			
			if(!sorted) {
				break;
			}
		}
	
		return inputArray;
		
	}

}

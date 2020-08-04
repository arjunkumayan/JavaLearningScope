package KKJavaTutorial;

public class DuplicateElementsInArray {
	
	
	

	public static void main(String[] args) {
		
		String arr[] = {"java","c","c++","python","java","python"};
		
		int len = arr.length;
		boolean flag = false;
		for(int i=0 ;i<len; i++) {
			for(int j=i+1; j<len; j++) {
				if(arr[i]==arr[j]) {
					System.out.println("Duplicates is: "+arr[i]);
					flag= true;
				}
				
			}
		}
		
		if(flag==false) {
			System.out.println("Duplicates element is not found");
		}

	}

}

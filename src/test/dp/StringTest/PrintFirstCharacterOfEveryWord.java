package StringTest;

public class PrintFirstCharacterOfEveryWord {

	public static void main(String[] args) {
		
		String str= " Hello User!! World";
		
		char[] arr = str.toCharArray();
		
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i]!=' ') {
				
				if(i==0) {
					System.out.println(arr[i]);
				}
				
				else if(arr[i-1]==' ') {
					System.out.println(arr[i]);
				}
				
			}
			System.out.println("Another way");
			
			if(arr[i]!=0 && ((i==0) || arr[i-1]==' ' )) {
				System.out.println(arr[i]);
			}
			
		}
		
	}

}

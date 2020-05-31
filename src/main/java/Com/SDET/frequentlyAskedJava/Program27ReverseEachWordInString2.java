package Com.SDET.frequentlyAskedJava;

public class Program27ReverseEachWordInString2 {

	public static void main(String[] args) {

		// WELCOME TO JAVA   - original string 
		// EMOCLEW OT AVAJ   - after reverse string
		
		String str = "WELCOME TO JAVA";
		
		//String[] words = str.split(" ");
		
		String[] words = str.split("\\s");
		String revereWord = "";
		
		for(String word: words)
		{
			StringBuilder sb = new StringBuilder(word);
			sb.reverse();
			
			revereWord =revereWord+sb.toString() +" ";
			System.out.println(revereWord);
		}
		
		System.out.println(revereWord);
		
		
	}

}
;
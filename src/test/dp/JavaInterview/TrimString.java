package JavaInterview;

public class TrimString {

	public static void main(String[] args) {
	     String s = "     hello   user!!    welcome  ";
		//String s = "    hello";
       System.out.println(s);
	char a[] = 	s.toCharArray();
		
	int start=0; int end = a.length-1;int count;
	
	for(int i= 0 ; i<a.length ; i++) {
		
		if(a[i] != ' ') {
			start = i;
			break;
		}
	}
	
	for(int j=a.length-1 ; j>0 ; j--) {
		
		if(a[j] != ' ') {
			end = j;
			break;
		}
		
	}
		
	
	count = end-start+1;
	
	String result = new String(a, start,count);
	System.out.println(result);
	}

}

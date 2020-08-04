package StringTest;

public class TrimTheSpace {

	public static void main(String[] args) {

		String str = "   Hello User World    ";
	 //	String str = " H      W 1";
		
		char[] arr = str.toCharArray();
		
		int len = arr.length;
		int start=0;
		int end = len-1;
		
		for(int i=0 ;i<len; i++) {			
			if(arr[i]!=' ') {
				start=i;
				break;
			}						
		}
		
		for(int j=len-1; j>=start-1 ;j--) {
			if(arr[j]!=' ') {
				end=j;
				break;
			}
		}
		int count = end-start+1;
		String strTest= new String(arr,start,count);
		
		String st="";
		
		for(int k= start; k<=end; k++) {
			//System.out.println(arr[k]);
			st= st+arr[k];
			
		}
		
		System.out.println(st);
		
	}

}

package amazon;

public class TrimString {

	public static void main(String[] args) {
		String str = "  hello user welcome  ";
		
		char arr[] = str.toCharArray();

		int count;
		
		int start = 0;
		int end = arr.length-1;
		
		for(int i=0; i<arr.length ; i++) {
			if(arr[i] !=' ') {
				start = i;
				break;
			}
		}
		
		for(int i = end; i>start-1 ; i--) {
			if(arr[i] != ' ') {
				end = i;
				break;
			}
		}
		
		count = end-start+1;
		
		String st = new String(arr, start, count);
		
		System.out.println(st);
		
	}

}

package amazon;

public class TrimTheSpace {

	public static void main(String[] args) {
		String str = " Hello welcome Arjun ";
		
		char a[] = str.toCharArray();

		int start = 0;
		int end = str.length()-1;
		int count;
		
		for(int i=0 ; i<a.length ; i++) {
			if(a[i] !=' ') {
				start = i;
				break;
			}
		}
		
		for(int j= a.length-1; j>=start-1 ; j--) {
			if(a[j] !=' ') {
				end = j;
				break;
			}
		}
		count = end-start+1;
		String finalStr = str.substring(start,end+1);
		System.out.println(finalStr);
		
		String newStr = new String(a, start, count);
		
		System.out.println(newStr);
		
		
	}

}

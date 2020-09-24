package amazon;

public class TrimString1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = " hello user welcome   ";
		
		char ch[] = str.toCharArray();
	   
		int start = 0;
		int end = 0;
		for(int i=0 ; i<ch.length ; i++) {
				if(ch[i] != ' ') {
					start =  i;
					break;
				}		
			
		}
		
		for(int j=ch.length-1 ; j>start-1 ; j--) {
			if(ch[j] !=' ') {
				end = j;
				break;
			}
		}
	
		int count = end-start+1;
		
		String result = new String(ch , start, count);
		System.out.println(result);
		
	}

}

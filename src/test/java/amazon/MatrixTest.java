package amazon;

public class MatrixTest {

	public static void main(String[] args) {
		int mat[][] = {{2,7,15},{4,9,19},{6,10,24}};
		
		if(mat.length == 0) {
			return;
		}
		
		int count =0;
		int totalRows = mat.length;
		int totalCol = mat[0].length;
		
		for(int i=0 ; i<totalRows ; i++) {
			for(int j=0 ; j<totalCol; j++) {
				if(mat[i][j]<10) {
					++count;
				}
				
				//System.out.print(mat[i][j]);
				
			}
			System.out.println(" ");
		}

		System.out.println("Count:  "+count);
	}

}

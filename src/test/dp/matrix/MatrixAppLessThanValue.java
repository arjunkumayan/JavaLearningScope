package matrix;

public class MatrixAppLessThanValue {

	public static void main(String[] args) {
		 int mat[][] = {
				         {2,7,15},
				         {4,9,19},
				         {6,10,24}
				      };
		 
		 numberOfElementsLessThanGivenValue(mat,10);
		 System.out.println( numberOfElementsLessThanGivenValue(mat,10));
		 System.out.println( numberOfElementsLessThanGivenValue(mat,1));
		 System.out.println( numberOfElementsLessThanGivenValue(mat,24));
		 
	}

	private static int numberOfElementsLessThanGivenValue(int[][] mat, int value) {
		
		if(mat.length <=0) {
			System.out.println("Matrix is Empty");
			return -1;
		}
		
		int len = mat.length;
		int totalRows = mat.length;
		int totalColumns = mat[0].length;
		
		
		int count =0;
		int rows = 0;
		int col = totalColumns-1;
		
		while(rows<totalRows && col>=0) {
			
			if(value >= mat[rows][col]) {
				count = count +col+1;
				rows++;
			}
			else {
				col--;
			}
			
		}
				
		return count;
		
	}

}

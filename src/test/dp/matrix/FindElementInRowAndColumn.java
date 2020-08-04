package matrix;

public class FindElementInRowAndColumn {

	public static void main(String[] args) {
		
		System.out.println("This program is used to find the requested value from the matrix");
		
		int mat[][] = {{2,7,15},{4,9,19},{6,10,24}};
		
		searchElementInRowColumnSortedIndex(mat,20);
		
	}

	private static void searchElementInRowColumnSortedIndex(int[][] mat, int value) {
		
		if(mat.length==0) {
			System.out.println("Matrix is blank");
			return;
		}
		
		int totalRows = mat.length;
		int totalColumns = mat[0].length;
		
		int rows = 0;
		int col= totalColumns-1;
		
			
		while(rows<totalRows && col>=0) {
			
			if(mat[rows][col]==value) {
				System.out.println("Value is present at: "+rows+" and columns:"+col);
				return;
			}
			
			if(value> mat[rows][col]) {
				rows++;
				
			}
			else {
				col--;
			}
			
			
			
			
		}
		
		System.out.println("Value is not present in matrix: "+value);
		
		
		
	}

}

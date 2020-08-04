package matrix;

public class FindElementLessThantheValue {

	public static void main(String[] args) {
	
       int mat[][] = {{2,7,15},{4,9,19},{6,10,24}};
		
		int totalCount = countElementInRowsColumnLessThanValue(mat,7);
		System.out.println(countElementInRowsColumnLessThanValue(mat,-1));
		System.out.println("Total values less than number is: "+totalCount);
		

	}

	private static int countElementInRowsColumnLessThanValue(int[][] mat, int value) {
		
		
		if(mat.length == 0) {
			System.out.println("Matrix is empty");
			return 0;
		}
		
		int matrixLength = mat.length;
		
		int totalRows = mat.length;
		int totalColumns = mat[0].length;
		int count =0;
	for(int rows =0 ; rows<totalRows; rows++) {
			for(int columns=0; columns<totalColumns; columns++){
				
				if(mat[rows][columns]<value) {
					++count;
				}
			}
     
		}
		
	return count;
		
		
		
	}

}

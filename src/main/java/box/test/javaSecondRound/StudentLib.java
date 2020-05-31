package box.test.javaSecondRound;

import box.test.util.Library;

public class StudentLib {

	public static void main(String[] args) {
		Library lib=new Library(); // import if class is available in different package
		
	int total=	lib.totalnumberOfbooks();
	System.out.println(total);
	System.out.println(lib.getSubjectBooks("physics"));
		
		
	}

}

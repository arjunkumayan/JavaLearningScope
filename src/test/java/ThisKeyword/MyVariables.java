package ThisKeyword;

public class MyVariables {
	
	int x;
	int y;
	
	public MyVariables(int x, int y) {
		this.x=x; // this refers to current class reference variable
		this.y=y;
		
	}
	
	public void sum()
	{
		int sum=x+y;
		System.out.println(sum);
	}
	public static void main(String[] args) {
		MyVariables obj = new MyVariables(10, 20);
		obj.sum();
	}

}

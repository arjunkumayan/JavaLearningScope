package JavaSessions;

public class IncrementalAndDecremental {

	public static void main(String[] args) {

		int i = 1;
		int j = i++;//post increment
		
		System.out.println(i);//2
		System.out.println(j);//1
		
		int p = 1;
		int q = ++p; //pre increment
		System.out.println(p);//2
		System.out.println(q);//2
		
		
		int m = 2;
		int n = m--; //post decrement
		System.out.println(m);//1
		System.out.println(n);//2
		
		int g = 2;
		int h = --g;//pre decrement
		System.out.println(g);//1
		System.out.println(h);//1
		
		
		int c = -2;
		int d = --c;//pre decrement -2-1 = -3
		System.out.println(c);//-3
		System.out.println(d);//-3
		
	}

}

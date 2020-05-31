package box.test.javaSecondRound;

public class TestCar {

	public static void main(String[] args) {
Test t1=new Test();
Test t2=new Test();

//Test t3=(Test)t1.clone();

Test t3=t1;

System.out.println(t1.hashCode());
System.out.println(t2.hashCode());
System.out.println(t3.hashCode());


System.out.println(t1.equals(t3));
System.out.println(t1==t3);
	}

}

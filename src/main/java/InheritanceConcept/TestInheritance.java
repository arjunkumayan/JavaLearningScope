package InheritanceConcept;

public class TestInheritance {

	public static void main(String[] args) {
		Parent p = new Parent();
		p.m1();
		
		Child c = new Child();
		c.m1();
		c.m2();
		
		Parent p2= new Child();
		p2.m1();
		

	}

}

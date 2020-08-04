package ListInterface;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		Emp e1= new Emp(111,"ratan");
		Student s1= new Student(222, "xxx");
		ArrayList al = new ArrayList();
		al.add(10);
		al.add('a');
		al.add(e1);
		al.add(s1);
		System.out.println(al.toString());
		
		for(Object o:al) {
			if(o instanceof Integer) {
				System.out.println(o.toString());
			}
			if(o instanceof Character) {
				System.out.println(o.toString());
			}
			if(o instanceof Emp) {
				Emp em = (Emp)o;
				System.out.println(em.eid+ " "+em.ename);
			}
			
			if(o instanceof Student) {
				Student sm = (Student)o;
				System.out.println(sm.sid + " "+sm.sname);
			}
		}
	}

}

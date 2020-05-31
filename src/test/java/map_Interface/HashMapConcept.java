package map_Interface;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapConcept {
	

	public static void main(String[] args) {
		Employee e1= new Employee("arjun", 27, "yerwada");
		Employee e2= new Employee("priyank", 29, "yerwada1");
		Employee e3= new Employee("kuldeep", 30, "yerwada2");
		HashMap<Integer,Employee> mapList = new HashMap<>();
		
		mapList.put(1, e1);
		mapList.put(2, e2);
		mapList.put(3, e3);
		
		
		for(Entry<Integer, Employee> s: mapList.entrySet())
		{
			System.out.println(s.getKey());
			Employee e =s.getValue();
			System.out.println(e.name+ " "+e.age+ " "+e.address);;
		}
		
	}

}

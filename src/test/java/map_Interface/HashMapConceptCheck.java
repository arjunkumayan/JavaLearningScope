package map_Interface;

public class HashMapConceptCheck {
	
	int id;
	String name;
	public HashMapConceptCheck(int id,String name) {
		this.id = id;
		this.name = name;
	
	}

	




	public static void main(String[] args) {
		
		HashMapConceptCheck m1= new HashMapConceptCheck(10, "arjun");
		HashMapConceptCheck m2= new HashMapConceptCheck(10, "arjun");
		
		System.out.println(m1.equals(m2));
		System.out.println(m1.hashCode());
		System.out.println(m2.hashCode());
		
		
		System.out.println(m1==m2);
		
		
		
		

	}






	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}






	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HashMapConceptCheck other = (HashMapConceptCheck) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}

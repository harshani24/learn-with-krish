package DeepCopy;

public class Registry {
	
	private Student s;
	private Address a;

	public Registry() {
		Registration();
	}

	public void Registration() {		
		s = new Student();
		a = new Address();
		
		a.setNo(305);
		a.setStreet("Janapadaya");
		a.setCity("Panadura");
				
		s.setId(1);
		s.setName("Harshani");
		s.setAge(18);
		s.setAdd(a);	
		
	}

	
	public Student getStudentClone() {
		
		Student s1 = null;
		
		try {
			s1 = (Student) s.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		return s1;
		
	}
	
	
}

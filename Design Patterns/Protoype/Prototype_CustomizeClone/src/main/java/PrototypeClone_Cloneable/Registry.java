package PrototypeClone_Cloneable;

public class Registry {
	
	private Student s;

	public Registry() {
		Registration();
	}

	public void Registration() {		
		s = new Student();
		s.setId(1);
		s.setName("Harshani");
		s.setAge(18);
		
	}

	
	public Student getStudentClone() {
		
		Student s1 = null;
		
		try {
			s1 =  (Student) s.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		return s1;
	}
	
	
}

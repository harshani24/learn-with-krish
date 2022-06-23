package PrototypeOwnClone_ShallowCopy;

public class Registry {
	
	private Student s;

	public Registry() {
		Registration(0, null, 0);
	}

	public void Registration(int id, String name, int age) {		
		//create the first instance and do registration
		s = new Student(id, name, age);	
		
	}

	//just get a shallow copy. Bcz we just return the reference of the object
	public Student getStudentClone() {
		return s;	
	}
	
	
}

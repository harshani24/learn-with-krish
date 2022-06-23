package PrototypeOwnClone_DeepCopy;

public class Registry {
	
	private Student s;

	public Registry() {
		Registration(0, null, 0);
	}

	public void Registration(int id, String name, int age) {		
		//create the first instance and do registration
		s = new Student(id, name, age);	
		
	}

	//Try to create a deep copy. Bcz we create new obj and copy each and every value to that
	public Student getStudentClone() {
		return new Student(s.getId(), s.getName() , s.getAge());	
	}
	
	
}

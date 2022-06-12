package PrototypeClone_Cloneable;

public class StudentCloneDemo {

	public static void main(String[] args) {
		
		//get a registry obj
		Registry registry = new Registry();
		
		Student s1= registry.getStudentClone();  //--->474675244
		System.out.println(s1);
		
		Student s2= registry.getStudentClone(); //--->932583850  (different adderesses)
		System.out.println(s2);
		
		s2.setAge(25);
		
		System.out.println("\n\nAfter changing the value of age 0f S2");
		System.out.println(s1);
		System.out.println(s2);
		
		
		//output
//		Student [id=1, name=Harshani, age=18, hashCode()=474675244]
//		Student [id=1, name=Harshani, age=18, hashCode()=932583850]
//
//
//		After changing the value of age 0f S2
//		Student [id=1, name=Harshani, age=18, hashCode()=474675244]
//		Student [id=1, name=Harshani, age=25, hashCode()=932583850]
		
	}

}

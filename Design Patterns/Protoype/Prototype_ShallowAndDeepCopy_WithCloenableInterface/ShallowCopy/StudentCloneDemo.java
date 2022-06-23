package ShallowCopy;

public class StudentCloneDemo {

	public static void main(String[] args) {

		Registry registry = new Registry();
		
		Student s1= registry.getStudentClone();  //--->1579572132
		System.out.println(s1);
		
		Student s2= registry.getStudentClone(); //---> 359023572  (different Student Objects, But)
		System.out.println(s2);
		
		System.out.println("\n"+s1.getAdd());          //-->212628335
		System.out.println(s2.getAdd());          //-->212628335 (Same references for address objects) So, this is a shallow copy
		
		s2.getAdd().setNo(100);
		s2.getAdd().setStreet("Batwaththa");
		s2.getAdd().setCity("Maharagama");;
		
		System.out.println("\n\n-----After changing the value of address 0f S2-----");
		System.out.println(s1.getAdd());
		System.out.println(s2.getAdd());
		
		
		//output
//		Student [id=1, name=Harshani, age=18, add=Address [no=305, street=Janapadaya, city=Panadura, hashCode()=212628335], hashCode()=1579572132]
//		Student [id=1, name=Harshani, age=18, add=Address [no=305, street=Janapadaya, city=Panadura, hashCode()=212628335], hashCode()=359023572]
//
//		Address [no=305, street=Janapadaya, city=Panadura, hashCode()=212628335]
//		Address [no=305, street=Janapadaya, city=Panadura, hashCode()=212628335]
//
//
//		-----After changing the value of address 0f S2-----
//		Address [no=100, street=Batwaththa, city=Maharagama, hashCode()=212628335]
//		Address [no=100, street=Batwaththa, city=Maharagama, hashCode()=212628335]

		
	}

}

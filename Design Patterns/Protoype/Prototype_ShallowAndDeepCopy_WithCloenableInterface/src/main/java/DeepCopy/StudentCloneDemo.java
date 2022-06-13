package DeepCopy;

public class StudentCloneDemo {

	public static void main(String[] args) {

		Registry registry = new Registry();
		
		Student s1= registry.getStudentClone();  //--->1579572132
		System.out.println(s1);
		
		Student s2= registry.getStudentClone(); //---> 305808283  (different student objects)
		System.out.println(s2);
		
		System.out.println("\n"+s1.getAdd());          //-->212628335
		System.out.println(s2.getAdd());          //-->359023572 (different references for address objects) So, this is a deep copy
		
		s2.getAdd().setNo(100);
		s2.getAdd().setStreet("Batwaththa");
		s2.getAdd().setCity("Maharagama");;
		
		System.out.println("\n\n-----After changing the value of address 0f S2-----");
		System.out.println(s1.getAdd());
		System.out.println(s2.getAdd());
		
		
		//output
//		Student [id=1, name=Harshani, age=18, add=Address [no=305, street=Janapadaya, city=Panadura, hashCode()=212628335], hashCode()=1579572132]
//		Student [id=1, name=Harshani, age=18, add=Address [no=305, street=Janapadaya, city=Panadura, hashCode()=359023572], hashCode()=305808283]
//
//		Address [no=305, street=Janapadaya, city=Panadura, hashCode()=212628335]
//		Address [no=305, street=Janapadaya, city=Panadura, hashCode()=359023572]
//
//
//		-----After changing the value of address 0f S2-----
//		Address [no=305, street=Janapadaya, city=Panadura, hashCode()=212628335]
//		Address [no=100, street=Batwaththa, city=Maharagama, hashCode()=359023572]

		
	}

}

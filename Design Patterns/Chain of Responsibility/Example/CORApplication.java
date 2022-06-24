package ChainOfResponsibilty;

public class CORApplication {

	public static void main(String[] args) {
		Visitor visitor= new Visitor();
		Student student= new Student();
		Teacher teacher= new Teacher();
		Admin admin= new Admin();
		
		visitor.setSuccessor(student);
		student.setSuccessor(teacher);
		teacher.setSuccessor(admin);
		
		User user3 = new User("c@gmail.com" , "ttt");
	    System.out.println(visitor.applyPrivilege(user3));

	}

}

//User user1 = new User("a@gmail.com" , "");
//System.out.println(visitor.applyPrivilege(user1));

//User user2 = new User("b@gmail.com" , "sss");
//System.out.println(visitor.applyPrivilege(user2));

//User user3 = new User("c@gmail.com" , "ttt");
//System.out.println(visitor.applyPrivilege(user3));

//User user4 = new User("d@gmail.com" , "aaa");
//System.out.println(visitor.applyPrivilege(user4));




package ChainOfResponsibilty;


public class Chain {
	
	static Visitor visitor= new Visitor();
	static Student student= new Student();
	static Teacher teacher= new Teacher();
	static Admin admin= new Admin();
	
	static {
	 visitor.setSuccessor(student);
	 student.setSuccessor(teacher);
	 teacher.setSuccessor(admin);
	}

	public static void getPriviledges(User user) {
		System.out.println("User priviledges are--->"+visitor.applyPrivilege(user));
	}

}

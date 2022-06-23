package BuilderReal;

import BuilderReal.Student.Builder;

public class BuilderApplication {

	public static void main(String[] args) {
		
		Student.Builder builder = new Student.Builder("1");
		Student student1 = builder.build();
		System.out.println(student1);
	    //Student student1 = new Student.Builder("1").build();
		
		Student student2 = new Student.Builder("2").degree(true).build();
		System.out.println(student2);

	}

}

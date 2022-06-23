package BuilderReal;

public class Student {

	//1.same properties
	private final String id;
	private final String name;
	private final Boolean degree;
	
	
	//3.constructor
	public Student(Builder builder) {
		this.id = builder.id;
		this.name= builder.name ;
		this.degree = builder.degree ;
	}
	
	
	//2.static class called Builder
	static class Builder{
		
		//1.same properties
		private String id;
		private String name;
		private Boolean degree;
		
		//4.build() method
		public Student build() {
			return new Student(this);
		}
		
		//2.constructor
		public Builder(String id) {
			this.id = id;
		}
		
		//3
		public Builder name(String name) {
			this.name = name;
			return this;
		}
		
		public Builder degree(Boolean degree) {
			this.degree = degree;
			return this;
		}
		
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", degree=" + degree + "]";
	}
	
	

}

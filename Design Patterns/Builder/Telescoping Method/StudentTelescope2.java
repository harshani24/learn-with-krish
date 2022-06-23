package Builder;

public class StudentTelescope2 {
	private String id;
	private String name;
	private Boolean degree;
	
	public StudentTelescope2(String id,String name,Boolean degree) {
		this.id = id;
		this.name = name;
		this.degree = degree;
	}
	
	
	public StudentTelescope2(String id,String name ) {
		this(id,name,null);
	
	}


	public StudentTelescope2(String id) {
		this(id,null);
	}

	@Override
	public String toString() {
		return "StudentTelescope1 [id=" + id + ", name=" + name + ", degree=" + degree + "]";
	}

	
}

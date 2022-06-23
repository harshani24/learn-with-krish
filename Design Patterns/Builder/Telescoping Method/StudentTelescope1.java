package Builder;

public class StudentTelescope1 {
	private String id;
	private String name;
	private Boolean degree;
	
	
	public StudentTelescope1(String id) {
		this.id = id;
	}
	
	public StudentTelescope1(String id,String name ) {
		this(id);
		this.name = name;
		
	}

	public StudentTelescope1(String id,String name,Boolean degree) {
		this(id, name);
		this.degree = degree;
	}

	@Override
	public String toString() {
		return "StudentTelescope1 [id=" + id + ", name=" + name + ", degree=" + degree + "]";
	}

	
}

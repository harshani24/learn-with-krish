package DeepCopy;

//We need to clone obj from this class and need implement an own clone method.
public class Student implements Cloneable{
	
	private int id;
	private String name;
	private int age;
	private Address add;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public Address getAdd() {
		return add;
	}
	public void setAdd(Address add) {
		this.add = add;
	}
	
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", add=" + add + ", hashCode()=" + hashCode()
				+ "]";
	}
	
	//This is the where we get a clone form student with new clone from address
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Student s = null;
		try {
			s = (Student) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		
		Address address = (Address) add.clone();
		s.setAdd(address); 

		return s;
	}
	
	
	

}

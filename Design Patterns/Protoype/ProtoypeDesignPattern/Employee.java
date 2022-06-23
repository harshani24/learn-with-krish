import java.util.Arrays;

public abstract class Employee implements Cloneable {
	
	private int id;
	private String name;
	private int numOfExp;
	private String[] skills;
	
	public int getId() {
		//System.out.println("Inside the getter id-->"+Integer.toHexString(System.identityHashCode(id)));
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		//System.out.println("Inside the getter name-->"+Integer.toHexString(System.identityHashCode(name)));
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getNumOfExp() {
		//System.out.println("Inside the getter numOfExp-->"+Integer.toHexString(System.identityHashCode(numOfExp)));
		return numOfExp;
	}
	
	public void setNumOfExp(int numOfExp) {
		this.numOfExp = numOfExp;
	}

	
	
	public String[] getSkills() {
		return skills;
	}

	public void setSkills(String[] skills) {
		this.skills = skills;
	}

	
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", numOfExp=" + numOfExp + ", skills="
				+ Arrays.toString(skills) + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		//System.out.println("In clone id=="+Integer.toHexString(System.identityHashCode(id)));
		//System.out.println("In clone name=="+Integer.toHexString(System.identityHashCode(name)));
		//System.out.println("In clone numOfExp=="+Integer.toHexString(System.identityHashCode(numOfExp)));
		//System.out.println("In clone skills=="+Integer.toHexString(System.identityHashCode(skills))+"\n");
		return super.clone();
	}
	

}

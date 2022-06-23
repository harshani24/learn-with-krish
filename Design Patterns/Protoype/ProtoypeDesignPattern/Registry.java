import java.util.HashMap;
import java.util.Map;

public class Registry {
	
	private Map<EmpType, Employee> emp = new HashMap<>();
	//constructor
	//registrarion
	//method to get a clone obj

	public Registry() {
		registerObj();
	}

	private void registerObj() {
		
		ContractEmp con = new ContractEmp();
		con.setId(1);
		con.setName("Harshani");
		con.setNumOfExp(3);
		con.setContractTimeInMonths(7);
		con.setSkills(new String[]{"java","c","C++"});
		
		
		PermanentEmp per = new PermanentEmp();
		per.setId(100);
		per.setName("Nimanthika");
		per.setNumOfExp(4);
		per.setBenifits(true);
		per.setSkills(new String[]{"java","C++"});
		
		
		emp.put(EmpType.CONTRACT, con);
		emp.put(EmpType.PERMANENT, per);
		
	}
	
	
	public Employee getEmployee(EmpType empType) {
		Employee employee = null;
		
		try {
			employee = (Employee) emp.get(empType).clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		
		return employee;
	}
	
}

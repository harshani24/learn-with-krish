import java.util.Arrays;

public class ContractEmp  extends Employee{

	private int contractTimeInMonths;

	public int getContractTimeInMonths() {
		
		return contractTimeInMonths;
	}

	public void setContractTimeInMonths(int contractTimeInMonths) {
		this.contractTimeInMonths = contractTimeInMonths;
	}


	@Override
	public String toString() {
		//System.out.println("contractTimeInMonths-->"+Integer.toHexString(System.identityHashCode(contractTimeInMonths)));
		return "ContractEmp [contractTimeInMonths=" + contractTimeInMonths + ", ID=" + getId() + ", Name="
				+ getName() + ", NumOfExp=" + getNumOfExp() + ",Skills=" + Arrays.toString(getSkills()) + ",hashCode()=" + hashCode() + "]";
	}
	
	

}

public class EmpApplicationCopy {	 

	public static void main(String[] args) {
		
		Registry reg = new Registry();
		
		ContractEmp e1 = (ContractEmp) reg.getEmployee(EmpType.CONTRACT);
		System.out.println("e1 --> "+e1);
		System.out.println(e1.hashCode());        //2111991224


		ContractEmp e2 = (ContractEmp) reg.getEmployee(EmpType.CONTRACT);
		System.out.println("e2 --> "+e2);
		System.out.println(e2.hashCode());   //292938459
		
		
		e2.setId(5);
		e2.setName("Kaveesha");  
		e2.setNumOfExp(8);
		e2.setContractTimeInMonths(2);
		e2.setSkills(new String[]{"javascipt"});
		
		System.out.println("\n\nAfter changing the e2 values"); 
		
		
		System.out.println("e1 --> "+e1);
		System.out.println(e1.hashCode()); 

		System.out.println("e2 --> "+e2);
		System.out.println(e2.hashCode());  
		
		
		//output
//		e1 --> ContractEmp [contractTimeInMonths=7, ID=1, Name=Harshani, NumOfExp=3,Skills=[java, c, C++],hashCode()=2111991224]
//				2111991224
//		e2 --> ContractEmp [contractTimeInMonths=7, ID=1, Name=Harshani, NumOfExp=3,Skills=[java, c, C++],hashCode()=292938459]
//				292938459
//
//
//		After changing the e2 values===================================================
//		e1 --> ContractEmp [contractTimeInMonths=7, ID=1, Name=Harshani, NumOfExp=3,Skills=[java, c, C++],hashCode()=2111991224]
//			   2111991224
//		e2 --> ContractEmp [contractTimeInMonths=2, ID=5, Name=Kaveesha, NumOfExp=8,Skills=[javascipt],hashCode()=292938459]
//			   292938459


	}

}

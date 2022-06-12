public class EmpApplication {	 

public static void main(String[] args) {
		
		Registry reg = new Registry();
		
		ContractEmp e1 = (ContractEmp) reg.getEmployee(EmpType.CONTRACT);
		System.out.println("e1 ID --> "+e1.getId());
		System.out.println(e1.hashCode());        //2111991224


		ContractEmp e2 = (ContractEmp) reg.getEmployee(EmpType.CONTRACT);
		System.out.println("e2 ID --> "+e2.getId());
		System.out.println(e2.hashCode());   //292938459
		
		
		e2.setId(5);
		
		System.out.println("\n\nAfter changing the e2 ID value"); 
		
		
		System.out.println("e1 ID --> "+e1.getId());
		System.out.println(e1.hashCode()); 

		System.out.println("e2 ID --> "+e2.getId());
		System.out.println(e2.hashCode());  
		
		
		//output
//		e1 ID --> 1
//		2111991224
//		e2 ID --> 1
//		292938459
//
//
//		After changing the e2 ID value===================================================
//		e1 ID --> 1
//		2111991224
//		e2 ID --> 5
//		292938459
		
		



	}

}

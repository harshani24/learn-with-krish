public class CloneCopy {

	public static void main(String[] args) throws CloneNotSupportedException {
	
		CloningA obj = new CloningA();
		obj.setI(5); 
		obj.setJ(6);
		
		//This is the place you are gonna clone the obj
		CloningA  obj1 = (CloningA) obj.clone();
	
		obj1.setJ(8);
		

		System.out.println(obj1);   //A [i=5, j=8]         //ObjCopyInJava.A@6f2b958e -> A [i=5, j=8]
		System.out.println(obj);    //A [i=5, j=6]         //ObjCopyInJava.A@5e91993f ->A [i=5, j=6]

		

	}

}

package ObjectCopying;

public class ShallowCopy {

	public static void main(String[] args) {
		// You are  ---> not create 2 obj.  but create 2 references.
		
		A obj = new A();
		obj.setI(5); 
		obj.setJ(6);
		
		//This is the place you are gonna create the shallow copy
		A obj1 = obj;
		
		obj1.setJ(8);
		
		System.out.println(obj1);   //A [i=5, j=8]                              //ObjCopyInJava.A@6f2b958e ->A [i=5, j=8]
		System.out.println(obj);   //hope 5 , 6 but that is A [i=5, j=8]        //ObjCopyInJava.A@6f2b958e  ->A [i=5, j=8]
		

	}

}

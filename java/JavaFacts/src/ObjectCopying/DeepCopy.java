package ObjectCopying;

public class DeepCopy {

	public static void main(String[] args) {
		// You are  ---> create 2 obj & copy each and every value one by one
		
		A obj = new A();
		obj.setI(5); 
		obj.setJ(6);
		
		//This is the place you are gonna create the deep copy
		A obj1 = new A();
		obj1.setI(obj.getI()); 
		obj1.setJ(obj.getJ()); 
		
		
		obj1.setJ(8);
		

		System.out.println(obj1);   //A [i=5, j=8]         //ObjCopyInJava.A@6f2b958e -> A [i=5, j=8]
		System.out.println(obj);    //A [i=5, j=6]         //ObjCopyInJava.A@5e91993f ->A [i=5, j=6]

		

	}

}

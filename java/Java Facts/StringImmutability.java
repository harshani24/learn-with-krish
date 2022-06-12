
public class StringImmutability {
	 public static void main(String args[])
	  {
	    String a="nikhil";    
	    String b="nikhil";// it stores in String constant pool
	    String s=new String("nikhil");    //with new stores in heap
	    System.out.println(Integer.toHexString(System.identityHashCode(a)));            //------------1ee0005
	    System.out.println(Integer.toHexString(System.identityHashCode(b)));			//------------1ee0005
	    System.out.println(Integer.toHexString(System.identityHashCode(s)));			//------------6504e3b2
	    
	    a= "harshani";
	    System.out.println(Integer.toHexString(System.identityHashCode(a)));			//------------515f550a
	  }

}

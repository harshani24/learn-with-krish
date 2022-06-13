package Singleton;

public class SingletonDemo {

	public static void main(String[] args) {
		
		SingletonObj instance = SingletonObj.getInstance();
		System.out.println(instance);
		
		SingletonObj instance1 = SingletonObj.getInstance();
		System.out.println(instance1);
		
		SingletonObj instance2 = SingletonObj.getInstance();
		System.out.println(instance2);

	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	SingletonLazyImplementation instance1 = SingletonLazyImplementation.getInstance();
//	System.out.println(instance1);    //Singleton.SingletonObj@5e91993f
//	
//	SingletonLazyImplementation instance2 = SingletonLazyImplementation.getInstance();
//	System.out.println(instance2);   //Singleton.SingletonObj@5e91993f
//}


package Singleton;

public class SingletonLazyImplementation {
	
	//3.we need to have a obj from this class
	private static volatile SingletonLazyImplementation instance;
	
	//1.u need to have a private constructor
	//no one can create any instances from this, bcz this is private
	private SingletonLazyImplementation() {
		if(instance != null) {
			throw new RuntimeException("Please use the getInstance() method");
		}
	}
	
	
	//2.to get the obj from this class, make a static method
	public static SingletonLazyImplementation getInstance() {
		
		if(instance == null) {
			
			instance = new SingletonLazyImplementation();
		}
		
		return instance;
	}
	

}


//Basic implementation
//public class SingletonObj {
//	
//	//This is should private, otherwise we can access object from here no usage og having getIntance() method
//	private static volatile SingletonObj instance = new SingletonObj();
//	
//	//no one can create any instances from this, bcz this is private
//	private SingletonObj() {
//		
//	}
//
//	BasicSingleton
//	//This shuold be static, otherwise u can't access this method without creating obj. 
//	public static SingletonObj getInstance() {
//		return instance;
//	}
//	
//
//}


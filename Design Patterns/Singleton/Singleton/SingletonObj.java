package Singleton;

public class SingletonObj {
	

	private static volatile SingletonObj instance; //= new SingletonObj();
    
	
    private  SingletonObj() {
    	if(instance != null){
    		throw new RuntimeException("Please use the getInstace() method");
    	}
    	
    }
    
   
    public static  SingletonObj getInstance() {
    	
    	if(instance == null) {
    		
    		synchronized(SingletonObj.class) {
    			if(instance == null) {
    				instance = new SingletonObj();
    			}
    			
    		}
    		
    	}
    	
    	return instance;
	
    }
}


//1.EagerInitialization
////3.we need to have a obj from this class
//	private static volatile SingletonObj instance = new SingletonObj();
//  
//  //1.u need to have a private constructor
//  private  SingletonObj() {
//  	
//  }
//  
//  
//  //2.to get the obj from this class, make a static method
//  public static SingletonObj getInstance() {
//  	return instance;
//	
//  }



//2.Lazy Initialization
//private static volatile SingletonObj instance; //= new SingletonObj();
//
//
//private  SingletonObj() {
//	if(instance != null){
//		throw new RuntimeException("Please use the getInstace() method");
//	}
//
//
//public static SingletonObj getInstance() {
//	
//	if(instance == null) {
//		instance = new SingletonObj();
//	}
//	
//	return instance;
//
//}


//3.Double Checking / Double Lock Method

//private static volatile SingletonObj instance; //= new SingletonObj();
//
//
//private  SingletonObj() {
//	if(instance != null){
//		throw new RuntimeException("Please use the getInstace() method");
//	}
//	
//}
//
//
//public static SingletonObj getInstance() {
//	
//	if(instance == null) {
//		
//		synchronized(SingletonObj.class) {
//			if(instance == null) {
//				instance = new SingletonObj();
//			}
//			
//		}
//		
//	}
//	
//	return instance;
//
//}

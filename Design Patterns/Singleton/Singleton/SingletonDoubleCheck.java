package Singleton;

public class SingletonDoubleCheck {
	private static volatile SingletonDoubleCheck instance; //= new SingletonObj();
	
	
	private  SingletonDoubleCheck() {
		if(instance != null){
			throw new RuntimeException("Please use the getInstace() method");
		}
		
	}
	
	
	public static SingletonDoubleCheck getInstance() {
		
		if(instance == null) {
			
			synchronized(SingletonDoubleCheck.class) {
				if(instance == null) {
					instance = new SingletonDoubleCheck();
				}
				
			}
			
		}
		
		return instance;
	
	}


}

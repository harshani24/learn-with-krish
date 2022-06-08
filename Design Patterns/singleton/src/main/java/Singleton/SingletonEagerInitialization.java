package Singleton;

public class SingletonEagerInitialization {

	//3.we need to have a obj from this class
	private static volatile SingletonEagerInitialization instance = new SingletonEagerInitialization();
	
	//1.u need to have a private constructor
	//no one can create any instances from this, bcz this is private
	private SingletonEagerInitialization() {
		
	}
	
	//2.to get the obj from this class, make a static method
	public static SingletonEagerInitialization getInstance() {
		return instance;
	}

}
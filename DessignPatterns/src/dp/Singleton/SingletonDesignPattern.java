package dp.Singleton;

public class SingletonDesignPattern {
	/**
	 * -------------------------------------------------------------
	 * Singleton design pattern
	 * -------------------------------------------------------------
	 * Singleton class is designed to have only one object at a time.
	 * After first time, if try to instantiate the singleton class it will also refer to the first instance created.
	 * Used synchronized with the block to make multiple threads cannot access at a time. 
	 */
	
	int Id;
	
	private SingletonDesignPattern() {
		System.out.println("This is singleton constructor invocation.");
	}
	
	static SingletonDesignPattern instance;
	
	public static SingletonDesignPattern createSingletonObject() {
		
		synchronized (SingletonDesignPattern.class) {
			if(instance==null) {
				instance = new SingletonDesignPattern();
			}
		}
		
		
		return instance;
	}


}

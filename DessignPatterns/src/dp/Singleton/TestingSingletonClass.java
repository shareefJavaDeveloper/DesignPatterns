package dp.Singleton;

public class TestingSingletonClass {

public static void main(String[] args) {
		
		//since the constructor is private cannot access and create the instance
		
		SingletonDesignPattern singleton = SingletonDesignPattern.createSingletonObject();
		System.out.println(singleton);
		
		SingletonDesignPattern singleton1 = SingletonDesignPattern.createSingletonObject();
		System.out.println(singleton1);
		
		SingletonDesignPattern singleton2 = SingletonDesignPattern.createSingletonObject();
		System.out.println(singleton2);

	}
}

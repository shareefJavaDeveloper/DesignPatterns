package dp.Factory;

public class FactoryDesignPattern {
	/**
	 * It is a creational design pattern which talks about creation of an object.
	 * Factory design pattern defined as create an interface/abstract class and let the sub classes decides the
	 * which object to be instantiated.
	 * This factory design pattern is also called as virtual constructor.
	 * 
	 * 
	 */

	public static void main(String[] args) {
		
		MobileModel mobileConfig = FactoryInstanceGenerationClass.getMobileInstance("MI");
		
		
		mobileConfig.cpu();
		mobileConfig.ram();
		mobileConfig.price();
	}

}

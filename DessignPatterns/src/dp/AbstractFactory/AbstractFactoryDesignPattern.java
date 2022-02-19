package dp.AbstractFactory;

public class AbstractFactoryDesignPattern {
	
	/**
	 *Abstract factory design pattern is one of the creational design pattern 
	 *It is almost similar to factory design pattern with extra abstract layer.
	 *It provides more abstractions in terms of layers compared to factory.
	 *
	 */
	
	public static void main(String[] args) {
		
		MobileFactory factory = new IndiaMobileFactory();
		MobileModel indModel = factory.confgMobile("Samsung");
		
		MobileFactory factory1 = new ChinaMobileFactory();
		MobileModel chiModel =  factory1.confgMobile("OnePlus");
		
		
		indModel.cpu();
		chiModel.cpu();
		
		
	}

}

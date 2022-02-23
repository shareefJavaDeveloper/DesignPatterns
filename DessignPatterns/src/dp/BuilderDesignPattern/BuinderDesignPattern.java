package dp.BuilderDesignPattern;

public class BuinderDesignPattern {
	
	/**
	 * Builder design pattern is similar to factory design pattern.
	 * It is also an creational design pattern which helps us to create complex objects.
	 * Builder doesn't require the products to have a common interface.
	 * That make it possible to produce different products using the same construction process.
	 */
	
	public static void main(String[] args) {
		Phone p = new PhoneBuilder().setOs("Android").setRam(2).getPhone();
		
		System.out.println(p.toString());
	}

}

package dp.Factory;

public class FactoryInstanceGenerationClass {
		
	public static MobileModel getMobileInstance(String mobile) {
		
		MobileModel mobileModel = null;
		
		if(mobile.equalsIgnoreCase("MI")) {
			mobileModel = new MiMobile();
		}
		else if(mobile.equalsIgnoreCase("SAMSUNG")) {
			mobileModel = new SamsungMobile();
		}
		
		return mobileModel;
			
		
	}
	
}

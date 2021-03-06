package dp.AbstractFactory;

public class ChinaMobileFactory extends MobileFactory {

	@Override
	public MobileModel produceMobile(String mobile) {
		
		MobileModel mobileModel = null;
		
		if(mobile.equalsIgnoreCase("Mi")) {
			mobileModel = new MiMobile();
		}
		else if (mobile.equalsIgnoreCase("OnePlus"))
			mobileModel = new OnePlusMobile();
		
		
		return mobileModel;
	}

}

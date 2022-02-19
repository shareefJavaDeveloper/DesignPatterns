package dp.AbstractFactory;

import dp.Factory.MobileModel;

public class IndiaMobileFactory extends MobileFactory {

	@Override
	public dp.AbstractFactory.MobileModel produceMobile(String mobile) {
		
		dp.AbstractFactory.MobileModel mobileModel = null;
		
		if(mobile.equalsIgnoreCase("MI")) {
			mobileModel = new MiMobile();
		}
		else if (mobile.equalsIgnoreCase("Samsung")) {
			mobileModel = new SamsungMobile();
		}
		
		
		return mobileModel ;
	}

}

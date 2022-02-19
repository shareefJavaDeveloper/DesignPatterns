package dp.AbstractFactory;

public abstract class MobileFactory {
	
	public abstract MobileModel produceMobile(String mobile);
	
	public MobileModel confgMobile(String mobile) {
		
		MobileModel mobileModel = produceMobile(mobile);
		
		return mobileModel;
		
	}
	

}

package dp.AbstractFactory;

public class SamsungMobile extends MobileModel {

	@Override
	public void cpu() {
		System.out.println("Samsung mobile cpu");

	}

	@Override
	public void ram() {
		System.out.println("samsung mobile ram");

	}

	@Override
	public void price() {
		System.out.println("Samsung mobile price");

	}

}

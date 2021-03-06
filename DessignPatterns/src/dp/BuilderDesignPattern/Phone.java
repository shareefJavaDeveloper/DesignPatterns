package dp.BuilderDesignPattern;

public class Phone {
	
	private String os;
	private int ram;
	private String processor;
	private double screenSize;
	private int cost;
	
	public Phone(String os, int ram, String processor, double screenSize, int cost) {
		super();
		this.os = os;
		this.ram = ram;
		this.processor = processor;
		this.screenSize = screenSize;
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Phone [os=" + os + ", ram=" + ram + ", processor=" + processor + ", screenSize=" + screenSize
				+ ", cost=" + cost + "]";
	}
	
	

}

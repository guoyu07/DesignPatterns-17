package BuilderDesignPattern.com.phone;

public class Phone {

	private String os;
	private int ram;
	private double screenSize;
	private int battery;
	private String Processor;

	public Phone(String os, int ram, double screenSize, int battery, String processor) {
		super();
		this.os = os;
		this.ram = ram;
		this.screenSize = screenSize;
		this.battery = battery;
		this.Processor = processor;
	}

	public String toString() {
		return "Phone [os =" + os + ", ram =" + ram + ", screenSize =" + screenSize + ", battery =" + battery
				+ ", Processor=" + Processor+" ]";
	}

}

package CompositeDesignPattern.Main;

import CompositeDesignPattern.Component;
import CompositeDesignPattern.Composite;
import CompositeDesignPattern.Leaf;

public class CompositeTest {

	public static void main(String[] args) {
		Component Hdd = new Leaf("Harddisk", 4000);
		Component mouse = new Leaf("Mouse", 5000);
		Component monitor = new Leaf("Monitor", 6000);
		Component Ram = new Leaf("Ram", 9000);
		Component CPU = new Leaf("CPU", 10000);

		Composite peri = new Composite("Peripheral");
		Composite cabinet = new Composite("Cabinet");
		Composite mb = new Composite("MotherBoard");
		Composite computer = new Composite("Computer");

		mb.addComponent(Ram);
		mb.addComponent(CPU);
		peri.addComponent(mouse);
		peri.addComponent(monitor);
		cabinet.addComponent(Hdd);
		cabinet.addComponent(mb);
		computer.addComponent(peri);
		computer.addComponent(cabinet);
		
		computer.showPrice();
	}
}

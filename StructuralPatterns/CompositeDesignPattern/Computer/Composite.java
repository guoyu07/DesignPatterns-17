package CompositeDesignPattern.Computer;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {
	String name;// Composite name

	List<Component> components = new ArrayList<Component>();

	public Composite(String name) {
		super();
		this.name = name;
	}

	public void addComponent(Component cmp) {
		this.components.add(cmp);

	}

	@Override
	public void showPrice() {
		System.out.println("Composite Name"+" "+this.name);
		for (Component cmp : components) {
			cmp.showPrice();
		}

	}

}

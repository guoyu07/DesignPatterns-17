package FactoryDesignPattern.Main;

import FactoryDesignPattern.com.phone.OS;
import FactoryDesignPattern.com.phone.OperatingSystemFactory;

public class FactoryMain {

	
	/* client dont need to change anything 
	 here for any one just pass one paramater to
	 our operating system factory class*/

	public static void main(String[] args) {

		OperatingSystemFactory osFactory = new OperatingSystemFactory();
		OS osObj = osFactory.getInstance("Close");
		osObj.spec();

	}

}

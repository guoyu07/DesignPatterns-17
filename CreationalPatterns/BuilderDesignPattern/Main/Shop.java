package BuilderDesignPattern.Main;

import BuilderDesignPattern.com.phone.Phone;
import BuilderDesignPattern.com.phone.PhoneBuilder;

public class Shop {

	public static void main(String[] args) {
		// Without applying Design pattern, client have to provide all the
		// parameters in the constructor and should match the sequence also.
		Phone p = new Phone("Android", 2, 15, 1300, "QualComm");

		// by using Builder pattern

		PhoneBuilder builder = new PhoneBuilder();

		// user can set whatever parameters he/she want
		builder.setOs("Android").setBattery(1300).setProcessor("Qualcomm");
		Phone builderPhone = builder.getPhone();
		System.out.println(builderPhone);

	}

}

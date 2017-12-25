package FactoryDesignPattern.com.phone;

public class OperatingSystemFactory {

	// mainly manages the creation of objects-factory pattern .User/client will not know
	//what classes are implemented for different OS implementations.
	public OS getInstance(String str){
		if(str=="Open")
		return new Android();
		
		else if(str=="Close"){
			return new iOS();
		}
		else {
			return new Windows();
		}
	}
}

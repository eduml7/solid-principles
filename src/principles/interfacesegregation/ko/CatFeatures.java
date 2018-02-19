package principles.interfacesegregation.ko;

public class CatFeatures implements AnimalFeatures {

	public String voice() {
		return "Meow";
	}
	public void fly() {
		//Nothing to do here
	}

}

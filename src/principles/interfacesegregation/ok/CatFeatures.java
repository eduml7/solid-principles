package principles.interfacesegregation.ok;

public class CatFeatures implements AnimalFeatures {

	@Override
	public String voice() {
		return "Meow";
	}

}

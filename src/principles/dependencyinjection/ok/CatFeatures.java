package principles.dependencyinjection.ok;

public class CatFeatures implements AnimalFeatures {

	@Override
	public String voice() {
		return "Meow";
	}

}

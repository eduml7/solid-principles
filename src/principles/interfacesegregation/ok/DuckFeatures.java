package principles.interfacesegregation.ok;

public class DuckFeatures implements AnimalFeatures, BirdFeatures {

	@Override
	public String voice() {
		return "Quack";
	}

	@Override
	public void fly() {
		System.out.println("Alright! Let's fly!");
	}

}

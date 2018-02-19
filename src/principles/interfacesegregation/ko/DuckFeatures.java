package principles.interfacesegregation.ko;

public class DuckFeatures implements AnimalFeatures {

	@Override
	public String voice() {
		return "Quack";
	}

	@Override
	public void fly() {
		System.out.println("Alright! Let's fly!");
	}

}

package principles.liskovsubstitution.ko;

public class DuckFeatures extends AnimalFeatures {

	@Override
	public String voice() {
		return "Quack";
	}

	@Override
	public void fly() {
		System.out.println("Alright! Let's fly!");
	}

}

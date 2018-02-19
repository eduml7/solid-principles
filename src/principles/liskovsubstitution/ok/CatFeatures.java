package principles.liskovsubstitution.ok;

public class CatFeatures extends AnimalFeatures {

	@Override
	public String voice() {
		return "Meow";
	}

	@Override
	public void move() {
		System.out.println("Running...");
	}

}

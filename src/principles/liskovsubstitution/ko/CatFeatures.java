package principles.liskovsubstitution.ko;

public class CatFeatures extends AnimalFeatures {

	@Override
	public String voice() {
		return "Meow";
	}

	@Override
	public void fly() {
		//Nothing to do here
	}

}

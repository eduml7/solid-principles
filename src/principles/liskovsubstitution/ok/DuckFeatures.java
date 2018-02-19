package principles.liskovsubstitution.ok;

public class DuckFeatures extends AnimalFeatures {

	@Override
	public String voice() {
		return "Quack";
	}

	@Override
	public void move() {
		fly();
	}
	
	private void fly() {
		System.out.println("Alright! Let's fly!");
	}

}

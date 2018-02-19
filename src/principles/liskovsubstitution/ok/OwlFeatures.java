package principles.liskovsubstitution.ok;

public class OwlFeatures extends AnimalFeatures {

	@Override
	public String voice() {
		return "Hoot";
	}
	
	@Override
	public void move() {
		fly();
	}

	public void fly() {
		System.out.println("Flying time for the owl!");
	}

}

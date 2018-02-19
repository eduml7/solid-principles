package principles.liskovsubstitution.ok;

public class AnimalControl {

	public void fly(AnimalFeatures animal) {
		animal.move();
	}
	
	public void communicate(AnimalFeatures animal) {
		System.out.println(String.format("The animal is telling something to you: %s!", animal.voice()));
	}
}

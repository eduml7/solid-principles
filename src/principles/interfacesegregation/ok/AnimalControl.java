package principles.interfacesegregation.ok;

public class AnimalControl {

	public void fly(BirdFeatures bird) {
		bird.fly();
	}
	
	public void communicate(AnimalFeatures animal) {
		System.out.println(String.format("The animal is telling something to you: %s!", animal.voice()));
	}
}

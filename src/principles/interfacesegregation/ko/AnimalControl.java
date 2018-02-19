package principles.interfacesegregation.ko;

public class AnimalControl {

	public void fly(AnimalFeatures animal) {
		animal.fly();
	}
	
	public void communicate(AnimalFeatures animal) {
		System.out.println(String.format("The animal is telling something to you: %s!", animal.voice()));
	}
}

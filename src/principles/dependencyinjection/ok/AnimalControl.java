package principles.dependencyinjection.ok;

public class AnimalControl {

	private AnimalFeatures animal;
	
	public AnimalFeatures getAnimal() {
		return animal;
	}

	public void setAnimal(AnimalFeatures animal) {
		this.animal = animal;
	}

	public void communicate(AnimalFeatures animal) {
		System.out.println(String.format("The animal is telling something to you: %s!", animal.voice()));
	}

}

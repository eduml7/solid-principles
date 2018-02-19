package principles.dependencyinjection.ko;

public class AnimalControl {

	public void communicate() {
		CatFeatures cat = new CatFeatures();
		System.out.println(String.format("The animal is telling something to you: %s!", cat.voice()));
	}

}

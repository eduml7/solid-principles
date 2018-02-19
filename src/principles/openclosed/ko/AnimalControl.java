package principles.openclosed.ko;

public class AnimalControl {

	public void communicate(AnimalFeatures animal) {

		String voice = "--";

		switch (animal.getType()) {
		case CAT:
			voice = catVoice();
			break;
		case DOG:
			voice = dogVoice();
			break;
		}

		System.out.println(String.format("The animal is telling something to you: %s!", voice));
	}

	private String catVoice() {
		return "Meow";
	}

	private String dogVoice() {
		return "Woof";
	}

}

package principles.singleresponsability.ko;

public class Cat {

	private String name;
	private String colour;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public void sleep(Cat cat) {
		System.out.println(String.format("%s is sleeping!", cat.getName()));
	}

	public void play(Cat cat) {
		System.out.println(String.format("%s is playing!", cat.getName()));
	}
}

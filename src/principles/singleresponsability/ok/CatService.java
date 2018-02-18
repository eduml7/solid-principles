package principles.singleresponsability.ok;

public class CatService {
	
	public void sleep(Cat cat) {
		System.out.println(String.format("%s is sleeping!", cat.getName()));
	}

	public void play(Cat cat) {
		System.out.println(String.format("%s is playing!", cat.getName()));
	}
	
}

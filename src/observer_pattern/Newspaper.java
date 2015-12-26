package observer_pattern;

public class Newspaper implements Observer {

	@Override
	public void update(float interest) {
		System.out.println("Newspaper: "+interest);
	}

}

package observer_pattern;

public class Internet implements Observer {

	@Override
	public void update(float interest) {
		System.out.println("Internet: "+interest);
	}

}

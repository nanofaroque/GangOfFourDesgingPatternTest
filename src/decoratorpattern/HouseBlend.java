package decoratorpattern;

public class HouseBlend extends Beverages {

	public HouseBlend() {
		description = "HouseBlend";
	}

	@Override
	public double cost() {
		return 0.89;
	}

}

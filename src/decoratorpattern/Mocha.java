package decoratorpattern;

public class Mocha extends CondimentDecorator {

	Beverages beverages;

	public Mocha(Beverages beverages) {
		this.beverages = beverages;
	}

	@Override
	public String getString() {
		return beverages.getDescription() + ",Mocha";
	}

	@Override
	public double cost() {

		return 0.20 + beverages.cost();
	}

}

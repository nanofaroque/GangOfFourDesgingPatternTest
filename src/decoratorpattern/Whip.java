package decoratorpattern;

public class Whip extends CondimentDecorator {

	Beverages beverages;

	public Whip(Beverages beverages) {
		this.beverages = beverages;
	}

	@Override
	public String getString() {
		return beverages.getDescription() + ",Whip";
	}

	@Override
	public double cost() {

		return 0.30 + beverages.cost();
	}
}
